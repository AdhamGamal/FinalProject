package com.udacity.gradle.jokedisplay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeActivityFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        String joke = getActivity().getIntent().getExtras().getString("joke");
        if (joke != null && joke.length() != 0) {
            ((TextView) root.findViewById(R.id.joke_textview)).setText(joke);
        }
        return root;
    }
}
