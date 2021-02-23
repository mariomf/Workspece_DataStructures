package test.abs.and.inerface;

import static java.lang.System.out;

public class Dog extends Animal{
	
	public final int CONSTANT = 10;
	public Dog() {};
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.born();
		dog.die();
		int something = dog.protectedTest;
		something = dog.defaultTest;
		out.println(something);
		//dog.varargs(1,2,3,4,5,5);
		Animal animal = new Dog();
		Animal animal1 = animal;
		dog.varargs(animal, animal1);
		
		Animal staticAnimal = new Dog();
		
		
	}

	@Override
	public void die() {
		
		System.out.println("die");
		// TODO Auto-generated method stub
		
	}
	
	public void feet(int num) {
		System.out.println(num);
	}

	public void varargs(Animal... num) {
		/*for(int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}*/
		System.out.println(num.length);
	}
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String grow() {
		// TODO Auto-generated method stub
		return null;
	}

}
