import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 10;
        int[] array = new int[N];
        System.out.print("Nhập số cần chèn (X): ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí (index) cần chèn (từ 0 đến " + (N - 1) + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index >= N) {
            System.out.println("Không thể chèn phần tử vào mảng.");
        } else {

            for (int i = N - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
