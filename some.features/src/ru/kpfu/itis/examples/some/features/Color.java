package ru.kpfu.itis.examples.some.features;

public enum Color {

	UNDEFINED("Неизвестный"),

	RED("Красный"),

	GREEN("Зеленый"),

	BLUE("Синий");

	private String description;

	private Color(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return getDescription();
	}

}
