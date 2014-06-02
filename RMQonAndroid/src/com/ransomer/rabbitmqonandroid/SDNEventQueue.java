/**
 * 
 */
package com.ransomer.rabbitmqonandroid;

import java.io.BufferedReader;
import java.util.ArrayList;

import android.content.Context;

/**
 * @author ransomer
 *This is my 'controller' code...
 *Starting out by storing one array list of SDNEvents in a singleton.
 *To make a singleton: 
 *1) Create a class with a private constructor
 *2) Create a get() method that returns the instance
 */
public class SDNEventQueue {
	private ArrayList<SDNEvent> mSDNEvents;
	
	private static SDNEventQueue sSDNEventQueue;
	private Context mAppContext;
	
	private SDNEventQueue(Context appContext) {
		mAppContext = appContext;
		mSDNEvents = new ArrayList<SDNEvent>();
		//insert
	}
	
	public static SDNEventQueue get(Context c) {
		if (sSDNEventQueue == null) {
			//Use application context for application wide singleton
			sSDNEventQueue = new SDNEventQueue(c.getApplicationContext());
		}
		return sSDNEventQueue;
	}
	
	public ArrayList<SDNEvent> getSDNEvents(){
		return mSDNEvents;
	
	}
	
	

	
}
