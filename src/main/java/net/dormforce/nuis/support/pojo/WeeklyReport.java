package net.dormforce.nuis.support.pojo;

public class WeeklyReport {
    private Integer weeklyReportId;

    private String title;

    private String subject;

    private String createTime;

    private String status;

    private Integer traineeId;

    public Integer getWeeklyReportId() {
        return weeklyReportId;
    }

    public void setWeeklyReportId(Integer weeklyReportId) {
        this.weeklyReportId = weeklyReportId;
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

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    @Override
    public String toString() {
        return "WeeklyReport{" +
                "weeklyReportId=" + weeklyReportId +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + status + '\'' +
                ", traineeId=" + traineeId +
                '}';
    }
}