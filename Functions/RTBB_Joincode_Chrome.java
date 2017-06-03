package Functions;


import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.frontendtest.components.ImageComparison;
import java.util.Properties;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.*; 
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
		//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		//driver = new InternetExplorerDriver();


public class RTBB_Joincode_Chrome {
	
	public WebDriver host,guest, portal;
	String hostURL = "https://www.coles.com.au/";
    String nodeURL="http://192.168.1.106:5555/wd/hub";
	String guestURL = "http://join-staging.rcrsv.io/";
    String baseURL = "http://testpages.clickwith.me/testpage.html";
    String portalURL = "https://portal-staging.rcrsv.io/login";
	Screen screen=new Screen();
    public Properties prop;
    public WebDriverWait wait;
    	
    
    
    @Test
     //portal settings
    /* public void portalVideo()throws Exception{   
     //System.setProperty("webdriver.firefox.marionette", "bin//geckodriver.exe");
	 portal = new FirefoxDriver();       
	 portal.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 portal.manage().window().maximize();
     portal.get(portalURL);
     Thread.sleep(1000);
	  portal.findElement(By.id("email")).clear();
	  portal.findElement(By.id("email")).sendKeys("chintan.patel@adactin.com");
	  portal.findElement(By.id("password")).clear();
	  portal.findElement(By.id("password")).sendKeys("Adactin123");
	  portal.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	  Thread.sleep(1000);
	  portal.findElement(By.linkText("Site Keys")).click();
	  Thread.sleep(10000);
	  portal.findElement(By.xpath("//table[@id='siteKeyTable']/tbody/tr[26]/td[3]/a/button")).click();
	  Thread.sleep(30000);
	  portal.findElement(By.id("multiTabMode-select-button")).click();
	  Thread.sleep(3000);
	  portal.findElement(By.linkText("Yes, all the time")).click();
	  portal.findElement(By.cssSelector("#audioVideoMode-select-button")).click();
	  portal.findElement(By.linkText("Video and audio")).click();
	  portal.findElement(By.cssSelector("#audioStart-select-button")).click();
	  portal.findElement(By.linkText("No. Either customer or agent can initiate audio interaction.")).click();
	  portal.findElement(By.cssSelector("#videoMode-select-button")).click();
	  portal.findElement(By.linkText("Both agent and customer can share video.")).click();
	  portal.findElement(By.cssSelector("#embedSettingsForm>button")).click();
	  Thread.sleep(3000);
	  portal.findElement(By.id("accountMenu")).click();
	  portal.findElement(By.linkText("Log Out")).click();
  }*/
    //adding extension to chrome
	public void addingExtension() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/chromedriver");
        ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
        options.addArguments("--use-fake-ui-for-media-stream");
        options.addArguments("start-fullscreen");
        options.addExtensions(new File("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/extension-1.3 13.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities ();	
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		host = new ChromeDriver(capabilities);
	    System.out.println("Opening extension");
        host.manage().window().maximize();
		host.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Pattern Dots=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Dots.png");
		Pattern MoreTools=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/MoreTools.png");
		Pattern Extensions=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Extensions.png");
		Pattern RL_Injector=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Injector.png");
		Pattern RL_Options=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Options.png");
		Pattern RL_Preview=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Preview.png");
		Pattern RL_Staging=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Staging.png");
		Pattern RL_Embedded=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/embedded.png");
		Pattern RL_EmbeddedCI=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/embedded-ci.png");
		Pattern RL_Save=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Save.png");
		screen.wait(Dots,5);
		screen.click(Dots);
		screen.wait(MoreTools,5);
		screen.hover(MoreTools);
		screen.wait(Extensions,5);
		screen.click(Extensions);
		screen.hover(RL_Injector);
		screen.wait(RL_Options,5);
		screen.click(RL_Options);
		screen.wait(RL_Preview,5);
		screen.click(RL_Preview);
		screen.wait(RL_Staging,5);
		screen.click(RL_Staging);
		screen.wait(RL_Embedded,5);
		screen.click(RL_Embedded);
		screen.wait(RL_EmbeddedCI,5);
		screen.click(RL_EmbeddedCI);
		screen.wait(RL_Save,5);
		screen.click(RL_Save);		
        System.out.println(host.getCurrentUrl());
        
		for (String winHandle : host.getWindowHandles()) {
		host.switchTo().window(winHandle);
		}
       
	                       	   
	}

    //joincode generation in chrome 
    public String chromeJoincode()throws Exception {
         
        host.get(hostURL);
        Pattern RL_IconMenu=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL_Icon.png");
        Pattern RL_Bottom=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Realtime_Bottom.png");
        Pattern RL=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/RL.png");
        screen.wait(RL_IconMenu,20);
		screen.click(RL_IconMenu);
		screen.hover(RL_Bottom);
		screen.wait(RL_Bottom,10);
		screen.click(RL_Bottom);
		screen.wait(RL,25);
		screen.click(RL);
		host.switchTo().frame("recursive-social-plugin");
		String Value=host.findElement(By.className("join-code")).getAttribute("value");
		System.out.println(Value); 
        return Value;
        
    }
  
    
     //firefox as a host
     public void firefoxHost(){   
     //System.setProperty("webdriver.firefox.marionette", "bin//geckodriver.exe");
	 host = new FirefoxDriver();       
	 host.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 host.manage().window().maximize();
     host.get(baseURL);
  }
    
    //safari as a host
    public void safariHost(){   
     host = new SafariDriver();       
    host.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	host.manage().window().maximize();
    host.get(baseURL);
  }
    
     //edge as a host
    public void edgeHost(){   
    System.setProperty("webdriver.edge.driver", "bin//MicrosoftWebDriver.exe");
    host = new EdgeDriver();    
    host.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	host.manage().window().maximize();
    host.get(baseURL);
  }
   
    //chrome as a guest
    public void chromeGuest(){
    System.setProperty("webdriver.chrome.driver", "/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("disable-infobars");
    options.addArguments("start-fullscreen");   
    options.addArguments("--use-fake-ui-for-media-stream");
    guest = new ChromeDriver(options);
        
    System.out.println("The browser type slected for guest is:"+guest);
    guest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	guest.manage().window().maximize();
	guest.get(guestURL);
}
    
    //firefox as a guest
     public void firefoxGuest(){
     //System.setProperty("webdriver.firefox.marionette", "bin//geckodriver.exe");
	 guest = new FirefoxDriver(); 
     guest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     guest.manage().window().maximize();    
	 guest.get(guestURL);   
     }
   
    //safari as a guest
    public void safariGuest(){   
    guest = new SafariDriver();       
    guest.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	guest.manage().window().maximize();
    guest.get(guestURL);
  }
    
    //edge as a guest
    public void edgeGuest(){   
     System.setProperty("webdriver.edge.driver", "bin//MicrosoftWebDriver.exe");
     guest = new EdgeDriver();       
    guest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	guest.manage().window().maximize();
    guest.get(guestURL);
  }
    
    //node chrome as guest
    public void nodeChromeGuest()throws Exception { 
    DesiredCapabilities cap=DesiredCapabilities.chrome();
    cap.setPlatform(Platform.ANY);
    URL url=new URL(nodeURL);
    WebDriver guest=new RemoteWebDriver(url,cap);
    guest.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    guest.get(guestURL);
}
    
   //selecting UI
   public void selectingUI()throws Exception {
   new Select(host.findElement(By.id("ui"))).selectByVisibleText("realtime-join-code-bottom-bar");
   host.findElement(By.id("save")).click(); 
   }
   
    //switch frame
    public void switchFrame()throws Exception { 
    host.switchTo().frame("recursive-social-plugin");
    }
    
   //join code generation
   public String joinCode()throws Exception { 
   host.switchTo().frame("recursive-social-plugin");
   host.findElement(By.cssSelector(".recursive-logo.icon-cwmn-realtime")).click(); 
   String Value=host.findElement(By.xpath(".//*[@id='app']/footer/div/div[1]/input")).getAttribute("value");
   System.out.println(Value);
   return Value;
   }
   
    //video switching
    public void videoSwitchOn()throws Exception {
    //host.switchTo().frame("recursive-social-plugin");
    host.findElement(By.xpath(".//*[@id='app']/footer/div/div[2]/div/div/label/span")).click();
    Thread.sleep(15000); 
    System.out.println("Started video session @host side");    
    }
    
    //video switching turning off
    public void videoSwitchOff()throws Exception {
    host.switchTo().frame("recursive-social-plugin");    
    host.findElement(By.xpath(".//*[@id='app']/footer/div/div[2]/div/div/label/span")).click();
    Thread.sleep(8000);    
    System.out.println("Video session ended");    
    }
    
       //switching control to popup video
        public String videoPopupChromeHost()throws Exception { 
        String parentWindowHandler = host.getWindowHandle(); // Store your parent window
	    String subWindowHandler = null;

	    Set<String> handles = host.getWindowHandles(); // get all window handles
	    Iterator<String> iterator = handles.iterator();
	    while (iterator.hasNext()){
	    subWindowHandler = iterator.next();
	    }
	    host.switchTo().window(subWindowHandler); // switch to popup window
	    String Popup_Share=host.switchTo().window(subWindowHandler).getTitle();
	    // perform operations on popup
	    System.out.println(Popup_Share); 
	    System.out.println(host.findElement(By.cssSelector(".agent-name")).getText());      
	    return parentWindowHandler;  
        }
    
    public void refreshChromeHostPage(String parentWindowHandler)throws Exception {
    host.switchTo().window(parentWindowHandler);  
    host.navigate().refresh();
    Thread.sleep(8000);    
    System.out.println("Host Page refreshed");    
    }
    
    
    //switching control to popup video
    public String videoPopupHost()throws Exception { 
   
   String parent=host.getWindowHandle();
    Set<String>s1=host.getWindowHandles();
    Iterator<String> I1= s1.iterator();
    while(I1.hasNext())
    {
       String child_window=I1.next();
    if(!parent.equals(child_window))
    {
    host.switchTo().window(child_window);
    String Popup_Share=host.switchTo().window(child_window).getTitle();
    System.out.println(Popup_Share); 
    System.out.println(host.findElement(By.cssSelector(".agent-name")).getText());      
   
    }//if
    }//while
    return parent;    
    }
   
    //chatting with name in host side
    public void chattingMessageHost()throws Exception {
    Thread.sleep(1500); 
    System.out.println("Chatting with "+host.findElement(By.cssSelector(".agent-name>b")).getText()); 
         
    }
    
    //allowing Audio and video sharing
    public void allowVideoShare()throws Exception {
        Thread.sleep(1500); 
       // Alert alert=host.switchTo().alert();
        //alert.accept();	
        Pattern RL_Widget_popup=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Widget_popup.png");
        Pattern RL_Allow=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Allow.png");
		screen.wait(RL_Widget_popup,5);
        screen.hover(RL_Widget_popup);
        screen.wait(RL_Allow,5);
        screen.hover(RL_Allow);
		screen.click(RL_Allow);  
    }    
    
    //allowing Audio and video sharing in guest
    public void allowVideoGuestShare()throws Exception {
        Thread.sleep(1500); 
        Alert alert=guest.switchTo().alert();
        alert.accept();	
        //guest.switchTo().defaultContent();
    }
        
    //blocking Audio and video sharing
    public void blockVideoShare()throws Exception {
     Pattern RL_Block=new Pattern("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/Block.png");
		screen.wait(RL_Block,5);
		screen.click(RL_Block);   
    } 
        
    //refresh host page
    public void refreshHostPage(String parent)throws Exception {
    host.switchTo().window(parent); 
    host.navigate().refresh();
    Thread.sleep(8000);    
    System.out.println("Host Page refreshed");    
    }
    
    //close popup video @host side
    public void videoPopupHostClose(String parent)throws Exception {
    host.close();
    host.switchTo().window(parent);
    }
    
    //host leaving the session
    public void hostLeaving()throws Exception {
    host.switchTo().frame("recursive-social-plugin");
    host.findElement(By.id("leave-session")).click();
    //String session_ended=host.findElement(By.cssSelector(".content")).getText();
   // System.out.println(session_ended);
    host.quit();
    guest.quit();    
    }  
    
    //join chat
    public void joinVideo()throws Exception {
    guest.findElement(By.xpath(".//*[@id='app']/div[6]/div/div/div[3]/button[2]")).click();    
    Thread.sleep(15000); 
    System.out.println("Guest joined video session");
    System.out.println("Chatting with "+guest.findElement(By.cssSelector(".agent-name>b")).getText());     
    }
    
   
    //close popup video @Guest side
    public void videoPopupGuestClose(String parent)throws Exception {
    guest.close();
    guest.switchTo().window(parent);
    }
    
   
    // System.out.println(guest.findElement(By.xpath(".//*[@id='video-chat-widget']/div[1]/span[1]/b")).getTitle());  
   // guest.switchTo().window(child_window);
        
   
    //close window
    public void closePopupVideo()throws Exception {
    guest.close();
    }
    
   //close chat
    public void closeVideo()throws Exception {
    guest.findElement(By.xpath(".//*[@id='app']/div[6]/div/div/div[3]/button[1]")).click();
    }    
    
    //guest joining
    public String guestJoin(String Value)throws Exception {  
    prop=new Properties();
    prop.load(new FileInputStream("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/SharedUIMapRL.properties")); 
    guest.findElement(By.id("joincode")).clear();
    guest.findElement(By.id("joincode")).sendKeys(Value);
    guest.findElement(By.id("name")).clear();
    String name="a";
	guest.findElement(By.id("name")).sendKeys(name);
	guest.findElement(By.xpath("//body[@id='app']/div[3]/div/div/div[2]/form/button")).click();
	System.out.println("Guest joined");  
        return name;
    }
    
    //check notification @host side whether guest is joined or not
    public void guestJoinNotification(String name)throws Exception {
    host.switchTo().defaultContent();
    host.switchTo().frame(2);
	//Thread.sleep(3000);
	String expected_notification = name+" has joined the session.";
	String actual_notification=host.findElement(By.className("content")).getText();
	System.out.println("System notification:"+actual_notification);
	assertEquals(expected_notification,actual_notification);
    host.switchTo().defaultContent();    
}
    //guestpage screenshot
    public String guestPageScreenshot()throws Exception {
        Thread.sleep(2000);
    File scrFile1 = ((TakesScreenshot)guest).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile1, new File("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/screenshot1.jpg"));
    String Guest=guest.getTitle();
    System.out.println(Guest);
        return Guest;
    }
    
    //upload docs
    public void uploadDocument()throws Exception {
    guest.findElement(By.xpath(prop.getProperty("Upload_Doc"))).click();
    guest.findElement(By.id("inputFile")).clear();
    guest.findElement(By.id("inputFile")).sendKeys("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/screenshot1.jpg");
    guest.findElement(By.linkText("Upload Doc")).click();
    Thread.sleep(3000);  
    }
    
	//accepting the doc
    public void acceptDocument()throws Exception { 
       // Thread.sleep(3000); 
       //host.switchTo().defaultContent();
       host.switchTo().frame(1);
        host.findElement(By.xpath("//div[@id='rcrsv-notifications']/div/div[3]/div/i[2]")).click();
                Thread.sleep(1000); 
      
    }
    
    //declining the doc
    public void declineDocument()throws Exception {  
        host.switchTo().defaultContent();
        //host.switchTo().frame(1);
        Thread.sleep(3000);
        host.findElement(By.xpath(".//*[@id='rcrsv-notifications']/div/div[3]/div/i[1]")).click();
    }  
   
    //guest leaving the session
    public void guestLeaving()throws Exception {
    guest.findElement(By.id("leave-session")).click();
    String guess_title=guest.findElement(By.cssSelector(".sub-header-text")).getText();
    System.out.println(guess_title);
    }   
   
    //verify Annotations
    public void verifyAnnotations()throws Exception {
       
        if(host.findElement(By.xpath(prop.getProperty("Free_Hand_Tool"))).isEnabled()) //verify freehand tool
        {
            System.out.println("Freehand tool is clickable");
            host.findElement(By.xpath(prop.getProperty("Free_Hand_Tool"))).click();  
        }
        else
           System.out.println("Freehand tool is not clickable");
       
        if(host.findElement(By.xpath(prop.getProperty("Rect_Tool"))).isEnabled())  //verify rectangle tool
        {
            System.out.println("Rectangle tool is clickable");
        host.findElement(By.xpath(prop.getProperty("Rect_Tool"))).click(); 
        }
        else
           System.out.println("Rectangle tool is not clickable"); 
        if(host.findElement(By.xpath(prop.getProperty("Text_b_Tool"))).isEnabled()) //verify text bubble tool
        {
            System.out.println("Text bubble Tool is clickable");       
        host.findElement(By.xpath(prop.getProperty("Text_b_Tool"))).click(); 
        }
         else
           System.out.println("Text bubble tool is not clickable"); 
         if(host.findElement(By.xpath(prop.getProperty("Arrow_Tool"))).isEnabled())//verify arrow tool
        {
            System.out.println("Arrow Tool is clickable");
        host.findElement(By.xpath(prop.getProperty("Arrow_Tool"))).click(); 
         }
         else
           System.out.println("Arrow tool is not clickable");      
         if(host.findElement(By.xpath(prop.getProperty("Change_Draw_Col"))).isEnabled()) //verify change color tool
        {
            System.out.println("Change colour Tool is clickable");        
        host.findElement(By.xpath(prop.getProperty("Change_Draw_Col"))).click();
         }
         else
           System.out.println("Change colour tool is not clickable"); 
         if(host.findElement(By.xpath(prop.getProperty("Erase_Anntn"))).isEnabled()) //verify erase tool
        {
            System.out.println("Erase Tool is clickable");          
        host.findElement(By.xpath(prop.getProperty("Erase_Anntn"))).click();
         }
         else
           System.out.println("Erase Tool is not clickable");   
        if(host.findElement(By.xpath(prop.getProperty("Mouse_Tool"))).isEnabled()) //verify mouse tool
        {
            System.out.println("Mouse Tool is clickable");     
        host.findElement(By.xpath(prop.getProperty("Mouse_Tool"))).click();     
        }
            else
           System.out.println("Mouse Tool is not clickable");  
    }
    
    //verify Annotations @guest
    public void verifyAnnotationsGuest()throws Exception {
        if(guest.findElement(By.xpath(prop.getProperty("Mouse_Tool"))).isEnabled()){
  	   System.out.println("Mouse tool is clickable");
  	 guest.findElement(By.xpath(prop.getProperty("Mouse_Tool"))).click();
  	 }
  	 else System.out.println("Mouse tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Free_Hand_Tool"))).isEnabled()){
   	   System.out.println("hand tool is clickable");
     guest.findElement(By.xpath(prop.getProperty("Free_Hand_Tool"))).click();
  	}
  	 else System.out.println("hand tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Arrow_Tool"))).isEnabled()){
    	   System.out.println("arrow tool is clickable");
     guest.findElement(By.xpath(prop.getProperty("Arrow_Tool"))).click();
  	}
  	 else System.out.println("arrow tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Rect_Tool"))).isEnabled()){
 	   System.out.println("rectangle tool is clickable");
     guest.findElement(By.xpath(prop.getProperty("Rect_Tool"))).click();
  	}
     else System.out.println("rectangle tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Oval_Tool"))).isEnabled()){
 	   System.out.println("oval tool is clickable");
     guest.findElement(By.xpath(prop.getProperty("Oval_Tool"))).click();
  	}
  	 else System.out.println("oval tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Text_b_Tool"))).isEnabled()){
  	   System.out.println("text bubble tool is clickable");
     guest.findElement(By.xpath(prop.getProperty("Text_b_Tool"))).click();
  	}
  	else System.out.println("text bubble tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Change_Draw_Col"))).isEnabled()){
   	   System.out.println("color change tool is clickable");
      guest.findElement(By.xpath(prop.getProperty("Change_Draw_Col"))).click();
   	}
   	else System.out.println("color change tool is not clickable");
  	if(guest.findElement(By.xpath(prop.getProperty("Erase_Anntn"))).isEnabled()){
    	   System.out.println("erase tool is clickable");
       guest.findElement(By.xpath(prop.getProperty("Erase_Anntn"))).click();
    	}
    	else System.out.println("erase tool is not clickable"); 
    }
    
    //see what I'm sharing
    public void seeWhatImSharing(String Guest) throws Exception {
        prop=new Properties();
        prop.load(new FileInputStream("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/SharedUIMapRL.properties")); 
      host.findElement(By.xpath(prop.getProperty("See_What_My"))).click();  
    // It will return the parent window name as a String
    String parent=host.getWindowHandle();
    // This will return the number of windows opened by Webdriver and will return Set of St//rings
    Set<String>s1=host.getWindowHandles();
    // Now we will iterate using Iterator
    Iterator<String> I1= s1.iterator();

    while(I1.hasNext())
    {
       String child_window=I1.next();
    // Here we will compare if parent window is not equal to child window then we will close
    if(!parent.equals(child_window))
    {
    host.switchTo().window(child_window);
    Thread.sleep(5000);
    File scrFile = ((TakesScreenshot)host).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/screenshot.jpg"));
    String Popup_Share=host.switchTo().window(child_window).getTitle();
    System.out.println(Popup_Share);
    assertEquals(Guest,Popup_Share); 
    host.close();
    }//if
    }//while
    // once all pop up closed now switch to parent window
    host.switchTo().window(parent); 
}
    
    //change color
    public void chooseColour(int i)throws Exception {
    //System.out.println("choose one number for selecting a colour\n1-white\n2-gray\n3-black\n4-red\n5-maroon\n6-orange\n7-yellow\n8-olive\n9-green\n10-lime\n11-dark green\n12-aqua\n13-blue\n14-navy\n15-pink\n16-purple\n ");
        host.findElement(By.xpath(prop.getProperty("Change_Draw_Col"))).click();  
        host.findElement(By.xpath("//ul[@id='colorList']/li[" + i + "]/div")).click();
        Thread.sleep(1000);
}
    
  //doubleclick on tool 
  public void doubleClickAnnotation(String Tool)throws Exception { 
    WebElement element=host.findElement(By.xpath(prop.getProperty(Tool)));
    Actions builder = new Actions(host);
    //build the action chain.
    Action doubleclick = builder.doubleClick(element).doubleClick(element).build();
   //perform the double click action
   doubleclick.perform(); 
    Thread.sleep(2000);
}

    //draw oval
    public void drawOval() throws Exception{
   
    host.findElement(By.xpath(prop.getProperty("Oval_Tool"))).click();
    host.switchTo().defaultContent();
	WebElement drag = host.findElement(By.id("rcrsv-annotation-container"));
	Actions action = new Actions(host);	
	Action drawAction = action.moveToElement(drag, 700, 400).clickAndHold().moveToElement(drag, 600, 300).release().build();
	drawAction.perform();
	//Thread.sleep(1000);
     }
    
    
    //free hand
    public void freeHand() throws Exception{
    host.switchTo().frame("recursive-social-plugin");
    host.findElement(By.xpath(prop.getProperty("Free_Hand_Tool"))).click();
    host.switchTo().defaultContent();
	WebElement drag = host.findElement(By.id("rcrsv-annotation-container"));
	Actions action = new Actions(host);	
	Action drawAction = action.moveToElement(drag, 200, 300).clickAndHold().moveToElement(drag, 400, 200).release().build();
	drawAction.perform();
     }
    
   //Arrow 
    public void drawArrow() throws Exception{
    
    host.switchTo().frame("recursive-social-plugin");
    host.findElement(By.xpath(prop.getProperty("Arrow_Tool"))).click();
    host.switchTo().defaultContent();
	WebElement drag = host.findElement(By.id("rcrsv-annotation-container"));
	Actions action = new Actions(host);	
	Action drawAction = action.moveToElement(drag, 400, 300).clickAndHold().moveToElement(drag, 900, 200).release().build();
	drawAction.perform();
	//Thread.sleep(2000);
     }
    
    //draw Rectangle
    public void drawRectangle() throws Exception{
    //host.switchTo().frame("recursive-social-plugin");
    host.findElement(By.xpath(prop.getProperty("Rect_Tool"))).click();
    host.switchTo().defaultContent();
	WebElement drag = host.findElement(By.id("rcrsv-annotation-container"));
	Actions action = new Actions(host);	
	Action drawAction = action.moveToElement(drag, 500, 100).clickAndHold().moveToElement(drag, 800, 300).release().build();
	drawAction.perform();      
	Thread.sleep(1000);
     }
   
 //verify rectangle
    public void verifyRectangle() throws Exception{
    Point A=new Point(500,100);
    Point B=new Point(800,300);
    Point C=new Point(500,300);
    Point D=new Point(800,100);
    int breadth = C.getY()-A.getY();
    int length = D.getX()-A.getX();
    System.out.println("length:"+length);
    System.out.println("breadth:"+breadth);
    if(length>breadth)
        System.out.println("Annotation drawn is a rectangle");  
     else
       System.out.println("Annotation drawn is not a rectangle");    
}
    
    //draw Rectangle @guest
    public void drawRectangleGuest() throws Exception{
    guest.findElement(By.xpath(prop.getProperty("Rect_Tool"))).click();
    guest.switchTo().defaultContent();
	WebElement drag = guest.findElement(By.id("rcrsv-annotation-container"));
	Actions action = new Actions(guest);	
	Action drawAction = action.moveToElement(drag, 600, 300).clickAndHold().moveToElement(drag, 1000, 500).release().build();
	drawAction.perform();
    Thread.sleep(1000);
     }
    
   //verify rectangle guest
    public void verifyRectangleGuest() throws Exception{
    Point A=new Point(600,300);
    Point B=new Point(1000,500);
    Point C=new Point(600,500);
    Point D=new Point(1000,300);
    int breadth = C.getY()-A.getY();
    int length = D.getX()-A.getX();
    System.out.println("length:"+length);
    System.out.println("breadth:"+breadth);
    if(length>breadth)
        System.out.println("Annotation drawn on guest is a rectangle");  
     else
       System.out.println("Annotation drawn on guest is not a rectangle");    
} 
    
    //text bubble
    public void textBubble()throws Exception {
	
	host.switchTo().frame("recursive-social-plugin");
	host.findElement(By.xpath(prop.getProperty("Text_b_Tool"))).click();
    host.switchTo().defaultContent();
	WebElement drag1 = host.findElement(By.id("rcrsv-annotation-container"));
	Actions action1 = new Actions(host);	
	Action drawAction1 = action1.moveToElement(drag1, 1000, 500).clickAndHold().moveToElement(drag1, 700, 300).release().build();
	drawAction1.perform();
    //By finding all the web elements using iframe tag
    int size = host.findElements(By.tagName("iframe")).size();
    System.out.println("Total Frames --" + size);
    host.switchTo().frame(6);
    host.findElement(By.xpath(prop.getProperty("Txt_B_area"))).sendKeys("hiiiiii");
    host.findElement(By.xpath(prop.getProperty("Txt_button"))).click();
    
       }
    
    //screenshot of host
    public void screenshotHost()throws Exception {
    BufferedImage image = screen.capture(15,100,1300,600).getImage();
	File host = new File("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/host.jpg");
	ImageIO.write(image, "jpg", host);
    }    
    
    //screenshot of guest
     public void screenshotGuest()throws Exception {
    BufferedImage image = screen.capture(80,150,1200,500).getImage();
	File guest = new File("/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/guest.jpg");
	ImageIO.write(image, "jpg", guest);
     }
    
	//image comparison 
     public void imageComparison()throws Exception {
	String hostScreen = "/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/host.jpg";
	String guestScreen = "/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/guest.jpg";
	String differences = "/Users/Saivenkatesh/Desktop/Selenium/RecursiveLabs/SharedUIMap/Images/comparison.jpg";
	ImageComparison imageComparison = new ImageComparison(60,60,0.20);
	if(imageComparison.fuzzyEqual(hostScreen,guestScreen,differences))
		System.out.println("both screens are equal");
	else
		System.out.println("both screens are not equal.");
     } 
    
}