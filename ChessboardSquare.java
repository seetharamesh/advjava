package advjava;
//https://leetcode.com/problems/determine-color-of-a-chessboard-square/submissions/
public class ChessboardSquare {
	
public static boolean squareIsWhite(String coordinates) {
	char[] c = coordinates.toCharArray();
	if((c[0] == 'a' || c[0] == 'c' || c[0] == 'e' || c[0] == 'g') &&
	(c[1] == '1' || c[1] == '3' || c[1] == '5' || c[1] == '7' ) )
		return false; 
	if((c[0] == 'b' || c[0] == 'd' || c[0] == 'f' || c[0] == 'h') &&
			(c[1] == '2' || c[1] == '4' || c[1] == '6' || c[1] == '8' ) )
	   return false;  
	return true;
    }

	public static void main(String[] args) {
		String coordinates = "c7";
		boolean result = squareIsWhite(coordinates);
		System.out.println(result);
		
	}

}
