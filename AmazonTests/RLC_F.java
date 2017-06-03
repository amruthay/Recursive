package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLC_F extends RTBB_Joincode_Chrome {
   
	
	@Test
	public void chromeFirefox() throws Exception {
	 
	    RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.addingExtension();
        String x=p.chromeJoincode();
        p.firefoxGuest();
		String name=p.guestJoin(x);	
        p.guestJoinNotification(name);
           p.guestLeaving();
	}
}

