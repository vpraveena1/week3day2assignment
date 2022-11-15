package week3day2assign;
/**Assignment * on Abstraction
===========
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/
public  class Automation extends Multilanguage implements Language,Testtool {
	
	public static void main(String[] args) {
		
		
		
		Automation at=new Automation();
		at.python();
		at.ruby();
		at.selenium();
		at.java();
		
		
	}

	public void selenium() {
		System.out.println("This is my Testtool Interface : Selenium");
		
	}

	public void java() {
		
		System.out.println("This is my Language Interface: java");
	}

	@Override
	public void ruby() {
		System.out.println("This is my Abstract class umimplemented method :ruby");
		
	}
	

}
