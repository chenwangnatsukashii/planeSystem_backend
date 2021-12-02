package com.example.engine_system.mapper;

import com.example.engine_system.entity.ResumeNine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeNineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeNine record);

    int insertSelective(ResumeNine record);

    ResumeNine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeNine record);

    int updateByPrimaryKey(ResumeNine record);

    int addResumeNine(List<ResumeNine> resume);

    int updateResumeNine(List<ResumeNine> resume);

    List<ResumeNine> getResumeNineById(Integer id);
}