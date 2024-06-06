
public class stockBuySell {

	public static void main(String[] args) {
		int[] stock = {2,4,1};
		int l = 0;
		int h = 0;
		int min = stock[0];
		int max = 0;
		int profit = 0;
		int a = 0;
		for (int  i = 0 ; i<stock.length;i++) {
			if(stock[i]<min) {
				min = stock[i];
				l = i;
				h=i;
				max=0;
				System.out.println(min);
			}
			if(stock[i]>max) {
				max= stock[i];
				h=i;
				System.out.println(max);
			}
			a=stock[h]-stock[l];
			if(a>profit) {
				profit=a;
			}
			
		}
		if(l==h) {
			System.out.println("notpossible");
		}
		System.out.println(profit);
	}

}
