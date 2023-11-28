package com.shankar.user;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

      UserEntity mapDtoToEntity(UserDto userDto);

      List<UserDto> mapEntitiesToDtos(List<UserEntity> userEntities);

      UserDto mapEntityToDto(UserEntity userEntity);

      UserEntity mapDtoToExistingEntity(UserDto userDto, @MappingTarget UserEntity userEntity);
}
