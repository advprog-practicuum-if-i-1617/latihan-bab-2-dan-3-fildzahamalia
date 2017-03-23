package merubahangkahurufsebaliknya;

public class convert {
    
    private String a;
    private String huruf[] = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public String converted(int angka) {
        if (angka < 12) {
            return huruf[angka];
        } else if (angka < 20) {
            return huruf[angka % 10] + " Belas";
        } else if (angka < 100) {
            return huruf[angka / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka < 200) {
            return "Seratus " + converted(angka % 100);
        } else if (angka < 1000) {
            return converted(angka / 100) + " Ratus " + converted(angka % 100);
        } else if (angka == 1000) {
            return "Seribu";
        } else {
            return "inputan melebihi batas";
        }
    }

//    public String converted(String huruf){
//        
//    }
    public String converted(String huruff) {
        String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String angka[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String[] no = huruff.split(" ");
        String hasil = "";
        for (int i = 0; i < no.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (no.length == 5) {
                    if (no[i].indexOf(huruf[j]) >= 0) {
                        hasil = hasil + angka[j];
                    }
                } else if (no.length == 4) {
                    if (no[0].equalsIgnoreCase("seratus") && no[i].indexOf(huruf[j]) >= 0) {
                        hasil = "1" + hasil + angka[j];
                    } else if (no.length == 4 && no[1].equalsIgnoreCase("ratus") && no[3].equalsIgnoreCase("belas") && no[i].indexOf(huruf[j]) >= 0) {
                        hasil = angka[j] + "1" + angka[j];
                    } else if (no.length == 4 && no[1].equalsIgnoreCase("ratus") && no[3].equalsIgnoreCase("puluh") && no[i].indexOf(huruf[j]) >= 0) {
                        hasil = angka[j] + angka[j] + "0";
                    }

                } else if (no.length == 3) {
                    if ( no[i].indexOf(huruf[j]) >= 0) {
                        hasil = hasil + angka[j];
                    } else if (no.length == 3 && no[0].equalsIgnoreCase("seratus") && no[1].equalsIgnoreCase(huruf[j]) && no[2].equalsIgnoreCase("belas")) {
                        hasil = "11" + angka[j];
                    } else if (no.length == 3 && no[0].equalsIgnoreCase("seratus") && no[1].equalsIgnoreCase(huruf[j]) && no[2].equalsIgnoreCase("puluh")) {
                        hasil = "1" + angka[j] + "0";
                    } else if (no.length == 3 && no[0].equalsIgnoreCase(huruf[j]) && no[1].equalsIgnoreCase("ratus sepuluh")) {
                        hasil = angka[j] + "10";
                    } else if (no.length == 3 && no[0].equalsIgnoreCase(huruf[j]) && no[1].equalsIgnoreCase("ratus sebelas")) {
                        hasil = angka[j] + "11";
                    } 
                } else if (no.length == 2) {
                    if (no.length == 2 && no[1].equalsIgnoreCase("puluh") && no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = angka[j] + "0";
                    } else if (no.length == 2 && no[1].equalsIgnoreCase("belas") && no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = "1" + angka[j];
                    } else if (no.length == 2 && no[1].equalsIgnoreCase("ratus") && no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = angka[j] + "00";
                    } else if (no.length == 2 && no[0].equalsIgnoreCase("seratus") && no[1].equalsIgnoreCase(huruf[j])) {
                        hasil = "10" + angka[j];
                    } else if (no.length == 2 && no[0].equalsIgnoreCase("seratus") && no[1].equalsIgnoreCase("sepuluh")) {
                        hasil = "110";
                    } else if (no.length == 2 && no[0].equalsIgnoreCase("seratus") && no[1].equalsIgnoreCase("sebelas")) {
                        hasil = "111";
                    }
                } else if (no.length == 1) {
                    if (no[0].equalsIgnoreCase(huruf[j])) {
                        hasil = angka[j];
                    } else if (no[0].equalsIgnoreCase("seratus")) {
                        hasil = "100";
                    } else if (no[0].equalsIgnoreCase("seribu")) {
                        hasil = "1000";
                    }
                }
            }
        }
        return hasil;
    }
}
