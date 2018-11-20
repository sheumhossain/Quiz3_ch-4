package distance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoundUnitTest {
	double velocity = 1100;
	double time = 7.2;
	Sound sound = new Sound();

	@Test
	void test() {
		assertEquals(7920.0,sound.dist(velocity, time));
	}
	

}
