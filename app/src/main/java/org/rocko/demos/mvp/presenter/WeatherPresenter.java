package org.rocko.demos.mvp.presenter;

/**
 * Created by itgoyo on 2017/3/8.
 * 天气 Presenter接口
 */
public interface WeatherPresenter {
    /**
     * 获取天气的逻辑
     */
    void getWeather(String cityNO);

}
