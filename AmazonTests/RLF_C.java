package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLF_C extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testF_C() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
   p.firefoxHost();   
   p.selectingUI(); 
   String x=p.joinCode();
   p.chromeGuest();
   String name=p.guestJoin(x);	
   p.guestJoinNotification(name);  
   p.guestLeaving();
   
   }
   	   

}




