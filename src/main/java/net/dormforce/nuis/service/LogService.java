package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.Log;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/27 0027.
 */
public interface LogService {

    public List<Log> getLogs();

    public List<Log> getLogsByUser(String actor);

    public Log getLogById(int logId);

    public Boolean saveLog(Log log);

    public Boolean removeLog(int logId);

}
