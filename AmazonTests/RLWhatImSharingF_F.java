package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLWhatImSharingF_F extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testShareF_F() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
   p.firefoxHost();   
   p.selectingUI(); 
   String x=p.joinCode();
   p.firefoxGuest();
   p.guestJoin(x);  
   String Guest=p.guestPageScreenshot();
   p.seeWhatImSharing(Guest);    
   p.guestLeaving();
   
   }
   	   

}






