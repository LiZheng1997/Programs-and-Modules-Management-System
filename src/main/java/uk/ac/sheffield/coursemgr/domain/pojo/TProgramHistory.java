package uk.ac.sheffield.coursemgr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class TProgramHistory {

    private Long id;

    private String type;

    private Long typeId;

    private String note;

    private String createBy;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    private Long programId;

    private String operation;

    private String element;


    private List<TProgramHistory> programHistory;

    public List<TProgramHistory> getProgramHistory() {
        return programHistory;
    }

    public void setProgramHistory(List<TProgramHistory> programHistory) {
        this.programHistory=programHistory;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation=operation;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element=element;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId=typeId;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId=programId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy=createBy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note=note;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime=createTime;
    }
}
