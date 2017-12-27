package com.shing.blurstickytab.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.shing.blurstickytab.R;

import java.util.List;

/**
 * Name: AbSearchAdapter
 * Author: SNXJ
 * Date: 2017-12-19
 * Description:描述：
 */
public class BlurRecyclerViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public BlurRecyclerViewAdapter(@Nullable List<String> data) {
        super(R.layout.recycle_view_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }

}
