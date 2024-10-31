package car;
import java.util.Scanner;

public class tester {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Silahkan Pilih Kendaraan Anda");
        System.out.println("1. Mobil");
        System.out.println("2. Sepeda");
        System.out.println("----------------------------");
        int pilihan = s.nextInt();
        s.nextLine();
        if (pilihan == 1) {
            System.out.println("Masukkan Merk : ");
            String merk = s.nextLine();
            System.out.print("Jumlah Roda : ");
            int numWheels = s.nextInt(); 
            s.nextLine();           
            System.out.println("Harga : ");
            double price = s.nextDouble();
            s.nextLine();            
            System.out.println("Jumlah Pintu : ");
            int numDoors = s.nextInt();
            System.out.print("Convertible (1. Ya /2. Tidak) :");
            Convertible mobil = new Convertible();
            System.out.println("tipe atap");
            String atap=s.nextLine();
            s.nextLine();  
            System.out.println("Apakah Listrik ? (True/False)");
            boolean isElectric = s.nextBoolean();
            Car c1 = new Car(numDoors, price, numWheels, isElectric);
            System.out.println("Masukkan persentase diskon: ");
            double discountPercentage = s.nextDouble();
            double finalPrice = c1.applyDiscount(discountPercentage);
            c1.print();
            System.out.println("Diskon: " + discountPercentage + "%");
            System.out.println("Harga setelah diskon: " + finalPrice);
        } else if (pilihan == 2) {
            System.out.println("Tipe Sepeda: ");
            String biketype = s.nextLine();
            System.out.println("Merk Sepeda: ");
            String merk = s.nextLine();
            System.out.println("Jumlah Roda: ");
            int numWheels = s.nextInt();
            s.nextLine();
            System.out.println("Harga: ");
            double harga = s.nextDouble();
            s.nextLine();
            Bicycle b1 = new Bicycle(numWheels, harga, biketype);
            System.out.println("Masukkan persentase diskon: ");
            double discountPercentage = s.nextDouble();
            double finalPrice = b1.applyDiscount(discountPercentage);
            b1.print();
            System.out.println("Diskon: " + discountPercentage + "%");
            System.out.println("Harga setelah diskon: " + finalPrice);
            
        }

        s.close();
    }
}
