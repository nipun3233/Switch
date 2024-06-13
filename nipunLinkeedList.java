
public class nipunLinkeedList {
	
	class trh{
		int data;
		trh agla;
	
	
	public trh(int data) {
		this.data = data;
		this.agla = null;
	}
	}
	trh rav;
	
	public nipunLinkeedList() {
		this.rav = null;
	}
	
	
	public void addtrh(int data) {
		trh pius = new trh(data);
		if(rav == null) {
			rav = pius;
		}else {
			trh current = rav;
			while(current.agla != null) {
				current = current.agla;
			}
			current.agla = pius;
		}
	}
	
	
	public void bataobaat() {
		trh current = rav;
		while(current != null) {
			System.out.println("baat" + current.data);
			current = current.agla;
		}
		System.out.println("controversy");
	}
	
	
	public static void main(String[] args) {
		nipunLinkeedList merabaat = new nipunLinkeedList();
		  int[] gossip = {1, 2, 3, 4, 5, 6, 7};
		for(int value : gossip) {
			merabaat.addtrh(value);
		}
		merabaat.bataobaat();

	}

}
