package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLDocumentSharingF_F extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testDocShareF_F() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
   p.firefoxHost();   
   p.selectingUI(); 
   String x=p.joinCode();
   p.firefoxGuest();
   String y=p.guestJoin(x);  
   p.guestJoinNotification(y);
   //p.uploadDocument();
   //p.declineDocument(); 
   p.uploadDocument();
   p.acceptDocument();   
  // p.guestLeaving();
   
   }
   	   

}







