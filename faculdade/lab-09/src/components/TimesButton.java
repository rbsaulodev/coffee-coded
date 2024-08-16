package components;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TimesButton extends JButton {
    public TimesButton(JTextField num1, JTextField num2) {
        super("*");
        this.setBounds(600, 300, 250, 70);
        this.setFont(new Font("Arial", Font.BOLD, 50));
        this.setFocusPainted(false);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    int result = number1 * number2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                }
            }
        });
    }
}
