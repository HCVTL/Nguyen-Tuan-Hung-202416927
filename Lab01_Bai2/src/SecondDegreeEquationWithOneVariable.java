import javax.swing.JOptionPane;
public class SecondDegreeEquationWithOneVariable {
    public static void main(String args[]) {
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null, "Enter a:");
        strB = JOptionPane.showInputDialog(null, "Enter b:");
        strC = JOptionPane.showInputDialog(null, "Enter c:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c == 0) {
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            }
            else if (b == 0 && c != 0) {
                JOptionPane.showMessageDialog(null, "No solution");
            }
            else {
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            }
        }
        else {
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "No solution");
            }
            else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "Double root x = " + (-b / (2 * a)));
            }
            else if (delta > 0) {
                JOptionPane.showMessageDialog(null, "x1 = " + ((-b - Math.sqrt(delta)) / (2 * a)) + '\n'
                        + "x2 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
            }
        }

        System.exit(0);
    }
}
