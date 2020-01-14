package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;

import java.util.List;
// interface to select, insert, update and delete Programme aims in database. ProgrammeAim的数据库中增删改查

public interface TProgramAimService {

    int insert(TProgramAim record); // insert programme aims to database 插入ProgrammeAim到数据库

    TProgramAim selectByPrimaryKey(Long id); // select programme aims from database 从数据库中查找ProgrammeAim

    int deleteByPrimaryKey(Long programAimId); // delete programme aims in database 删除数据库中的ProgrammeAim

    int updateByPrimaryKey(TProgramAim record); // update programme aims in database 更改数据库中的ProgrammeAim

    int countProgramAim(TProgramAim record); // count the number of programme aims 统计数据库中的ProgrammeAim

    //查询所有的专业的所有信息
    //select all from ProgrammeAim table
    List<TProgramAim> selectAll();

}
