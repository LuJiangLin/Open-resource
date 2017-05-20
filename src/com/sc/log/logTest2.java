package com.sc.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

public class logTest2 {
	
	// 在任何需要记录日志的类中   
	//private static Log log = LogFactory.getLog(logTest1.class);   
    private static Logger log = Logger.getLogger(logTest2.class);
    
    private static Log logger1 = LogFactory.getLog("mylogger1");
    private static Log logger2 = LogFactory.getLog("mylogger2");
    
    public static String one() {   
    	log.info( "into one method2" );   
    	try {   
    		System. out .println(9/0);   
    	} catch (RuntimeException e) {   
    		//log .error(e.getMessage());   
    		e.getStackTrace();
    	}   
    	logger1.info( "out one method2" );
    	logger2.info( "成功进入one()2" );
    	System.out.println("成功了2。。。");
		return "success";   
    }   

    public static void main(String[] args) {   
    	one(); 
    }   
	
}
