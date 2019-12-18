package by.belhard.j19.hw.hw3;

/*
 * 1.	Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
	Например, при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер, от 21 до 30 майку, выше 30 – ничего.
 */
public class Task1 {

	public static void main(String[] args) {

		int temperature = 11;
		String result = "";

		if (temperature < 10)
			result = "куртка";
		else if (temperature < 16)
			result = "ветровка";
		else if (temperature < 21)
			result = "свитер";
		else if (temperature < 31)
			result = "майка";
		else
			result = "отсутствует";

		System.out.println("Температура = " + temperature + ", одежда: " + result);

	}

}
