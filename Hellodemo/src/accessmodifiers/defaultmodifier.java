package accessmodifiers;

public class defaultmodifier {
	void method()
	{
		System.out.println("default modifier");
	}

	public static void main(String[] args) {
		defaultmodifier def = new defaultmodifier();
		def.method();
		
	}

}
