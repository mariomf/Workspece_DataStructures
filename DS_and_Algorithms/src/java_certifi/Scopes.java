package java_certifi;

public class Scopes {
	

	public static void main(String[] args) {
		
	    animal animal1 = new animal("Azul", "Grande");
	    animal animal3 = animal1;
	    
	    animal animal2 = new animal("Azul", "Grande");
	    
	    System.out.println(animal1 == animal3);
	    System.out.println(animal1.equals(animal2));
	    System.out.println(animal1 == animal2);
		
//		animal new_Animal = new dog();
//		new_Animal.eat();
		animal new_Animal = new animal();
		new_Animal.eat();
		new_Animal = new dog();
		new_Animal.eat();
		
		animal new_dog = new dog();
		dog dog1 = (dog) new_dog;
		
		dog dog3 = new dog();
		dog3.respira1();
		
		// TODO Auto-generated method stub
		Scopes.nested_scope(true);
		
		//--------------STRINGS------------------------/
	       String s1  = "1";
	       String s2 = s1.concat("2");
	       s2.concat("3"); //NO NEW REFERENCE. 
	       System.out.println(s2);
		
	    String hola = new String("hola");
	    String hola2 = "hola";
	    String hola3="hola";
	    	
	    System.out.println(hola2 == hola3);
	    System.out.println(hola2 == hola);
	    System.out.println(hola2.equals(hola));

	}
	
	public static void nested_scope(boolean hungry) {
		if(hungry) {
			int bitesOfCheese = 1_000_000;
			{
				var teenyBit = 1_000_000;
				System.out.println(bitesOfCheese);
				System.out.println(teenyBit);
			}
		}
		
	}

}
