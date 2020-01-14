package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.mapper.TCoreModuleMapper;
import uk.ac.sheffield.coursemgr.service.TCoreModuleService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TCoreModuleServiceImpl implements TCoreModuleService {

    @Resource
    private TCoreModuleMapper tCoreModuleMapper;

    @Override
    public int countCoreModule(TCoreModule tCoreModule) {
        return tCoreModuleMapper.countCoreModule(tCoreModule);
    }

    @Override
    public void insert(TCoreModule tCoreModule) {
        tCoreModuleMapper.insert(tCoreModule);
    }

    @Override
    public void delete(Long programId, Long coreModuleId) {
        tCoreModuleMapper.delete(programId, coreModuleId);
    }

    @Override
    public TCoreModule selectByPrimaryKey(Long coreModuleId) {
        return tCoreModuleMapper.selectByPrimaryKey(coreModuleId);
    }

    @Override
    public List<TCoreModule> selectAll() {
        return tCoreModuleMapper.selectAll();
    }

    @Override
    public List<TCoreModule> selectCoreModule(Long id) {
        return tCoreModuleMapper.selectCoreModule(id);
    }
}
