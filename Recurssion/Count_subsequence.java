package Recurssion;

public class Count_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ques="abc";
		//printsubsequence(ques,"");
		//System.out.print(count);
		System.out.print("\n"+printsubsequence(ques,""));
	}
	//static int count=0;
	public static int printsubsequence(String s,String ans) {
		if(s.length()==0) { 
			//count++;
			System.out.print(ans+" ");
			return 1;
		}
		char ch=s.charAt(0);
		int a1=printsubsequence(s.substring(1),ans);
		int a2=printsubsequence(s.substring(1),ans+ch);
		return a1+a2;
	}

}
