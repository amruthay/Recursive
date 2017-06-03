package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;


public class AnnotationsEdge extends RTBB_Joincode_Chrome {

	@Test
	public void edgeAnnotations() throws Exception {
		
		RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
        p.edgeHost();   
        p.selectingUI(); 
        String x=p.joinCode(); 
        p.verifyAnnotations();
        p.chooseColour(4);
        p.drawOval();
       // p.freeHand();
       // p.drawArrow();
       // p.drawRectangle();
        p.textBubble();     		
	   
	}

}


