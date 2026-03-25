import java.util.Scanner;

public class NumberOfDays {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);


        while (true) {
            System.out.println("Enter year");
            String strYear = keyboard.nextLine().trim();
            int year = Integer.parseInt(strYear);
            System.out.println("Enter month");
            String strMonth = keyboard.nextLine().trim();
            int month = getMonth(strMonth);

            if (year < 0 || month == -1) {
                System.out.println("Invalid month/year.");
            }
            else {
                int days;
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        days = 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        days = 30;
                        break;
                    case 2:
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                        break;
                    default:
                        days = -1;
                }

                System.out.println("Number of days: " + days);
                break;
            }
        }
        keyboard.close();
    }

    private static int getMonth(String input) {
        input = input.toLowerCase();

        if (input.equals("1") || input.equals("january") || input.equals("jan.") || input.equals("jan")) return 1;
        if (input.equals("2") || input.equals("february") || input.equals("feb.") || input.equals("feb")) return 2;
        if (input.equals("3") || input.equals("march") || input.equals("mar.") || input.equals("mar")) return 3;
        if (input.equals("4") || input.equals("april") || input.equals("apr.") || input.equals("apr")) return 4;
        if (input.equals("5") || input.equals("may") || input.equals("may.") || input.equals("may")) return 5;
        if (input.equals("6") || input.equals("june") || input.equals("jun.") || input.equals("jun")) return 6;
        if (input.equals("7") || input.equals("july") || input.equals("jul.") || input.equals("jul")) return 7;
        if (input.equals("8") || input.equals("august") || input.equals("aug.") || input.equals("aug")) return 8;
        if (input.equals("9") || input.equals("september") || input.equals("sep.") || input.equals("sep")) return 9;
        if (input.equals("10") || input.equals("october") || input.equals("oct.") || input.equals("oct")) return 10;
        if (input.equals("11") || input.equals("november") || input.equals("nov.") || input.equals("nov")) return 11;
        if (input.equals("12") || input.equals("december") || input.equals("dec.") || input.equals("dec")) return 12;

        return -1;
    }
}