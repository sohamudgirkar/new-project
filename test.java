class Animal{
	public void eat ()
		{System.out.println("eating");
   		}}
class Dog extends Animal{
	public void Bark(){
		System.out.println("Barking");
		}}
class Puppy extends Dog{
	public void age(){
		System.out.println("newborn");
		}}
 class  test extends Puppy{
	public static void main(String[] args){
		test d=new test();
   		d.eat();
		d.Bark();
		d.age();
		}
		}