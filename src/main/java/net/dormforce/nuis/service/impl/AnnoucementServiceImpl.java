package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.support.dao.AnnouncementDao;
import net.dormforce.nuis.support.pojo.Announcement;
import net.dormforce.nuis.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/18 0018.
 */
@Service("announcementService")
public class AnnoucementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementDao announcementDao;

    @Override
    public List<Announcement> getAnnouncements() {
        return announcementDao.findAnnoucements();
    }

    @Override
    public Announcement getAnnouncement(int announcementId) {
        return announcementDao.findAnnouncement(announcementId);
    }

    @Override
    public Boolean saveAnnouncement(Announcement announcement) {
        if(announcement.getAnnouncementId() != null){
            return announcementDao.updateAnnouncement(announcement);
        }else {
            return announcementDao.addAnnouncement(announcement);
        }
    }

    @Override
    public Boolean removeAnnouncement(int announcementId) {
        return announcementDao.deleteAnnouncement(announcementId);
    }
}
