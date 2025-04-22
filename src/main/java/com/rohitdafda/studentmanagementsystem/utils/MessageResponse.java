package com.rohitdafda.studentmanagementsystem.utils;

public class MessageResponse<T> {
    private int statusCode;
    private String message;
    private boolean isSuccess;
    private T data;

    public MessageResponse(int statusCode, String message, boolean isSuccess, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.isSuccess = isSuccess;
        this.data = data;
    }

    // Getters & setters
    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public T getData() {
        return data;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setData(T data) {
        this.data = data;
    }
}
