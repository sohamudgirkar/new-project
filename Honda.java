abstract class Bike{
	Bike(){
System.out.println("bike is run");
}
abstract  void run();
public void changegear(){
System.out.println(" abstract bike is change gear");
}
}
public class Honda extends Bike{
public static void main (String[] args){
Bike B =new Honda();
B.changegear();
B.run();
}
public void run(){
System.out.println(" running of bike Honda");
}
}