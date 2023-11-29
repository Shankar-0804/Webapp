package com.shankar.user;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

      UserEntity mapDtoToEntity(UserInDto userInDto);

      List<UserOutDto> mapEntitiesToDtos(List<UserEntity> userEntities);

      UserOutDto mapEntityToDto(UserEntity userEntity);

      UserEntity mapDtoToExistingEntity(UserInDto userInDto, @MappingTarget UserEntity userEntity);
}
