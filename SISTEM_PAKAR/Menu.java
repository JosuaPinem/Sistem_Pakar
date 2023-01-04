package SISTEM_PAKAR_KEL_4;
import java.util.Scanner;
public class Menu {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int MENU;
        Login log_in = new Login();
        sistemPakar user = new sistemPakar();
        Katarak katarak = new Katarak();
        //Login data pasien
        System.out.println("Silahkan isi data diri anda!");
        log_in.inputNamaDepan();
        log_in.inputNamaBelakang();
        log_in.inputJenisKelamin();
        log_in.inputUmur();
        log_in.display();
        System.out.println();
        //ucapan
        System.out.println("Selamat datang di sistem pakar Katarak ");
        System.out.println("Sistem ini dibangun untuk mengukur persentase anda terkena penyakit katarak");
        boolean menu = true;
        while (menu){
            System.out.println("Silahkan pilih menu yang anda inginkan : ");
            System.out.println("[1] Sistem Pakar");
            System.out.println("[2] Mengenai Katarak");
            System.out.println("[3] Ciri-Ciri Katarak");
            System.out.println("[4] Keluar");
            System.out.println();
            System.out.print("Menu yang anda inginkan : ");
            MENU = Integer.parseInt(scan.next().trim());
            switch(MENU){
                case 1 :
                    user.runSistemPakar();
                    log_in.display2();
                    user.display();
                    break;
                case 2 :
                    katarak.display();
                    break;
                case 3 :
                    katarak.display2();
                    break;
                case 4 :
                    System.out.println("Terima kasih semoga anda tetap dalam keadaan sehat!");
                    try
                    {
                        final String os = System.getProperty("os.name");
                        if (os.contains("Windows"))
                        {
                            Runtime.getRuntime().exec("cls");
                        }
                    }
                    catch (final Exception e)
                    {
                        e.printStackTrace();
                    }
                    System.exit(0);

            }
            menu = getYesorNo("Apakah anda ingin ke main menu?");
            System.out.println("Terima kasih semoga anda tetap dalam keadaan sehat!");
        }
    }
    private static boolean getYesorNo(String massage) {
        String Input;
        System.out.println("\n" + massage + "(ya/tidak)");
        Input = scan.next();
        while (!Input.equalsIgnoreCase("ya") && !Input.equalsIgnoreCase("tidak")) {
            System.err.println("Maaf inputan yang anda masukkan salah!");
            System.out.println("\n" + massage + "(ya/tidak)");
            Input = scan.next();
        }

        return Input.equalsIgnoreCase("ya");
    }
}
