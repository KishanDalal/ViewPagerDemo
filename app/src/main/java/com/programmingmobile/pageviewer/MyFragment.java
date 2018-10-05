package com.programmingmobile.pageviewer;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFragment extends Fragment {
	public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
	public  static final String EXTRA_MESSAGE1 = "Extra_Message";
	
	public static final MyFragment newInstance(String message, String image)
	{
		MyFragment fragment = new MyFragment();
		Bundle bdl = new Bundle();

		bdl.putString(EXTRA_MESSAGE, message);
	    bdl.putString(EXTRA_MESSAGE1, image);
	    fragment.setArguments(bdl);
	    return fragment;
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {

		// Adds string message to layout
		String message = getArguments().getString(EXTRA_MESSAGE);
		//
		String imp = getArguments().getString(EXTRA_MESSAGE1);


		View v = inflater.inflate(R.layout.myfragment_layout, container, false);

		TextView messageTextView = (TextView)v.findViewById(R.id.textView);
		ImageView image = (ImageView)v.findViewById(R.id.imageView);

		messageTextView.setText(message);
		image.setImageResource(getResources().getIdentifier(imp, "drawable", getActivity().getPackageName()));
        return v;
    }
}
