class Solution {

       public static String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append(":").append(s);
        }
        return sb.toString();

    }

    public static List<String> decode(String str) {
        List<String> decodedStringList  = new ArrayList<>();

        int i  = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != ':'){
                j++;
            }
            //find the  length of the string until  the  delimiter
            int length = Integer.parseInt(str.substring(i,j));
            // Extract the string based on the length and add to the list
            decodedStringList.add(str.substring(j+1,  j+1+length));
            i =  j+1+length;
        }
        return decodedStringList;
    }
}
