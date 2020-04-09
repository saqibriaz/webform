package com.example.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlerClass {
    @Autowired
    MarksRepo marksRepo;
    @RequestMapping("/")
    public String getMarks(){
        return "marks";
    }
    @RequestMapping("/details")
    public String getMarks(Marks marks){
        marksRepo.save(marks);
        return "marks";
    }
}
