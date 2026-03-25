import javax.swing.JOptionPane;
public class FirstDegreeEquationWithTwoVariables {
    public static void main(String args[]) {
        String stra11, stra12, strb1, stra21, stra22, strb2;
        stra11 = JOptionPane.showInputDialog(null, "Enter a11:");
        stra12 = JOptionPane.showInputDialog(null, "Enter a12:");
        strb1 = JOptionPane.showInputDialog(null, "Enter b1:");
        stra21 = JOptionPane.showInputDialog(null, "Enter a21:");
        stra22 = JOptionPane.showInputDialog(null, "Enter a22:");
        strb2 = JOptionPane.showInputDialog(null, "Enter b2:");

        double a11, a12, b1, a21, a22, b2;
        a11 = Double.parseDouble(stra11);
        a12 = Double.parseDouble(stra12);
        b1 = Double.parseDouble(strb1);
        a21 = Double.parseDouble(stra21);
        a22 = Double.parseDouble(stra22);
        b2 = Double.parseDouble(strb2);

        double D = a22 * a11 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            JOptionPane.showMessageDialog(null, "x1 = " + (D1 / D) + '\n'
                                                                        + "x2 = " + (D2 / D));
        }
        else if (D == 0 && D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "Infinite solutions");
        }
        else if (D == 0 && (D1 != 0 || D2 != 0)) {
            JOptionPane.showMessageDialog(null, "No solution");
        }
        System.exit(0);
    }
}
