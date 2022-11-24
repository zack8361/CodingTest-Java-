package 알고리즘2반복문;
    public class CountingStar {
        public static void main(String[] args) {

            for (int i = 0; i < 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 5; k > i; k--) {
                    System.out.print("*");
                }
            }
        }
    }