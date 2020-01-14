package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;
import uk.ac.sheffield.coursemgr.mapper.TProgramKnowledgeMapper;
import uk.ac.sheffield.coursemgr.service.TProgramKnowledgeService;

import javax.annotation.Resource;
import java.util.List;
// implement the interface of TProgramKnowledgeService 实现TProgramKnowledgeService接口

@Service
public class TProgramKnowledgeServiceImpl implements TProgramKnowledgeService {
    // implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramKnowledgeMapper programKnowledgeMapper;

    // insert the programme knowledge in database 插入ProgrammeKnowledge到数据库中
    @Override
    public int insert(TProgramKnowledge record) {
        Preconditions.checkNotNull(record);
        return programKnowledgeMapper.insert(record);
    }

    // according to the primary key to select the programme knowledge in database 根据主键查找数据库中的ProgrammeKnowledge
    @Override
    public TProgramKnowledge selectByPrimaryKey(Long id) {
        return programKnowledgeMapper.selectByPrimaryKey(id);
    }
    // according to the primary key to delete the programme knowledge in database 根据主键删除数据库中的ProgrammeKnowledge
    @Override
    public int deleteByPrimaryKey(Long programKnowledgeId){
        return programKnowledgeMapper.deleteByPrimaryKey(programKnowledgeId);
    }

    @Override
    // according to the primary key to update the programme knowledge in database 根据主键更新数据库中的ProgrammeKnowledge
    public int updateByPrimaryKey(TProgramKnowledge record){
        return programKnowledgeMapper.updateByPrimaryKey(record);
    }

    @Override
    // according to the primary key to update the programme knowledge in database 根据主键更新数据库中的ProgrammeKnowledge
    public int  countProgramKnowledge(TProgramKnowledge record){
        return programKnowledgeMapper.countProgramKnowledge(record);
    }

    @Override
    public List<TProgramKnowledge> selectAll() {
        return programKnowledgeMapper.selectAll();
    }

    @Override
    public List<TModuleLo> selectModuleLoKnowledge(Long programKnowledgeId) {
        return programKnowledgeMapper.selectModuleLoKnowledge(programKnowledgeId);
    }

    @Override
    public List<TModuleLo> selectKnowledgeToLo() {
        return programKnowledgeMapper.selectKnowledgeToLo();
    }


}
