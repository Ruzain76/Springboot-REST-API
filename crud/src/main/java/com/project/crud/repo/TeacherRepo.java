package com.project.crud.repo;

import com.project.crud.entity.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository <teacher,Integer>{
}
