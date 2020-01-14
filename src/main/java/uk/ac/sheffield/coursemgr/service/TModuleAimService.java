package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;


import java.util.List;

public interface TModuleAimService {
    //插入一条Aim记录
    //insert a record into this table
    int insert(TModuleAim record);

    //删除一条Aim记录通过主键
    //delete a aim by PK
    int deleteByPrimaryKey(Long aimId);

    //修改一条Aim记录以主键的方式
    //update a aim by PK
    int update(TModuleAim record);

    //通过主键的方式查询一条Aim
    //select a aim from table by PK
    TModuleAim selectByPrimaryKey(Long aimId);

    //查询所有的Aims
    //select all aims from the table
    List<TModuleAim> selectAll();
}
