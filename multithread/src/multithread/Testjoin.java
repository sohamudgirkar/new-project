
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Testjoin{
public static void main(String []args){
Task1 T1= new Task1();

T1.start();
T1.join();
Task2 T2= new Task2();
Thread Th=new Thread(T2);
Th.start();
    try {
        Th.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(Testjoin.class.getName()).log(Level.SEVERE, null, ex);
    }
Task3 T3= new Task3();

T3.start();
T3.join();
Task3 T4=new Task3();
T4.start();

T4.join();
}
}
