package Task2.HW_03_02;

public class Printer {
    TextPrinter textPrinter;
    public Printer(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }
    public void print(Text text) {
        textPrinter.print(text.getText());
    }
}