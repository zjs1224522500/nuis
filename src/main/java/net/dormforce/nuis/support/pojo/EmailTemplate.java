package net.dormforce.nuis.support.pojo;

public class EmailTemplate {
    private Integer emailTemplateId;

    private String type;

    private String subject;

    private String title;

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public void setEmailTemplateId(Integer emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Override
    public String toString() {
        return "EmailTemplate{" +
                "emailTemplateId=" + emailTemplateId +
                ", type='" + type + '\'' +
                ", subject='" + subject + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}