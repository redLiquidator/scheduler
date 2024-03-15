package com.sch.demo.service;

public abstract class BaseException extends RuntimeException{
    public abstract BaseExceptionType getExceptionType();
}