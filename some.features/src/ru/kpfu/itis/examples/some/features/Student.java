package ru.kpfu.itis.examples.some.features;

public class Student {

	private String name;

	private int year;

	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Студент [имя=" + name + ", год=" + year + "]";
	}

}
