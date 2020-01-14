package uk.ac.sheffield.coursemgr.service;


import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;

import java.util.List;
// interface to select, insert, update and delete Programme skills in database. ProgrammeSkill的数据库中增删改查

public interface TProgramSkillService {

    int insert(TProgramSkill record); // insert programme skills to database 插入ProgrammeSkill到数据库

    TProgramSkill selectByPrimaryKey(Long id); // select programme skills from database 从数据库中查找ProgrammeSkill

    int deleteByPrimaryKey(Long programSkillId); // delete programme skills in database 删除数据库中的ProgrammeSkill

    int updateByPrimaryKey(TProgramSkill record); // update programme skills in database 更改数据库中的ProgrammeSkill

    int countProgramSkill(TProgramSkill record); // count the number of programme skills 统计数据库中的ProgrammeSkill

    //select all from ProgrammeSkill table
    List<TProgramSkill> selectAll();

    //select all los which contribute to one knowledge
    List<TModuleLo> selectModuleLoSkill(Long skillId);

    //select all los which contribute to one knowledge
    List<TModuleLo> selectSkillToLo();
}
