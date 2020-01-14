package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TModuleHistory;

import java.util.List;

public interface TModuleHistoryService {
    //插入一条module history数据
    //insert a module history into the table
    void insert(TModuleHistory tModuleHistory);


    //查询所有的module histories
    //select all module histories from the table
    List<TModuleHistory> selectAll();

    //查询一条记录通过ID
    //select one history by id.
    List<TModuleHistory> selectByModuleId(Long moduleId);
}
