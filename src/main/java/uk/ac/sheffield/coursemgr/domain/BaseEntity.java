package uk.ac.sheffield.coursemgr.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import uk.ac.sheffield.coursemgr.common.utils.LocalDateUtils;

import java.time.LocalDateTime;

/**
 * 所有Pojo的公共父类.
 * The public class of all pojo classes,
 */
public class BaseEntity {

    private String createBy;

    @JsonFormat(pattern = LocalDateUtils.YYYY_MM_DD_HH_MM_SS)
    @DateTimeFormat(pattern = LocalDateUtils.YYYY_MM_DD_HH_MM_SS)
    private LocalDateTime createTime;

    private String updateBy;

    @JsonFormat(pattern = LocalDateUtils.YYYY_MM_DD_HH_MM_SS)
    @DateTimeFormat(pattern = LocalDateUtils.YYYY_MM_DD_HH_MM_SS)
    private LocalDateTime updateTime;

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
