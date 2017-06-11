/*
 * 网络管理委员会信息管理系统 ( NetUnion Information System )
 * Copyright (c) 2017.
 */

package net.dormforce.nuis.support.pojo;

/**
 * Description: JSON 响应结果对象封装<br/>
 * Author: liuwenzhe<br/>
 * Date: 2017/4/19, 星期三
 */
public class JsonResult {

    private int error;
    private String message;
    private Object data;
    private String status;

    public JsonResult(int error, String message, Object data, String status) {
        this.error = error;
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public JsonResult(int error, String message, String status) {
        this.error = error;
        this.message = message;
        this.status = status;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "error='" + error + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", status='" + status + '\'' +
                '}';
    }
}
