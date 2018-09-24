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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.viewpager.data.Item;

import java.util.ArrayList;

/**
 * Fragment that displays "Monday".
 */
public class VegetablesFragment extends Fragment {

    private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;
    //    private static final int NUM_LIST_ITEMS = 100;
    private String categoryColor = "#b2ff59";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final ArrayList<Item> vegItemsList = new ArrayList<Item>();
        vegItemsList.add(new Item("tomato", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("cucumbers", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("pepper", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("cabbage", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("beet", 3.0, 1.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("carrot", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("lettuce-hasa", 6.0, 1.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("lettuce-baby", 6.0, 1.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("spring onions", 6.0, 0.5, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("onion", 3.0, 1.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("apples", 3.0, 2.0, Item.Ranks.VEGETABLE));
        vegItemsList.add(new Item("oranges", 3.0, 2.0, Item.Ranks.VEGETABLE));

//        mNumbersList = (RecyclerView) findViewById(R.id.rv_numbers);
//        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
        mAdapter = new GreenAdapter(vegItemsList, categoryColor);
        View rootView = inflater.inflate(R.layout.fragment_vegetables, container, false);

        mNumbersList = (RecyclerView) rootView.findViewById(R.id.rv_numbers);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mNumbersList.setLayoutManager(layoutManager);
        mNumbersList.setHasFixedSize(true);
        mNumbersList.setAdapter(mAdapter);
//      // ------ Check recyckler items checked !!!! ----
//        int count = mNumbersList.getChildCount();
//        GreenAdapter.ItemViewHolder holder =
//                (GreenAdapter.ItemViewHolder) mNumbersList.findViewHolderForAdapterPosition(0);
//        boolean isChecked = holder.selectedItem.isChecked();
        //-----------------------------------------------

        return mNumbersList;
    }

    @Override
    public void onResume() {
        super.onResume();
//        getActivity().setTitle("Vegetables");
    }
}
