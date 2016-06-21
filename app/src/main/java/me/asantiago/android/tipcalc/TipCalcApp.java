package me.asantiago.android.tipcalc;

import android.app.Application;

/**
 * Created by Amador on 04/06/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "http://twitter.com/Amador368";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
