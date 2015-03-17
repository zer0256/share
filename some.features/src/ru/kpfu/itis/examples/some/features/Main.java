package ru.kpfu.itis.examples.some.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		final int count = 10;
		final int max = 2000;

		Student[] students = new Student[count];
		for (int index = 0; index < count; index++) {
			students[index] = new Student("Student " + index,
					(int) (max * Math.random()));
		}

		System.out.println(Arrays.toString(students));

		Main main = new Main();
		System.out.println("После определнного года:");
		System.out.println(main.getStudents(students, s -> s.getYear() > 1000));

		Arrays.sort(students, (s1, s2) -> s1.getYear() - s2.getYear());
	}

	public List<Student> getStudents(Student[] array, Predicate<Student> test) {
		List<Student> list = new ArrayList<>();
		for (Student st : array) {
			if (test.test(st)) {
				list.add(st);
			}
		}
		return list;
	}

}
