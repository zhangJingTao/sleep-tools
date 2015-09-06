package com.sleep.common;

/**
 * UtilsConfig
 *
 * @author Zhang Jingtao
 * @date 2015/9/6
 */
public class UtilsConfig {
    //LogUtil根据该属性判断在执行指定utils时，是否打印日志
    Boolean showLog = false;

    public Boolean getShowLog() {
        return showLog;
    }

    public void setShowLog(Boolean showLog) {
        this.showLog = showLog;
    }
}
