import java.util.Scanner;

public class Toko01 {
    public static void main(String[] args) {

        Scanner input01 = new Scanner(System.in);
        System.out.print("Masukkan nama Anda : ");
        String nama = input01.nextLine();
        System.out.print("Apakah pelanggan member? (y/t): ");
        String member = input01.nextLine();

        boolean isContinue = true;
        double hargaSatuan, totalHarga = 0;
        double diskon, totalDiskon = 0;
        int kuantitas, totalItem = 0;
        String produk;

        while (isContinue) {
            System.out.print("Masukkan produk yang anda beli : ");
            produk = input01.nextLine();
            System.out.print("Banyaknya : ");
            kuantitas = input01.nextInt();
            System.out.print("Masukkan harga satuan: ");
            hargaSatuan = input01.nextDouble();
            System.out.print("Masukkan diskon : ");
            diskon = input01.nextDouble();
      
            double hargaProduk = hargaSatuan * kuantitas * (1 - diskon / 100);
      
            totalHarga += hargaProduk;
            totalDiskon += hargaProduk * diskon / 100;
            totalItem += kuantitas;
      
            System.out.print("Apakah anda mau menambahkan produk? (y/t): ");
            isContinue = input01.nextLine().equals("y");
          }
      
        
          double diskonMember = 0;
          if (member.equals("y") && totalHarga >= 200000) {
            diskonMember = 0.1;
          } else if (member.equals("y")) {
            diskonMember = 0.05;
          }
      
      
          double totalDiskonMember = totalHarga * diskonMember / 100;
      
          
          double totalAkhir = totalHarga - totalDiskon - totalDiskonMember;
      
      
          System.out.println("Nama pelanggan: " + nama);
          System.out.println("Tipe: " + (member.equals("y") ? "Member" : "Non-member"));
          System.out.println("Total item barang yang dibeli2: " + totalItem);
          System.out.println("Total harga sebelum diskon: " + totalHarga);
          System.out.println("Total diskon: " + totalDiskon);
          System.out.println("Total diskon member: " + totalDiskonMember);
          System.out.println("Total akhir yang harus dibayar: " + totalAkhir);
        }
      }