import java.util.Scanner;
public class StudiKasus103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Input your total cup: ");
        jumlahCup = sc.nextInt();

        System.out.print("input Your Payment: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Payment Before Discount Is Rp." + totalHarga);
        System.out.println("Total Discount Is Rp." + diskon);
        System.out.println("Total Payment After Discount Is Rp." + totalBayar);

        if (uangBayar  >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Your Change is Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Not Enough Money, Short By Rp." + kurang);
        }
        
        }
    }