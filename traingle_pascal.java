public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0 ; i < numRows; i++){
            temp.clear();
            temp.add(1);
            if(result.size() >= 2){
                for(int j = 0; j < i-1; j++){
                    temp.add(result.get(result.size()-1).get(j)+result.get(result.size()-1).get(j+1));
                }
            }
            if(i >= 1){
                temp.add(1);
            }
            result.add(new ArrayList<Integer>(temp));
        }
        return result;
    }
}