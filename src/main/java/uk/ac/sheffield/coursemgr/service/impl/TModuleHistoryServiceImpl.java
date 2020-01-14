package uk.ac.sheffield.coursemgr.service.impl;


import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleHistory;
import uk.ac.sheffield.coursemgr.mapper.TModuleHistoryMapper;
import uk.ac.sheffield.coursemgr.service.TModuleHistoryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleHistoryServiceImpl implements TModuleHistoryService{

    @Resource
    private TModuleHistoryMapper tModuleHistoryMapper;

    @Override
    public void insert(TModuleHistory tModuleHistory) {
        tModuleHistoryMapper.insert(tModuleHistory);
    }

    @Override
    public List<TModuleHistory> selectAll() {
        return tModuleHistoryMapper.selectAll();
    }

    @Override
    public List<TModuleHistory> selectByModuleId(Long moduleId) {
        return tModuleHistoryMapper.selectByModuleId(moduleId);
    }


}
