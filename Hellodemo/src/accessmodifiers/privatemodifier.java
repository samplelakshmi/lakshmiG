package accessmodifiers;

public class privatemodifier {
	private String name = "lakshmi";
	private void modifier()
	{
		System.out.println("welcome to java");
	}

	public static void main(String[] args) {
		privatemodifier pm = new privatemodifier();
		System.out.println(pm.name);
		pm.modifier();
		
	}

}
