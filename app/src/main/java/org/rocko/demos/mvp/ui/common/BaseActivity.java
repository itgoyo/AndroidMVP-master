package org.rocko.demos.mvp.ui.common;

import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by itgoyo on 2017/3/8.
 */
public class BaseActivity extends ActionBarActivity {

    protected  <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
