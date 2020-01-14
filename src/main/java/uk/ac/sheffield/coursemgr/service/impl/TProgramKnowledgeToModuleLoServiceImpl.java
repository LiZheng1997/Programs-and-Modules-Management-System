package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledgeToModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;
import uk.ac.sheffield.coursemgr.mapper.TProgramKnowledgeToModuleLoMapper;
import uk.ac.sheffield.coursemgr.mapper.TProgramSkillToModuleLoMapper;
import uk.ac.sheffield.coursemgr.service.TProgramKnowledgeToModuleLoService;
import uk.ac.sheffield.coursemgr.service.TProgramSkillToModuleLoService;

import javax.annotation.Resource;
// implement the interface of TProgramSkillService 实现TProgramSkillService接口

@Service
public class TProgramKnowledgeToModuleLoServiceImpl implements TProgramKnowledgeToModuleLoService {
    // implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramKnowledgeToModuleLoMapper programKnowledgeToModuleLoMapper;

    // insert the programme skill in database 插入ProgrammeSkill到数据库中
    @Override
    public int insert(TProgramKnowledgeToModuleLo record) {
        Preconditions.checkNotNull(record);
        return programKnowledgeToModuleLoMapper.insert(record);
    }

    // according to the primary key to select the programme skill in database 根据主键查找数据库中的ProgrammeSkill
    @Override
    public TProgramKnowledgeToModuleLo selectByPrimaryKey(Long id) {
        return programKnowledgeToModuleLoMapper.selectByPrimaryKey(id);
    }
    // according to the primary key to delete the programme skill in database 根据主键删除数据库中的ProgrammeSkill
    @Override
    public int deleteByPrimaryKey(Long programKnowledgeToModuleLoId){
        return programKnowledgeToModuleLoMapper.deleteByPrimaryKey(programKnowledgeToModuleLoId);
    }

    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int updateByPrimaryKey(TProgramKnowledgeToModuleLo record){
        return programKnowledgeToModuleLoMapper.updateByPrimaryKey(record);
    }

    // according to the primary key to delete the programme skill in database 根据主键删除数据库中的ProgrammeSkill
    @Override
    public int deleteProgramKnowledgeLoById( Long loId){
        return programKnowledgeToModuleLoMapper.deleteProgramKnowledgeLoById(loId);
    }


    @Override
    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int countProgramKnowledgeLo(TProgramKnowledgeToModuleLo record){
        return programKnowledgeToModuleLoMapper.countProgramKnowledgeLo(record);
    }

}
