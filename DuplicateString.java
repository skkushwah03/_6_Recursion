package _6_Recursion;

public class DuplicateString {
    public static void removeduplicate(String str ,int idx, StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
        }
         char currchar =str.charAt(idx);
         if(map[currchar-'a']==true){
            removeduplicate(str, idx+1, newstr, map);
         }
         else{

            map[currchar-'a']=true;
            removeduplicate(str, idx, newstr.append(currchar), map);
         }  
    }
    public static void main(String[] args) {
        String str="apnaCollege";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
        /*String s = "appnnacollege";
        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check if 'ch' is already in ns
            boolean found = false;
            for (int j = 0; j < ns.length(); j++) {
                if (ns.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            // if not found, add to ns
            if (!found) {
                ns += ch;
            }
        }

        System.out.println(ns); // Output: apncoleg
        */
    }
}
