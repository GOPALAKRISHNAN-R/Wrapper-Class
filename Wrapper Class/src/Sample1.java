/**
 * Simple Java program for Wrapped Class
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class Sample1 
{
	public static void main(String[] args) 
	{
		Integer a=new Integer(10);
		Integer b=11;
		Integer c=new Integer("12");
		
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		
		Integer d=Integer.valueOf("12");
		Integer e=Integer.valueOf(133);
		
		System.out.println(d);
		System.out.println(e);
		
		
		

	}

}
