package uk.ac.sheffield.coursemgr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgram;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;

public interface TProgramAimMapper {

    //通过统计主键的数量统计所有的programme Aim的数量
    //count all programme aims from tables by PK
    int countProgramAim(TProgramAim programAim);

    //删除一条Aim记录通过主键
    //delete a aim by PK
    int deleteByPrimaryKey(Long aimId);

    //插入一条Aim记录
    //insert a record into this table
    int insert(TProgramAim record);

    //通过主键的方式查询一条Aim
    //select a aim from table by PK
    TProgramAim selectByPrimaryKey(Long aimId);

    //修改一条Aim记录以主键的方式
    //update a aim by PK
    int updateByPrimaryKey(TProgramAim record);

    //查询所有的Aims
    //select all aims from the table
    List<TProgramAim> selectAll();







    int insertSelective(TProgramAim record);

    int updateByPrimaryKeySelective(TProgramAim record);
}
