package net.dormforce.nuis.support.pojo;

public class RentalRecord {
    private Integer rentalRecordId;

    private String createTime;

    private String returnTime;

    private String status;

    private Integer userId;

    private Integer stockId;

    public Integer getRentalRecordId() {
        return rentalRecordId;
    }

    public void setRentalRecordId(Integer rentalRecordId) {
        this.rentalRecordId = rentalRecordId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @Override
    public String toString() {
        return "RentalRecord{" +
                "rentalRecordId=" + rentalRecordId +
                ", createTime='" + createTime + '\'' +
                ", returnTime='" + returnTime + '\'' +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                ", stockId=" + stockId +
                '}';
    }
}