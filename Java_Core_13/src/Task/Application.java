package Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		VerhovnaRada vr = new VerhovnaRada();

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				vr.addFraction();
			}
				break;
			case "2": {
				vr.deleteFraction();
			}
				break;
			case "3": {
				vr.ShowAllFraction();
			}
				break;
			case "4": {
				vr.cleanFractionXfromDeputat();
			}
				break;
			case "5": {
				vr.ShowFractionX();
			}
				break;
			case "6": {
				vr.addDepToFraction();
			}
				break;
			case "7": {
				vr.deleteDepToFraction();
			}
				break;
			case "8": {
				vr.showAllDeputatsOfFraction();

			}
				break;
			case "9": {
				vr.biggestHabarnykOfFraction();
			}

				break;

			default:
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");

	}

}
