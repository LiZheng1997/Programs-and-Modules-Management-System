package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;

import java.util.List;

public interface TModuleContentService {

    //通过主键的数量统计所有的content的数量
    //count all module's contents by Pk
    int countByExample(TModuleContent tModuleContent);

    //增加一条module的content记录到数据库中
    //insert a module's content
    int insert(TModuleContent record);

    //删除一条数据库中content的记录通过主键的方式
    //delete a content by the module's content id
    int deleteByPrimaryKey(Long contentId);

    //修改一条content通过主键的方式
    //update a content by PK
    int update(TModuleContent record);

    //查询一条content的所有对应的ID通过这个content的ID
    //select module content list by this content's id
    Long selectConnectContentById(Long contentId);

    //查询一条module content记录
    //select a module content by id
    TModuleContent selectByPrimaryKey(Long contentId);

    //查询所有module content通过id
    //select all module contents
    List<TModuleContent> selectAll(Long contentId);

    //我们假设所有的课程都只有一个前提的课程需要学习，所以在查询中，包括存储表中，我们都是只存取
    //这个课程的前提课程的ID，并且通过这个ID去module的table中进行查询
    //select a module content's prerequisite, here we set prerequisite is a module's id,
    //because we assume that all modules just have a prerequisite, so we store the id of module.
    Long selectContentPrerequisite(Long contentId);

    //通过moduleID查询Lo表中的部分信息
    //select a part info from lo table by contentId
    List<TModuleLo> selectLos(Long contentId);

    //通过contentId查询assessment表中的部分信息
    //select a part info from assessment table by contentId
    List<TModuleAssessment> selectAssessments(Long contentId);

    //通过moduleID查询Lo表中的部分信息
    //select a part info from lo table by contentId
    List<TModuleLo> selectContentLos();
}
