package dao;

import model.Student;

public interface StudentDao {
    /** 方法名对应Mapper中方法名 */
    public Student getStudent(int id);
}
