package util;

import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/5/5.
 */
public class ResponseJsonUtils {

    /**
     * 默认字符编码
     */
    private static String encoding = "UTF-8";

    /**
     * JSONP默认的回调函数
     */
    private static String callback = "callback";

      /**
     * 把Java对象JSON序列化
     * @param obj 需要JSON序列化的Java对象
     * @return JSON字符串
     */
    private static String toJSONString(Object obj){
        JSONObject  json= new JSONObject(obj);
        return json.toString();
    }

    /**
     * 返回JSON格式数据
     * @param response
     * @param data 待返回的Java对象
     * @param encoding 返回JSON字符串的编码格式
     */
    public static void json(HttpServletResponse response, Object data, String encoding){
        //设置编码格式
        response.setContentType("text/plain;charset=" + encoding);
        response.setCharacterEncoding(encoding);

        PrintWriter out = null;
        try{
            out = response.getWriter();
            out.write(toJSONString(data));
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 返回JSON格式数据，使用默认编码
     * @param response
     * @param data 待返回的Java对象
     */
    public static void json(HttpServletResponse response, Object data){
        json(response, data, encoding);
    }

    /**
     * 返回JSONP数据，使用默认编码和默认回调函数
     * @param response
     * @param data JSONP数据
     */
    public static void jsonp(HttpServletResponse response, Object data){
        jsonp(response, callback, data, encoding);
    }

    /**
     * 返回JSONP数据，使用默认编码
     * @param response
     * @param callback JSONP回调函数名称
     * @param data JSONP数据
     */
    public static void jsonp(HttpServletResponse response, String callback, Object data){
        jsonp(response, callback, data, encoding);
    }

    /**
     * 返回JSONP数据
     * @param response
     * @param callback JSONP回调函数名称
     * @param data JSONP数据
     * @param encoding JSONP数据编码
     */
    public static void jsonp(HttpServletResponse response, String callback, Object data, String encoding){
        StringBuffer sb = new StringBuffer(callback);
        sb.append("(");
        sb.append(toJSONString(data));
        sb.append(");");

        // 设置编码格式
        response.setContentType("text/plain;charset=" + encoding);
        response.setCharacterEncoding(encoding);

        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(sb.toString());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getEncoding() {
        return encoding;
    }

    public static void setEncoding(String encoding) {
        ResponseJsonUtils.encoding = encoding;
    }

    public static String getCallback() {
        return callback;
    }

    public static void setCallback(String callback) {
        ResponseJsonUtils.callback = callback;
    }

}
