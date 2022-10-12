
// Tugas praktikum 3 Muhamad Zaki Raihan
import java.util.Scanner;

public class spookynumber {
  public static void main(String[] Args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Pilih tombol lift 1-18 : ");

    int floor = myObj.nextInt();

    if (floor > 13) {
      int actuallyFloor = (int) (floor - 1);
      System.out.print("Lantai Saat ini " + actuallyFloor);
    } else {
      System.out.print("Lantai Saat ini " + floor);
    }

  }
}
