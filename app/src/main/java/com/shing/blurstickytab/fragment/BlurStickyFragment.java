package com.shing.blurstickytab.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.shing.blurstickytab.adapter.BlurRecyclerViewAdapter;
import com.shing.blurstickytab.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Name: LiveRankAnchorFragment
 * Author: SNXJ
 * Date: 2017-11-10
 * Description:
 */
public class BlurStickyFragment extends Fragment {
    public static final String TITLE = "title";
    private String mTitle = "";


    public void initData(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mTitle = getArguments().getString(TITLE);
        }
        initMyDate();
    }

    List<String> list = new ArrayList<>();
    RecyclerView recyclerView;

    public void initMyDate() {
        for (int i = 0; i < 15; i++) {
            list.add("");//模拟数据
        }
        BlurRecyclerViewAdapter adapter = new BlurRecyclerViewAdapter(list);
        //瀑布流
//          recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
//
            }
        });
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.blur_sticky_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.id_sticky_layout_inner_scrollview);
        initData(savedInstanceState);
        return view;
    }

    public static BlurStickyFragment newInstance(String title) {
        BlurStickyFragment fragment = new BlurStickyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        fragment.setArguments(bundle);
        return fragment;
    }
}
