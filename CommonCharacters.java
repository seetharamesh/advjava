package advjava;
import java.util. *;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCharacters {
	
public static List<String> commonChars(String[] words) {
		List<String> result = new ArrayList<>();
		Map<String,Integer> prevMap = new HashMap<>();

		for(int j = 0; j < words.length; j++) {
		Map<String,Integer> commonMap = new HashMap<>();
				
		char[] c1 = words[j].toCharArray();
		int len = c1.length;
		int value = 1, value_1 = 1,preval = 1;
		HashMap<String,Integer> map1 = new HashMap<>();
		List<Integer> list11 = new ArrayList<>();
		for(int i = 0 ; i <len; i++) {
			if(!map1.containsKey(Character.toString(c1[i]))) {
				map1.put(Character.toString(c1[i]), value);		
			}
			else {
				int temp = map1.get(Character.toString(c1[i]));
				map1.put(Character.toString(c1[i]), ++temp);	
			}
		}//end of for i
		if(j == 0) {
			prevMap.putAll(map1);
			continue;
		}
		for(String key: prevMap.keySet()) {
			if(map1.containsKey(key)) {
				System.out.println("key is same");
				if(prevMap.get(key).compareTo(map1.get(key)) >= 0) {
					int val = map1.get(key);
					System.out.println(val);
					commonMap.put(key, val);
				}
				else {
					int val = prevMap.get(key);
					commonMap.put(key, val);
				}
			}
		}//end of for
		prevMap.clear();
		prevMap.putAll(commonMap);
		System.out.println(prevMap);
		}//end of for j
		System.out.println(prevMap);

		//loop hashmap and store the values in list
		for(Map.Entry<String, Integer> res : prevMap.entrySet()) {
			int v = res.getValue();
			String s = res.getKey();
			for(int k = 0; k < v; k++) {
				result.add(s);
			}
		}
		System.out.println(result);
		return result;
}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cool","lock","cook"}; //{"bella","label","roller"} ;
		List<String> result = new ArrayList<>();
		result = commonChars(words);
		System.out.println(result);
	}

}





/*List<Character> result = new ArrayList<>();
		HashMap<Character, List<Integer>> map = new HashMap<>();
		List<Integer> value = new ArrayList<>();;
	
		int count = 1;
		char[] c1 = words[0].toCharArray();
		for(char c: c1) {
			if(map.containsKey(c)) {
				
				value.add(++count);
				map.put(c,  value);
			}
			else {
				count = 1;
				value.clear();
				value.add(count);
				map.put(c, value);
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
				
			
			//System.out.println(result);
			//System.out.println(res);
			//Union of keys from both maps
//			HashSet<Character> unionKeys = new HashSet<>(map.keySet());
//			unionKeys.addAll(map2.keySet());
//			 
//			unionKeys.removeAll(map2.keySet());
//			 
//			System.out.println(unionKeys);
		//	Stream combined = Stream.concat(map.entrySet().stream(), map2.entrySet().stream());
			
						
		//	Map<Object,Object> res = areEqualKeyValues(map, map2);
//			System.out.println(res);
//			
//			for(Map.Entry m: res.entrySet()) {
//				if(m.getValue().equals(true)) {
//					result.add((Character) m.getKey());
//					
//				}
//			}
			
		}
		
		
        return result;
        
    }
	public static Map<Object, Object> areEqualKeyValues(Map<Character, Integer> first, Map<Character,Integer> second) {
    return(first.entrySet().stream()
      .collect(Collectors.toMap(e -> e.getKey(), 
        e -> e.getValue().equals(second.get(e.getKey())))));*/