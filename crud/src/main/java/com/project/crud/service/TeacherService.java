package com.project.crud.service;

import com.project.crud.dto.TeacherDto;
import com.project.crud.dto.TeacherSaveDto;
import com.project.crud.dto.TeacherUpdateDto;

import java.util.List;

public interface TeacherService {
    String addTeacher(TeacherSaveDto teacherSaveDto);

    List<TeacherDto> getall();

    String updateTeacher(TeacherUpdateDto teacherUpdateDto);

    boolean deleteTeacher(int id);
}
