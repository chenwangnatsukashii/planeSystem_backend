package com.example.engine_system.mapper;

import com.example.engine_system.entity.Plane;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PlaneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Plane record);

    int insertSelective(Plane record);

    Plane selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Plane record);

    int updateByPrimaryKey(Plane record);

    List<Plane> getAllPlanes(@Param("work_number") String workNumber, @Param("plane_type") String planeType, @Param("unit_number") String unitNumber, @Param("plane_num") String planeNum);

    void addPlane(List<Plane> planes);
}