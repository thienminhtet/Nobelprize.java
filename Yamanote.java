import java.util.Scanner;

class Yamanote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String e;
        System.out.println("RΜθόΜwπ\¦·ι");

        while (true) {
            System.out.println("w©η,½wΪ");
            System.out.println("-30` +30");
            n = sc.nextInt();
            e = yamanote(n);
            System.out.println(e + "w");
        }
    }

    static String yamanote(int n) {
        String[] eki = {"", "Ly¬", "V΄", "lΌ¬", "c¬", "ΦQ[gEFC", "iμ", "εθ", "ά½c", "Ϊ", "bδυ", "aJ", "γXΨ", "Vh", "VεvΫ", "cnκ",
                "Ϊ", "rά", "εΛ", "", "ξ", "c[", "Όϊι’", "ϊι’", "ιςJ", "γμ", "δk¬", "Ht΄", "_c"};

        int numStations = eki.length;
        if (n >= 0) {
            n = n % numStations;
        } else {
            n = (n % numStations + numStations) % numStations;
        }

        return eki[n];
    }
}
