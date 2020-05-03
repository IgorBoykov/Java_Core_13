package Task;

import java.util.Scanner;

public class Deputat extends Human {

	private String surname;
	private String name;
	private int age;
	private boolean habarnyk;
	public int qhabar;

	public Deputat(int mass, int height, String surname, String name, int age, boolean habarnyk, int qhabar) {
		super(mass, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.habarnyk = habarnyk;
		this.qhabar = qhabar;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHabarnyk() {
		return habarnyk;
	}

	public void setHabarnyk(boolean habarnyk) {
		this.habarnyk = habarnyk;
	}

	@Override
	public String toString() {
		return "Deputat [surname=" + surname + ", name=" + name + ", age=" + age + ", habarnyk=" + habarnyk
				+ ", toString()=" + super.toString() + "]";
	}

	public void giveHabar() {
		if (habarnyk == false) {
			System.out.println("÷ей депутат не бере хабар≥в");
		} else {
			System.out.println("яку суму хабар€ дати депутату?");
			Scanner sc = new Scanner(System.in);
			int newhabar = sc.nextInt();
			if (newhabar > 5000) {
				System.err.println("ƒепутата ув€знить пол≥ц≥€");
			} else {
				System.out.println("хабар в сум≥ " + newhabar + " передано");
				this.qhabar = newhabar;
			}
		}

	}

}
