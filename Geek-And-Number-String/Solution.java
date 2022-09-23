class Solution { 
    public int minLength(String s, int n) { 
    	String str[] = {"12", "21", "34", "43", "56", "65", "78", "87", "09", "90"};
    	
    	while(s.contains(str[0]) || s.contains(str[1]) || s.contains(str[2]) || s.contains(str[3]) ||
    	s.contains(str[4]) || s.contains(str[5]) || s.contains(str[6]) || s.contains(str[7]) ||
    	s.contains(str[8]) || s.contains(str[9])){
    	    s = s.replaceAll(str[0],"");
    	    s = s.replaceAll(str[1],"");
    	    s = s.replaceAll(str[2],"");
    	    s = s.replaceAll(str[3],"");
    	    s = s.replaceAll(str[4],"");
    	    s = s.replaceAll(str[5],"");
    	    s = s.replaceAll(str[6],"");
    	    s = s.replaceAll(str[7],"");
    	    s = s.replaceAll(str[8],"");
    	    s = s.replaceAll(str[9],"");
    	}
        return s.length();
    }
}