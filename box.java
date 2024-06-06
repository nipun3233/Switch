
public class box {
	int length=1;
	int width=1;
	int height=1;
	int vol;
	
	int meth(int l,int b,int h){
		this.length = l;
		this.width = b;
		this.height = h;
		vol = length*width*height;
		return vol;
	}
	int meth(int a) {
		this.length = a;
		vol = length*length*length;
		return vol;
	}
	void meth() {
		System.out.println("no values provided ");
	}
}
