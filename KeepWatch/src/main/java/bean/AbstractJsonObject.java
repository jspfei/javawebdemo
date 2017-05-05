package bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/5/5.
 */
public class AbstractJsonObject implements Serializable{

    private String code;

    private String msg;

    private Long time = new Date().getTime();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setContent(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public void setStatusObject(StatusObject statusObject){
        this.code = statusObject.getCode();
        this.msg = statusObject.getMsg();
    }
}
