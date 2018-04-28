package com.example.android.viewpager;

/**
 * Created by Arkady on 28-Apr-18.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment that displays "Monday".
 */
public class DayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
//        String[] myStrings=bundle.getStringArray("day");
        String myStrings = bundle.getString("day");
//        TextView day_text = (TextView) getActivity().findViewById(R.id.text_day);
//        day_text.setText(myStrings);
        Log.v("DAY_Fragment:", myStrings);
//        Log.v("DAY_Fragment:", day_text.getText().toString());
        View view = inflater.inflate(R.layout.fragment_friday, container, false);
        TextView day_text = (TextView)view.findViewById(R.id.text_day);
//        Log.v("DAY_Fragment:", day_text.getText().toString());
        day_text.setText(myStrings);
        return view;
    }
}
