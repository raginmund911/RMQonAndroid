package com.ransomer.rabbitmqonandroid;


import java.util.UUID;

/* An instance of SDNEvent will represent a single log entry.  An example is listed below:
 * "2013-07-12 10:27:45.513 INFO  [n.f.c.m.FloodlightModuleLoader] Loading default modules"
 */
public class SDNEvent {
	 
	//private UUID mId; // an ID number will uniquely identify an instance of Crime
	private String mTimeStamp; //ex. - 2013-07-12 10:27:45.513
	private String mLogType; //ex. - DEBUG, INFO
	private String mClassName; //ex. - [n.f.c.m.FloodlightModuleLoader]
	private String mComment;//ex. - "Found Module net.floodlightcontroller.storage.memory.MemoryStorageSource"
		 
	//constructor for event
	SDNEvent(String Timestamp, String LogType, String ClassName, String Comment) {
		
	}

	
	@Override
    public String toString() {
        return mLogType;
    }
	
	public String getLogType() {
		return mLogType;
	}
	
	public void setTimeStamp (String timestamp){
		mTimeStamp = timestamp;
	}
	
	public void setLogType(String logtype){
		mLogType = logtype;
	}
	
	public void setClassName(String classname){
		mClassName = classname;
	}
	
	public void setComment (String comment){
		mComment = comment;
	}
}

