package example;

public class overloadingexampleclass  {
	char m3(int d)
	{
		System.out.println("this is overloading example");
		return 'l';
	}
	public static void main(String[] args) {
		childclass cc = new childclass();
		overloadingexampleclass oc = new overloadingexampleclass();
		cc.m1('A');
		oc.m3(10);

	}

}
