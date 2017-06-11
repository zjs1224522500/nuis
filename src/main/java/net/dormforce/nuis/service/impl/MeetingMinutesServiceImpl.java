package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.MeetingMinutesService;
import net.dormforce.nuis.support.dao.MeetingMinutesDao;
import net.dormforce.nuis.support.pojo.MeetingMinutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
@Service("meetingMinutesService")
public class MeetingMinutesServiceImpl implements MeetingMinutesService {

    @Autowired
    private MeetingMinutesDao meetingMinutesDao;

    @Override
    public List<MeetingMinutes> getMeetingMinutesList() {
        return meetingMinutesDao.findMeetingMinutes();
    }

    @Override
    public MeetingMinutes getMeetingMinutesById(int meetingMinutesId) {
        return meetingMinutesDao.findMeetingMinutesById(meetingMinutesId);
    }

    @Override
    public Boolean saveMeetingMinutes(MeetingMinutes meetingMinutes) {
        if(meetingMinutes.getMeetingMinutesId() != null){
            return  meetingMinutesDao.updateMeetingMinutes(meetingMinutes);
        }else {
            return meetingMinutesDao.addMeetingMinutes(meetingMinutes);
        }
    }

    @Override
    public Boolean removeMeetingMinutes(int meetingMinutesId) {
        return meetingMinutesDao.deleteMeetingMinutes(meetingMinutesId);
    }
}
