package java_certifi;


public class animal extends ser_Viviente{
	
	private String eyes;
	private String nose;
	
	public animal() {};
	
	public animal(String eyes, String nose ) {
		this.eyes = eyes;
		this.nose = nose;
	};
	
	public void eat () {
		System.out.println("Something");
		
	}

	@Override
	public void respira() {
		System.out.println("Animal respira");
		
	}


}
