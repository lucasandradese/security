package com.lucasandrade.security.exception;

import java.util.Date;

public record ExceptionResponse(Date date, String message, String details) {
}
