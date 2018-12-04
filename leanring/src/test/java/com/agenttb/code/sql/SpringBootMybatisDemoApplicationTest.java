package com.agenttb.code.sql;

import com.agenttb.code.sql.dao.StudentMapper;
import com.agenttb.code.sql.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootMybatisDemoApplicationTest {
    private ExecutorService executorService = Executors.newFixedThreadPool(100);
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void insertStudent() {
        List<Future<?>> futuresList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<?> submit = executorService.submit(new InsertDataTask(studentMapper));
            futuresList.add(submit);
        }
        for (Future future : futuresList) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Insert data 5000w over");

    }

    private static class InsertDataTask implements Runnable {
        private StudentMapper studentMapper;
        public InsertDataTask(StudentMapper studentMapper) {
            this.studentMapper = studentMapper;
        }



        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println("Thread name:" + name);
            int id = (int)Thread.currentThread().getId() %10;
            Date enrollmentDate = getLastTenYears(id);
            String sex = "M";
            if (Thread.currentThread().getId() % 2 == 0) {
                sex = "F";
            }
            for (int i = 0; i < 500000; i++) {
                Student student = new Student();
                student.setsAge(18 + id);
                student.setsDept(name + "compute");
                student.setsEnrollmentDate(enrollmentDate);
                student.setsName("t" + i + name);
                student.setsSex(sex);
                studentMapper.insert(student);
            }
            System.out.println(name + "over task");
        }

        private Date getLastTenYears(int i) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, 0 -i);
            return calendar.getTime();
        }
    }
}
