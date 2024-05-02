package package1;
//Assignmen1--------
//example:((((10+2)+2)-2)*2)/2) 
public class Arithmetics {
	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("sumresult is"+" "+c);
		
		return c;
	}
	public int sum2(int d, int e) {
		int f;
		f=d+e;
		System.out.println("sumresult2 is"+" "+f);
		return f;
	}
	public int sub(int g, int h) {
		int j;
		j=g-h;
		System.out.println("subresult is"+" "+j);
		return j;
	}
	public int multi(int k, int l) {
		int m;
		m=k*l;
		System.out.println("multiresult is"+" "+m);
		return m;
	}
	public int div(int n, int o) {
		int p;
		p=n/o;
		System.out.println("divresult is"+" "+p);
		return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Arithmetics ob=new Arithmetics();
		int sumresult=ob.sum(10,2);
		int sumresult2=ob.sum(sumresult,2);
		int subresult=ob.sub(sumresult2,2);
		int multiresult=ob.multi(subresult,2);
		int divresult=ob.div(multiresult,2);

	}

}
