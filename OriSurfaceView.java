package com.example.sehwan.origami;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Sehwan on 2016-06-04.
 */
public class OriSurfaceView extends GLSurfaceView {

    public OriSurfaceView(Context context) {
        super(context);

        setRenderer(new OriRenderer());
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


}
