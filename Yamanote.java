import java.util.Scanner;

class Yamanote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String e;
        System.out.println("�R�̎���̉w��\������");

        while (true) {
            System.out.println("�����w����,���w��");
            System.out.println("-30�` +30");
            n = sc.nextInt();
            e = yamanote(n);
            System.out.println(e + "�w");
        }
    }

    static String yamanote(int n) {
        String[] eki = {"����", "�L�y��", "�V��", "�l����", "�c��", "���փQ�[�g�E�F�C", "�i��", "���", "�ܔ��c", "�ڍ�", "�b���", "�a�J", "��X��", "�V�h", "�V��v��", "���c�n��",
                "�ڔ�", "�r��", "���", "����", "�", "�c�[", "�����闢", "���闢", "��J", "���", "��k��", "�H�t��", "�_�c"};

        int numStations = eki.length;
        if (n >= 0) {
            n = n % numStations;
        } else {
            n = (n % numStations + numStations) % numStations;
        }

        return eki[n];
    }
}
