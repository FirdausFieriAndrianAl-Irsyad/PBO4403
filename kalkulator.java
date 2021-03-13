package PBO;

public class kalkulator {
    public static void main(String[] args) {
        int angka1 = 12, angka2 = 5;

        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2;
        int modulus = angka1 % angka2;

        System.out.println("Hasil Penjumlahan :" + penjumlahan);
        System.out.println("Hasil Pengurangan :" + pengurangan);
        System.out.println("Hasil Perkalian " + perkalian);
        System.out.println("Hasil Pembagian :" + pembagian);
        System.out.println("Hasil Modulus : " + modulus);
    }
}
