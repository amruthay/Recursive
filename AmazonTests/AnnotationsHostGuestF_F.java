package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;


public class AnnotationsHostGuestF_F extends RTBB_Joincode_Chrome {

	@Test
	public void host_guestAnnotationsF_F() throws Exception {
		
		RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.firefoxHost(); 
        p.selectingUI(); 
        String x=p.joinCode();
        p.firefoxGuest();
        p.guestJoin(x);  
        p.verifyAnnotations();
        //p.chooseColour(4);
        //p.doubleClickAnnotation("Free_Hand_Tool");
        //p.drawOval();
        //p.freeHand();
        //p.drawArrow();
        //p.textBubble();  
        p.drawRectangle();
        p.verifyRectangle();
        p.verifyAnnotationsGuest();
        p.drawRectangleGuest();
        p.verifyRectangleGuest();
        p.screenshotHost();
        p.screenshotGuest();
        p.imageComparison();
        p.hostLeaving();   
	}

}


