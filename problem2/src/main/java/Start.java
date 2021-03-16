public class Start {
    public static void main(String[] args) {
        int sum = 2;

        int n1 = 1;
        int n2 = 2;

        while (true) {
            int temp = n2;
            if (n2 >= 4000000)
                break;
            n2 = n2 + n1;
            n1 = temp;
            if (n2 % 2 == 0)
                sum += n2;
        }
        System.out.println(sum);
    }
}
