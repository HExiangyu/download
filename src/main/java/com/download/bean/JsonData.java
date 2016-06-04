package com.download.bean;

/**
 * Created by Laily on 16/6/4.
 */
public class JsonData {
    private boolean success;
    private String msg;

    public JsonData(){

    }

    public JsonData(boolean succcess, String msg){
        this.setSuccess(succcess);
        this.setMsg(msg);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
