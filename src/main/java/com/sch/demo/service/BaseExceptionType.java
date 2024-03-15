package com.sch.demo.service;

import org.springframework.http.HttpStatus;

public interface BaseExceptionType {
    int getErrorCode();

    String getErrorMessage();

	HttpStatus getHttpStatus();
}