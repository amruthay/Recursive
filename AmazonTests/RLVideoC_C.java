package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLVideoC_C extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testVideoC_C() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
  // p.portalVideo();
   p.addingExtension();
   String x=p.chromeJoincode();  
   p.chromeGuest();
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








