package servlet;

import bean.ListObject;
import bean.StatusHouse;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import model.Students;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import serviceImpl.StudentServiceImpl;
import util.ResponseJsonUtils;

import java.io.IOException;
import java.util.List;

/**
 * Created by admin on 2017/5/5.
 */
public class ServletStudentInq extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            List<Students> list = new StudentServiceImpl().getAllStudents();
            ListObject listObject = new ListObject();
            listObject.setItems(list);
            listObject.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            ResponseJsonUtils.json(response,listObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
