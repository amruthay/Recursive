package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLC_C extends RTBB_Joincode_Chrome {
	
	@Test
	public void chromeExtension() throws Exception {
		
		RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.addingExtension();
        String x=p.chromeJoincode();  
        p.chromeGuest();
        String name=p.guestJoin(x);	
        p.guestJoinNotification(name);
        Thread.sleep(1000);
        p.screenshotHost();
        p.screenshotGuest();
        p.imageComparison();
        p.guestLeaving();
	   
	}

}
