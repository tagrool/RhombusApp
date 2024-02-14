public class Main {
    public static void main(String[] args) {
        //İç-içə keçirilmiş for loop'larından istifadə edərək "*" işarəsi ilə romb fiqurunun yaradılması

        for (int i = 0; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int s = 0; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int s = 6; s >=i; s--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
