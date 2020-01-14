package uk.ac.sheffield.coursemgr.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.*;

public interface TProgramMapper {

    //通过统计主键的数量统计所有的programme的数量
    //count all programmes from tables by PK
    int countProgram(TProgram program);

    //delete a programme by primary key
    //删除一个专业通过主键
    int deleteByPrimaryKey(Long programId);

    //insert a programme entity
    //插入一个专业记录
    int insert(TProgram record);

    //update a programme info by pk.
    //通过主键修改一个专业信息
    int updateByPrimaryKey(TProgram record);

    //选择某一个专业通过主键寻找
    //select a program by PK.
    TProgram selectByPrimaryKey(Long programId);

    //查询所有的的所有信息
    //select all from programme table
    List<TProgram> selectAll();

    //查询全表中一部分字段信息
    //select a part info from programme table
    List<Map<String, Object>> selectPartProgram();

    //通过aimId 查询全表中一部分字段信息
    //select a part info from programme table by aimID
    List<Map<String, Object>> selectPartProgramByProgramAim(Long programAimId);

    //通过loId 查询全表中一部分字段信息
    //select a part info from programme table by loId
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





    int countByPrimarykey(Long programId);

    int insertSelective(TProgram record);

    //选择专业下所有的必修课程
    //select all core modules which belongs to this program.
    List<TProgram> selectByCoreModuleId(List id);


    int updateByPrimaryKeySelective(TProgram record);
}
