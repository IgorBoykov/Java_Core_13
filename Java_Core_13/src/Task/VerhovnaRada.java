package Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerhovnaRada {

	List<Fraction> fract = new ArrayList<>();

	public void addFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву Фракції");
		String newFractionName = sc.nextLine();

		Fraction f = new Fraction(null, newFractionName);
		System.out.println("Фракцію " + newFractionName + " додано");
		fract.add(f);
	}

	public void deleteFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть Фракцію, яку хочете видалити");
		String deleteFractionName = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			if (deleteFractionName.equals(iterator.next().getNameOfFraction())) {
				iterator.remove();
				System.out.println("Фракцію " + deleteFractionName + " видалено");
			}
		}
	}

	public void ShowAllFraction() {
		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			System.out.println();
			System.out.println(iterator.next());
		}
	}

	public void ShowFractionX() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть Фракцію, яку хочете вивести");
		String fractionSc = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fractionX = iterator.next();
			if (fractionX.getNameOfFraction().equals(fractionSc)) {
				System.out.println("Список фракцій");
				System.out.println();
				System.out.println(fractionX);
			}
		}
	}

	public void addDepToFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть Фракцію, в яку хочете додати депутата");
		String fractionPlusDep = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionPlusDep)) {
				fraction1.addDeputat();
				System.out.println("Депутата додано до фракції " + fraction1);
			}
		}
	}

	public void deleteDepToFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть Фракцію, з якої хочете видалити депутата");
		String fractionMinusDep = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionMinusDep)) {
				fraction1.deleteDeputat();
				System.out.println("Депутата видалено фракції " + fraction1);
			}
		}
	}

	public void showAllHabarnyksOfFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть Фракцію, з якої хочете вивести всіх хабарників");
		String fractionHabarnyks = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionHabarnyks)) {
				fraction1.showHabarnyks();
				System.out.println("Всі хабарники фракції " + fraction1);
			}
		}
	}

	public void biggestHabarnykOfFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву Фракції");
		String fractionBiggestHabarnyks = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionBiggestHabarnyks)) {
				fraction1.biggestHabarnyk();
				System.out.println("Найбільший хабарник фракції " + fraction1);
			}
		}
	}

	public void showAllDeputatsOfFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву Фракції");
		String fractionAllDep = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionAllDep)) {
				fraction1.showAllDeputats();
				;
				System.out.println("Депутати фракції " + fraction1);
			}
		}
	}

	public void cleanFractionXfromDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву Фракції");
		String fractionAllDepClean = sc.nextLine();

		Iterator<Fraction> iterator = fract.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.getNameOfFraction().equals(fractionAllDepClean)) {
				fraction1.deleteAllDeputats();
				;
				System.out.println("Фракцію " + fraction1 + " очищено від депутатів");
			}
		}
	}

}
