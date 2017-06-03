package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLVideoF_F extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testVideoF_F() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
  // p.portalVideo();
   p.firefoxHost();   
   p.selectingUI(); 
   String x=p.joinCode();
   p.firefoxGuest();
   p.guestJoin(x);  
   p.videoSwitchOn(); 
   String parent=p.videoPopupChromeHost();
   p.joinVideo();
   p.chattingMessageHost();     
   p.refreshHostPage(parent);
   p.hostLeaving();   
   //p.videoPopupGuestClose(z);   
   //p.videoSwitchOn(); 
   //p.closeVideo();
   //p.guestLeaving();
   
   }
   	   

}







