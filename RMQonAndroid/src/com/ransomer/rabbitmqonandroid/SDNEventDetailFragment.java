package com.ransomer.rabbitmqonandroid;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ransomer.rabbitmqonandroid.R;
import com.ransomer.rabbitmqonandroid.dummy.SDNEventStreams;

/**
 * A fragment representing a single SDNEvent detail screen. This fragment is
 * either contained in a {@link SDNEventListActivity} in two-pane mode (on
 * tablets) or a {@link SDNEventDetailActivity} on handsets.
 */
public class SDNEventDetailFragment extends ListFragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private SDNEventStreams.SDNEventQueue mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public SDNEventDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = SDNEventStreams.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}
	
	//Create a new adapter that knows how to work with SDNEvent objects
	private class SDNEventAdapter extends ArrayAdapter<SDNEvent> {
		public SDNEventAdapter(ArrayList<SDNEvent> sdnevents) {
		super(getActivity(), 0, sdnevents);
		}
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		// If we weren't given a view, inflate one
		if (convertView == null) {
			convertView = getActivity().getLayoutInflater()
					.inflate(R.layout.fragment_sdnevent_detail, null);
		}
		
		// Configure the view for this SDNEvent, this is where you use your setters...
		SDNEvent s = getItem(position);
		TextView titleTextView =
		(TextView)convertView.findViewById(R.id.sdnevent_detail_container);
		titleTextView.setText(s.getLogType());
		TextView dateTextView =
		(TextView)convertView.findViewById(R.id.sdnevent_detail_container);
		dateTextView.setText(c.getDate().toString());
		
		
		return convertView;
	}
	
	
	//Create and configure the fragment's view, inflate layout
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_sdnevent_detail,
				container, false);
		/*
		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.sdnevent_detail))
					.setText(mItem.content);
		}
		*/
		return rootView;
	}
}
