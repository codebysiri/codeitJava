public class Test {
    public static void main(String[] args) {
        int[] intArray = new int[30];
        String[] remainders = {"Zero", "One", "Two", "Three"};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1001 + i;
        }
        for (int num : intArray) {
            System.out.println(remainders[num % 4]);
        }
    }
}