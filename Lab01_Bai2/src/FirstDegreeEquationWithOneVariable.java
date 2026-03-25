import javax.swing.JOptionPane;
public class FirstDegreeEquationWithOneVariable {
    public static void main(String args[]) {
        String strA, strB;
        strA = JOptionPane.showInputDialog(null, "Please enter a:",
                "Input a", JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Please enter b:",
                "Input b", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "No solution");
        }
        else if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "Infinite solutions");
        }
        else {
            JOptionPane.showMessageDialog(null, "x = " + (-b / a));
        }

        System.exit(0);
    }
}
