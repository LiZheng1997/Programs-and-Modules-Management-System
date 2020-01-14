package uk.ac.sheffield.coursemgr.mapper;

import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;

import java.util.List;

public interface TCoreModuleMapper {


    //通过统计主键的数量统计所有的core module的数量
    //count all core modules from tables by PK
    int countCoreModule(TCoreModule coreModule);


    //插入一条core module数据
    //insert a core module into the table
    void insert(TCoreModule tCoreModule);

    //删除一条coreModule记录通过主键
    //delete a coreModule by two ids
    void delete(@Param("programId") Long programId, @Param("coreModuleId") Long coreModuleId);

    //通过主键的方式查询一条coreModule
    //select a coreModule from table by PK
    TCoreModule selectByPrimaryKey(Long coreModuleId);

    //查询所有的coreModules
    //select all coreModules from the table
    List<TCoreModule> selectAll();

    //通过program id 查询所有的core modules
    //select all core modules from core module table by program id
    List<TCoreModule> selectCoreModule(Long id);
}
