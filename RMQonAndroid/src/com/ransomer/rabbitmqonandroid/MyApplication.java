package com.ransomer.rabbitmqonandroid;

import android.app.Application;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;



import java.util.ArrayList;

public class MyApplication extends Application {

	public static ConnectionFactory mFactory;
	public static Connection mConnection;
	//public static ArrayList<DummyItem> mChannels;
	public static Channel currentChannel;
	//public static int sid = MQService.startId; 
	public static boolean connectionActive = false;
	private String queue_name;
	private String binding_key;
	

	
	public void setData(String queue_name, String binding_key){
		this.queue_name = queue_name;
		this.binding_key = binding_key;
	}
	
	private QueueingConsumer MySubscription;
	//byte[] mLastMessage;  //last message to post back
	
}
