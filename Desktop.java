package week3.day2;

public abstract class Desktop implements HardWare,Software {
	

	public void desktopModel()
	{
		System.out.println("The Desktop Model is:Dell");
		
	}
	public void hardwareResources()
	{
		System.out.println("The Hardware resources are:");
		System.out.println("Mouse");
		System.out.println("Keyboard");
		System.out.println("Printer");
	}
	public void softwareResources()
	{
		System.out.println("The Software resources are:");
		System.out.println("Paint");
		System.out.println("OS");
		System.out.println("MS Office");	
	}
	abstract void desktopconfig();
}
