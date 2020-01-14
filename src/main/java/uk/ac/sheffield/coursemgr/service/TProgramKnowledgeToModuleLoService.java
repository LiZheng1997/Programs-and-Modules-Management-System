package uk.ac.sheffield.coursemgr.service;


import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledgeToModuleLo;
// // interface to insert and delete relations between Programme knowledge and Lo in database. ProgrammeSkill和Lo之间的关系的数据库中增删

public interface TProgramKnowledgeToModuleLoService {


    // count relations between Programme knowledge and Lo in database 统计数据库中的ProgrammeKnowledge和Lo之间的关系
    int countProgramKnowledgeLo(TProgramKnowledgeToModuleLo record);

    // insert relations between Programme knowledge and Lo in database 插入ProgrammeKnowledge和Lo之间的关系到数据库
    int insert(TProgramKnowledgeToModuleLo record);

    // delete relations between Programme knowledge and Lo in database 删除数据库中的ProgrammeKnowledge和Lo之间的关系通过knowledgeId和loId
    int deleteProgramKnowledgeLoById( Long loId);









    TProgramKnowledgeToModuleLo selectByPrimaryKey(Long id); // select programme skills from database 从数据库中查找ProgrammeSkill

    int deleteByPrimaryKey(Long programKnowledgeToModuleLoId); // delete programme skills in database 删除数据库中的ProgrammeSkill

    int updateByPrimaryKey(TProgramKnowledgeToModuleLo record); // update programme skills in database 更改数据库中的ProgrammeSkill


}
