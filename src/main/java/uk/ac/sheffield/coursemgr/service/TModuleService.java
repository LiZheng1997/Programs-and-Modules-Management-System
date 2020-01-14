package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.*;

import java.util.List;
import java.util.Map;

public interface TModuleService {

    //count the number of module by pk.
    //统计所有的课程数量通过主键
    int countByPrimaryKey(Long moduleId);

    //insert a module entity
    //插入一个课程记录
    int insert(TModule record);

    //delete a module by primary key
    //删除一个课程通过主键
    int deleteByPrimaryKey(Long moduleId);

    //update a module info by pk.
    //通过主键修改一个课程信息
    int update(TModule record);

    //select a module by PK
    //通过主键查询一门课
    TModule selectByPrimaryKey(Long moduleId);

    //查询所有的课程的所有信息
    //select all from module table
    List<TModule> selectAll();

    //查询全表中一部分字段信息
    //select a part info from module table
    List<Map<String, Object>> selectPartModule();

    //通过aimId 查询全表中一部分字段信息
    //select a part info from module table by aimID
    List<Map<String, Object>> selectPartModuleByAim(Long aimId);

    //通过loId 查询全表中一部分字段信息
    //select a part info from module table by loId
    List<Map<String, Object>> selectPartModuleByLo(Long loId);

    //通过moduleID查询aim表中的部分信息
    //select a part info from aim table by moduleId
    List<TModuleAim> selectAims(Long id);

    //通过moduleID查询Lo表中的部分信息
    //select a part info from aim table by moduleId
    List<TModuleLo> selectLos(Long id);

    //通过moduleID查询assessment表中的部分信息
    //select a part info from assessment table by moduleId
    List<TModuleAssessment> selectAssessments(Long id);

    //通过moduleID查询content表中的部分信息
    //select a part info from content table by moduleId
    List<TModuleContent> selectContents(Long id);
}
