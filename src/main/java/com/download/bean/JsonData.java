package com.download.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Laily on 16/6/4.
 */
public class JsonData {
    private boolean success;
    private String msg;

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public JsonData(){

    }

    public JsonData(boolean succcess, String msg){
        this.setSuccess(succcess);
        this.setMsg(msg);
    }

    public String toJSONString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{\"success\":false,\"msg\":\"json wrong\"}";
        }
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
