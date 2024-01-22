import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Tarik tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda sekarang: $" + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah deposit: ");
                    double depositAmount = scanner.nextDouble();
                    saldo += depositAmount;
                    System.out.println("Deposit sejumlah $" + depositAmount + " berhasil. Saldo Anda sekarang: $" + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= saldo) {
                        saldo -= withdrawalAmount;
                        System.out.println("Penarikan sejumlah $" + withdrawalAmount + " berhasil. Saldo Anda sekarang: $" + saldo);
                    } else {
                        System.out.println("Saldo tidak mencukupi untuk melakukan penarikan.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }
}
