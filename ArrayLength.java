import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");
		for (int i = 0; i < intArray.length; i++) //�Է¹޴� �ݺ���
			intArray[i] = scanner.nextInt();

		for (int i = 0; i < intArray.length; i++) //���� ���ϴ� �ݺ���
			sum += intArray[i];

		System.out.println("����� " + (double) sum / intArray.length); //��հ��
		scanner.close();
	}
}