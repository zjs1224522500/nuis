package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.MeetingMinutes;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MeetingMinutesDao {

    public MeetingMinutes findMeetingMinutesById(int meetingMinuteId);

    public List<MeetingMinutes> findMeetingMinutes();

    public Boolean addMeetingMinutes(MeetingMinutes meetingMinutes);

    public Boolean updateMeetingMinutes(MeetingMinutes meetingMinutes);

    public Boolean deleteMeetingMinutes(int meetingMinuteId);

}