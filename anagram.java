public class Solution {
   private int getHash(int[] count){
       int hash = 0;
        int a = 378551;
        int b = 63689;
        for (int num : count) {
            hash = hash * a + num;
            a = a * b;
        }
        return hash;
   }
    
    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> result = new ArrayList<String>();
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        for(String m : strs){
            int[] count = new int[26];
            for (int i = 0; i < m.length(); i++) {
                count[m.charAt(i) - 'a']++;
            }

            int hashcode = getHash(count);
            if(map.containsKey(hashcode)){
                ArrayList<String> temp = map.get(hashcode);
                temp.add(m);
                map.put(hashcode, temp);
            }else{
                ArrayList<String> array = new ArrayList<String>();
                array.add(m);
                map.put(hashcode, array);
            }
        }
        for(ArrayList<String> s : map.values()){
            if(s.size() > 1){
                result.addAll(s);
            }
        }
        return result;
    }
}
