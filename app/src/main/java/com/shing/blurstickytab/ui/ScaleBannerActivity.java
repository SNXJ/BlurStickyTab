package com.shing.blurstickytab.ui;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.shing.blurstickytab.R;
import com.shing.blurstickytab.view.CardScaleHelper;

import java.util.ArrayList;
import java.util.List;

import com.shing.blurstickytab.adapter.CardAdapter;
import butterknife.ButterKnife;


/**
 * Name: ScaleBannerActivity
 * Author: Shing
 * Date: 2018/1/5 上午10:38
 * Description: ..
 */

public class ScaleBannerActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private ImageView mBlurView;
    private List<Integer> mList = new ArrayList<>();
    private CardScaleHelper mCardScaleHelper = null;
    private Runnable mBlurRunnable;
    private int mLastPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            View decorView = getWindow().getDecorView();
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//            decorView.setSystemUiVisibility(option);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }
        setContentView(R.layout.scale_banner_activity);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        for (int i = 0; i < 9; i++) {
            mList.add(R.mipmap.home_banner_1);
            mList.add(R.mipmap.home_banner_2);
            mList.add(R.mipmap.home_banner_3);

        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new CardAdapter(mList));
        // mRecyclerView绑定scale效果
        mCardScaleHelper = new CardScaleHelper();
        mCardScaleHelper.setCurrentItemPos(2);
        mCardScaleHelper.attachToRecyclerView(mRecyclerView);

//        initBlurBackground();
    }

//    private void initBlurBackground() {
//        mBlurView = (ImageView) findViewById(R.id.blurView);
//        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
//                    notifyBackgroundChange();
//                }
//            }
//        });
//
//        notifyBackgroundChange();
//    }
//
//    private void notifyBackgroundChange() {
//        if (mLastPos == mCardScaleHelper.getCurrentItemPos()) return;
//        mLastPos = mCardScaleHelper.getCurrentItemPos();
//        final int resId = mList.get(mCardScaleHelper.getCurrentItemPos());
//        mBlurView.removeCallbacks(mBlurRunnable);
//        mBlurRunnable = new Runnable() {
//            @Override
//            public void run() {
//                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), resId);
//                ViewSwitchUtils.startSwitchBackgroundAnim(mBlurView, BlurBitmapUtils.getBlurBitmap(mBlurView.getContext(), bitmap, 15));
//            }
//        };
//        mBlurView.postDelayed(mBlurRunnable, 500);
//    }
}
