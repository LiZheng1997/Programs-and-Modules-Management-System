package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TModuleAim {

    private Long moduleId;

    private Long aimId;

    private Long moduleAssessmentId;

    private String moduleTitle;

    private String aimDescription;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private List<TModuleAim> tModuleAimList;




    public List<TModuleAim> gettModuleAimList() {
        return tModuleAimList;
    }

    public void settModuleAimList(List<TModuleAim> tModuleAimList) {
        this.tModuleAimList = tModuleAimList;
    }

    public Long getModuleAssessmentId() {
        return moduleAssessmentId;
    }

    public void setModuleAssessmentId(Long moduleAssessmentId) {
        this.moduleAssessmentId = moduleAssessmentId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getAimId() {
        return aimId;
    }

    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public String getAimDescription() {
        return aimDescription;
    }

    public void setAimDescription(String aimDescription) {
        this.aimDescription = aimDescription;
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
}
