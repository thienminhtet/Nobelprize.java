import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901�N  Sully-Prudhomme.jpg  �V�����E�v�����h��  �t�����X�̊� �t�����X���a��  ��  �t�����X�l���̎�܎� �����܎�",
            "1902�N  T-mommsen -2.jpg  �e�I�h�[���E�����[��  �h�C�c�̊� �h�C�c�鍑  ���j  �h�C�c�l���̎�܎�",
            "1903�N  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  �r�������X�e�B�G���l�E�r�������\��  �m���E�F�[  ��  �m���E�F�[�l���̎�܎�",
            "1904�N  Portrait frederic mistral.jpg  �t���f���b�N�E�~�X�g����  �t�����X�̊� �t�����X���a��  ��  �t�����X�l�Ƃ���2�l�ڂ̎�܎� �v�����@���X��ł̒��� �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M���Ƌ��Ɏ��",
            "1904�N  Jose Echegaray y Eizaguirre.jpg  �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M��  �X�y�C���̊� �X�y�C������  �Y��  �X�y�C���l���̎�܎� �t���f���b�N�E�~�X�g�����Ƌ��Ɏ��",
            "1905�N  Henryk Sienkiewicz 1905.jpg  �w�����N�E�V�F���L�F���B�`  �|�[�����h�̊� �|�[�����h  ����  �|�[�����h�l���̎�܎�",
            "1906�N  Carducci.jpg  �W���Y�G�E�J���h�D�b�`  �C�^���A�����̊� �C�^���A����  ��  �C�^���A�l���̎�܎�",
            "1907�N  Rudyard Kipling (portrait).jpg  ���h���[�h�E�L�b�v�����O  �C�M���X�̊� �C�M���X  ����  �C�M���X�l���̎�܎� �m�[�x�����w�܍ŔN����܎ҁi41�΁j",
            "1908�N  Eucken-im-Alter.png  ���h���t�E�N���X�g�t�E�I�C�P��  �h�C�c�̊� �h�C�c�鍑  �N�w  �h�C�c�l�Ƃ���2�l�ڂ̎�܎�",
            "1909�N  Selma Lagerlof.jpg  �Z���}�E���[�Q�����[��  �X�E�F�[�f��  ����  �X�E�F�[�f���l���̎�܎� �������̎�܎�",
            "1910�N  Paul Heyse 1910.jpg  �p�E���E�t�H���E�n�C�[  �h�C�c�̊� �h�C�c�鍑  ����  �h�C�c�l�Ƃ���3�l�ڂ̎�܎�",
            "1911�N  Maurice Maeterlinck 1911.jpg  ���[���X�E���[�e�������N  �x���M�[�̊� �x���M�[  �Y�ȁE��  �x���M�[�l���̎�܎� �t�����X��ł̒���",
            "1912�N  Gerhart Hauptmann nobel.jpg  �Q�A�n���g�E�n�E�v�g�}��  �h�C�c�̊� �h�C�c�鍑  �Y��",
            "1913�N  Rabindranath Tagore.jpg  ���r���h���i�[�g�E�^�S�[��  �C�M���X�̃C���h�鍑�̊� �C�M���X�̃C���h�鍑  ��  �C���h�l���̎�܎� �A�W�A�l���̎�܎� �x���K����ł̒���",
            "1914�N      ��܎҂Ȃ�",
            "1915�N  Romain Rolland 1915.jpg  ���}���E������  �t�����X�̊� �t�����X���a��  ����  �t�����X�l�Ƃ���3�l�ڂ̎�܎�",
            "1916�N  Verner von Heidenstam in 1915.jpg  ���F���l���E�t�H���E�w�C�f���X�^��  �X�E�F�[�f��  ��  �X�E�F�[�f���l�Ƃ���2�l�ڂ̎�܎�",
            "1917�N  Karl Gjellerup 1917.jpg  �J�[���E�M�F�����v  �f���}�[�N  ��  �w�����N�E�|���g�s�_���Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1917�N  Henrik Pontoppidan 1917.jpg  �w�����N�E�|���g�s�_��  �f���}�[�N  ����  �J�[���E�M�F�����v�Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1918�N      ��܎҂Ȃ�",
            "1919�N  Carl Spitteler 1919.jpg  �J�[���E�V���s�b�e���[  �X�C�X�̊� �X�C�X  ��  �X�C�X�l���̎�܎� �h�C�c��ł̒���"
        };
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901�N  Sully-Prudhomme.jpg  �V�����E�v�����h��  �t�����X�̊� �t�����X���a��  ��  �t�����X�l���̎�܎� �����܎�",
            "1902�N  T-mommsen -2.jpg  �e�I�h�[���E�����[��  �h�C�c�̊� �h�C�c�鍑  ���j  �h�C�c�l���̎�܎�",
            "1903�N  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  �r�������X�e�B�G���l�E�r�������\��  �m���E�F�[  ��  �m���E�F�[�l���̎�܎�",
            "1904�N  Portrait frederic mistral.jpg  �t���f���b�N�E�~�X�g����  �t�����X�̊� �t�����X���a��  ��  �t�����X�l�Ƃ���2�l�ڂ̎�܎� �v�����@���X��ł̒��� �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M���Ƌ��Ɏ��",
            "1904�N  Jose Echegaray y Eizaguirre.jpg  �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M��  �X�y�C���̊� �X�y�C������  �Y��  �X�y�C���l���̎�܎� �t���f���b�N�E�~�X�g�����Ƌ��Ɏ��",
            "1905�N  Henryk Sienkiewicz 1905.jpg  �w�����N�E�V�F���L�F���B�`  �|�[�����h�̊� �|�[�����h  ����  �|�[�����h�l���̎�܎�",
            "1906�N  Carducci.jpg  �W���Y�G�E�J���h�D�b�`  �C�^���A�����̊� �C�^���A����  ��  �C�^���A�l���̎�܎�",
            "1907�N  Rudyard Kipling (portrait).jpg  ���h���[�h�E�L�b�v�����O  �C�M���X�̊� �C�M���X  ����  �C�M���X�l���̎�܎� �m�[�x�����w�܍ŔN����܎ҁi41�΁j",
            "1908�N  Eucken-im-Alter.png  ���h���t�E�N���X�g�t�E�I�C�P��  �h�C�c�̊� �h�C�c�鍑  �N�w  �h�C�c�l�Ƃ���2�l�ڂ̎�܎�",
            "1909�N  Selma Lagerlof.jpg  �Z���}�E���[�Q�����[��  �X�E�F�[�f��  ����  �X�E�F�[�f���l���̎�܎� �������̎�܎�",
            "1910�N  Paul Heyse 1910.jpg  �p�E���E�t�H���E�n�C�[  �h�C�c�̊� �h�C�c�鍑  ����  �h�C�c�l�Ƃ���3�l�ڂ̎�܎�",
            "1911�N  Maurice Maeterlinck 1911.jpg  ���[���X�E���[�e�������N  �x���M�[�̊� �x���M�[  �Y�ȁE��  �x���M�[�l���̎�܎� �t�����X��ł̒���",
            "1912�N  Gerhart Hauptmann nobel.jpg  �Q�A�n���g�E�n�E�v�g�}��  �h�C�c�̊� �h�C�c�鍑  �Y��",
            "1913�N  Rabindranath Tagore.jpg  ���r���h���i�[�g�E�^�S�[��  �C�M���X�̃C���h�鍑�̊� �C�M���X�̃C���h�鍑  ��  �C���h�l���̎�܎� �A�W�A�l���̎�܎� �x���K����ł̒���",
            "1914�N      ��܎҂Ȃ�",
            "1915�N  Romain Rolland 1915.jpg  ���}���E������  �t�����X�̊� �t�����X���a��  ����  �t�����X�l�Ƃ���3�l�ڂ̎�܎�",
            "1916�N  Verner von Heidenstam in 1915.jpg  ���F���l���E�t�H���E�w�C�f���X�^��  �X�E�F�[�f��  ��  �X�E�F�[�f���l�Ƃ���2�l�ڂ̎�܎�",
            "1917�N  Karl Gjellerup 1917.jpg  �J�[���E�M�F�����v  �f���}�[�N  ��  �w�����N�E�|���g�s�_���Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1917�N  Henrik Pontoppidan 1917.jpg  �w�����N�E�|���g�s�_��  �f���}�[�N  ����  �J�[���E�M�F�����v�Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1918�N      ��܎҂Ȃ�",
            "1919�N  Carl Spitteler 1919.jpg  �J�[���E�V���s�b�e���[  �X�C�X�̊� �X�C�X  ��  �X�C�X�l���̎�܎� �h�C�c��ł̒���"
        };

        while (true) {
            System.out.println("���N�̎�܎҂ɂ��܂���?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "�N")) {
                    System.out.println(x);
                }
            }
        }
    }
}
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901�N  Sully-Prudhomme.jpg  �V�����E�v�����h��  �t�����X�̊� �t�����X���a��  ��  �t�����X�l���̎�܎� �����܎�",
            "1902�N  T-mommsen -2.jpg  �e�I�h�[���E�����[��  �h�C�c�̊� �h�C�c�鍑  ���j  �h�C�c�l���̎�܎�",
            "1903�N  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  �r�������X�e�B�G���l�E�r�������\��  �m���E�F�[  ��  �m���E�F�[�l���̎�܎�",
            "1904�N  Portrait frederic mistral.jpg  �t���f���b�N�E�~�X�g����  �t�����X�̊� �t�����X���a��  ��  �t�����X�l�Ƃ���2�l�ڂ̎�܎� �v�����@���X��ł̒��� �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M���Ƌ��Ɏ��",
            "1904�N  Jose Echegaray y Eizaguirre.jpg  �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M��  �X�y�C���̊� �X�y�C������  �Y��  �X�y�C���l���̎�܎� �t���f���b�N�E�~�X�g�����Ƌ��Ɏ��",
            "1905�N  Henryk Sienkiewicz 1905.jpg  �w�����N�E�V�F���L�F���B�`  �|�[�����h�̊� �|�[�����h  ����  �|�[�����h�l���̎�܎�",
            "1906�N  Carducci.jpg  �W���Y�G�E�J���h�D�b�`  �C�^���A�����̊� �C�^���A����  ��  �C�^���A�l���̎�܎�",
            "1907�N  Rudyard Kipling (portrait).jpg  ���h���[�h�E�L�b�v�����O  �C�M���X�̊� �C�M���X  ����  �C�M���X�l���̎�܎� �m�[�x�����w�܍ŔN����܎ҁi41�΁j",
            "1908�N  Eucken-im-Alter.png  ���h���t�E�N���X�g�t�E�I�C�P��  �h�C�c�̊� �h�C�c�鍑  �N�w  �h�C�c�l�Ƃ���2�l�ڂ̎�܎�",
            "1909�N  Selma Lagerlof.jpg  �Z���}�E���[�Q�����[��  �X�E�F�[�f��  ����  �X�E�F�[�f���l���̎�܎� �������̎�܎�",
            "1910�N  Paul Heyse 1910.jpg  �p�E���E�t�H���E�n�C�[  �h�C�c�̊� �h�C�c�鍑  ����  �h�C�c�l�Ƃ���3�l�ڂ̎�܎�",
            "1911�N  Maurice Maeterlinck 1911.jpg  ���[���X�E���[�e�������N  �x���M�[�̊� �x���M�[  �Y�ȁE��  �x���M�[�l���̎�܎� �t�����X��ł̒���",
            "1912�N  Gerhart Hauptmann nobel.jpg  �Q�A�n���g�E�n�E�v�g�}��  �h�C�c�̊� �h�C�c�鍑  �Y��",
            "1913�N  Rabindranath Tagore.jpg  ���r���h���i�[�g�E�^�S�[��  �C�M���X�̃C���h�鍑�̊� �C�M���X�̃C���h�鍑  ��  �C���h�l���̎�܎� �A�W�A�l���̎�܎� �x���K����ł̒���",
            "1914�N      ��܎҂Ȃ�",
            "1915�N  Romain Rolland 1915.jpg  ���}���E������  �t�����X�̊� �t�����X���a��  ����  �t�����X�l�Ƃ���3�l�ڂ̎�܎�",
            "1916�N  Verner von Heidenstam in 1915.jpg  ���F���l���E�t�H���E�w�C�f���X�^��  �X�E�F�[�f��  ��  �X�E�F�[�f���l�Ƃ���2�l�ڂ̎�܎�",
            "1917�N  Karl Gjellerup 1917.jpg  �J�[���E�M�F�����v  �f���}�[�N  ��  �w�����N�E�|���g�s�_���Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1917�N  Henrik Pontoppidan 1917.jpg  �w�����N�E�|���g�s�_��  �f���}�[�N  ����  �J�[���E�M�F�����v�Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1918�N      ��܎҂Ȃ�",
            "1919�N  Carl Spitteler 1919.jpg  �J�[���E�V���s�b�e���[  �X�C�X�̊� �X�C�X  ��  �X�C�X�l���̎�܎� �h�C�c��ł̒���"
        };

        while (true) {
            System.out.println("���N�̎�܎҂ɂ��܂���?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "�N")) {
                    System.out.println(x);
                }
            }
        }
    }
}
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901�N  Sully-Prudhomme.jpg  �V�����E�v�����h��  �t�����X�̊� �t�����X���a��  ��  �t�����X�l���̎�܎� �����܎�",
            "1902�N  T-mommsen -2.jpg  �e�I�h�[���E�����[��  �h�C�c�̊� �h�C�c�鍑  ���j  �h�C�c�l���̎�܎�",
            "1903�N  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  �r�������X�e�B�G���l�E�r�������\��  �m���E�F�[  ��  �m���E�F�[�l���̎�܎�",
            "1904�N  Portrait frederic mistral.jpg  �t���f���b�N�E�~�X�g����  �t�����X�̊� �t�����X���a��  ��  �t�����X�l�Ƃ���2�l�ڂ̎�܎� �v�����@���X��ł̒��� �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M���Ƌ��Ɏ��",
            "1904�N  Jose Echegaray y Eizaguirre.jpg  �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M��  �X�y�C���̊� �X�y�C������  �Y��  �X�y�C���l���̎�܎� �t���f���b�N�E�~�X�g�����Ƌ��Ɏ��",
            "1905�N  Henryk Sienkiewicz 1905.jpg  �w�����N�E�V�F���L�F���B�`  �|�[�����h�̊� �|�[�����h  ����  �|�[�����h�l���̎�܎�",
            "1906�N  Carducci.jpg  �W���Y�G�E�J���h�D�b�`  �C�^���A�����̊� �C�^���A����  ��  �C�^���A�l���̎�܎�",
            "1907�N  Rudyard Kipling (portrait).jpg  ���h���[�h�E�L�b�v�����O  �C�M���X�̊� �C�M���X  ����  �C�M���X�l���̎�܎� �m�[�x�����w�܍ŔN����܎ҁi41�΁j",
            "1908�N  Eucken-im-Alter.png  ���h���t�E�N���X�g�t�E�I�C�P��  �h�C�c�̊� �h�C�c�鍑  �N�w  �h�C�c�l�Ƃ���2�l�ڂ̎�܎�",
            "1909�N  Selma Lagerlof.jpg  �Z���}�E���[�Q�����[��  �X�E�F�[�f��  ����  �X�E�F�[�f���l���̎�܎� �������̎�܎�",
            "1910�N  Paul Heyse 1910.jpg  �p�E���E�t�H���E�n�C�[  �h�C�c�̊� �h�C�c�鍑  ����  �h�C�c�l�Ƃ���3�l�ڂ̎�܎�",
            "1911�N  Maurice Maeterlinck 1911.jpg  ���[���X�E���[�e�������N  �x���M�[�̊� �x���M�[  �Y�ȁE��  �x���M�[�l���̎�܎� �t�����X��ł̒���",
            "1912�N  Gerhart Hauptmann nobel.jpg  �Q�A�n���g�E�n�E�v�g�}��  �h�C�c�̊� �h�C�c�鍑  �Y��",
            "1913�N  Rabindranath Tagore.jpg  ���r���h���i�[�g�E�^�S�[��  �C�M���X�̃C���h�鍑�̊� �C�M���X�̃C���h�鍑  ��  �C���h�l���̎�܎� �A�W�A�l���̎�܎� �x���K����ł̒���",
            "1914�N      ��܎҂Ȃ�",
            "1915�N  Romain Rolland 1915.jpg  ���}���E������  �t�����X�̊� �t�����X���a��  ����  �t�����X�l�Ƃ���3�l�ڂ̎�܎�",
            "1916�N  Verner von Heidenstam in 1915.jpg  ���F���l���E�t�H���E�w�C�f���X�^��  �X�E�F�[�f��  ��  �X�E�F�[�f���l�Ƃ���2�l�ڂ̎�܎�",
            "1917�N  Karl Gjellerup 1917.jpg  �J�[���E�M�F�����v  �f���}�[�N  ��  �w�����N�E�|���g�s�_���Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1917�N  Henrik Pontoppidan 1917.jpg  �w�����N�E�|���g�s�_��  �f���}�[�N  ����  �J�[���E�M�F�����v�Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1918�N      ��܎҂Ȃ�",
            "1919�N  Carl Spitteler 1919.jpg  �J�[���E�V���s�b�e���[  �X�C�X�̊� �X�C�X  ��  �X�C�X�l���̎�܎� �h�C�c��ł̒���"
        };

        while (true) {
            System.out.println("���N�̎�܎҂ɂ��܂���?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "�N")) {
                    System.out.println(x);
                }
            }
        }
    }
}
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901�N  Sully-Prudhomme.jpg  �V�����E�v�����h��  �t�����X�̊� �t�����X���a��  ��  �t�����X�l���̎�܎� �����܎�",
            "1902�N  T-mommsen -2.jpg  �e�I�h�[���E�����[��  �h�C�c�̊� �h�C�c�鍑  ���j  �h�C�c�l���̎�܎�",
            "1903�N  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  �r�������X�e�B�G���l�E�r�������\��  �m���E�F�[  ��  �m���E�F�[�l���̎�܎�",
            "1904�N  Portrait frederic mistral.jpg  �t���f���b�N�E�~�X�g����  �t�����X�̊� �t�����X���a��  ��  �t�����X�l�Ƃ���2�l�ڂ̎�܎� �v�����@���X��ł̒��� �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M���Ƌ��Ɏ��",
            "1904�N  Jose Echegaray y Eizaguirre.jpg  �z�Z�E�G�`�F�K���C�E�C�E�A�C�T�M��  �X�y�C���̊� �X�y�C������  �Y��  �X�y�C���l���̎�܎� �t���f���b�N�E�~�X�g�����Ƌ��Ɏ��",
            "1905�N  Henryk Sienkiewicz 1905.jpg  �w�����N�E�V�F���L�F���B�`  �|�[�����h�̊� �|�[�����h  ����  �|�[�����h�l���̎�܎�",
            "1906�N  Carducci.jpg  �W���Y�G�E�J���h�D�b�`  �C�^���A�����̊� �C�^���A����  ��  �C�^���A�l���̎�܎�",
            "1907�N  Rudyard Kipling (portrait).jpg  ���h���[�h�E�L�b�v�����O  �C�M���X�̊� �C�M���X  ����  �C�M���X�l���̎�܎� �m�[�x�����w�܍ŔN����܎ҁi41�΁j",
            "1908�N  Eucken-im-Alter.png  ���h���t�E�N���X�g�t�E�I�C�P��  �h�C�c�̊� �h�C�c�鍑  �N�w  �h�C�c�l�Ƃ���2�l�ڂ̎�܎�",
            "1909�N  Selma Lagerlof.jpg  �Z���}�E���[�Q�����[��  �X�E�F�[�f��  ����  �X�E�F�[�f���l���̎�܎� �������̎�܎�",
            "1910�N  Paul Heyse 1910.jpg  �p�E���E�t�H���E�n�C�[  �h�C�c�̊� �h�C�c�鍑  ����  �h�C�c�l�Ƃ���3�l�ڂ̎�܎�",
            "1911�N  Maurice Maeterlinck 1911.jpg  ���[���X�E���[�e�������N  �x���M�[�̊� �x���M�[  �Y�ȁE��  �x���M�[�l���̎�܎� �t�����X��ł̒���",
            "1912�N  Gerhart Hauptmann nobel.jpg  �Q�A�n���g�E�n�E�v�g�}��  �h�C�c�̊� �h�C�c�鍑  �Y��",
            "1913�N  Rabindranath Tagore.jpg  ���r���h���i�[�g�E�^�S�[��  �C�M���X�̃C���h�鍑�̊� �C�M���X�̃C���h�鍑  ��  �C���h�l���̎�܎� �A�W�A�l���̎�܎� �x���K����ł̒���",
            "1914�N      ��܎҂Ȃ�",
            "1915�N  Romain Rolland 1915.jpg  ���}���E������  �t�����X�̊� �t�����X���a��  ����  �t�����X�l�Ƃ���3�l�ڂ̎�܎�",
            "1916�N  Verner von Heidenstam in 1915.jpg  ���F���l���E�t�H���E�w�C�f���X�^��  �X�E�F�[�f��  ��  �X�E�F�[�f���l�Ƃ���2�l�ڂ̎�܎�",
            "1917�N  Karl Gjellerup 1917.jpg  �J�[���E�M�F�����v  �f���}�[�N  ��  �w�����N�E�|���g�s�_���Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1917�N  Henrik Pontoppidan 1917.jpg  �w�����N�E�|���g�s�_��  �f���}�[�N  ����  �J�[���E�M�F�����v�Ƌ��Ƀf���}�[�N�l���̎�܎�",
            "1918�N      ��܎҂Ȃ�",
            "1919�N  Carl Spitteler 1919.jpg  �J�[���E�V���s�b�e���[  �X�C�X�̊� �X�C�X  ��  �X�C�X�l���̎�܎� �h�C�c��ł̒���"
        };

        while (true) {
            System.out.println("���N�̎�܎҂ɂ��܂���?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "�N")) {
                    System.out.println(x);
                }
            }
        }
    }
}

        while (true) {
            System.out.println("���N�̎�܎҂ɂ��܂���?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "�N")) {
                    System.out.println(x);
                }
            }
        }
    }
}
