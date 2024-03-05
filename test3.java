abstract class Animal{
	abstract void eat();
	}
class Dog extends Animal{
	void eat(){
	System.out.println("eating");
}
}
public class test3{
public static void main(String[] args){
	Dog D= new Dog();
		D.eat();
}}