package com.sch.demo.service;

@SuppressWarnings("serial")
public class MemberException extends BaseException {
    private BaseExceptionType exceptionType;


    public MemberException(BaseExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return exceptionType;
    }
}
