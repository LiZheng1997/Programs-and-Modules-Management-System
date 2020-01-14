package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.*;
import uk.ac.sheffield.coursemgr.mapper.TProgramMapper;
import uk.ac.sheffield.coursemgr.service.TProgramService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
// implement the interface of TProgramService 实现TProgramService接口

@Service
public class TProgramServiceImpl implements TProgramService {
// implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramMapper programMapper;

// insert the programme in database 插入Programme到数据库中
    @Override
    public int insert(TProgram record) {
        Preconditions.checkNotNull(record); // make sure the programme record is not null 确保要插入的Programme不为空
        return programMapper.insert(record);
    }

// according to the primary key to select the programme in database 根据主键查找数据库中的Programme
    @Override
    public TProgram selectByPrimaryKey(Long id) {
        return programMapper.selectByPrimaryKey(id);
    }
// according to the primary key to delete the programme in database 根据主键删除数据库中的Programme
    @Override
    public int deleteByPrimaryKey(Long programId){
        return programMapper.deleteByPrimaryKey(programId);
    }

    @Override
// according to the primary key to update the programme in database 根据主键更新数据库中的Programme
    public int updateByPrimaryKey(TProgram record){
        return programMapper.updateByPrimaryKey(record);
    }

    @Override
// according to the primary key to update the programme in database 根据主键更新数据库中的Programme
    public int countProgram(TProgram record){
        return programMapper.countProgram(record);
    }

    @Override
    public List<TProgram> selectAll() {
        return programMapper.selectAll();
    }

    @Override
    public List<Map<String, Object>> selectPartProgram() {
        return programMapper.selectPartProgram();
    }

    @Override
    public List<Map<String, Object>> selectPartProgramByProgramAim(Long programAimId) {
        return programMapper.selectPartProgramByProgramAim(programAimId);
    }

    @Override
    public List<Map<String, Object>> selectPartProgramByLo(Long loId) {
        return programMapper.selectPartProgramByLo(loId);
    }

    @Override
    public List<TProgramAim> selectAims(Long id) {
        return programMapper.selectAims(id);
    }

    @Override
    public List<TProgramSkill> selectSkills(Long id) {
        return programMapper.selectSkills(id);
    }

    @Override
    public List<TProgramKnowledge> selectKnowledge(Long id) {
        return programMapper.selectKnowledge(id);
    }

    @Override
    public List<TModule> selectCores(Long id) {
        return programMapper.selectCores(id);
    }

    @Override
    public List<TModule> selectOptionals(Long id) {
        return programMapper.selectOptionals(id);
    }
}
