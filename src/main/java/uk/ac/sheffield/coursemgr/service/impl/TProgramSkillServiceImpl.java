package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;
import uk.ac.sheffield.coursemgr.mapper.TProgramSkillMapper;
import uk.ac.sheffield.coursemgr.service.TProgramSkillService;

import javax.annotation.Resource;
import java.util.List;
// implement the interface of TProgramSkillService 实现TProgramSkillService接口

@Service
public class TProgramSkillServiceImpl implements TProgramSkillService {
    // implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramSkillMapper programSkillMapper;

    // insert the programme skill in database 插入ProgrammeSkill到数据库中
    @Override
    public int insert(TProgramSkill record) {
        Preconditions.checkNotNull(record);
        return programSkillMapper.insert(record);
    }

    // according to the primary key to select the programme skill in database 根据主键查找数据库中的ProgrammeSkill
    @Override
    public TProgramSkill selectByPrimaryKey(Long id) {
        return programSkillMapper.selectByPrimaryKey(id);
    }
    // according to the primary key to delete the programme skill in database 根据主键删除数据库中的ProgrammeSkill
    @Override
    public int deleteByPrimaryKey(Long programSkillId){
        return programSkillMapper.deleteByPrimaryKey(programSkillId);
    }

    @Override
    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int updateByPrimaryKey(TProgramSkill record){
        return programSkillMapper.updateByPrimaryKey(record);
    }

    @Override
    // according to the primary key to update the programme skill in database 根据主键更新数据库中的ProgrammeSkill
    public int countProgramSkill(TProgramSkill record){
        return programSkillMapper.countProgramSkill(record);
    }

    @Override
    public List<TProgramSkill> selectAll() {
        return programSkillMapper.selectAll();
    }

    @Override
    public List<TModuleLo> selectModuleLoSkill(Long skillId) {
        return programSkillMapper.selectModuleLoSkill(skillId);
    }

    @Override
    public List<TModuleLo> selectSkillToLo() {
        return programSkillMapper.selectSkillToLo();
    }

}
