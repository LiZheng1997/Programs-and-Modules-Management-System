package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramHistory;
import uk.ac.sheffield.coursemgr.mapper.TCoreModuleMapper;
import uk.ac.sheffield.coursemgr.mapper.TProgramHistoryMapper;
import uk.ac.sheffield.coursemgr.service.TCoreModuleService;
import uk.ac.sheffield.coursemgr.service.TProgramHistoryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TProgramHistoryServiceImpl implements TProgramHistoryService {

    @Resource
    private TProgramHistoryMapper tProgramHistoryMapper;

    @Override
    public void insert(TProgramHistory tProgramHistory) {
        tProgramHistoryMapper.insert(tProgramHistory);
    }

    @Override
    public List<TProgramHistory> select(Long programId) {
        return tProgramHistoryMapper.select(programId);
    }

    @Override
    public List<TProgramHistory> selectAll() {
        return tProgramHistoryMapper.selectAll();
    }


}
