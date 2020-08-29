package com.agenttb.code.sql.mybatis;

import com.agenttb.code.sql.dao.StudentMapper;
import com.agenttb.code.sql.model.Student;
import com.agenttb.code.sql.model.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MybatisBootApplication {
    public static void main(String[] args) {
        String resource = "mybatis/mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session  = sqlSessionFactory.openSession(true);
            StudentMapper studentMapper = session.getMapper(StudentMapper.class);

            List<Student> student = batchAddStudent();

            int count = studentMapper.batchInsert(student);
            session.commit();
            System.out.println("update rows == " + count);
            showIncrId(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    private static StudentExample createStudentQuery() {
        StudentExample query = new StudentExample();
        query.createCriteria().andSNoEqualTo(10001);
        return query;
    }

    private static Student createStudent() {
        Student student = new Student();
        student.setsAge(28);
        student.setsDept("compute");
        student.setsEnrollmentDate(new Date());
        student.setsName("agenttb");
        student.setsSex("M");
        return student;
    }

    private static List<Student> batchAddStudent() {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(createStudent());
        }
        return list;
    }

    private static void showIncrId(List<Student> list) {
        list.forEach(v -> System.out.println(v.getsNo() + "  "));
    }
}
