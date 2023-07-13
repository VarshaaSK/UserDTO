package com.example.springbootmapstruct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserDetails")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
    private String email;
}
