package net.dormforce.nuis.support.dao;

import java.util.List;
import net.dormforce.nuis.support.pojo.Announcement;
import org.springframework.stereotype.Component;

@Component
public interface AnnouncementDao {

    public List<Announcement> findAnnoucements();

    public Announcement findAnnouncement(int announcementId);

    public Boolean addAnnouncement(Announcement announcement);

    public Boolean updateAnnouncement(Announcement announcement);

    public Boolean deleteAnnouncement(int announcementId);
}