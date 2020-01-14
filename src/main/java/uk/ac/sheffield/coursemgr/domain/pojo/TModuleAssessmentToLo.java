package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TModuleAssessmentToLo {

    private Long id;

    private Long moduleAssessmentId;

    private Long moduleLoId;

    private int number;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private TModuleAssessment ModuleAssessment;

    private TModuleLo ModuleLo;

    private List<Long> ids;



    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public TModuleAssessment getModuleAssessment() {
        return ModuleAssessment;
    }

    public void setModuleAssessment(TModuleAssessment moduleAssessment) {
        ModuleAssessment = moduleAssessment;
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

    public Long getModuleAssessmentId() {
        return moduleAssessmentId;
    }

    public void setModuleAssessmentId(Long moduleAssessmentId) {
        this.moduleAssessmentId = moduleAssessmentId;
    }

    public Long getModuleLoId() {
        return moduleLoId;
    }

    public void setModuleLoId(Long moduleLoId) {
        this.moduleLoId = moduleLoId;
    }
}
