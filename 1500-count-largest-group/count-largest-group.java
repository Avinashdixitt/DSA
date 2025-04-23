class Solution {

    public int countLargestGroup(int n) {
        int maxValue=0;
        Map <Integer ,Integer> hashmap=new HashMap<Integer,Integer>();
        for (int i=1;i<=n;i++){
            int key=0,i0=i;
            while(i0!=0){
                key+=i0%10;
                i0=i0/10;
            }
            hashmap.put(key,hashmap.getOrDefault(key,0)+1);
            maxValue=Math.max(maxValue,hashmap.get(key));
        }
        int count=0;
        for(Map.Entry<Integer,Integer>kv:hashmap.entrySet()){
            if (kv.getValue()==maxValue){
                ++count;
            }
        }
        return count;
    }
}