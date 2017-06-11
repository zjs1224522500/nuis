package net.dormforce.nuis.support.pojo;

/**
 * Created by liuwenzhe on 2017/4/14.
 */
public class Position {
    private int positionId;
    private String positionCode;
    private String positionName;
    private String positionDesc;
    private Integer positionDept;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    public Integer getPositionDept() {
        return positionDept;
    }

    public void setPositionDept(Integer positionDept) {
        this.positionDept = positionDept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position that = (Position) o;

        if (positionId != that.positionId) return false;
        if (positionCode != null ? !positionCode.equals(that.positionCode) : that.positionCode != null)
            return false;
        if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null)
            return false;
        if (positionDesc != null ? !positionDesc.equals(that.positionDesc) : that.positionDesc != null)
            return false;
        if (positionDept != null ? !positionDept.equals(that.positionDept) : that.positionDept != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = positionId;
        result = 31 * result + (positionCode != null ? positionCode.hashCode() : 0);
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        result = 31 * result + (positionDesc != null ? positionDesc.hashCode() : 0);
        result = 31 * result + (positionDept != null ? positionDept.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionCode='" + positionCode + '\'' +
                ", positionName='" + positionName + '\'' +
                ", positionDesc='" + positionDesc + '\'' +
                ", positionDept=" + positionDept +
                '}';
    }
}
