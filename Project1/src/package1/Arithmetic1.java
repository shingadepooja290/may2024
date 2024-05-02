 package package1;
	//Assignmen2--------
 //((((10/2)-2)+2)-2)/2)
public class Arithmetic1 {
	public int div(int a, int b) 
	{
		int c;
		c=a/b;
		System.out.println("divresult is"+ " "+ c);
		return c;
	}
	public int sub(int d, int e) 
	{
		int f;
		f= d-e;
		System.out.println("subresult is"+" "+ f);
		return f;
	}
	public int sum(int g, int h)
	{
		int k;
		k=g-h;
		System.out.println("sumresult is"+" "+ k);
		return k;
	}
	public int sub2(int l, int m)
	{
		int n;
		n=l-m;
		System.out.println("sub2result is"+" "+ n);
		return n;
	}
	public int div2(int o, int p)
	{
		int q;
		q=o/p;
		System.out.println("div2result is"+" "+ q);
		return q;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic1 ob=new Arithmetic1();
		int divresult=ob.div(10,2);
		int subresult=ob.sub(divresult,2);
		int sumresult=ob.sum(subresult,2);
		int sub2result=ob.sub2(sumresult,2);
		int div2result=ob.div2(sub2result,2);
		
		

	}

}







