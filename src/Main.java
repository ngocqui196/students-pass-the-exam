import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng sinh viên thi");
            size = Integer.parseInt(sc.nextLine());
            if (size > 30) {
                System.out.println("Sơ lượng không quá 30.");
            }
        }while (size > 30);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập điểm số trung bình học sinh thứ "+i+":");
            int point = Integer.parseInt(sc.nextLine());
            arr[i] = point;
        }

        System.out.print("Danh sách các số điểm :");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if  ( arr[i] > 5 & arr[i] < 10) {
                count++;
            }
        }
        System.out.println("Tổng số các sinh viên thi đỗ: " + count);
    }
}
