package com.thanh.flashsale.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // Auth
    EMAIL_ALREADY_EXISTS(409, "Email already exists"),
    INVALID_CREDENTIALS(401, "Invalid email or password"),
    TOKEN_EXPIRED(403, "Your refresh token has expired. Please log in again."),
    TOKEN_REVOKED(403, "Token is already revoked."),
    REFRESH_TOKEN_NOT_FOUND(404, "Refresh token not found, please log in again."),
    INVALID_CURRENT_PASSWORD(400, "Invalid current password."),
    SAME_AS_OLD_PASSWORD(400, "The password has been used, try another password"),


    // User
    USER_NOT_FOUND(404, "User not found"),


    ;

    private final int httpStatus;
    private final String message;
}

