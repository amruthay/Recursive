package AmazonTests;

import org.testng.annotations.Test;

import Functions.RTBB_Joincode_Chrome;

import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

public class RLF_E extends RTBB_Joincode_Chrome {
 
  
  @Test
  public void testF_E() throws Exception {
      
   RTBB_Joincode_Chrome p=new RTBB_Joincode_Chrome();
   p.firefoxHost();   
   p.selectingUI(); 
   String x=p.joinCode();
   p.edgeGuest();
   String name=p.guestJoin(x);	
   p.guestJoinNotification(name); 
   p.guestLeaving();
   
   }
   	   

}






