package com.example.springbootmapstruct.mapper;

import com.example.springbootmapstruct.Model.User;
import com.example.springbootmapstruct.dto.UsersDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    @Mapping(source = "id", target = "userId")
    UsersDTO userToUserDTO(User user);

    @Mapping(source = "userId", target = "id")
    User userDTOToUser(UsersDTO userDTO);

    List<UsersDTO> listOfUserToUsersDTO(List<User> user);

    List<User> listOfUserDTOToUser(List<UsersDTO> usersDTO);
}
