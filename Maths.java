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
        System.out.println("8�C���`�� " + inch2cm(8) + " cm");
        System.out.println("�{�[�����O�̃{�[����");
	System.out.println(lb2kg(10) + " kg");
	System.out.println(lb2kg(16)+ " kg���炢�ł�");
	System.out.println("����80�i�C���͖�");
	System.out.println(mile2km(80)+ " km/h");

    }
}
