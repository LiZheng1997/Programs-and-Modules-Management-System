package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TOptionalModule;
import uk.ac.sheffield.coursemgr.mapper.TOptionalModuleMapper;
import uk.ac.sheffield.coursemgr.service.TOptionalModuleService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TOptionalModuleServiceImpl implements TOptionalModuleService {

    @Resource
    private TOptionalModuleMapper tOptionalModuleMapper;

    @Override
    public int countOptionalModule(TOptionalModule tOptionalModule) {
        return tOptionalModuleMapper.countOptionalModule(tOptionalModule);
    }

    @Override
    public void insert(TOptionalModule optionalModuleId) {
        tOptionalModuleMapper.insert(optionalModuleId);
    }

    @Override
    public int delete(Long programId, Long optionalModuleId) {
        tOptionalModuleMapper.delete(programId, optionalModuleId);
        return 0;
    }

    @Override
    public TOptionalModule selectByPrimaryKey(Long optionalModuleId) {
        return tOptionalModuleMapper.selectByPrimaryKey(optionalModuleId);
    }

    @Override
    public List<TOptionalModule> selectAll() {
        return tOptionalModuleMapper.selectAll();
    }

    @Override
    public List<TOptionalModule> selectOptionalModule(Long id) {
        return tOptionalModuleMapper.selectOptionalModule(id);
    }
}
