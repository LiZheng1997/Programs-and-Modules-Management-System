package uk.ac.sheffield.coursemgr.mapper;


import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;

import java.util.List;
import java.util.Map;

public interface TProgramSkillToModuleLoMapper {

    //通过统计主键的数量统计所有的programme skill和lo关系的数量
    //count all relations between programme skill and lo from tables by PK
    int countProgramSkillLo(TProgramSkillToModuleLo programSkillToModuleLo);

    //增加一个Skill和Lo之间的关系
    //insert a relation between program skill and lo
    int insert(TProgramSkillToModuleLo record);

    //删除一个Skill和Lo之间的关系 通过Skill id 和 Lo id
    //delete a relation between program skill and lo by skill Id and lo Id
    int deleteProgramSkillLoById(@Param("loId") Long loId);









    int insertSelective(TProgramSkillToModuleLo record);

    int updateByPrimaryKeySelective(TProgramSkillToModuleLo record);

    int updateByPrimaryKey(TProgramSkillToModuleLo record);

    TProgramSkillToModuleLo selectByPrimaryKey(Long Id);

    List<TProgramSkillToModuleLo> selectAll();

    int deleteByPrimaryKey(Long Id);

    int updateProgramSkillLoBySkill(TProgramSkillToModuleLo record);

    int updateProgramSkillLoByLo(TProgramSkillToModuleLo record);

    List<Map<String, Object>> selectPartProgramSkillLo();

    List<Map<String, Object>> selectPartProgramSkillLoBySkill(Long skillId);

    List<Map<String, Object>> selectPartProgramSkillLoByLo(Long loId);

    int updateByPrimaryKeyWithBLOBs(TProgramSkillToModuleLo record);

}
