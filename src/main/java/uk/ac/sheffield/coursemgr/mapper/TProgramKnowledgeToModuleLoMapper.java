package uk.ac.sheffield.coursemgr.mapper;


import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledgeToModuleLo;

import java.util.List;
import java.util.Map;

public interface TProgramKnowledgeToModuleLoMapper {

    //通过统计主键的数量统计所有的programme knowledge和lo关系的数量
    //count all relations between programme knowledge and lo from tables by PK
    int countProgramKnowledgeLo(TProgramKnowledgeToModuleLo programKnowledgeToModuleLo);

    //增加一个Knowledge和Lo之间的关系
    //insert a relation between program knowledge and lo
    int insert(TProgramKnowledgeToModuleLo record);

    //删除一个Knowledge和Lo之间的关系 通过Skill id 和 Lo id
    //delete a relation between program Knowledge and lo by Knowledge Id and lo Id
    int deleteProgramKnowledgeLoById(@Param("loId") Long loId);






    TProgramKnowledgeToModuleLo selectByPrimaryKey(Long Id);

    List<TProgramKnowledgeToModuleLo> selectAll();

    int deleteByPrimaryKey(Long Id);

    int updateByPrimaryKey(TProgramKnowledgeToModuleLo record);

    List<Map<String, Object>> selectPartProgramSkillLo();

    List<Map<String, Object>> selectPartProgramSkillLoBySkill(Long skillId);

    List<Map<String, Object>> selectPartProgramSkillLoByLo(Long loId);

    int insertSelective(TProgramKnowledgeToModuleLo record);

    int updateByPrimaryKeySelective(TProgramKnowledgeToModuleLo record);

    int updateByPrimaryKeyWithBLOBs(TProgramKnowledgeToModuleLo record);

    int updateProgramKnowledgeLoByKnowledge(TProgramKnowledgeToModuleLo record);

    int updateProgramKnowledgeLoByLo(TProgramKnowledgeToModuleLo record);






}
