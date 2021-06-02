package advjava;
import java.util. *;
import java.util.stream.Collectors;

public class CommonCharacters {
	
public static List<String> commonChars(String[] words) {
		List<String> result = new ArrayList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		int value = 1;
		char[] c1 = words[0].toCharArray();
		for(int i = 0 ; i < c1.length; i++) {
			if(map.containsKey(c1[i]))
				map.put(c1[i], ++value);
			else {
				value = 1;
				map.put(c1[i], value);
			}
			
		}
		
      //check same map key value in other words
		int value2=1;
		for(int i = 1; i < words.length; i++) {
			HashMap<Character, Integer> map2 = new HashMap<>();
			char[] c2 = words[i].toCharArray();
			for(int j = 0; j < c2.length; j++) {
				if(map2.containsKey(c2[j]))
					map2.put(c2[j], ++value2);
				else {
					value2 = 1;
					map2.put(c2[j], value2);
				}
			}//end of for
			//check if key and values match with the base hashmap map
			Map<String,Boolean> res = new HashMap<>();
			map.entrySet().stream()
		      .collect(Collectors.toMap(e -> e.getKey(), 
		        e -> e.getValue().equals(map2.get(e.getKey()))));	
			
		}
		
       
        return result;
        
    }
	public static void areEqualKeyValues(Map<Character, Integer> first, Map<Character,Integer> second) {
    System.out.println(first.entrySet().stream()
      .collect(Collectors.toMap(e -> e.getKey(), 
        e -> e.getValue().equals(second.get(e.getKey())))));
}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"bella","label","roller"} ;
		List<String> result = new ArrayList<>();
		result = commonChars(words);
		System.out.println(result);
	}

}
