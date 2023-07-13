package com.example.springbootmapstruct.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.Mapping;

@Data
public class UsersDTO {

    private int userId;
    private String name;
    private String email;
}
