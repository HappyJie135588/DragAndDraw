package com.huangjie.draganddraw;

import android.graphics.PointF;

/**
 * Created by HuangJie on 2016/9/1.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }

    public void setCurrent(PointF mCurrent) {
        this.mCurrent = mCurrent;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
