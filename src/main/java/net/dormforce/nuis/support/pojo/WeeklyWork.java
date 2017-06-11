package net.dormforce.nuis.support.pojo;

public class WeeklyWork {
    private Integer weeklyWorkId;

    private String type;

    private String title;

    private String subject;

    private String createTime;

    private String status;

    private String score;

    private Integer managerId;

    private Integer traineeId;

    public Integer getWeeklyWorkId() {
        return weeklyWorkId;
    }

    public void setWeeklyWorkId(Integer weeklyWorkId) {
        this.weeklyWorkId = weeklyWorkId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

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
        return "WeeklyWork{" +
                "weeklyWorkId=" + weeklyWorkId +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + status + '\'' +
                ", score='" + score + '\'' +
                ", managerId=" + managerId +
                ", traineeId=" + traineeId +
                '}';
    }
}