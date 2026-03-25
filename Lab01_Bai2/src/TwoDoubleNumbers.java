import javax.swing.JOptionPane;

public class TwoDoubleNumbers {
    public static void main(String args[]) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:",
                    "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Sum: " + (num1 + num2) + '\n');
        JOptionPane.showMessageDialog(null, "Difference: " + (num1 - num2) + '\n');
        JOptionPane.showMessageDialog(null, "Product: " + (num1 * num2) + '\n');
        if (num2 == 0) JOptionPane.showMessageDialog(null, "Cannot calculate");
        else JOptionPane.showMessageDialog(null, "Quotient: " + (num1 / num2) + '\n');
        System.exit(0);
    }
}
