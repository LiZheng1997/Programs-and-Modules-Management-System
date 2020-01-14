package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TModuleContentToLo {

    private Long id;

    private Long moduleContentId;

    private Long moduleLoId;

    private int number;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private TModuleContent ModuleContent;

    private TModuleLo ModuleLo;

    private List<Long> ids;



    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public TModuleContent getModuleContent() {
        return ModuleContent;
    }

    public void setModuleContent(TModuleContent moduleContent) {
        ModuleContent = moduleContent;
    }

    public TModuleLo getModuleLo() {
        return ModuleLo;
    }

    public void setModuleLo(TModuleLo moduleLo) {
        ModuleLo = moduleLo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModuleContentId() {
        return moduleContentId;
    }

    public void setModuleContentId(Long moduleContentId) {
        this.moduleContentId = moduleContentId;
    }

    public Long getModuleLoId() {
        return moduleLoId;
    }

    public void setModuleLoId(Long moduleLoId) {
        this.moduleLoId = moduleLoId;
    }
}
