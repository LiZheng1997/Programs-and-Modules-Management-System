package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;
import uk.ac.sheffield.coursemgr.mapper.TProgramSkillMapper;
import uk.ac.sheffield.coursemgr.mapper.TProgramSkillToModuleLoMapper;
import uk.ac.sheffield.coursemgr.service.TProgramSkillService;
import uk.ac.sheffield.coursemgr.service.TProgramSkillToModuleLoService;

import javax.annotation.Resource;
// implement the interface of TProgramSkillService 实现TProgramSkillService接口

@Service
public class TProgramSkillToModuleLoServiceImpl implements TProgramSkillToModuleLoService {
    // implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramSkillToModuleLoMapper programSkillToModuleLoMapper;

    // insert the programme skill in database 插入ProgrammeSkill到数据库中
    @Override
    public int insert(TProgramSkillToModuleLo record) {
        Preconditions.checkNotNull(record);
        return programSkillToModuleLoMapper.insert(record);
    }

    // according to the primary key to select the programme skill in database 根据主键查找数据库中的ProgrammeSkill
    @Override
    public TProgramSkillToModuleLo selectByPrimaryKey(Long id) {
        return programSkillToModuleLoMapper.selectByPrimaryKey(id);
    }
    // according to the primary key to delete the programme skill in database 根据主键删除数据库中的ProgrammeSkill
    @Override
    public int deleteByPrimaryKey(Long programSkillToModuleLoId){
        return programSkillToModuleLoMapper.deleteByPrimaryKey(programSkillToModuleLoId);
    }


    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int updateByPrimaryKey(TProgramSkillToModuleLo record){
        return programSkillToModuleLoMapper.updateByPrimaryKey(record);
    }

    // according to the primary key to delete the programme skill in database 根据主键删除数据库中的ProgrammeSkill
    @Override
    public int deleteProgramSkillLoById(Long loId){
        return programSkillToModuleLoMapper.deleteProgramSkillLoById(loId);
    }

    @Override
    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int countProgramSkillLo(TProgramSkillToModuleLo record){
        return programSkillToModuleLoMapper.countProgramSkillLo(record);
    }
}
