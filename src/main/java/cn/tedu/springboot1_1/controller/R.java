package cn.tedu.springboot1_1.controller;

import java.io.Serializable;

public class R implements Serializable {
    public static final int OK = 200;
    public static final int ERRO = 500;
    private int status = OK;
    private String message;


    public static R ok(String message){
        R r = new R();
        r.setStatus(OK);
        r.setMessage(message);
        return r;
    }

    public static int getOK() {
        return OK;
    }

    public static int getERRO() {
        return ERRO;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
