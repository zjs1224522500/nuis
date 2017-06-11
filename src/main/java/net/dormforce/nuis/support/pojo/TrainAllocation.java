package net.dormforce.nuis.support.pojo;

public class TrainAllocation {

    private Integer managerId;

    private Integer traineeId;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    @Override
    public String toString() {
        return "TrainAllocation{" +
                "managerId=" + managerId +
                ", traineeId=" + traineeId +
                '}';
    }
}