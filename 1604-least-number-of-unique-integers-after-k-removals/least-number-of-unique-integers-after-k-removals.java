import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		Collections.sort(entryList,new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
		});
		

		Iterator<Map.Entry<Integer, Integer>> iterator = entryList.iterator();
		while (iterator.hasNext() && k >= 0) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			int val = entry.getValue();
			if (val <= k) {
				k -= val;
				iterator.remove();
			} else {
				break;
			}
		}

		return entryList.size();
    }
}