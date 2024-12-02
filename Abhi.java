
    import java.util.Scanner;

    class Abhi {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int a = (int) (Math.random() * 100);
            int input = 0;
            int attempt = 0;

            while (input != a) {

                System.out.println("enter  ur number ");
                input = scanner.nextInt();
                attempt++;
                int score = 10 - attempt;
                if (input < a) {
                    System.out.println("your number is shorter");
                }

                else if (input > a) {
                    System.out.println("your number is greater ");

                } else {
                    System.out.println("congrats you won!! \n your  score is = " + score);
                }
            }

        }
    }
