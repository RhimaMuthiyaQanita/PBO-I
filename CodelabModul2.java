package org.example;

import java.util.Scanner;

class Mahasiswa {
    static String universitas = "Universitas Muhammadiyah Malang";
    private String nim;
    private String nama;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas: " + universitas);
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan data mahasiswa
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Memastikan panjang NIM sesuai spesifikasi
        while (nim.length() < 15 || nim.length() > 15) {
            System.out.println("Panjang NIM harus 15 angka. Silakan masukkan kembali.");
            System.out.print("Masukkan NIM: ");
            nim = scanner.nextLine();
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jurusan);

        // Menampilkan universitas
        Mahasiswa.tampilUniversitas();

        // Menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa:");
        mahasiswa.tampilDataMahasiswa();

        scanner.close();
    }
}
