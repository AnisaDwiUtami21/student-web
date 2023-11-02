package com.ubl.studentweb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubl.studentweb.domain.Student;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome UBL Student";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        Student student1 = new Student();
        student1.setFullName("Anisa Dwi Utami");
        student1.setAddress("Tangerang");
        student1.setDateOfBirth(LocalDate.of(2002, 8, 21));
        student1.setNim("2112500083");

        Student student2 = new Student();
        student2.setFullName("Saosan Nabila");
        student2.setAddress("Tangerang");
        student2.setDateOfBirth(LocalDate.of(2006, 6, 19));
        student2.setNim("12323");

        Student student3 = new Student();
        student3.setFullName("Nala ");
        student3.setAddress("Tangerang");
        student3.setDateOfBirth(LocalDate.of(2003, 2, 12));
        student3.setNim("12332");

        studentsList.addAll(List.of(student1, student2, student3));
        return studentsList;

    }
}
