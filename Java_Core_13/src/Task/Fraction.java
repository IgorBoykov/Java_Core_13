package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	List<Deputat> depts = new ArrayList<>();

	public void addDeputat() {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ ������� ��������");
		String addSurName = sc.nextLine();
		System.out.println("������ ��'� ��������");
		String addName = sc.nextLine();
		System.out.println("������ �� ��������");
		int addAge = sc.nextInt();
		System.out.println("�� ��������� ������� ����������? true - ���� ��� ; false - ���� �");
		boolean addhabarnyk = sc.nextBoolean();
		System.out.println("������ ���� �������� � ��");
		int addMass = sc.nextInt();
		System.out.println("������ ��� �������� � ��");
		int addHeight = sc.nextInt();

		Deputat d = new Deputat(addMass, addHeight, addSurName, addName, addAge, addhabarnyk, 0);

		System.out.println("�������� " + d + " ������");

		d.giveHabar();

		depts.add(d);

	}

	public void deleteDeputat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� �������� ����� ������ ��������");
		String deleteSurName = sc.nextLine();

		Iterator<Deputat> iterator = depts.iterator();
		while (iterator.hasNext()) {
			if (deleteSurName.equals(iterator.next().getSurname())) {
				iterator.remove();
				System.out.println("�������� " + deleteSurName + " ��������");
			}
		}
	}

	public void showHabarnyks() {
		Iterator<Deputat> iterator = depts.iterator();
		while (iterator.hasNext()) {
			Deputat habarDeputat = iterator.next();
			if (habarDeputat.isHabarnyk()) {
				System.out.println("������ ���������");
				System.out.println();
				System.out.println(habarDeputat);
			}
		}
	}

	public Deputat biggestHabarnyk() {
		return Collections.max(depts, new DeputatComparator());
	}

	public void showAllDeputats() {
		Iterator<Deputat> iterator = depts.iterator();
		while (iterator.hasNext()) {
			System.out.println("������ ��� ��������");
			System.out.println();
			System.out.println(iterator.next());
		}
	}

	public void deleteAllDeputats() {
		depts.clear();
		System.out.println("��� �������� � ������� ��������");
	}

	String nameOfFraction;

	public Fraction(List<Deputat> depts, String nameOfFraction) {
		super();
		this.depts = depts;
		this.nameOfFraction = nameOfFraction;
	}

	public List<Deputat> getDepts() {
		return depts;
	}

	public void setDepts(List<Deputat> depts) {
		this.depts = depts;
	}

	public String getNameOfFraction() {
		return nameOfFraction;
	}

	public void setNameOfFraction(String nameOfFraction) {
		this.nameOfFraction = nameOfFraction;
	}

	@Override
	public String toString() {
		return "Fraction nameOfFraction=" + nameOfFraction;
	}

}
