package org.rocko.demos.mvp.ui.view;

import org.rocko.demos.mvp.model.entity.Weather;

/**
 * Created by itgoyo on 2017/3/8.
 */
public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
