package uk.ac.sheffield.coursemgr.mapper;


import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContentToLo;

public interface TModuleContentToLoMapper {

    //删除一个Content和Lo之间的关系 通过Lo id
    //delete a relation between module content and lo by lo Id
    int deleteModuleContentLoById(Long id);

    //增加一个Content和Lo之间的关系 通过Lo id
    //insert a relation between module content and lo by lo id
    int insertModuleContentLo(TModuleContentToLo tModuleContentToLo);

}
