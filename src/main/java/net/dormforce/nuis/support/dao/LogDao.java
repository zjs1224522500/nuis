package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.Log;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LogDao {

    public List<Log> findLogs();

    public Log findLogById(int logId);

    public List<Log> findLogByUser(String actor);

    public Boolean updateLog(Log log);

    public Boolean addLog(Log log);

    public Boolean deleteLog(int logId);
}