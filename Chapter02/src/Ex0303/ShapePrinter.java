package Ex0303;

public class ShapePrinter {
    public void printTriangle(int height) {

        for (int i = 1; i <= height; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
