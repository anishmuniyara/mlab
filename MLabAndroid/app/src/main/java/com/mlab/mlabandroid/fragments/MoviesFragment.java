package com.mlab.mlabandroid.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mlab.mlabandroid.R;
import com.mlab.mlabandroid.list.JobCustomAdapter;
import com.mlab.mlabandroid.list.JobModel;

import java.util.ArrayList;

/**
 * Created by Anish Antony on 16-12-2017.
 */

public class MoviesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<JobModel> dataModels;
    ListView listView;
    private static JobCustomAdapter adapter;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MoviesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MoviesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MoviesFragment newInstance(String param1, String param2) {
        MoviesFragment fragment = new MoviesFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);

         listView=(ListView)rootView.findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new JobModel("Apple Pie", "Android 1.0", "1","September 23, 2008"));
        dataModels.add(new JobModel("Banana Bread", "Android 1.1", "2","February 9, 2009"));
        dataModels.add(new JobModel("Cupcake", "Android 1.5", "3","April 27, 2009"));
        dataModels.add(new JobModel("Donut","Android 1.6","4","September 15, 2009"));
        dataModels.add(new JobModel("Eclair", "Android 2.0", "5","October 26, 2009"));
        dataModels.add(new JobModel("Froyo", "Android 2.2", "8","May 20, 2010"));
        dataModels.add(new JobModel("Gingerbread", "Android 2.3", "9","December 6, 2010"));
        dataModels.add(new JobModel("Honeycomb","Android 3.0","11","February 22, 2011"));
        dataModels.add(new JobModel("Ice Cream Sandwich", "Android 4.0", "14","October 18, 2011"));
        dataModels.add(new JobModel("Jelly Bean", "Android 4.2", "16","July 9, 2012"));
        dataModels.add(new JobModel("Kitkat", "Android 4.4", "19","October 31, 2013"));
        dataModels.add(new JobModel("Lollipop","Android 5.0","21","November 12, 2014"));
        dataModels.add(new JobModel("Marshmallow", "Android 6.0", "23","October 5, 2015"));

        adapter= new JobCustomAdapter(dataModels,getActivity());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                JobModel dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
