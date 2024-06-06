
public class palindromeValid {

	public static void main(String[] args) {
		String s = "0P";
	
		char arr[] = s.toCharArray();
		int i = 0 ;
		char arr2[] = new char[arr.length];
		int j = 0 ;
		int count = 0 ; 
		while (i<arr.length) {
			if((arr[i]>=65 && arr[i]<=90) || (arr[i]>=97 && arr[i]<=122) || (arr[i]>=48 && arr[i]<=57)){
				arr2[j]=arr[i];
				count++;
				i++;
				j++;
			}
			else {
			i++;
			}
		}
	
		for(int k = 0 ; k<arr2.length;k++) {
			System.out.println(arr2[k] );
		}
		
		
		i=0;
		j=count-1;
		while(i<=j) {
			System.out.println(arr2[i] + "-->  " + i + " "  + arr2[j] + "--> " + j  );
			if(Character.toLowerCase(arr2[i])==Character.toLowerCase(arr2[j])) {
			System.out.println(arr2[i] + " " + arr2[j]);
			i++;
			j--;
			}
			else {
				System.out.println("break");
				break;
			}
			
		}
		
		
		
	}

}





//s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)