package Star_pattern;

public class pattern5

{
		public static void main(String[] args) {
			
			//***
			// **
			//  *
			
			int space=0;
			int star=3;
			
			//			2<=3
			for(int i=1;i<=3;i++)
			{
				//			2<=1
				for(int j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				
				//			1<=2
				for(int j=1;j<=star;j++)
				{
					System.out.print("*");
				}
			System.out.println();
			space++;
			star--;
				
				
				
			}
			
			
			
			
		}
}
