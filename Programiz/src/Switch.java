// Switch Statement in java


public class Switch {
    public static void main(String[] args) {

        int grade = 5;

        switch (grade) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Bad");
                break;
            case 2:
                System.out.println("Normal");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Very Good");
                break;
            case 5:
                System.out.println("Excelent");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
