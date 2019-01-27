// This program uses inheritance to extend the random class and print random numbers/characters under specified conditions 

import java.util.Random;

public class newRandom extends Random {
	Random rand = new Random();

	// method that prints random int between low and high range
	public int nextInt(int l, int h) {
		int random = rand.nextInt(h - l) + l;
		return random;
	}

	// method that prints random even int with max
	public int nextEven(int h) {
		int random = rand.nextInt(h/2)*2;
		return random;
	}

	// method that prints random even between range
	public int nextEven(int l, int h) {
		int random = rand.nextInt((h-l)/2)*2 + l;
		return random;
	}

	// method that prints random odd with max
	public int nextOdd(int h) {
		int random = rand.nextInt((h - 1) / 2) * 2 + 1;
		return random;
	}

	// method that prints random odd between range
	public int nextOdd(int l, int h) {
		int random = rand.nextInt(((h - l) - 1) / 2) * 2 + l + 1;
		return random;
	}

	// method that prints random character (A-Z only)
	public char nextChar(){
		int n = rand.nextInt(26) + 65;
		return (char)n;
	}

	// method that prints random character between specified range (A-Z only)
	public char nextChar(char l, char h) {
		int n;
		if(l > h) {		// in case the first char comes after the second
			n = rand.nextInt(l - h) + h ;		// finds difference between char's ascii and then adds to lower character
		} else {
			n = rand.nextInt(h - l) + l ;
		}
		return (char)n;
	}

}
