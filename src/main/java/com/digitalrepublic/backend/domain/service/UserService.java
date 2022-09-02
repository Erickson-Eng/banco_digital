package com.digitalrepublic.backend.domain.service;

import com.digitalrepublic.backend.application.dto.request.auth.RegisterUser;
import com.digitalrepublic.backend.application.dto.response.UserResponse;

public interface UserService {

        UserResponse registerUser(RegisterUser registerUser);

        UserResponse updateUser(RegisterUser registerUser);

        void deleteUser(String id);

        UserResponse getUserByUsername(String username);

}
