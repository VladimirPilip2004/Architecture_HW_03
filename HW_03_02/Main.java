package Task2.HW_03_02;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        TextPrinter myTextPrinter = new ConsoleTextPrinter();
        Printer myPrinter = new Printer(myTextPrinter);

        myPrinter.print(myText); // Hello, world!
    }
}
