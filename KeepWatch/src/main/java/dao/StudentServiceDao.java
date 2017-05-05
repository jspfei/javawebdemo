package dao;

import db.DBUtil;
import model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/5.
 */
public class StudentServiceDao {

    public static List<Students> getAllStudents() throws SQLException{
        List<Students> studentsList = new ArrayList<Students>();

        Connection conn = DBUtil.getConn();
        StringBuffer sb = new StringBuffer();
        sb.append("select id,name,age,sex,mobile from student");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sb.toString());

        Students students = null;
        while (rs.next()){

            students = new Students();
            students.setId(rs.getInt("id"));
            students.setName(rs.getString("name"));
            students.setAge(rs.getInt("age"));
            students.setSex(rs.getInt("sex"));
            students.setMoblie(rs.getInt("mobile"));

            studentsList.add(students);
        }
        return studentsList;

    }
}
