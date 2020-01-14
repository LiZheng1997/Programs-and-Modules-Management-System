package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContentToLo;
import uk.ac.sheffield.coursemgr.mapper.TModuleContentToLoMapper;
import uk.ac.sheffield.coursemgr.service.TModuleContentToLoService;

import javax.annotation.Resource;

@Service
public class TModuleContentToLoServiceImpl implements TModuleContentToLoService {

    @Resource
    private TModuleContentToLoMapper tModuleContentToLoMapper;

    @Override
    public int deleteModuleContentLoById(Long loId) {
        tModuleContentToLoMapper.deleteModuleContentLoById( loId);
        return 1;
    }

    @Override
    public int insertModuleContentLo(TModuleContentToLo tModuleContentToLo) {
        tModuleContentToLoMapper.insertModuleContentLo(tModuleContentToLo);
        return 1;
    }
}
