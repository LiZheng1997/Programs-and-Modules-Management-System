package uk.ac.sheffield.coursemgr.mapper;

import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TOptionalModule;

import java.util.List;

public interface TOptionalModuleMapper {

    //通过统计主键的数量统计所有的Optional module的数量
    //count all Optional modules from tables by PK
    int countOptionalModule(TOptionalModule program);

    //插入一条optional module数据
    //insert a optional module into the table
    void insert(TOptionalModule optionalModuleId);

    //删除一条optionalModuleId记录通过主键
    //delete a optionalModuleId by PK
    int delete(@Param("programId") Long programId, @Param("optionalModuleId") Long optionalModuleId);

    //通过主键的方式查询一条optionalModuleId
    //select a optionalModuleId from table by PK
    TOptionalModule selectByPrimaryKey(Long optionalModuleId);

    //查询所有的optionalModuleIds
    //select all 查询所有的optionalModuleIds from the table
    List<TOptionalModule> selectAll();

    //通过program id 查询所有的Optional modules
    //select all Optional modules from Optional module table by program id
    List<TOptionalModule> selectOptionalModule(Long id);
}
