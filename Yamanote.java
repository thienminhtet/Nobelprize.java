import java.util.Scanner;

class Yamanote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String e;
        System.out.println("ŽR‚ÌŽèü‚Ì‰w‚ð•\Ž¦‚·‚é");

        while (true) {
            System.out.println("“Œ‹ž‰w‚©‚ç,‰½‰w–Ú");
            System.out.println("-30` +30");
            n = sc.nextInt();
            e = yamanote(n);
            System.out.println(e + "‰w");
        }
    }

    static String yamanote(int n) {
        String[] eki = {"“Œ‹ž", "—LŠy’¬", "V‹´", "•l¼’¬", "“c’¬", "‚—ÖƒQ[ƒgƒEƒFƒC", "•iì", "‘åè", "ŒÜ”½“c", "–Ú•", "Œb”äŽõ", "a’J", "‘ãX–Ø", "Vh", "V‘å‹v•Û", "‚“c”nê",
                "–Ú”’", "’r‘Ü", "‘å’Ë", "‘ƒŠ›", "‹îž", "“c’[", "¼“ú•é—¢", "“ú•é—¢", "éò’J", "ã–ì", "Œä“k’¬", "H—tŒ´", "_“c"};

        int numStations = eki.length;
        if (n >= 0) {
            n = n % numStations;
        } else {
            n = (n % numStations + numStations) % numStations;
        }

        return eki[n];
    }
}
