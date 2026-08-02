package Recurssion;

public class Pallindromic_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nitin";
		System.out.print(countPallindromic_substring(s));
	}

	public static int countPallindromic_substring(String s) {
		// TODO Auto-generated method stub
		int count=0;
		// for odd
		for(int axis=0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				count++;
			}
		}//for even
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {
					break;
				}
				count++;
			}
		}
		return count;
	}

}
//One more methods to find the pallindromic substring is to use recurssion

// class Solution {
//     public int countSubstrings(String s) {
//         int n=s.length();
//         int ans=0;
//         for(int i=0;i<s.length();i++){
//             // odd
          
//             ans+=helper(s,i,i);
//             //even 
//            ans+=helper(s,i,i+1);

//         }
//         return ans;
//     }
//     public int helper(String s,int l,int r){
//         int count=0;
//         while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
//             l--;
//             r++;
//             count++;
//         }
//         return count;
//     }
// }

