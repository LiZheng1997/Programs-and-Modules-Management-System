package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.*;

import java.util.List;

public interface TModuleLoService {

    //统计所有的los通过主键的数量
    //count all los from the table by id
    int countByPrimaryKey(Long id);

    //增加一个学习成果记录
    //insert a module lo into the table
    int insert(TModuleLo record);

    //删除一条学习成果记录
    //delete a lo by primary key
    int deleteByPrimaryKey(Long moduleLoId);

    //修改一个Lo以主键的方式
    //update one lo by PK
    int update(TModuleLo record);

    //通过一个主键进行查询
    //select a module lo by primary key
    TModuleLo selectByPrimaryKey(Long moduleLoId);

    //查询所有的表中的学习成果
    //select all los from the table.
    List<TModuleLo> selectAll();

    //查询当前Lo下的所有对应的测试
    //select all assessments which contribute to this lo
    List<TModuleAssessment> selectModuleAssessmentLo (Long moduleLoId);

    //查询当前Lo下所有的学习成果
    //select all contents which contribute to this lo
    List<TModuleContent> selectModuleContentLo(Long moduleLoId);

    //select a skill which contribute to this lo
    List<TProgramSkill> selectProgramSkillLo(Long moduleLoId);

    //select all skills which contribute to this lo
    List<TProgramSkill> selectLoToSkill();

    //select knowledge which contribute to this lo
    List<TProgramKnowledge> selectProgramKnowledgeLo(Long moduleLoId);

    //select all knowledge which contribute to this lo
    List<TProgramKnowledge> selectLoToKnowledge();
}
