public class Ex0409 {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;

        while (num % key > 0) {
            num--;
        }
        System.out.println(num);
    }
}
