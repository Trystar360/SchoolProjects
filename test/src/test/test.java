package test;

public class test {

	public static void main(String[] args) {
		char letter = 'e';
		int r = 0;
		switch (letter) {
		case 'a': r += 1;
		case 'b':
		case 'c': r += 2;
		case 'd': r += 3;
		}
		
		System.out.print(r);
	}

}
