package com.download.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 向前台返回JSON数据的对象
 * Created by Laily on 16/6/4.
 */
public class JsonData {
    private boolean success;
    private String msg;
    private Object obj;

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public JsonData(){

    }

    public JsonData(boolean succcess, String msg){
        this.setSuccess(succcess);
        this.setMsg(msg);
    }

    public JsonData(boolean succcess, String msg, Object obj){
        this.setSuccess(succcess);
        this.setMsg(msg);
        this.setObj(obj);
    }

    /**
     * 转换为json字符串
     * @return
     */
    public String toJSONString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            //TODO: 将错误提示管理员
            return "{\"success\":false,\"msg\":\"some data wrong\"}";
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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
