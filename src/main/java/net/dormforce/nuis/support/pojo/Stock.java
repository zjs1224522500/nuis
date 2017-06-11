package net.dormforce.nuis.support.pojo;

public class Stock {
    private Integer stockId;

    private String totalCount;

    private String surplus;

    private String status;

    private Integer officeSuppliesId;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount == null ? null : totalCount.trim();
    }

    public String getSurplus() {
        return surplus;
    }

    public void setSurplus(String surplus) {
        this.surplus = surplus == null ? null : surplus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOfficeSuppliesId() {
        return officeSuppliesId;
    }

    public void setOfficeSuppliesId(Integer officeSuppliesId) {
        this.officeSuppliesId = officeSuppliesId;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", totalCount='" + totalCount + '\'' +
                ", surplus='" + surplus + '\'' +
                ", status='" + status + '\'' +
                ", officeSuppliesId=" + officeSuppliesId +
                '}';
    }
}