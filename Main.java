package Tugas05;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> listTugas = new LinkedList<String>();
        String masukan;
        int fence = 0;

        System.out.println("Menu :");
        System.out.println("1. Tambahkan tugas");
        System.out.println("2. Tugas selesai");
        System.out.println("3. Tampilkan daftar tugas prioritas");
        System.out.println("4. Tampilkan daftar tugas");
        System.out.println("5. Hentikan Program");

        String masukan2 = input.nextLine();

        while (fence != 1){
            if (Objects.equals(masukan2, "1")) {
                System.out.print("Masukan nama tugas : ");
                masukan = input.nextLine();
                listTugas.add(masukan);
                System.out.println("----------------------");
            }
            if (Objects.equals(masukan2, "2")) {
                listTugas.poll();
                System.out.println("Tugas di selesaikan");
                System.out.println("----------------------");
            }
            if (Objects.equals(masukan2, "3")) {
                System.out.println(listTugas.peek());
                System.out.println("----------------------");
            }
            if (Objects.equals(masukan2, "4")) {
                System.out.println(listTugas);
                System.out.println("----------------------");
            }
            if (Objects.equals(masukan2, "5")) {
                fence = 1;
                System.out.println("Menghentikan program");
                System.out.println("----------------------");
            }
            if (!Objects.equals(masukan2, "5")) {
                System.out.println("Menu :");
                System.out.println("1. Tambahkan tugas");
                System.out.println("2. Tugas selesai");
                System.out.println("3. Tampilkan daftar tugas prioritas");
                System.out.println("4. Tampilkan daftar tugas");
                System.out.println("5. Hentikan Program");

                masukan2 = input.nextLine();
            }
        }
    }
}
