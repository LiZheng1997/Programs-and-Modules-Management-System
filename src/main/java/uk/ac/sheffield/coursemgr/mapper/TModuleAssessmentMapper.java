package uk.ac.sheffield.coursemgr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.*;

public interface TModuleAssessmentMapper {

    //通过统计主键的数量统计所有的assessments的数量
    //count all assessments from tables by PK
    int countByPrimaryKey(TModuleAssessment tModuleAssessment);

    //插入一条assessment记录
    //insert a assessment into the table
    int insert(TModuleAssessment record);

    //删除一个assessment通过主键的方式
    //delete a assessment by PK
    int deleteByPrimaryKey(Long assessmentId);

    //修改一条assessment记录通过主键的方式
    //update a assessment by PK
    int update(TModuleAssessment record);

    //查询assessment下所有的对应的Los
    //select all los which contribute to all assessments
    List<TModuleLo> selectAssessmentLos();

    //查询assessment下所有的对应Aims
    //select all aims which contribute to all assessments
    List<TModuleAim> selectAssessmentAims();

    //通过主键查询一条assessment记录
    //select one assessment by PK
    TModuleAssessment selectByPrimaryKey(Long assessmentId);

    //查询assessment下所有的对应的Los
    //select all los which contribute to one assessment
    List<TModuleLo> selectLOs(Long assessmentId);

    //查询assessment下所有的对应的Los
    //select all los which contribute to one assessment
    List<TModuleAim> selectAims(Long assessmentId);

    //查询assessment下所有的对应的Contents
    //select all los which contribute to one assessment
    List<TModuleContent> selectContents(Long assessmentId);


}