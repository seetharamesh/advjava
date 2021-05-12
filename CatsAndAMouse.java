package advjava;
import static java.lang.Math.abs;
//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
public class CatsAndAMouse {
	static String catAndMouse(int x, int y, int z) {
		if(abs(x-z) > abs(y-z)) return "Cat B";
		else if(abs(y-z) > abs(x-z)) return "Cat A";
		else return "Mouse C";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = catAndMouse(1,3,2);
		System.out.println(result);
	}

}
