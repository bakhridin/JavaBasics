package GroupHW;

public interface WebDriver {
	
	void open();
	void close();
	
	String getTitle();
	

}
interface TakesScreenshot{
	void getScreenshot();
}

interface RemoteWebDriver extends TakesScreenshot, WebDriver{
	
	void navigate();
}
class ChromeDriver implements RemoteWebDriver{

	@Override
	public void getScreenshot() {
		System.out.println("Chrome gets screenshot");
		
	}

	@Override
	public void open() {
		System.out.println("Crome opens fast");
		
	}

	@Override
	public void close() {
		System.out.println("Crome close rundawey");
		
	}

	@Override
	public String getTitle() {
		String getname="John";
		System.out.println(getname+" uses crome ");
		
		return getname;
	}

	@Override
	public void navigate() {
		System.out.println("Chrome navigation is popular");
		
	}
	
}
