public class Ex0503 {
    public static void main(String[] args) {
        int[] intArray = new int[30];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1001 + i;
        }

        String[] remainder = {"Zero", "One", "Two", "Three"};

        for (int i : intArray) {
            System.out.println(remainder[i % 4]);
        }
    }
}
