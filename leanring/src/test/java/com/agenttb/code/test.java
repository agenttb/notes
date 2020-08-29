package com.agenttb.code;

import com.agenttb.code.sql.model.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    @Test
    public void testStreamSorted() {
        List<Student> students = new ArrayList<>();
        students.stream().sorted(Comparator.comparing(Student::getsAge).thenComparing(Student::getsNo)).collect(Collectors.toList());
    }
}
