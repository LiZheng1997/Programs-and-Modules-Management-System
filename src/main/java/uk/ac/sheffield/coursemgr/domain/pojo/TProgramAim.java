package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;

public class TProgramAim {
    private Long aimId;

    private Long programId;

    private String aimDescription;

    private String programCode;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;



    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId=programId;
    }

    public Long getAimId() {
        return aimId;
    }

    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }

    public String getAimDescription() {
        return aimDescription;
    }

    public void setAimDescription(String aimDescription) {
        this.aimDescription = aimDescription;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
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
