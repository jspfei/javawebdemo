package service;

import model.Students;

import java.util.List;

/**
 * Created by admin on 2017/5/5.
 */
public interface StudentService {
    public List<Students> getAllStudents() throws Exception;
}
