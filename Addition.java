public class Addition{
	public void add (int x,int y )
		{System.out.println(x+y);
   		}
	public void add (int x,int y,int z )
		{System.out.println(x+y+z);
   		}
	public void add (int x,int y,double z,String operation )
		{System.out.println(operation+(x+y+z));
   		}
		
	 public static void main(String[] args){
		Addition ad= new Addition();
		ad.add(10,20);
		ad.add(10,20,30);
		ad.add(10,20,30.0,"Addition");
}

}