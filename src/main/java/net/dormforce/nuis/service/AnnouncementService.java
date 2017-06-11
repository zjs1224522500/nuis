package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Announcement;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/18 0018.
 */
public interface AnnouncementService {

    public List<Announcement> getAnnouncements();

    public Announcement getAnnouncement(int announcementId);

    public Boolean saveAnnouncement(Announcement announcement);

    public Boolean removeAnnouncement(int announcementId);
}
