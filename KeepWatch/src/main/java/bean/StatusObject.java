package bean;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/5.
 */
public class StatusObject implements Serializable{
    private String code;
    private String msg;

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

    public StatusObject(String code, String msg){
        super();
        this.code = code;
        this.msg = msg;

    }


}
