package com.huangjie.draganddraw;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment creatFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
