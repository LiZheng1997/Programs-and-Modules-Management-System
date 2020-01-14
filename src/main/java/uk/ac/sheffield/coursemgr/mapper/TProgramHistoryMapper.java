package uk.ac.sheffield.coursemgr.mapper;

import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramHistory;

import java.util.List;

public interface TProgramHistoryMapper {

    //插入一条program history数据
    //insert a program history into the table
    void insert(TProgramHistory tProgramHistory);


    //通过主键的方式查询一条program history
    //select a program history from table by programId
    List<TProgramHistory> select(@Param("programId") Long programId);

    //查询所有的program history
    //select all program history from the table
    List<TProgramHistory> selectAll();

}
