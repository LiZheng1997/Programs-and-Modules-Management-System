package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.*;

import java.util.List;
import java.util.Map;
// interface to select, insert, update and delete Programmes in database. Programme的数据库中增删改查

public interface TProgramService {

    int insert(TProgram record); // insert programmes to database 插入Programme到数据库

    TProgram selectByPrimaryKey(Long id); // select programmes from database 从数据库中查找Programme

    int deleteByPrimaryKey(Long programId); // delete programmes in database 删除数据库中的Programme

    int updateByPrimaryKey(TProgram record); // update programmes in database 更改数据库中的Programme

    int countProgram(TProgram record); // count the number of programmes 统计数据库中的Programmes

    //查询所有的专业的所有信息
    //select all from Programme table
    List<TProgram> selectAll();

    //查询全表中一部分字段信息
    //select a part info from Programme table
    List<Map<String, Object>> selectPartProgram();

    //通过aimId 查询全表中一部分字段信息
    //select a part info from Programme table by aimID
    List<Map<String, Object>> selectPartProgramByProgramAim(Long programAimId);

    //通过loId 查询全表中一部分字段信息
    //select a part info fromProgramme table by loId
    List<Map<String, Object>> selectPartProgramByLo(Long loId);

    //通过program id 查询所有的Aims
    //select all aims from aim table by program id
    List<TProgramAim> selectAims(Long id);

    //通过program id 查询所有的Skills
    //select all aims from skills table by program id
    List<TProgramSkill> selectSkills(Long id);

    //通过program id 查询所有的Knowledge
    //select all aims from knowledge table by program id
    List<TProgramKnowledge> selectKnowledge(Long id);

    //通过program id 查询所有的CoreModules
    //select all 查询所有的CoreModules from knowledge table by program id
    List<TModule> selectCores(Long id);

    //通过program id 查询所有的CoreModules
    //select all 查询所有的CoreModules from knowledge table by program id
    List<TModule> selectOptionals(Long id);
}
