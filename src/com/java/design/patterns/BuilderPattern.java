package com.java.design.patterns;

public class BuilderPattern {
    public static void main(String[] args) {
        ErrorDto errorDto = ErrorDto.builder().code("400").message("Error message").status(400).build();
        System.out.println(errorDto);
        ErrorDto e = ErrorDto.builder().code("300").build();
        System.out.println(e);
    }
}
class ErrorDto {
    private Integer status = null;
    private String code = null;
    private String message = null;

    public static class ErrorDtoBuilder {
        private Integer status;
        private String code;
        private String message;

        ErrorDtoBuilder() {
        }
        public ErrorDtoBuilder status(Integer status) {
            this.status = status;
            return this;
        }
        public ErrorDtoBuilder code(String code) {
            this.code = code;
            return this;
        }
        public ErrorDtoBuilder message(String message) {
            this.message = message;
            return this;
        }
        public ErrorDto build() {
            return new ErrorDto(status, code, message);
        }
    }
    protected ErrorDto(Integer status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public static ErrorDtoBuilder builder() {
        return new ErrorDtoBuilder();
    }

    public String toString() {
        return "ErrorDto.ErrorDtoBuilder(status=" + this.status + ", code=" + this.code + ", message=" + this.message + ")";
    }
}
