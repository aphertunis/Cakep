//Nama      : Nur Riskon Abdan Syakuro
//  NIM       : 23176031
//  Prodi     : Sistem Informasi
//  Deskripsi :   program ini untuk menanyakan apakah author mengerjakan sendiri atau tidak


import java.util.Scanner;

public class latihan30 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("run:");
            System.out.println("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?");
            System.out.print("Jawab (Iyanih/Enggak): ");
            String jawaban = scanner.nextLine();
            
            if (jawaban.equalsIgnoreCase("Iyanih")) {
                System.out.println("Bagus. Good Job");
                System.out.println("BUILD SUCCESSFUL (total time: 8 seconds)");
            } else if (jawaban.equalsIgnoreCase("Enggak")) {
                System.out.println("Tetep Bagus sih.");
                System.out.println("Yang penting paham konsep nya.");
                System.out.println("Keep the code works dude");
                System.out.println("BUILD SUCCESSFUL (total time: 6 seconds)");
            } else {
                System.out.println("Salah input, coba lagi!");
            }
        }
    }
}
