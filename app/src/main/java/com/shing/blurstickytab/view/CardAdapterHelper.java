package com.shing.blurstickytab.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.shing.blurstickytab.utils.LogUtils;
import com.shing.blurstickytab.utils.ScreenUtil;


/**
 * Author: SNXJ
 * Date: 2018-1-5
 * Description:
 * <p>
 * adapter中调用onCreateViewHolder, onBindViewHolder
 */
public class CardAdapterHelper {
    private int mPagePadding = 10;
    private int mShowLeftCardWidth = 15;

    public void onCreateViewHolder(ViewGroup parent, View itemView) {
        RecyclerView.LayoutParams lp = (RecyclerView.LayoutParams) itemView.getLayoutParams();
        lp.width = parent.getWidth() - ScreenUtil.dip2px(itemView.getContext(), 2 * (mPagePadding + mShowLeftCardWidth));
        LogUtils.i("====onCreate====", lp.width + "+============+");
        itemView.setLayoutParams(lp);
    }

//    public void onBindViewHolder(View itemView, final int position, int itemCount) {
//        int padding = ScreenUtil.dip2px(itemView.getContext(), mPagePadding);
//        itemView.setPadding(padding, 0, padding, 0);
//        int leftMarin = position == 0 ? padding + ScreenUtil.dip2px(itemView.getContext(), mShowLeftCardWidth) : 0;
//        int rightMarin = position == itemCount - 1 ? padding + ScreenUtil.dip2px(itemView.getContext(), mShowLeftCardWidth) : 0;
//        LogUtils.i("====onBindViewHolder====", position + "+============+" + itemCount+"=================="+leftMarin + "+============+" + rightMarin);
//        setViewMargin(itemView, leftMarin, 0, rightMarin, 0);
//    }

//    private void setViewMargin(View view, int left, int top, int right, int bottom) {
//        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
//
//        LogUtils.i("====set====", lp.leftMargin+"="+left + "+====l=====top===+" +  lp.topMargin +"="+top+"==============right===="+lp.rightMargin +"="+ right + "+=========bottom===+" + lp.bottomMargin +"="+ bottom);
//        if (lp.leftMargin != left || lp.topMargin != top || lp.rightMargin != right || lp.bottomMargin != bottom) {
//            lp.setMargins(left, top, right, bottom);
//            view.setLayoutParams(lp);
//        }
//    }

    public void setPagePadding(int pagePadding) {
        mPagePadding = pagePadding;
    }

    public void setShowLeftCardWidth(int showLeftCardWidth) {
        mShowLeftCardWidth = showLeftCardWidth;
    }
}
