package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="TestLeaf";
		 char[] charArray=name.toCharArray();
		 int count=0;
		 for(int i=0;i<charArray.length;i++) {
		
				
				if(charArray[i] == 'e')
				{
					
					count++;
					
				}
	}
System.out.println("No of e : " + count );
}
}
