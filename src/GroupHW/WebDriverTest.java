package GroupHW;

public class WebDriverTest {

	public static void main(String[] args) {
		
		
		 WebDriver wd=new ChromeDriver ();
		 wd.close();
		 wd.open();
		 
		 TakesScreenshot ts=new ChromeDriver();
		 ts.getScreenshot();
		 
		 System.out.println("-------------------------");
		 
		 RemoteWebDriver rw=new ChromeDriver();
		 rw.close();
		 rw.open();
		 rw.getTitle();
		 rw.getScreenshot();
		 rw.navigate();
		 
		 

	}

}
