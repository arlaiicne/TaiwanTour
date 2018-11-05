package com.example.tongl.taiwantour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {
    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        //picture from https://upload.wikimedia.org/wikipedia/commons/1/1a/Taipei_101_2009_amk-EditMylius.jpg
        attractions.add(new Attraction(R.string.landmark_taipei_description, R.string.landmark_taipei_101, R.drawable.taipei_101));
        //picture from https://res.klook.com/images/fl_lossy.progressive,q_65/c_fill,w_1200,h_630,f_auto/w_80,x_15,y_15,g_south_west,l_klook_water/activities/j8evvgbchhrx8c5zag7f/Jiufen,ShifenandKeelungMiaokowNightMarketShuttleBusfromXimen.jpg
        attractions.add(new Attraction(R.string.landmark_jiufen_description, R.string.landmark_jiufen, R.drawable.jiufen));
        //picture from https://upload.wikimedia.org/wikipedia/commons/3/3e/Qinbi_Village_%E8%8A%B9%E5%A3%81%E6%9D%91_-_panoramio.jpg
        attractions.add(new Attraction(R.string.landmark_qinbi_description, R.string.landmark_qinbi_village, R.drawable.qinbi_village));

        // Create an {@link AttractionsAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions, R.color.category_landmarks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}


