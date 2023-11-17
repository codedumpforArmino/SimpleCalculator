import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel jpanel;
    private JComboBox cbOperations;
    private JTextField tfResult;
    private JButton btnCompute;
    private JTextField tfnum1;
    private JTextField tfnum2;
    private JLabel num1Label;
    private JLabel num2Label;

    public SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char operation;
                int num1,num2;

                //input
                try{
                    double result = 0;
                    num1 = Integer.parseInt(tfnum1.getText());
                    num2 = Integer.parseInt(tfnum2.getText());

                    operation = String.valueOf(cbOperations.getSelectedItem()).charAt(0);

                    switch(operation){
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '/':
                            result = num1 / num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                    }

                    tfResult.setText("" + result);

                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(jpanel, "You didn't enter a number");
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(600, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
