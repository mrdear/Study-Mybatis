package com.itoolshub.mybatis.common.mapperbak;

import com.itoolshub.mybatis.common.domain.TeacherClassroom;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherClassroomMapper {

  TeacherClassroom findById(Long id);

  TeacherClassroom create(TeacherClassroom createDo);

  TeacherClassroom update(TeacherClassroom updateDo);

}
