package com.shing.blurstickytab;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.shing.blurstickytab.ui.BlurStickyActivity;
import com.shing.blurstickytab.ui.ScaleBanner2Activity;
import com.shing.blurstickytab.ui.ScaleBannerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Name: MainActivity
 * Author: Shing
 * Date: 17/12/26 下午3:23
 * Description: ..
 */

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_blurSticky)
    Button btnBlurSticky;
    @BindView(R.id.btn_scale_banner)
    Button btnScaleBanner;
    @BindView(R.id.btn_scale_banner2)
    Button btnScaleBanner2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);
        btnBlurSticky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BlurStickyActivity.class));
            }
        });

        btnScaleBanner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScaleBanner2Activity.class));
            }
        });


    }

    @OnClick(R.id.btn_scale_banner)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this, ScaleBannerActivity.class));
    }
}
