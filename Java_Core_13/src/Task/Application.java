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
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");

	}

}
