package com.example.android.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.android.viewpager.data.Item;

import java.util.ArrayList;

public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.ItemViewHolder> {

    private static final String TAG = GreenAdapter.class.getSimpleName();

    private int mNumberItems;
    private ArrayList<Item> mItemsList;
    private int mBgColor;

    final private ItemClickListener mItemClickListener;


    public GreenAdapter(ItemClickListener listener, ArrayList<Item> itemsList, String bgColor) {
//        mNumberItems = numberOfItems;
        mItemsList = itemsList;
        mNumberItems = itemsList.size();
        mBgColor = Color.parseColor(bgColor);
        mItemClickListener = listener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        ItemViewHolder viewHolder = new ItemViewHolder(view);
//        view.setBackgroundColor(Color.parseColor("#f06292"));
        view.setBackgroundColor(mBgColor);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = mItemsList.get(position);
//        holder.bind(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public interface ItemClickListener {
        void onItemClickListener(int itemId);
    }

    public ArrayList<Item> getListItems(){
        return mItemsList;
    }

    public void setListItems(ArrayList<Item> list){
        mItemsList = list;
//        notifyDataSetChanged();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        TextView listItem;
        TextView weightItem;
        CheckBox selectedItem;

        public ItemViewHolder(View itemView) {
            super(itemView);
            listItem = (TextView) itemView.findViewById(R.id.tv_item);
            weightItem = (TextView) itemView.findViewById(R.id.tv_weight);
            selectedItem = (CheckBox) itemView.findViewById(R.id.checkBox);
            itemView.setOnClickListener(this);
        }

//        void bind(int listIndex) {
//            listItem.setText(String.valueOf(listIndex) + " ***");
//            weightItem.setText("2 kg");
//        }

        void bind(Item item) {
            listItem.setText(item.getName());
            weightItem.setText(String.valueOf(item.getAmount()));
        }

        @Override
        public void onClick(View v) {
            Log.d("ItemClick","Item clicked! Eee!");
        }
    }

}
