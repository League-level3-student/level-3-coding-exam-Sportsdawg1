import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int commonPairs = 0;
		Collection<String> values = hashmap1.values();
		String[] names = new String[0];
		Set<String> map1Set = hashmap1.keySet();
		String[] names1 = map1Set.toArray(new String[0]);
		for (int i = 0; i < hashmap1.size(); i++) {
			if(hashmap2.containsKey(names1[i])) {
				if(hashmap2.get(names1[i]).contentEquals(hashmap1.get(names1[i]))) {
					commonPairs++;
				}
			}
		}
		return commonPairs;
	}
}
