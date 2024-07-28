package com.project.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherUpdateDto {

    private int teacherid;
    private String teachername;
    private String phone;
}
