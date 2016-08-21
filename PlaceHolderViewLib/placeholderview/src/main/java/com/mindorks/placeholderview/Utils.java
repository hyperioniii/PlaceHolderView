package com.mindorks.placeholderview;

import android.content.Context;

/**
 * Created by janisharali on 20/08/16.
 */
public class Utils {

    /**
     *
     * @param context
     * @return
     */
    protected static int getDeviceWidth(Context context){
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /**
     *
     * @param context
     * @return
     */
    protected static int getDeviceHeight(Context context){
        return context.getResources().getDisplayMetrics().heightPixels;
    }
}