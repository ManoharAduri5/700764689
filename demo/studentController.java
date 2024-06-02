package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class studentService {
    public List<student> getstudents() {
        return List.of(
                new student(
                        "Manohar",
                        "manoharreddyaduri27@gmail.com",
                        LocalDate.of(2002, Month.MAY, 12),
                        22

                )
        );
    }
}
