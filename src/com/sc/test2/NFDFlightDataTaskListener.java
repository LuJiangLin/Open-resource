package com.sc.test2;

import javax.servlet.ServletContextEvent;

public class NFDFlightDataTaskListener {

	
	 public void contextInitialized(ServletContextEvent sce) {
         new TimerManager();
    }
 
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
         
    }
}
