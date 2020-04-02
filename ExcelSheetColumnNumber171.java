package myPackge;

public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColumnNumber171 main = new ExcelSheetColumnNumber171();
		System.out.println(main.titleToNumber("ZY"));
	}

	public int titleToNumber(String s) {
		
		int output=0;
		int n = s.length();
		
		int[] arr = new int[27];
		
		for(int i=1;i<=26;i++) {
			arr[i] = i;
		}
		
		while(n>0) {
			int index = s.charAt(0) -64;
			output = output + (int)(arr[index]*Math.pow(26, n-1));
			
			s = s.substring(1, s.length());
			n = n-1;
		}
		
		return output;
	}

}
