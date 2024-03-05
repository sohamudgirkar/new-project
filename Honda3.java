interface Bike {
    void run();

    void changegear();
}

public class Honda3 implements Bike {
    public static void main(String[] args) {
        Bike b = new Honda3();
        b.changegear();
        b.run();
    }

    public void run() {
        System.out.println(" Honda");
    }
public void changegear() {
        System.out.println("honda changegear");
    }
}