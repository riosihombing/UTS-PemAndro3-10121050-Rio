/*
 *     Tanggal Pengerjaan : 7/6/2024
 *     Nim : 10121050
 *     Nama : Rio Christian Cesar Sihombing
 *     email :riosihombing047@gmail.com
 *     Copyright © 2024 Rio Sihombing. All rights reserved.
 */
package com.rio.myself;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class DailyFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.Adapter recyclerViewAdapter2;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    RecyclerView.LayoutManager recylerViewLayoutManager2;
    ArrayList<DailyModel> data;
    ArrayList<FriendModel> data2;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public DailyFragment() {

    }

    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recylerViewLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i < DailyItem.Headline.length; i++) {
            data.add(new DailyModel(
                    DailyItem.Headline[i],
                    DailyItem.Subhead[i],
                    DailyItem.iconList[i]
            ));
        }

        recyclerViewAdapter = new AdapterDaily(data);
        recyclerView.setAdapter(recyclerViewAdapter);
        //FriendList
        recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);

        LinearLayoutManager recylerViewLayoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(recylerViewLayoutManager2);
        recyclerView2.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        data2 = new ArrayList<>();
        for (int i = 0; i < FriendItem.Headline.length; i++) {
            data2.add(new FriendModel(
                    FriendItem.Headline[i],
                    FriendItem.Subhead[i],
                    FriendItem.iconList[i]
            ));
        }

        recyclerViewAdapter2 = new AdapterFriend(data2);
        recyclerView2.setAdapter(recyclerViewAdapter2);
        return view;

    }
}