
package multithread;

class Task1 extends Thread{
        public void run(){
for(int i=0;i<10;i++){
System.out.println(i);
}
        }
}
class Task2 implements Runnable{
    public void run(){
    for(int i=10;i<20;i++){
System.out.println(i);
}
}
}
class Task3 extends Thread{
    public void run(){
        for(int i=20;i<30;i++){
System.out.println(i);
        }
    }
}
public class TestThread{
public static void main(String []args){
Task1 T1= new Task1();
T1.setPriority(10);
T1.start();
Task2 T2= new Task2();
Thread Th=new Thread(T2);
Th.setPriority(6);
Th.start();
Task3 T3= new Task3();
T3.setPriority(9);
T3.start();
Task3 T4=new Task3();
T4.start();
}
}
