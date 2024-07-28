package com.project.crud.service.IMPL;

import com.project.crud.dto.TeacherDto;
import com.project.crud.dto.TeacherSaveDto;
import com.project.crud.dto.TeacherUpdateDto;
import com.project.crud.entity.teacher;
import com.project.crud.repo.TeacherRepo;
import com.project.crud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceIMPL implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;



    @Override
    public String addTeacher(TeacherSaveDto teacherSaveDto) {

        teacher Teacher = new teacher(

                teacherSaveDto.getTeachername(),
                teacherSaveDto.getPhone()


        );
        teacherRepo.save(Teacher);
        return Teacher.getTeachername();

    }

    @Override
    public List<TeacherDto> getall() {

        List<teacher> getTeacher = teacherRepo.findAll();
        List<TeacherDto> teacherDtoList = new ArrayList<>();

        for(teacher Teacher:getTeacher)
        {
           TeacherDto teacherDto = new TeacherDto(
                   Teacher.getTeacherid(),
                   Teacher.getTeachername(),
                   Teacher.getPhone()
           );
           teacherDtoList.add(teacherDto);

        }
        return teacherDtoList;
    }

    @Override
    public String updateTeacher(TeacherUpdateDto teacherUpdateDto)
    {
        if (teacherRepo.existsById(teacherUpdateDto.getTeacherid()))
        {
            teacher Teacher = teacherRepo.getById(teacherUpdateDto.getTeacherid());
            Teacher.setTeachername(teacherUpdateDto.getTeachername());
            Teacher.setPhone(teacherUpdateDto.getPhone());

            teacherRepo.save(Teacher);

            return Teacher.getTeachername();
        }
        else
        {
            System.out.println("TeacherID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteTeacher(int id) {

        if(teacherRepo.existsById(id))
        {
            teacherRepo.deleteById(id);
        }
        else
        {
            System.out.println("TeacherID Not Found");
        }



        return false;
    }
}
