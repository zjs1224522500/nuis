package net.dormforce.nuis.support.pojo;

public class MeetingMinutes {
    private Integer meetingMinutesId;

    private String deptId;

    private String subject;

    private String createTime;

    private Integer userId;

    public Integer getMeetingMinutesId() {
        return meetingMinutesId;
    }

    public void setMeetingMinutesId(Integer meetingMinutesId) {
        this.meetingMinutesId = meetingMinutesId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MeetingMinutes{" +
                "meetingMinutesId=" + meetingMinutesId +
                ", deptId='" + deptId + '\'' +
                ", subject='" + subject + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                '}';
    }
}