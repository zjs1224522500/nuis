package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.LogService;
import net.dormforce.nuis.support.dao.LogDao;
import net.dormforce.nuis.support.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
@Service("logService")
public class LogServiceImpl implements LogService{

    @Autowired
    private LogDao logDao;

    @Override
    public List<Log> getLogs() {
        return logDao.findLogs();
    }

    @Override
    public List<Log> getLogsByUser(String actor) {
        return logDao.findLogByUser(actor);
    }

    @Override
    public Log getLogById(int logId) {
        return logDao.findLogById(logId);
    }

    @Override
    public Boolean saveLog(Log log) {
        if(log.getLogId() != null){
            return logDao.updateLog(log);
        }else {
            return logDao.addLog(log);
        }
    }

    @Override
    public Boolean removeLog(int logId) {
        return logDao.deleteLog(logId);
    }
}
