public class Main {
    public static void main(String[] args) {
        double[] a = {-1.0, 6.5, 1.1, 4.3, 0.2, 4.9, 23, 7.7, 8.8, 2.3, 5.6, 60, -2, -31, -7.9};
        double gg = 0;
        int torponya = 0;
        boolean pudgeros = false;
        for (double nabers : a) {
            if (nabers < 0) {
                pudgeros = true;
            } else if (pudgeros) {
                torponya++;
                gg += nabers;
            }
        }
        System.out.println(gg / torponya);
    }
}