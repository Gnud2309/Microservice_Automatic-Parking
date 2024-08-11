package com.parking.notification_service.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHENTICATED(1010, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    BODY_PARSE_FAIL(1012, "Body parse fail", HttpStatus.BAD_REQUEST),
    NOTFOUND_URL(1016, "Url not exists", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED(1017, "Not have permission", HttpStatus.FORBIDDEN),


    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    ;
    int code;
    String message;
    HttpStatusCode httpStatusCode;
}
