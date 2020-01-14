package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.*;
import uk.ac.sheffield.coursemgr.mapper.TModuleLoMapper;
import uk.ac.sheffield.coursemgr.service.TModuleLoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleLoServiceImpl implements TModuleLoService {

    @Resource
    private TModuleLoMapper tModuleLoMapper;

    @Override
    public int countByPrimaryKey(Long id) {
        return tModuleLoMapper.countByPrimaryKey(id);
    }

    @Override
    public int update(TModuleLo record) {
        return tModuleLoMapper.update(record);
    }

    @Override
    public int deleteByPrimaryKey(Long moduleLoId) {
        return tModuleLoMapper.deleteByPrimaryKey(moduleLoId);
    }

    @Override
    public int insert(TModuleLo record) {
        return tModuleLoMapper.insert(record);
    }

    @Override
    public TModuleLo selectByPrimaryKey(Long moduleLoId) {
        return tModuleLoMapper.selectByPrimaryKey(moduleLoId);
    }

    @Override
    public List<TModuleLo> selectAll() {
        return tModuleLoMapper.selectAll();
    }


    @Override
    public List<TModuleAssessment> selectModuleAssessmentLo(Long moduleLoId) {
        return tModuleLoMapper.selectModuleAssessmentLo(moduleLoId);
    }

    @Override
    public List<TModuleContent> selectModuleContentLo(Long moduleLoId) {
        return tModuleLoMapper.selectModuleContentLo(moduleLoId);
    }

    @Override
    public List<TProgramSkill> selectProgramSkillLo(Long moduleLoId) {
        return tModuleLoMapper.selectProgramSkillLo(moduleLoId);
    }

    @Override
    public List<TProgramSkill> selectLoToSkill() {
        return tModuleLoMapper.selectLoToSkill();
    }

    @Override
    public List<TProgramKnowledge> selectProgramKnowledgeLo(Long moduleLoId) {
        return tModuleLoMapper.selectProgramKnowledgeLo(moduleLoId);
    }

    @Override
    public List<TProgramKnowledge> selectLoToKnowledge() {
        return tModuleLoMapper.selectLoToKnowledge();
    }
}
