package com.example.sehwan.origami;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Sehwan on 2016-06-10.
 */
public class OriSampleView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new OriSurfaceView(this));
    }
}
