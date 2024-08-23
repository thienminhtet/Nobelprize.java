import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901年  Sully-Prudhomme.jpg  シュリ・プリュドム  フランスの旗 フランス共和国  詩  フランス人初の受賞者 初代受賞者",
            "1902年  T-mommsen -2.jpg  テオドール・モムゼン  ドイツの旗 ドイツ帝国  歴史  ドイツ人初の受賞者",
            "1903年  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  ビョルンスティエルネ・ビョルンソン  ノルウェー  詩  ノルウェー人初の受賞者",
            "1904年  Portrait frederic mistral.jpg  フレデリック・ミストラル  フランスの旗 フランス共和国  詩  フランス人として2人目の受賞者 プロヴァンス語での著作 ホセ・エチェガライ・イ・アイサギレと共に受賞",
            "1904年  Jose Echegaray y Eizaguirre.jpg  ホセ・エチェガライ・イ・アイサギレ  スペインの旗 スペイン王国  戯曲  スペイン人初の受賞者 フレデリック・ミストラルと共に受賞",
            "1905年  Henryk Sienkiewicz 1905.jpg  ヘンリク・シェンキェヴィチ  ポーランドの旗 ポーランド  小説  ポーランド人初の受賞者",
            "1906年  Carducci.jpg  ジョズエ・カルドゥッチ  イタリア王国の旗 イタリア王国  詩  イタリア人初の受賞者",
            "1907年  Rudyard Kipling (portrait).jpg  ラドヤード・キップリング  イギリスの旗 イギリス  小説  イギリス人初の受賞者 ノーベル文学賞最年少受賞者（41歳）",
            "1908年  Eucken-im-Alter.png  ルドルフ・クリストフ・オイケン  ドイツの旗 ドイツ帝国  哲学  ドイツ人として2人目の受賞者",
            "1909年  Selma Lagerlof.jpg  セルマ・ラーゲルレーヴ  スウェーデン  小説  スウェーデン人初の受賞者 女性初の受賞者",
            "1910年  Paul Heyse 1910.jpg  パウル・フォン・ハイゼ  ドイツの旗 ドイツ帝国  小説  ドイツ人として3人目の受賞者",
            "1911年  Maurice Maeterlinck 1911.jpg  モーリス・メーテルリンク  ベルギーの旗 ベルギー  戯曲・詩  ベルギー人初の受賞者 フランス語での著作",
            "1912年  Gerhart Hauptmann nobel.jpg  ゲアハルト・ハウプトマン  ドイツの旗 ドイツ帝国  戯曲",
            "1913年  Rabindranath Tagore.jpg  ラビンドラナート・タゴール  イギリス領インド帝国の旗 イギリス領インド帝国  詩  インド人初の受賞者 アジア人初の受賞者 ベンガル語での著作",
            "1914年      受賞者なし",
            "1915年  Romain Rolland 1915.jpg  ロマン・ロラン  フランスの旗 フランス共和国  小説  フランス人として3人目の受賞者",
            "1916年  Verner von Heidenstam in 1915.jpg  ヴェルネル・フォン・ヘイデンスタム  スウェーデン  詩  スウェーデン人として2人目の受賞者",
            "1917年  Karl Gjellerup 1917.jpg  カール・ギェレルプ  デンマーク  詩  ヘンリク・ポントピダンと共にデンマーク人初の受賞者",
            "1917年  Henrik Pontoppidan 1917.jpg  ヘンリク・ポントピダン  デンマーク  小説  カール・ギェレルプと共にデンマーク人初の受賞者",
            "1918年      受賞者なし",
            "1919年  Carl Spitteler 1919.jpg  カール・シュピッテラー  スイスの旗 スイス  詩  スイス人初の受賞者 ドイツ語での著作"
        };
import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nobel = {
            "1901年  Sully-Prudhomme.jpg  シュリ・プリュドム  フランスの旗 フランス共和国  詩  フランス人初の受賞者 初代受賞者",
            "1902年  T-mommsen -2.jpg  テオドール・モムゼン  ドイツの旗 ドイツ帝国  歴史  ドイツ人初の受賞者",
            "1903年  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  ビョルンスティエルネ・ビョルンソン  ノルウェー  詩  ノルウェー人初の受賞者",
            "1904年  Portrait frederic mistral.jpg  フレデリック・ミストラル  フランスの旗 フランス共和国  詩  フランス人として2人目の受賞者 プロヴァンス語での著作 ホセ・エチェガライ・イ・アイサギレと共に受賞",
            "1904年  Jose Echegaray y Eizaguirre.jpg  ホセ・エチェガライ・イ・アイサギレ  スペインの旗 スペイン王国  戯曲  スペイン人初の受賞者 フレデリック・ミストラルと共に受賞",
            "1905年  Henryk Sienkiewicz 1905.jpg  ヘンリク・シェンキェヴィチ  ポーランドの旗 ポーランド  小説  ポーランド人初の受賞者",
            "1906年  Carducci.jpg  ジョズエ・カルドゥッチ  イタリア王国の旗 イタリア王国  詩  イタリア人初の受賞者",
            "1907年  Rudyard Kipling (portrait).jpg  ラドヤード・キップリング  イギリスの旗 イギリス  小説  イギリス人初の受賞者 ノーベル文学賞最年少受賞者（41歳）",
            "1908年  Eucken-im-Alter.png  ルドルフ・クリストフ・オイケン  ドイツの旗 ドイツ帝国  哲学  ドイツ人として2人目の受賞者",
            "1909年  Selma Lagerlof.jpg  セルマ・ラーゲルレーヴ  スウェーデン  小説  スウェーデン人初の受賞者 女性初の受賞者",
            "1910年  Paul Heyse 1910.jpg  パウル・フォン・ハイゼ  ドイツの旗 ドイツ帝国  小説  ドイツ人として3人目の受賞者",
            "1911年  Maurice Maeterlinck 1911.jpg  モーリス・メーテルリンク  ベルギーの旗 ベルギー  戯曲・詩  ベルギー人初の受賞者 フランス語での著作",
            "1912年  Gerhart Hauptmann nobel.jpg  ゲアハルト・ハウプトマン  ドイツの旗 ドイツ帝国  戯曲",
            "1913年  Rabindranath Tagore.jpg  ラビンドラナート・タゴール  イギリス領インド帝国の旗 イギリス領インド帝国  詩  インド人初の受賞者 アジア人初の受賞者 ベンガル語での著作",
            "1914年      受賞者なし",
            "1915年  Romain Rolland 1915.jpg  ロマン・ロラン  フランスの旗 フランス共和国  小説  フランス人として3人目の受賞者",
            "1916年  Verner von Heidenstam in 1915.jpg  ヴェルネル・フォン・ヘイデンスタム  スウェーデン  詩  スウェーデン人として2人目の受賞者",
            "1917年  Karl Gjellerup 1917.jpg  カール・ギェレルプ  デンマーク  詩  ヘンリク・ポントピダンと共にデンマーク人初の受賞者",
            "1917年  Henrik Pontoppidan 1917.jpg  ヘンリク・ポントピダン  デンマーク  小説  カール・ギェレルプと共にデンマーク人初の受賞者",
            "1918年      受賞者なし",
            "1919年  Carl Spitteler 1919.jpg  カール・シュピッテラー  スイスの旗 スイス  詩  スイス人初の受賞者 ドイツ語での著作"
        };

        while (true) {
            System.out.println("何年の受賞者にしますか?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "年")) {
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
            "1901年  Sully-Prudhomme.jpg  シュリ・プリュドム  フランスの旗 フランス共和国  詩  フランス人初の受賞者 初代受賞者",
            "1902年  T-mommsen -2.jpg  テオドール・モムゼン  ドイツの旗 ドイツ帝国  歴史  ドイツ人初の受賞者",
            "1903年  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  ビョルンスティエルネ・ビョルンソン  ノルウェー  詩  ノルウェー人初の受賞者",
            "1904年  Portrait frederic mistral.jpg  フレデリック・ミストラル  フランスの旗 フランス共和国  詩  フランス人として2人目の受賞者 プロヴァンス語での著作 ホセ・エチェガライ・イ・アイサギレと共に受賞",
            "1904年  Jose Echegaray y Eizaguirre.jpg  ホセ・エチェガライ・イ・アイサギレ  スペインの旗 スペイン王国  戯曲  スペイン人初の受賞者 フレデリック・ミストラルと共に受賞",
            "1905年  Henryk Sienkiewicz 1905.jpg  ヘンリク・シェンキェヴィチ  ポーランドの旗 ポーランド  小説  ポーランド人初の受賞者",
            "1906年  Carducci.jpg  ジョズエ・カルドゥッチ  イタリア王国の旗 イタリア王国  詩  イタリア人初の受賞者",
            "1907年  Rudyard Kipling (portrait).jpg  ラドヤード・キップリング  イギリスの旗 イギリス  小説  イギリス人初の受賞者 ノーベル文学賞最年少受賞者（41歳）",
            "1908年  Eucken-im-Alter.png  ルドルフ・クリストフ・オイケン  ドイツの旗 ドイツ帝国  哲学  ドイツ人として2人目の受賞者",
            "1909年  Selma Lagerlof.jpg  セルマ・ラーゲルレーヴ  スウェーデン  小説  スウェーデン人初の受賞者 女性初の受賞者",
            "1910年  Paul Heyse 1910.jpg  パウル・フォン・ハイゼ  ドイツの旗 ドイツ帝国  小説  ドイツ人として3人目の受賞者",
            "1911年  Maurice Maeterlinck 1911.jpg  モーリス・メーテルリンク  ベルギーの旗 ベルギー  戯曲・詩  ベルギー人初の受賞者 フランス語での著作",
            "1912年  Gerhart Hauptmann nobel.jpg  ゲアハルト・ハウプトマン  ドイツの旗 ドイツ帝国  戯曲",
            "1913年  Rabindranath Tagore.jpg  ラビンドラナート・タゴール  イギリス領インド帝国の旗 イギリス領インド帝国  詩  インド人初の受賞者 アジア人初の受賞者 ベンガル語での著作",
            "1914年      受賞者なし",
            "1915年  Romain Rolland 1915.jpg  ロマン・ロラン  フランスの旗 フランス共和国  小説  フランス人として3人目の受賞者",
            "1916年  Verner von Heidenstam in 1915.jpg  ヴェルネル・フォン・ヘイデンスタム  スウェーデン  詩  スウェーデン人として2人目の受賞者",
            "1917年  Karl Gjellerup 1917.jpg  カール・ギェレルプ  デンマーク  詩  ヘンリク・ポントピダンと共にデンマーク人初の受賞者",
            "1917年  Henrik Pontoppidan 1917.jpg  ヘンリク・ポントピダン  デンマーク  小説  カール・ギェレルプと共にデンマーク人初の受賞者",
            "1918年      受賞者なし",
            "1919年  Carl Spitteler 1919.jpg  カール・シュピッテラー  スイスの旗 スイス  詩  スイス人初の受賞者 ドイツ語での著作"
        };

        while (true) {
            System.out.println("何年の受賞者にしますか?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "年")) {
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
            "1901年  Sully-Prudhomme.jpg  シュリ・プリュドム  フランスの旗 フランス共和国  詩  フランス人初の受賞者 初代受賞者",
            "1902年  T-mommsen -2.jpg  テオドール・モムゼン  ドイツの旗 ドイツ帝国  歴史  ドイツ人初の受賞者",
            "1903年  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  ビョルンスティエルネ・ビョルンソン  ノルウェー  詩  ノルウェー人初の受賞者",
            "1904年  Portrait frederic mistral.jpg  フレデリック・ミストラル  フランスの旗 フランス共和国  詩  フランス人として2人目の受賞者 プロヴァンス語での著作 ホセ・エチェガライ・イ・アイサギレと共に受賞",
            "1904年  Jose Echegaray y Eizaguirre.jpg  ホセ・エチェガライ・イ・アイサギレ  スペインの旗 スペイン王国  戯曲  スペイン人初の受賞者 フレデリック・ミストラルと共に受賞",
            "1905年  Henryk Sienkiewicz 1905.jpg  ヘンリク・シェンキェヴィチ  ポーランドの旗 ポーランド  小説  ポーランド人初の受賞者",
            "1906年  Carducci.jpg  ジョズエ・カルドゥッチ  イタリア王国の旗 イタリア王国  詩  イタリア人初の受賞者",
            "1907年  Rudyard Kipling (portrait).jpg  ラドヤード・キップリング  イギリスの旗 イギリス  小説  イギリス人初の受賞者 ノーベル文学賞最年少受賞者（41歳）",
            "1908年  Eucken-im-Alter.png  ルドルフ・クリストフ・オイケン  ドイツの旗 ドイツ帝国  哲学  ドイツ人として2人目の受賞者",
            "1909年  Selma Lagerlof.jpg  セルマ・ラーゲルレーヴ  スウェーデン  小説  スウェーデン人初の受賞者 女性初の受賞者",
            "1910年  Paul Heyse 1910.jpg  パウル・フォン・ハイゼ  ドイツの旗 ドイツ帝国  小説  ドイツ人として3人目の受賞者",
            "1911年  Maurice Maeterlinck 1911.jpg  モーリス・メーテルリンク  ベルギーの旗 ベルギー  戯曲・詩  ベルギー人初の受賞者 フランス語での著作",
            "1912年  Gerhart Hauptmann nobel.jpg  ゲアハルト・ハウプトマン  ドイツの旗 ドイツ帝国  戯曲",
            "1913年  Rabindranath Tagore.jpg  ラビンドラナート・タゴール  イギリス領インド帝国の旗 イギリス領インド帝国  詩  インド人初の受賞者 アジア人初の受賞者 ベンガル語での著作",
            "1914年      受賞者なし",
            "1915年  Romain Rolland 1915.jpg  ロマン・ロラン  フランスの旗 フランス共和国  小説  フランス人として3人目の受賞者",
            "1916年  Verner von Heidenstam in 1915.jpg  ヴェルネル・フォン・ヘイデンスタム  スウェーデン  詩  スウェーデン人として2人目の受賞者",
            "1917年  Karl Gjellerup 1917.jpg  カール・ギェレルプ  デンマーク  詩  ヘンリク・ポントピダンと共にデンマーク人初の受賞者",
            "1917年  Henrik Pontoppidan 1917.jpg  ヘンリク・ポントピダン  デンマーク  小説  カール・ギェレルプと共にデンマーク人初の受賞者",
            "1918年      受賞者なし",
            "1919年  Carl Spitteler 1919.jpg  カール・シュピッテラー  スイスの旗 スイス  詩  スイス人初の受賞者 ドイツ語での著作"
        };

        while (true) {
            System.out.println("何年の受賞者にしますか?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "年")) {
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
            "1901年  Sully-Prudhomme.jpg  シュリ・プリュドム  フランスの旗 フランス共和国  詩  フランス人初の受賞者 初代受賞者",
            "1902年  T-mommsen -2.jpg  テオドール・モムゼン  ドイツの旗 ドイツ帝国  歴史  ドイツ人初の受賞者",
            "1903年  Portrett av Bjornstjerne Bjornson, 1909 - no-nb digifoto 20150129 00043 bldsa BB0791 - Restoration.jpg  ビョルンスティエルネ・ビョルンソン  ノルウェー  詩  ノルウェー人初の受賞者",
            "1904年  Portrait frederic mistral.jpg  フレデリック・ミストラル  フランスの旗 フランス共和国  詩  フランス人として2人目の受賞者 プロヴァンス語での著作 ホセ・エチェガライ・イ・アイサギレと共に受賞",
            "1904年  Jose Echegaray y Eizaguirre.jpg  ホセ・エチェガライ・イ・アイサギレ  スペインの旗 スペイン王国  戯曲  スペイン人初の受賞者 フレデリック・ミストラルと共に受賞",
            "1905年  Henryk Sienkiewicz 1905.jpg  ヘンリク・シェンキェヴィチ  ポーランドの旗 ポーランド  小説  ポーランド人初の受賞者",
            "1906年  Carducci.jpg  ジョズエ・カルドゥッチ  イタリア王国の旗 イタリア王国  詩  イタリア人初の受賞者",
            "1907年  Rudyard Kipling (portrait).jpg  ラドヤード・キップリング  イギリスの旗 イギリス  小説  イギリス人初の受賞者 ノーベル文学賞最年少受賞者（41歳）",
            "1908年  Eucken-im-Alter.png  ルドルフ・クリストフ・オイケン  ドイツの旗 ドイツ帝国  哲学  ドイツ人として2人目の受賞者",
            "1909年  Selma Lagerlof.jpg  セルマ・ラーゲルレーヴ  スウェーデン  小説  スウェーデン人初の受賞者 女性初の受賞者",
            "1910年  Paul Heyse 1910.jpg  パウル・フォン・ハイゼ  ドイツの旗 ドイツ帝国  小説  ドイツ人として3人目の受賞者",
            "1911年  Maurice Maeterlinck 1911.jpg  モーリス・メーテルリンク  ベルギーの旗 ベルギー  戯曲・詩  ベルギー人初の受賞者 フランス語での著作",
            "1912年  Gerhart Hauptmann nobel.jpg  ゲアハルト・ハウプトマン  ドイツの旗 ドイツ帝国  戯曲",
            "1913年  Rabindranath Tagore.jpg  ラビンドラナート・タゴール  イギリス領インド帝国の旗 イギリス領インド帝国  詩  インド人初の受賞者 アジア人初の受賞者 ベンガル語での著作",
            "1914年      受賞者なし",
            "1915年  Romain Rolland 1915.jpg  ロマン・ロラン  フランスの旗 フランス共和国  小説  フランス人として3人目の受賞者",
            "1916年  Verner von Heidenstam in 1915.jpg  ヴェルネル・フォン・ヘイデンスタム  スウェーデン  詩  スウェーデン人として2人目の受賞者",
            "1917年  Karl Gjellerup 1917.jpg  カール・ギェレルプ  デンマーク  詩  ヘンリク・ポントピダンと共にデンマーク人初の受賞者",
            "1917年  Henrik Pontoppidan 1917.jpg  ヘンリク・ポントピダン  デンマーク  小説  カール・ギェレルプと共にデンマーク人初の受賞者",
            "1918年      受賞者なし",
            "1919年  Carl Spitteler 1919.jpg  カール・シュピッテラー  スイスの旗 スイス  詩  スイス人初の受賞者 ドイツ語での著作"
        };

        while (true) {
            System.out.println("何年の受賞者にしますか?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "年")) {
                    System.out.println(x);
                }
            }
        }
    }
}

        while (true) {
            System.out.println("何年の受賞者にしますか?");
            int y = sc.nextInt();
            for (String x : nobel) {
                if (x.startsWith(y + "年")) {
                    System.out.println(x);
                }
            }
        }
    }
}
