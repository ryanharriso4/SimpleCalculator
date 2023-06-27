import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Window extends JFrame {

    private JTextField inputBox;
    Calculation calculations;

    public Window() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        calculations = new Calculation();
        panel.setLayout(layout);

        inputBox = new JTextField(10);

        JButton button0 = new JButton("0");
        button0.addActionListener(event -> onButtonClick('0'));
        JButton button1 = new JButton("1");
        button1.addActionListener(event -> onButtonClick('1'));
        JButton button2 = new JButton("2");
        button2.addActionListener(event -> onButtonClick('2'));
        JButton button3 = new JButton("3");
        button3.addActionListener(event -> onButtonClick('3'));
        JButton button4 = new JButton("4");
        button4.addActionListener(event -> onButtonClick('4'));
        JButton button5 = new JButton("5");
        button5.addActionListener(event -> onButtonClick('5'));
        JButton button6 = new JButton("6");
        button6.addActionListener(event -> onButtonClick('6'));
        JButton button7 = new JButton("7");
        button7.addActionListener(event -> onButtonClick('7'));
        JButton button8 = new JButton("8");
        button8.addActionListener(event -> onButtonClick('8'));
        JButton button9 = new JButton("9");
        button9.addActionListener(event -> onButtonClick('9'));

        JButton addButton = new JButton("+");
        addButton.addActionListener(event -> onButtonClick('+'));
        JButton subButton = new JButton("-");
        subButton.addActionListener(event -> onButtonClick('-'));
        JButton mulButton = new JButton("*");
        mulButton.addActionListener(event -> onButtonClick('*'));
        JButton divButton = new JButton("/");
        divButton.addActionListener(event -> onButtonClick('/'));
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(event -> onButtonClick('C'));
        JButton enterButton = new JButton("=");
        enterButton.addActionListener(event -> onButtonClick('='));

        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(inputBox, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(button1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(button2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(button3, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(addButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(button4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(button5, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(button6, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(subButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(button7, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(button8, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(button9, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        panel.add(mulButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(button0, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(clearButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(enterButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        panel.add(divButton, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public void onButtonClick(char input) {
        if (((input >= '0') && (input <= '9'))
                || ((input == '+') || (input == '-') || (input == '*') || (input == '/'))) {
            inputBox.setText(inputBox.getText() + "" + input);
        } else if (input == 'C') {
            inputBox.setText("");
        } else {
            inputBox.setText("" + calculations.solve(inputBox.getText()));
        }

    }
}