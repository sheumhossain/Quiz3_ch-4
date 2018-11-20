package distance;

public class Sound {
	public static void main(String[] args) {
		double velocity = 1100;
		double time = 7.2;
		double distance = dist(velocity,time);
		System.out.println(distance);
	}

	public static double dist(double vel,double t) {
		return vel*t;
	}
}
