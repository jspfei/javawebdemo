package serviceImpl;

import dao.StudentServiceDao;
import model.Students;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/5/5.
 */
public class StudentServiceImpl implements StudentService{
    public List<Students> getAllStudents() throws Exception {
      StudentServiceDao serviceDao = new StudentServiceDao();
      return serviceDao.getAllStudents();
    }
}
