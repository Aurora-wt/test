package com.example.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    public static Result success() {
        return new Result(1, "success", null);
    }
    public static Result success(String msg){
        return new Result(1,msg,null);
    }
}
