
public class Patterns {
	
	public static void main(String[] args) {
	//	practisingPatterns();
	//	sqaureMult();
	charPattern();	
		
	}
	
	
	public static void practisingPatterns() {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1 || i==n) || (j==n || j==1)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}				
			}
			System.out.println();
		}
	}
	
	
	public static void sqaureMult() {
		int n=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==n || j==1 || j==n || (i+j==n+1) || i==j) {
					System.out.print("*  ");
				}else
					System.out.print("   ");
			}
			System.out.println();
		}		
	}
	
	public static void charPattern() {
		char ch = 'A';
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print("  ");
			}
			ch ='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
		}
	}
}
