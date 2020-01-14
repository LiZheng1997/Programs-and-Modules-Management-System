package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;
import uk.ac.sheffield.coursemgr.mapper.TModuleAimMapper;
import uk.ac.sheffield.coursemgr.service.TModuleAimService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleAimServiceImpl implements TModuleAimService {

    @Resource
    private TModuleAimMapper tModuleAimMapper;

    @Override
    public int insert(TModuleAim record) {
        return tModuleAimMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Long aimId) {
        return tModuleAimMapper.deleteByPrimaryKey(aimId);
    }

    @Override
    public int update(TModuleAim record) {
        return tModuleAimMapper.update(record);
    }

    @Override
    public TModuleAim selectByPrimaryKey(Long aimId) {
        return tModuleAimMapper.selectByPrimaryKey(aimId);
    }

    @Override
    public List<TModuleAim> selectAll() {
        return tModuleAimMapper.selectAll();
    }
}
