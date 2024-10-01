package screens;

import components.AddButton;
import components.Num1;
import components.Num2;
import components.SubtractButton;
import components.TimesButton;
import components.OverButton;

import javax.swing.JFrame;

public class Screen extends JFrame {
    public Screen() {
        this.setTitle("Calculadora");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        Num1 num1 = new Num1();
        this.add(num1);

        Num2 num2 = new Num2();
        this.add(num2);

        this.add(new AddButton(num1, num2));
        this.add(new SubtractButton(num1, num2));
        this.add(new TimesButton(num1, num2));
        this.add(new OverButton(num1, num2));

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Screen();
    }
}
