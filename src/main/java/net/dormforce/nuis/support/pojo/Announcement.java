package net.dormforce.nuis.support.pojo;

public class Announcement {

    private Integer announcementId;

    private String type;

    private String title;

    private String subject;

    private String relUsers;

    private String status;

    private String createTime;

    private Integer userId;

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
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

    public String getRelUsers() {
        return relUsers;
    }

    public void setRelUsers(String relUsers) {
        this.relUsers = relUsers == null ? null : relUsers.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        return "Announcement{" +
                "announcementId=" + announcementId +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", relUsers='" + relUsers + '\'' +
                ", status='" + status + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                '}';
    }
}