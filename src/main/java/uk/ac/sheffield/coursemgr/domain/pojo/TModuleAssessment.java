package uk.ac.sheffield.coursemgr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class TModuleAssessment {
    private Long assessmentId;

    private Long moduleId;

    private String moduleCode;

    private Long aimId;

    private int percentage;

    private LocalDateTime issuedTime;

    private LocalDateTime submitTime;

    private String modulePrerequisite;

    private String assessmentTitle;

    private String assessmentType;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private List<TModuleLo> moduleLos;

    private List<TModuleAim> moduleAims;

    private List<TModuleContent> moduleContents;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Timestamp assessmentRelease;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Timestamp assessmentSubmit;



    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public LocalDateTime getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(LocalDateTime issuedTime) {
        this.issuedTime = issuedTime;
    }

    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    public List<TModuleContent> getModuleContents() {
        return moduleContents;
    }

    public void setModuleContents(List<TModuleContent> moduleContents) {
        this.moduleContents = moduleContents;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public List<TModuleAim> getModuleAims() {
        return moduleAims;
    }

    public void setModuleAims(List<TModuleAim> moduleAims) {
        this.moduleAims = moduleAims;
    }

    public List<TModuleLo> getModuleLos() {
        return moduleLos;
    }

    public void setModuleLos(List<TModuleLo> moduleLos) {
        this.moduleLos = moduleLos;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Long getAimId() {
        return aimId;
    }

    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }

    public String getModulePrerequisite() {
        return modulePrerequisite;
    }

    public void setModulePrerequisite(String modulePrerequisite) {
        this.modulePrerequisite = modulePrerequisite;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
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

    @JsonFormat(pattern="yyyy-MM-dd")
    public Timestamp getAssessmentRelease() {
        return assessmentRelease;
    }

    public void setAssessmentRelease(Timestamp assessmentRelease) {
        this.assessmentRelease = assessmentRelease;
    }

    @JsonFormat(pattern="yyyy-MM-dd")
    public Timestamp getAssessmentSubmit() {
        return assessmentSubmit;
    }

    public void setAssessmentSubmit(Timestamp assessmentSubmit) {
        this.assessmentSubmit = assessmentSubmit;
    }

    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    public void setAssessmentTitle(String assessmentTitle) {
        this.assessmentTitle = assessmentTitle;
    }
}