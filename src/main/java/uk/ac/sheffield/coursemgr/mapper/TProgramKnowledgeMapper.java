package uk.ac.sheffield.coursemgr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;

public interface TProgramKnowledgeMapper {

    //通过统计主键的数量统计所有的programme Knowledge的数量
    //count all programme Knowledge from tables by PK
    int countProgramKnowledge(TProgramKnowledge programKnowledge);

    //删除一个Knowledge通过主键的方式
    //delete a Knowledge by PK
    int deleteByPrimaryKey(Long knowledgeId);

    //插入一条Knowledge记录
    //insert a Knowledge into the table
    int insert(TProgramKnowledge record);

    //通过主键查询一条Knowledge记录
    //select one Knowledge by PK
    TProgramKnowledge selectByPrimaryKey(Long knowledgeId);

    //修改一条Knowledge记录通过主键的方式
    //update a Knowledge by PK
    int updateByPrimaryKey(TProgramKnowledge record);

    //select all from programme knowledge table
    List<TProgramKnowledge> selectAll();

    //select all los which contribute to one knowledge
    List<TModuleLo> selectModuleLoKnowledge(Long knowledgeId);

    //select all los which contribute to one knowledge
    List<TModuleLo> selectKnowledgeToLo();

















    int updateByPrimaryKeySelective(TProgramKnowledge record);

    int updateByPrimaryKeyWithBLOBs(TProgramKnowledge record);


    int insertSelective(TProgramKnowledge record);
}
