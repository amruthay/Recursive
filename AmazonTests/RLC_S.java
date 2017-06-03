package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLC_S extends RTBB_Joincode_Chrome {
	
	@Test
	public void testC_S() throws Exception {
		
		RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.addingExtension();
        String x=p.chromeJoincode();  
        p.safariGuest();
        String name=p.guestJoin(x);	
        p.guestJoinNotification(name);
	      p.guestLeaving();
	}

}

