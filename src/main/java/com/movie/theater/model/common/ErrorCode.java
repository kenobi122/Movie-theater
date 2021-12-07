package com.movie.theater.model.common;

import com.movie.theater.exception.ApiError;
import org.springframework.http.HttpStatus;

public class ErrorCode {
    public static final ApiError EMPLOYEE_ID_NOT_FOUND = new ApiError(HttpStatus.BAD_REQUEST, "id not found");
    public static final ApiError JWT_NOT_FOUND = new ApiError(HttpStatus.UNAUTHORIZED, "jwt not found");
    public static final ApiError FAIL_AUTHORIZATION = new ApiError(HttpStatus.UNAUTHORIZED,"authorization fail, please login again ");

    public static final ApiError ACCOUNT_NOT_FOUND = new ApiError(HttpStatus.BAD_REQUEST, "Account or password not found");
    public static final ApiError WRONG_PASSWORD = new ApiError(HttpStatus.BAD_REQUEST, "Wrong password");
    public static final ApiError ACCOUNT_ALREADY_EXISTS = new ApiError(HttpStatus.BAD_REQUEST, "account already exists ");

    public static final ApiError CINEMA_ROOM_ALREADY_EXISTS = new ApiError(HttpStatus.BAD_REQUEST, "cinema room already exists ");
    public static final ApiError SCHEDULE_SEAT_ALREADY_EXISTS = new ApiError(HttpStatus.BAD_REQUEST, "schedule seat already exists ");
    public static final ApiError SEAT_ALREADY_EXISTS = new ApiError(HttpStatus.BAD_REQUEST, "seat already exists ");
    public static final ApiError TICKET_ALREADY_EXISTS = new ApiError(HttpStatus.BAD_REQUEST, "ticket already exists ");


    public static final ApiError ANSWER_NOT_FOUND = new ApiError(HttpStatus.BAD_REQUEST, "answer not found");
    public static final ApiError DEPARTMENT_NOT_FOUND = new ApiError(HttpStatus.BAD_REQUEST, "department not found");



}
