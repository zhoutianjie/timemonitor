package com.ztj.debugtool;

import android.util.SparseArray;

/**
 * Created by zhoutianjie on 2019/1/11.
 */

public class TimeMonitorManager {

    private SparseArray<TimeMonitor> monitors;

    private TimeMonitorManager() {
        monitors = new SparseArray<>();
    }

    private static class SingleTonHolder{
        private static TimeMonitorManager instance = new TimeMonitorManager();
    }

    public static TimeMonitorManager Instance(){
        return SingleTonHolder.instance;
    }

    public void resetTimeMonitor(int id){
        TimeMonitor timeMonitor = monitors.get(id);
        if(timeMonitor !=null){
            monitors.remove(id);
        }
        getTimeMonitor(id);
    }

    private TimeMonitor getTimeMonitor(int id) {
        TimeMonitor timeMonitor = monitors.get(id);
        if(timeMonitor == null){
            timeMonitor = new TimeMonitor(id);
            monitors.put(id,timeMonitor);
        }
        return timeMonitor;
    }


}
