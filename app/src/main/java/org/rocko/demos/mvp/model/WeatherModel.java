package org.rocko.demos.mvp.model;

import org.rocko.demos.mvp.presenter.OnWeatherListener;

/**
 * Created by itgoyo on 2017/3/8.
 * 天气Model接口
 */
public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
