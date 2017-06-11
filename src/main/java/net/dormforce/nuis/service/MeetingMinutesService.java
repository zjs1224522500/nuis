package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.MeetingMinutes;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
public interface MeetingMinutesService {

    public List<MeetingMinutes> getMeetingMinutesList();

    public MeetingMinutes getMeetingMinutesById(int meetingMinutesId);

    public Boolean saveMeetingMinutes(MeetingMinutes meetingMinutes);

    public Boolean removeMeetingMinutes(int meetingMinutesId);
}
