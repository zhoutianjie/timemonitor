package com.ztj.debugtool;

import android.util.Log;

import java.util.HashMap;

/**
 * Created by zhoutianjie on 2019/1/11.
 */

public class TimeMonitor {
    private final String TAG = "TimeMonitor";
    private int monitorId = -1;
    private HashMap<String,Long> mTimeTag = new HashMap<>();
    private long mStartTime = 0;

    public TimeMonitor(int monitorId) {
        Log.d(TAG,"init TimeMonitor id "+monitorId);
        this.monitorId = monitorId;
    }

    public int getMonitorId(){
        return monitorId;
    }

    public void startMonitor(){
        if(mTimeTag.size()>0){
            mTimeTag.clear();
        }
        mStartTime = System.currentTimeMillis();
    }

    /**
     * 打点统计时间 tag标记需要统计时间的模块或者方法
     * @param tag
     */
    public void recordingTimeTag(String tag){
        if(mTimeTag.get(tag)!=null){
            mTimeTag.remove(tag);
        }

        long time = System.currentTimeMillis()-mStartTime;
        Log.e(TAG,tag+" : "+time);
        mTimeTag.put(tag,time);
    }


    public HashMap<String,Long> getmTimeTags(){
        return mTimeTag;
    }
}
