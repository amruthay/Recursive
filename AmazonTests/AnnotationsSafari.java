package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;


public class AnnotationsSafari extends RTBB_Joincode_Chrome {

	@Test
	public void safariAnnotations() throws Exception {
		
	    RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.safariHost();   
        p.selectingUI(); 
        p.joinCode(); 
        //p.verifyAnnotations();
       // p.chooseColour(4);
        //p.doubleClickAnnotation("Free_Hand_Tool");
        p.drawOval();
        //p.freeHand();
        //p.drawArrow();
        //p.drawRectangle();
        //p.textBubble();    		
	   
	}

}


