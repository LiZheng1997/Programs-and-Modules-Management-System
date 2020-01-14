package uk.ac.sheffield.coursemgr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;

public interface TProgramSkillMapper {

    //通过统计主键的数量统计所有的programme skill的数量
    //count all programme skill from tables by PK
    int countProgramSkill(TProgramSkill programSkill);

    //删除一个programme skill通过主键的方式
    //delete a programme skill by PK
    int deleteByPrimaryKey(Long skillId);

    //插入一条programme skill记录
    //insert a programme skill into the table
    int insert(TProgramSkill record);

    //通过主键查询一条programme skill记录
    //select one programme skill by PK
    TProgramSkill selectByPrimaryKey(Long skillId);

    //修改一条programme skill记录通过主键的方式
    //update a programme skill by PK
    int updateByPrimaryKey(TProgramSkill record);

    //查询一条skill的所有对应的ID的集合通过这个skill的ID
    //select program skill list by this skill's id
    List<TProgramSkill> selectModuleContentContentById(Long contentId);

    //查询一条skill对应的其他课程的content的id 集合，以主键ID的方式
    //select a module content's relative module content's id list by id
    List<Long> selectModuleConnectContentById(Long contentId);

    //select all from programme skill table
    List<TProgramSkill> selectAll();

    //select all los which contribute to one knowledge
    List<TModuleLo> selectModuleLoSkill(Long skillId);

    //select all los which contribute to one knowledge
    List<TModuleLo> selectSkillToLo();











    int insertSelective(TProgramSkill record);

    int updateByPrimaryKeySelective(TProgramSkill record);
}
