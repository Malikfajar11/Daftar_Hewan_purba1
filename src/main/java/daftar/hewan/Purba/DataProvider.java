package daftar.hewan.Purba;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import daftar.hewan.Purba.model.Gajah;
import daftar.hewan.Purba.model.Ikan;
import daftar.hewan.Purba.model.Hewan;
import daftar.hewan.Purba.model.Burung;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Gajah> initDataGajah(Context ctx) {
        List<Gajah> gajahs = new ArrayList<>();
        gajahs.add(new Gajah("American Mastodon", "Amerika",
                "Tinggi gajah betina ialah 7 kaki (2,1 meter) dan jantan 10 kaki (3 meter). Beratnya bisa mencapai 6 ton, panjangnya mencapai 4,5 meter dan gadingnya memiliki panjang 2 meter", R.drawable.gajah1));
        gajahs.add(new Gajah("Amebelodon", "Amerikaa Utara",
                "Ciri khas paling menonjol dari Amebelodon adalah gading bagian bawah yang berbentuk seperti sekop. Dua gading ini bentuknya rata, pipih dan berdekatan", R.drawable.gajah2));
        gajahs.add(new Gajah("Mammoth berbulu", "Samudra Arktik",
                " mammoth berbulu terakhir terlihat pada 4.000 tahun lalu di sebuah pulau terpencil di Samudra Arktik. Manusia memang pernah hidup berdampingan dengan mammoth.Sayangnya, manusia purba dulu berburu mammoth untuk dimanfaatkan organ tubuhnya. Misal, memakai bulu sebagai pakaian atau gading sebagai alat untuk berburu.", R.drawable.gajah3));
        gajahs.add(new Gajah(" Deinotherium", "Afrika",
                "Kalau biasanya gading gajah melengkung ke atas, berbeda dengan Deinotherium. Gading gajah ini justru melengkung ke arah bawah dan cenderung pendek.", R.drawable.gajah4));
        gajahs.add(new Gajah(" Palaeomastodon", "Afrika Utara",
                "Menurut para ilmuwan, Palaeomastodon adalah kerabat dekat Moeritherium, salah satu nenek moyang gajah. Sepintas, wujudnya mirip dengan tapir yang kita kenal sekarang.", R.drawable.gajah5));
        gajahs.add(new Gajah("Stegomastodon", "Amerika Selatan",
                "Gajah Stegomastodon hidup di zaman Pliosen Akhir hingga Modern, kira-kira 3 juta hingga 10.000 tahun lalu ", R.drawable.gajah6));
        return gajahs;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Andalgalornis", "Argentina",
                "Andalgalornis merupakan burung predator raksasa yang hidup pada masa Miosen Akhir, atau sekiitar 23 juta tahun yang lalu", R.drawable.burung1));
        burungs.add(new Burung("Titanis", "Amerika Selatan ",
                "Titanis menjadi salah satu burung yang cukup ditakuti pada masa Pliosen hingga Pleistosen, atau sekitar 3.1 juta tahun yang lalu dan mendapatkan julukan sebagai Terror Bird", R.drawable.burung2));
        burungs.add(new Burung("Phorusracos", "Argentina",
                "Hewan bernama latin Phorusracos longissimus yang memiliki arti sangat panjang ini memiliki tinggi 2,5 meter dan berat badan 130 kg. ", R.drawable.burung3));
        burungs.add(new Burung("Gastornis", "Eropa",
                "30 juta tahun lalu. Burung bernama latin Gastornis gigantea umumnya memangsa mamalia kecil yang hidup pada masa itu. Tinggi yang mencapai 2 meter membuat burung ini menjadi pemangsa utama di pada masa tersebut. ", R.drawable.burung4));
        burungs.add(new Burung("Argentavis", "Argentina",
                "Argentavis merupakan burung terbang terbesar yang pernah ada di muka bumi, dengan rentang sayap sepanjang 7 meter hingga 8 meter.", R.drawable.burung5));
        burungs.add(new Burung("Kelenken", "provinsi Rio Negro",
                "Kelenken menjadi burung yang tidak terbang terbesar, dari keluarga Phorusrhacidae yang pernah ada, dengan panjang tengkorak yang telah ditemukan sepanjang 71,6 cm. ", R.drawable.burung6));
        return burungs;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Lancetfish", "Kutub utara",
                "Ukuran Lancetfish sekitar 2 meter dan dapat ditemukan di banyak lautan kecuali kutub. Ia pun memangsa ikan-ikan lebih kecil, cumi-cumi bahkan sesamanya sendiri.", R.drawable.ikan1));
        ikans.add(new Ikan("Arwana", "Asia,Afrika,dan Australia",
                "Kehebatan hewan berwarna indah ini adalah bisa melompat hingga ketinggian dua meter di atas air untuk menangkap burung atau kelelawar", R.drawable.ikan2));
        ikans.add(new Ikan("Frilled Shark", "Pedalaman Laut",
                "Pemangsa dalam laut yang sudah ada di zaman Cretaceous ini masih hidup hingga saat ini.", R.drawable.ikan3));
        ikans.add(new Ikan("Sturgeon", "Rusia",
                "Populasi ikan ini sangat terancam karena perburuan yang tak bisa dikendalikan. Spesies ini bisa tumbuh hingga mencapai 6 meter. Sturgeon pun tak berbahaya bagi manusia kecuali bila merasa terancam.", R.drawable.ikan4));
        ikans.add(new Ikan("Sawfish", "Pedalaman laut",
                "Biasa juga dikenal dengan nama hiu gergaji. Predator laut ini pun memiki status hampir punah. Selain di laut, Sawfish juga bisa ditemukan di sungai atau anaksungai. Ukurannya mencapai 7 meter membuat ini terlihat seperti hiu.", R.drawable.ikan5));
        ikans.add(new Ikan("Coelacanthh", "Pedalaman Laut",
                "Makanan hewan ini adalah ikan kecil bahkan hiu kecil. Ikan ini pun biasa ditemukan di perairan yang gelap.", R.drawable.ikan6));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataGajah(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

