public class Maths {

    static double inch2cm(double x) {
        return x * 2.54;
    }

    static double lb2kg(double w) {
        return w * 0.450;
    }
    static double mile2km(int n){
	return n * 1.6;
}
    public static void main(String[] args) {
        System.out.println("8インチは " + inch2cm(8) + " cm");
        System.out.println("ボーリングのボールは");
	System.out.println(lb2kg(10) + " kg");
	System.out.println(lb2kg(16)+ " kgくらいです");
	System.out.println("時速80ナイルは約");
	System.out.println(mile2km(80)+ " km/h");

    }
}
