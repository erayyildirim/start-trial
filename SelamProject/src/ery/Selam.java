package ery;

public class Selam {
	private String world = "Millet";

	public String selamSoyle(String kime) {
		String selamCumlesi;

		if (kime != " ")

			selamCumlesi = "Selam " + kime + ":)";
		else
			selamCumlesi = "Selam " + world + ":)";

		return selamCumlesi;
	}

}
