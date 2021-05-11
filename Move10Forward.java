package advjava;

public class Move10Forward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String name = "testcase";
		
		//convert string to char array
		char[] temp = name.toCharArray();
		
		//replace each letter with 10 forward letters
		String newstr=" ";
		for(int i = 0; i < temp.length; i++) {
			char elem = temp[i];
			for(int j = 0; j < alphabets.length; j++) {
				if(elem == alphabets[j]) {
					int index = j;
					int addvalue = index + 10;
					char newchar = alphabets[addvalue];
					 newstr = newstr + newchar;	
					 break;
				}
			}
		}
		System.out.println(newstr);

	}

}
