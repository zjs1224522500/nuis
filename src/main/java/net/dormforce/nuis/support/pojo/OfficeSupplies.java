package net.dormforce.nuis.support.pojo;

public class OfficeSupplies {
    private Integer officeSuppliesId;

    private String name;

    private String type;

    private String description;

    private String createTime;

    private String status;

    public Integer getOfficeSuppliesId() {
        return officeSuppliesId;
    }

    public void setOfficeSuppliesId(Integer officeSuppliesId) {
        this.officeSuppliesId = officeSuppliesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "OfficeSupplies{" +
                "officeSuppliesId=" + officeSuppliesId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}