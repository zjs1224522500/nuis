package net.dormforce.nuis.support.pojo;

public class Repair {
    private Integer repairId;

    private String type;

    private String subject;

    private Long createTime;

    private String status;

    private Integer transactor;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getTransactor() {
        return transactor;
    }

    public void setTransactor(Integer transactor) {
        this.transactor = transactor;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "repairId=" + repairId +
                ", type='" + type + '\'' +
                ", subject='" + subject + '\'' +
                ", createTime=" + createTime +
                ", status='" + status + '\'' +
                ", transactor=" + transactor +
                '}';
    }
}