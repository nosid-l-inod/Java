// Break


public class Break {
    public static void main(String[] args) {

        // Break is used to stop a loop
        for (int i = 0; i < 10; i++) {

            // This is going to break if the number is 7 and skip 5
            if (i == 7) {
                break;
            }
            else if (i == 5) {
                continue;
            }
            System.out.println(i);

        }

    }
}
