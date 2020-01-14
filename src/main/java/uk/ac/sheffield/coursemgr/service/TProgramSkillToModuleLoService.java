package uk.ac.sheffield.coursemgr.service;


import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;
// interface to insert and delete relations between Programme skills and Lo in database. ProgrammeSkill和Lo之间的关系的数据库中增删

public interface TProgramSkillToModuleLoService {


    // count relations between Programme skills and Lo in database 统计数据库中的ProgrammeSkill和Lo之间的关系
    int countProgramSkillLo(TProgramSkillToModuleLo record);

    // insert relations between Programme skills and Lo in database 插入ProgrammeSkill和Lo之间的关系到数据库
    int insert(TProgramSkillToModuleLo record);

    // delete relations between Programme skills and Lo in database 删除数据库中的ProgrammeSkill和Lo之间的关系通过SkillId和loId
    int deleteProgramSkillLoById(Long loId);









    TProgramSkillToModuleLo selectByPrimaryKey(Long id); // select programme skills from database 从数据库中查找ProgrammeSkill

    int deleteByPrimaryKey(Long programSkillToModuleLoId); // delete programme skills in database 删除数据库中的ProgrammeSkill

    int updateByPrimaryKey(TProgramSkillToModuleLo record); // update programme skills in database 更改数据库中的ProgrammeSkill


}
