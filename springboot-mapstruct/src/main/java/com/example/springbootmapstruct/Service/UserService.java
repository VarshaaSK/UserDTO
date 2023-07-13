package com.example.springbootmapstruct.Service;

import com.example.springbootmapstruct.Model.User;
import com.example.springbootmapstruct.Repository.UserRepository;
import com.example.springbootmapstruct.dto.UsersDTO;
import com.example.springbootmapstruct.mapper.UserMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserMapper userMapper = Mappers.getMapper(UserMapper.class);
    @Autowired
    private UserRepository userRepository;

    public UsersDTO addUser(UsersDTO userDTO){
        User user = userMapper.userDTOToUser(userDTO);
        user = userRepository.save(user);
        UsersDTO usersDTO = userMapper.userToUserDTO(user);
        return usersDTO;
    }

    public List<UsersDTO> addManyUsers(List<UsersDTO> usersDTO){
        List<User> userList = userMapper.listOfUserDTOToUser(usersDTO);
        userList = userRepository.saveAll(userList);
        List<UsersDTO> userDTOList = userMapper.listOfUserToUsersDTO(userList);
        return userDTOList;
    }

    public List<UsersDTO> getUsers(){
        List<User> userList = userRepository.findAll();
        List<UsersDTO> userDTOList = userMapper.listOfUserToUsersDTO(userList);
        return userDTOList;
    }
}
