package service;

import model.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentService {
    /**
     *sqlSessionTemplate模板提供了sqlsession
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    public Student getStudent(int id) {
        Student student = sqlSessionTemplate.selectOne("dao.StudentDao.getStudent", id);
        return student;
    }
}