/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private FragmentManager mFm;
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mFm = fm;
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            MilkFragment sf = new MilkFragment();
            return sf;
        } else if (position == 1) {
            return new VegetablesFragment();
        } else if (position == 2) {
            return new MeatFragment();
        } else if (position == 3) {
            return new WaterFragment();
        } else if (position == 4) {
            return new BreadFragment();
        } else {
            Bundle bundl = new Bundle();
            String day = "-Friday-";
            bundl.putString("day", day);
            Fragment dv = new DayFragment();
            dv.setArguments(bundl);
            return dv;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        if (position == 0) {
            return mContext.getString(R.string.category_milk);
        } else if (position == 1) {
            return mContext.getString(R.string.category_vegetable);
        } else if (position == 2) {
            return mContext.getString(R.string.category_meat);
        } else if (position == 3){
            return mContext.getString(R.string.category_water);
        } else {
            return mContext.getString(R.string.category_bread);
        }
    }
}
