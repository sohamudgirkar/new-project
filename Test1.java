class Animal{
	public void sound ()
		{System.out.println("Sound");
   		}}
class test1 extends Animal{
	public void sound(String abc,int y){
		System.out.println("Bark");
		}
         public static void main(String[] args){
		Dog tr=new Dog();
		tr.sound("sagar",23);

}
}