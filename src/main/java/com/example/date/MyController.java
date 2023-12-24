package com.example.date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
     @GetMapping("/")
    public String date() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = now.format(format1);
        System.out.println(formattedDate);
    }
}
