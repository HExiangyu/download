package com.download.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 向前台返回JSON数据的对象
 * Created by Laily on 16/6/4.
 */
public class JsonData implements Serializable {

    private static final long serialVersionUID = -2657240590616301427L;

    private static final Logger logger = LoggerFactory.getLogger(JsonData.class);

    public final static long SUCCESS_CODE = 1;  //成功返回码
    public final static long FAIL_CODE = 0;  //失败返回码
    public final static long EXCEPTION_CODE = -1;  //异常返回码


    private long code;
    private String message;
    private Object result;
    private Timestamp time = new Timestamp(System.currentTimeMillis());

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 阉割掉这个方法?
     */
    private JsonData() {

    }

    /**
     * 构造方法
     *
     * @param code    返回码
     * @param result  结果
     * @param message 返回信息
     */
    public JsonData(long code, String message, Object result) {
        this.code = code;
        this.result = result;
        this.message = message;
    }


    /**
     * 简单的失败返回数据
     *
     * @return String
     */
    public static String simpleFailJsonReturnDate() {
        JsonData jsonData = new JsonData();
        jsonData.setResult(false);
        jsonData.setCode(JsonData.FAIL_CODE);
        jsonData.setMessage("FAIL");
        return jsonData.toJSONString();
    }

    /**
     * 简单的错误返回数据
     *
     * @return String
     */
    public static String simpleExceptionJsonReturnDate(String message) {
        JsonData resultData = new JsonData();
        resultData.setResult(false);
        resultData.setCode(JsonData.EXCEPTION_CODE);
        resultData.setMessage(message);
        return resultData.toJSONString();
    }

    /**
     * 简单的成功返回数据
     *
     * @return String
     */
    public static String simpleSuccessJsonReturnDate() {
        JsonData resultData = new JsonData();
        resultData.setResult(true);
        resultData.setCode(JsonData.SUCCESS_CODE);
        resultData.setMessage("SUCCESS");
        return resultData.toJSONString();
    }


    /**
     * 转换为json字符串
     *
     * @return String
     */
    public String toJSONString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            logger.error(" toJSONString is error ");
            return "{\"code\":" + JsonData.EXCEPTION_CODE + ",\"message\":\"some data wrong\"}";
        }
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
