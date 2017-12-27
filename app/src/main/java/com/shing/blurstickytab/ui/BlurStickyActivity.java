package com.shing.blurstickytab.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


import com.shing.blurstickytab.R;
import com.shing.blurstickytab.adapter.FragmentAdapter;
import com.shing.blurstickytab.fragment.BlurStickyFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Name: BlurStickyActivity
 * Author: Shing
 * Date: 17/12/26 下午3:33
 * Description: ..
 */

public class BlurStickyActivity extends AppCompatActivity {

    @BindView(R.id.id_sticky_layout_indicator)
    TabLayout tab;
    @BindView(R.id.id_sticky_layout_viewpager)
    ViewPager mViewPager;
    private String[] mTitles = new String[]{"微博", "视频", "资料"};
    private List<Fragment> fragments = new ArrayList<>();
    private FragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blur_sticky_ctivity);
        ButterKnife.bind(this);
        mViewPager = (ViewPager) findViewById(R.id.id_sticky_layout_viewpager);
        initDatas();
    }


    private void initDatas() {
        for (int i = 0; i < mTitles.length; i++) {
            fragments.add(BlurStickyFragment.newInstance(mTitles[i]));
        }
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragments, mTitles);
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setAdapter(adapter);
        tab.setupWithViewPager(mViewPager);
//        TabLayoutUtil.setTabIndicator(tab, 30, 30);
    }

}
