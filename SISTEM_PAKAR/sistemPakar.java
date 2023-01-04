package SISTEM_PAKAR_KEL_4;
import java.util.Scanner;
class sistemPakar {
    public static Scanner scan = new Scanner(System.in);
    private static float hasil, hasilPls;
    public void runSistemPakar(){
        int ruang = 0;
        String jawaban;
        String[] pertanyaan = new String[6];
        pertanyaan[1]  = "Apakah Penglihatan mata anda kabur atau tidak fokus?";
        pertanyaan[2]  = "Apakah anda sulit untuk melihat di malam hari?";
        pertanyaan[3]  = "Apakah mata anda menjadi lebih sensitif terhadap cahaya/silau?";
        pertanyaan[4]  = "Apakah anda merasa terdapat lingkaran putih dalam sumber cahaya seperti lampu pada mata anda??";
        pertanyaan[5]  = "Apakah penglihatan anda menjadi lebih ganda";
        float[] belief = {0,0.6f, 0.8f, 0.5f, 0.8f, 0.5f};
        float[] user = new float[6];
        for(int soal = 1; soal <=5; soal++){
            System.out.println(pertanyaan[soal]);
            System.out.print("Jawaban anda (y/t) : ");
            jawaban = scan.next();
            if(jawaban.equals("y") || jawaban.equals("Y")){
                user[ruang] = belief[soal];
                ruang +=1;
            }else{
                continue;
            }
        if(user[1]==0){
            this.hasil = user[0] * 10;
        }else{
            setKombinasi_1(user[0], user[1]);
            if(user[2] != 0){
                for(int i = 2; i <= 5; i++ ){
                    if(user[i] != 0){
                        setKombinasi_1(hasil, user[i]);
                    }else{
                        continue;
                    }
                }
                this.hasil = this.hasil * 100;
            }else{
                this.hasil = this.hasil * 100;
            }

        }

        }
    }
    public void setKombinasi_1(float Bel_1, float Bel_2){
        float Pls_1 = 1 - Bel_1;
        float Pls_2 = 1 - Bel_2;
        float kombinasiBel = Bel_1 * Bel_2;
        float KombinasiBelPls = Bel_1 * Pls_2;
        float KombinasiPlsBel = Pls_1 * Bel_2;
        float KomBinasiPls = Pls_1 * Pls_2;
        this.hasil = KombinasiBelPls + kombinasiBel + KombinasiPlsBel/ 1-0;
        this.hasilPls = KomBinasiPls;
    }

    public void display(){
        System.out.println();
        System.out.println("Kemungkinan anda terkena katarak adalah " + this.hasil + " %");
        if(this.hasil>50){
            System.out.println("Kami menyarankan anda untuk memeriksa ke dokter mata!");
        }else {
            System.out.println("Kami menyarankan anda untuk menjaga pola hidup sehat dan kebersihan mata!");
        }
        System.out.println("=================================================================================");
    }
}
