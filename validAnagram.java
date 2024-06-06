import java.util.*;
public class validAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		boolean bol = false;
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        s = String.valueOf(s1);
        t = String.valueOf(t1);
        if(s.equals(t)){
            bol = true;
        }
        System.out.println(bol);

	}

}
