package com.mhdante.androidryersonsdc;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class FragmentColour extends Fragment {

    View rootView;
    public FragmentColour() { /*noop*/ }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fragment_colour, container, false);

        Random rand = new Random();
        int c = Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        rootView.setBackgroundColor(c);
        return rootView;
    }

}
