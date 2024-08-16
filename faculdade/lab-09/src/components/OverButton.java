package components;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OverButton extends JButton {
    public OverButton(JTextField num1, JTextField num2) {
        super("/");
        this.setBounds(600, 400, 250, 70);
        this.setFont(new Font("Arial", Font.BOLD, 50));
        this.setFocusPainted(false);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(num1.getText());
                    int number2 = Integer.parseInt(num2.getText());
                    if (number2 != 0) {
                        int result = number1 / number2;
                        JOptionPane.showMessageDialog(null, "Resultado: " + result);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                }
            }
        });
    }
}
