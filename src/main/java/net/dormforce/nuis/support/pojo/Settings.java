package net.dormforce.nuis.support.pojo;

public class Settings {
    private String settingsCode;

    private String type;

    private String name;

    private String value;

    private String status;

    public void setSettingsCode(String settingsCode) { this.settingsCode = settingsCode; }

    public String getSettingsCode() { return settingsCode; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "Settings{" +
                "settingsCode='" + settingsCode + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}