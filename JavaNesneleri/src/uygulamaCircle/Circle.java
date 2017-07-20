package uygulamaCircle;

public class Circle {
	double radius; // yarıcap

	public Circle(double newRadius) {
		radius = newRadius;

	}

	public Circle() {
		radius = 10d;

	}

	double alan() {
		double circleAlan = (double) (radius * radius * 3.14);
		System.out.println("Dairenin alanı =" + circleAlan);
		return circleAlan;
	}

	double cevre() {
		double i = (double) (2 * 3.14 * radius);
		System.out.println(i);
		return i;
	}

	public void getInfo() {
		System.out.println(radius);
	}

}
