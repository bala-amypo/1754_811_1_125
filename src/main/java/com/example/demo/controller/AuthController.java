@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserService userService;

    // ================= REGISTER =================
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        User user = userService.register(request);
        return ResponseEntity.status(201).body(user);
    }

    // ================= LOGIN =================
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword()
            )
        );

        User user = userService.findByEmail(request.getEmail());
        String token = jwtTokenProvider.generateToken(request.getEmail(), user);

        return ResponseEntity.ok(new AuthResponse(token));
    }
}
