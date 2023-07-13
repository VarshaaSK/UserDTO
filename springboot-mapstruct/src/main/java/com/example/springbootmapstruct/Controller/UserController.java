package com.example.springbootmapstruct.Controller;

import com.example.springbootmapstruct.Model.User;
import com.example.springbootmapstruct.Service.UserService;
import com.example.springbootmapstruct.dto.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userDTO")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addData")
    public UsersDTO putUser(@RequestBody UsersDTO userDTO){
        return userService.addUser(userDTO);
    }

    @PostMapping("/addDatas")
    public List<UsersDTO> putUsers(@RequestBody List<UsersDTO> usersDTO){
        return userService.addManyUsers(usersDTO);
    }

    @GetMapping("/getUsers")
    public List<UsersDTO> getMultipleUsers(){
        return userService.getUsers();
    }
}
