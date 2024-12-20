import java.util.*; 

class Solution {
    public String solution(int[] numbers) {
        
        int count = numbers.length;
        String [] arr = new String[count];
        for(int i=0;i<count;i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        if(arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : arr){
            sb.append(s);
        }
            
        return sb.toString();
    }
}