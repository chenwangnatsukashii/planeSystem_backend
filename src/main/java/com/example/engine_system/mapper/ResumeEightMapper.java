package com.example.engine_system.mapper;

import com.example.engine_system.entity.ResumeEight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResumeEightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeEight record);

    int insertSelective(ResumeEight record);

    ResumeEight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeEight record);

    int updateByPrimaryKey(ResumeEight record);

    int addResumeEight(List<ResumeEight> resume);

    List<ResumeEight> getResumeEightById(Integer id);
}