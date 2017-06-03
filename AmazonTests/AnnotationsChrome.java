package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;


public class AnnotationsChrome extends RTBB_Joincode_Chrome {

	@Test
	public void chromeAnnotations() throws Exception {
		
		RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.addingExtension();
	    p.chromeJoincode();
        p.verifyAnnotations();
        p.chooseColour(4);
        p.doubleClickAnnotation("Free_Hand_Tool");
        p.drawOval();
        p.freeHand();
        p.drawArrow();
        p.drawRectangle();
        p.textBubble();     		
	   
	}

}

