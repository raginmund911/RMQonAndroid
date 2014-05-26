/**
 * 
 */
package com.ransomer.rabbitmqonandroid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author ransomer
 *This is my 'controller' code...
 */
public class SDNEventQueue {
	private ArrayList <SDNEvent> eventArray = new ArrayList<SDNEvent>();
	
	//Initializer to read a text file into an array of SDNEvent objects
	public SDNEventQueue (String queueFilename) {
		String line;
		BufferedReader br;
	
		try{
	        br = new BufferedReader(new InputStreamReader(getResources().getAssets().open(queueFilename)));
	 
	        while((line = br.readLine()) != null) {
	            StringTokenizer sTok = new StringTokenizer(line, ":");
	            SDNEvent sdn = new SDNEvent(sTok.nextToken());
	            sdn.address = sTok.nextToken();
	            eventArray.add(sdn);
	           }
	
	}
	
	//Method to retrieve events
	public ArrayList<SDNEvent> getSDNEvents() {
		return eventArray;
	}
	
	
}
