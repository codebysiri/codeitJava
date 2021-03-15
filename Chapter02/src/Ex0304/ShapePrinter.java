package Ex0304;

public class ShapePrinter {
    public void printPyramid(int height) {
        for(int i = 1; i <= height; i++) {
            for(int k = 1; k <= height - i; k++) {
                System.out.print(" ");
            }
            for (int m = 1; m < 2 * i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
