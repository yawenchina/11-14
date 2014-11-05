public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        if(rowIndex == 0){
            return temp;
        }
        ArrayList<Integer> cur = new ArrayList<Integer>();
        for(int i = 0 ; i <= rowIndex; i++){
            cur.clear();
            cur.add(1);
            if(temp.size() >= 2){
                for(int j = 0; j < temp.size()-1; j++){
                    cur.add(temp.get(j) + temp.get(j+1));
                }
            }
            if(i >= 1)
            cur.add(1);
            temp = new ArrayList<Integer>(cur);
        }
        return temp ;
    }
}