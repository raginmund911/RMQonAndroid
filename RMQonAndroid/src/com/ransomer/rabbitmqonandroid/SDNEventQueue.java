/**
 * 
 */
package com.ransomer.rabbitmqonandroid;

import java.io.BufferedReader;
import java.util.ArrayList;

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
	
		
	
	}
	
	//methods to retrieve queue names
	public 

	//Method to retrieve events
	public ArrayList<SDNEvent> getSDNEvents() {
		return eventArray;
	}
	
	
}
