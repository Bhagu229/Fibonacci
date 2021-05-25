package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
				int n1=0, n2=1, n3, i,count=10;
				System.out.print(n1+" "+n2);//printing0 and 1
				for(i=2;i<count;++i)//loop started from 2
				{
					n3=n1+n2;
					System.out.print(" " +n3);
					n1=n2;
					n2=n3;
							
				}

			}


	}


