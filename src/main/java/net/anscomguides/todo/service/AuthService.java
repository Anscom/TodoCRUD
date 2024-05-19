package net.anscomguides.todo.service;

import net.anscomguides.todo.dto.JwtAuthResponse;
import net.anscomguides.todo.dto.LoginDto;
import net.anscomguides.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    JwtAuthResponse login(LoginDto loginDto);
}
