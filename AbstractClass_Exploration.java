package explore;

abstract class myclass{
	 public abstract void hey();
	 
	 abstract class nyclass2{
		 public abstract void mymethod();
	 }
	 
	 interface a{
		 void myinterface();
	 }
	 
	 class b{
		 
	 }
	 
	 
}

public class AbstractClass_Exploration extends myclass{
	interface b{
		void a();
	}
	
	abstract class ac{
		
	}
	
	public static void main(String[] args) {
		
		myclass m=new AbstractClass_Exploration();
		m.hey();
	}

	@Override
	public void hey() {	
		System.out.println("method of abstract outer class");
	}
	
	public AbstractClass_Exploration ret() {
		return new AbstractClass_Exploration();
	}

}
