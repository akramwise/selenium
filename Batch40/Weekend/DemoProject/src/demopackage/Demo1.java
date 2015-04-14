package demopackage;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Begining");
		First f1=new First();
		f1.breakfast();
	}

}
class First{
	public void breakfast(){
		System.out.println("Break fast");
	}
}