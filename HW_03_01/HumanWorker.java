package Task1.HW_03_01;

public class HumanWorker implements Working, ToEat {
public void work() {
System.out.println("Человек работает");
}

public void eat() {
    System.out.println("Человек ест");
}
}