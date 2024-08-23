public class August23 {

    public static void main(String[] args) {
        int v = 50;
        int c1 = 0;
        int c2 = 0;
        int[] arr = {10, 20, 30, 40, 50, 60, 70}; // Example array

        for (int n : arr) {
            if (n > v) {
                c1++;
            } else {
                c2++;
            }
        }

        System.out.println(v + "‚æ‚è‘å‚«‚È—v‘f" + c1 + "ŒÂ");
        System.out.println(v + "ˆÈ‰º‚Ì—v‘f" + c2 + "ŒÂ");
        System.out.println(arr.length + " " + (c1 + c2));
    }
}
