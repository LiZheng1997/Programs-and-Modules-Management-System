package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TMContentToAssessment {

    private Long id;

    private Long contentId;

    private Long assessmentId;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private int number;

    private TModuleContent tModuleContent;

    private TModuleAssessment tModuleAssessment;

    private List<Long> ids;




    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public TModuleContent gettModuleContent() {
        return tModuleContent;
    }

    public void settModuleContent(TModuleContent tModuleContent) {
        this.tModuleContent = tModuleContent;
    }

    public TModuleAssessment gettModuleAssessment() {
        return tModuleAssessment;
    }

    public void settModuleAssessment(TModuleAssessment tModuleAssessment) {
        this.tModuleAssessment = tModuleAssessment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
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