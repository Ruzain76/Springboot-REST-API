package com.project.crud.controller;

import com.project.crud.dto.TeacherDto;
import com.project.crud.dto.TeacherSaveDto;
import com.project.crud.dto.TeacherUpdateDto;
import com.project.crud.service.TeacherService;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/save")
    public String saveteacher(@RequestBody TeacherSaveDto teacherSaveDto)
    {
        String teachername = teacherService.addTeacher(teacherSaveDto);
        return teachername;
    }

    @GetMapping("/getallteachers")

    public List<TeacherDto> getAll(){

        List<TeacherDto> allTeachers = teacherService.getall();
        return allTeachers;
    }

    @PutMapping("/update")
    public String updateteacher(@RequestBody TeacherUpdateDto teacherUpdateDto)
    {
        String teachername = teacherService.updateTeacher(teacherUpdateDto);
        return "UPDATED";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteteacher(@PathVariable(value="id")int id)

    {
        boolean deleteTeacher = teacherService.deleteTeacher(id);
        return "DELETED";
    }

}
