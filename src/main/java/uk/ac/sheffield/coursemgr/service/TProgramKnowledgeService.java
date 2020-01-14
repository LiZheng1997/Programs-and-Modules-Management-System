package uk.ac.sheffield.coursemgr.service;


import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;

import java.util.List;
// interface to select, insert, update and delete Programme knowledge in database. ProgrammeKnowledge的数据库中增删改查

public interface TProgramKnowledgeService {

    int insert(TProgramKnowledge record); // insert programme knowledge to database 插入ProgrammeKnowledge到数据库

    TProgramKnowledge selectByPrimaryKey(Long id); // select programme knowledge from database 从数据库中查找ProgrammeKnowledge

    int deleteByPrimaryKey(Long programKnowledgeId); // delete programme knowledge in database 删除数据库中的ProgrammeKnowledge

    int updateByPrimaryKey(TProgramKnowledge record); // update programme knowledge in database 更改数据库中的ProgrammeKnowledge

    int countProgramKnowledge(TProgramKnowledge record); //// count the number of programme knowledge 统计数据库中的ProgrammeKnowledge


    //select all from ProgrammeKnowledge table
    List<TProgramKnowledge> selectAll();


    //select all los which contribute to one knowledge
    List<TModuleLo> selectModuleLoKnowledge(Long knowledgeId);

    //select all los which contribute to one knowledge
    List<TModuleLo> selectKnowledgeToLo();

}
