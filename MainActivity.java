package com.gohool.covr.funimationanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable batAnimation;
    private ImageView batImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batImage = (ImageView) findViewById(R.id.batID);
        batImage.setBackgroundResource(R.drawable.bat_anim);
        batAnimation = (AnimationDrawable) batImage.getBackground();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        batAnimation.start();

        Handler mhandler = new Handler();
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                //stop animation
                batAnimation.stop();

            }
        }, 5000); //5seconds set in milliseconds

        return super.onTouchEvent(event);
    }

}
