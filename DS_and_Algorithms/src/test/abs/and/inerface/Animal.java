package test.abs.and.inerface;

public abstract class Animal implements LivingBeing{
	
	private boolean eyes;
	private boolean mout;
	private static int animalCounter;
	
	int defaultTest = 10;
	protected int protectedTest = 11;
	
	public void born() {
		
		staticTest();
		System.out.println("be born");
		
	}
	
	public abstract void die();
	
	public static void staticTest() {
		animalCounter ++;
		System.out.println("print static method " + animalCounter);
	}

}
