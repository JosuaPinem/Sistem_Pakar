package SISTEM_PAKAR_KEL_4;
import java.util.Scanner;
class Login {
    private String NamaDepan;
    private String NamaBelakang;
    private String JenisKelamin;
    private String namadepan;
    private String namabelakang;
    private String jeniskelamin;
    public int Umur;
    private int umur;
    public static Scanner scan = new Scanner(System.in);
    public void setNamaDepan(String namadepan){
        this.NamaDepan = namadepan;
    }
    public void setJenisKelamin(String jeniskelamin){
        this.JenisKelamin = jeniskelamin;
    }
    public void setUmur(int umur){
        this.Umur = umur;
    }
    public void setNamaBelakang(String namabelakang){
        this.NamaBelakang = namabelakang;
    }
    public void inputNamaDepan(){
        System.out.print("Nama Depan    : ");
        namadepan = scan.nextLine();
        this.setNamaDepan(namadepan);
    }
    public void inputNamaBelakang(){
        System.out.print("Nama Belakang : ");
        namabelakang = scan.nextLine();
        this.setNamaBelakang(namabelakang);
    }
    public void inputJenisKelamin(){
        System.out.print("Jenis Kelamin : ");
        jeniskelamin = scan.nextLine();
        this.setJenisKelamin(jeniskelamin);
    }
    public void inputUmur(){

        System.out.print("Umur (angka)  : ");
        umur = Integer.parseInt(scan.next().trim());
        this.setUmur(umur);
    }
    public void display(){
        System.out.println();
        System.out.println("=================================================================================");
        System.out.println("\tHalo, "+this.NamaDepan+"! Berikut data diri anda : ");
        System.out.println("\tNama          : " + this.NamaDepan + " " + this.NamaBelakang);
        System.out.println("\tJenis Kelamin : " + this.JenisKelamin);
        System.out.println("\tUmur          : " + this.Umur + " Tahun");
        System.out.println("=================================================================================");
        System.out.println();
    }
    public void display2(){
        System.out.println();
        System.out.println("=================================================================================");
        System.out.println("Nama          : " + this.NamaDepan + " " + this.NamaBelakang);
        System.out.println("Jenis Kelamin : " + this.JenisKelamin);
        System.out.println("Umur          : " + this.Umur + " Tahun");
    }
}
