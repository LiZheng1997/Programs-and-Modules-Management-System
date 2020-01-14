package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;
import uk.ac.sheffield.coursemgr.mapper.TProgramAimMapper;
import uk.ac.sheffield.coursemgr.service.TProgramAimService;

import javax.annotation.Resource;
import java.util.List;
// implement the interface of TProgramAimService 实现TProgramAimService接口

@Service
public class TProgramAimServiceImpl implements TProgramAimService {
    // implementing following functions by calling mapper interface 通过调用mapper的接口去实现以下方法
    @Resource
    private TProgramAimMapper programAimMapper;

    // insert the programme aim in database 插入ProgrammeAim到数据库中
    @Override
    public int insert(TProgramAim record) {
        Preconditions.checkNotNull(record);
        return programAimMapper.insert(record);
    }

    // according to the primary key to select the programme aim in database 根据主键查找数据库中的ProgrammeAim
    @Override
    public TProgramAim selectByPrimaryKey(Long id) {
        return programAimMapper.selectByPrimaryKey(id);
    }
    // according to the primary key to delete the programme aim in database 根据主键删除数据库中的ProgrammeAim
    @Override
    public int deleteByPrimaryKey(Long programAimId){
        return programAimMapper.deleteByPrimaryKey(programAimId);
    }

    @Override
    // according to the primary key to update the programme aim in database 根据主键更新数据库中的ProgrammeAim
    public int updateByPrimaryKey(TProgramAim record){ return programAimMapper.updateByPrimaryKey(record); }

    @Override
    // according to the primary key to update the programme aim in database 根据主键更新数据库中的ProgrammeAim
    public int countProgramAim(TProgramAim record){ return programAimMapper.countProgramAim(record); }

    @Override
    public List<TProgramAim> selectAll() {
        return programAimMapper.selectAll();
    }

}
