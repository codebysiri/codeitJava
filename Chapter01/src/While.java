public class While {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        int i = 0;

        while(key*i<=num){
            i = i + 1;
        }
        System.out.print(key*(i-1));
    }
}
