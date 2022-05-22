package ru.gb.java.almazbakiev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private Double leftOperand;
    private String operation;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1000, 200, 400, 400);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 32));
        add(display, BorderLayout.NORTH);

        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();

                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)) {
                    displayText = "";
                }

                displayText += text;
                display.setText(displayText);
            }
        };

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                Double rightOperand = Double.parseDouble(display.getText());
                if ("=".equals(action) || "!".equals(action) || "sq".equals(action)) {
                    if ("!".equals(action)) {
                        leftOperand = Double.parseDouble(display.getText());
                        if (leftOperand <= 1) {
                            display.setText("1");
                        } else {
                            double result = 1.0;
                            for (double i = 1.0; i <= leftOperand; i++) {
                                result *= i;
                            }
                            display.setText(String.valueOf(result));
                        }
                    } else if ("sq".equals(action)) {
                        leftOperand = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(Math.sqrt(leftOperand)));
                    } else if (leftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;
                            case "^":
                                display.setText(String.valueOf(Math.pow(leftOperand, rightOperand)));
                                break;
                            case "AC":
                                leftOperand = null;
                                rightOperand = null;
                                display.setText("0");
                        }
                        leftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(3, 3, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(numberListener);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(buttonListener);

        JButton acButton = new JButton("AC");
        acButton.addActionListener(buttonListener);

        JButton divisionButton = new JButton("/");
        divisionButton.addActionListener(buttonListener);

        JButton squareButton = new JButton("sq");
        squareButton.addActionListener(buttonListener);


        JPanel footerPanel = new JPanel();
        GridLayout footerLayout = new GridLayout(1, 4, 10, 10);
        footerPanel.setLayout(footerLayout);

        footerPanel.add(divisionButton);
        footerPanel.add(pointButton);
        footerPanel.add(zeroButton);
        footerPanel.add(equalButton);
        footerPanel.add(acButton);

        JPanel westButtonPanel = new JPanel();
        GridLayout westButtonLayout = new GridLayout(3, 1, 10, 10);
        westButtonPanel.setLayout(westButtonLayout);

        for (char c : "+-*".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            westButtonPanel.add(button);
        }

        JPanel eastButtonPanel = new JPanel();
        GridLayout eastButtonLayout = new GridLayout(3, 1, 10, 10);
        eastButtonPanel.setLayout(eastButtonLayout);

        eastButtonPanel.add(squareButton);

        for (char c : "!^".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            eastButtonPanel.add(button);
        }

        add(westButtonPanel, BorderLayout.WEST);
        add(eastButtonPanel, BorderLayout.EAST);
        add(numberPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Calculator();
    }
}
