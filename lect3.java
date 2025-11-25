import java.util.Arrays;

class lect3 {



//     public static void main(String[] args){
//         String str="hello";
//         String str1="hlloe";
//         char ch[]=str.toCharArray();
//         char ch1[]=str1.toCharArray();
//         Arrays.sort(ch);
//         Arrays.sort(ch1);
//         String val1=new String(ch);
//         String val2=new String(ch1);
//         if(val1.equals(val2)){
//             System.out.println(true);

//         }else{
//             System.out.println(false);
//         }
//     }
// }






//         String str="hello is powerfull";
//         String a[]=str.split(" ");
//         String largest=" ";
        
//         for(String val:a){
//             if(val.length()>largest.length()){
//                 largest=val;
//             }
//         }
//         System.out.println(largest);
//     }
// }
// String str="aabc";
// int freq[]=new int[256];
// for(char ch:str.toCharArray()){
//     freq[ch]++;
// }
// for(int i=0;i<256;i++){
//     if(freq[i]>0){
//         System.out.println((char)i+"->"+freq[i]);

//     }
// }
//     }
// }
//         int v=0;
//         for(char ch:str.toCharArray()){
//             if("aeiou".indexOf(ch)!=-1){
//                 v++;
            
//             }
//         }
//         System.out.println(v);
//     }
    
// }

// ['h','e','l','l','o'];

// public static void main(String[] args){
//     StringBuilder str=new StringBuilder("hello");
//     str.insert(2,"byee");
//     System.out.println(str);
// }
// }
// public static void main(String[] args){
//  sb.repalce(1,4,"JAVA");
// System.out.println("replace():"+sb);
// }
// }
// public static void main(String[] args) {
  
//  StringBuilder str=new StringBuilder("hello");
// str.delete(2,5);
//     System.out.println(str);
// }
// }
// StringBuilder str=new StringBuilder("i love java");
// str.reverse();
//     System.out.println(str);
// }
// }
// public static void main(String[] args) {
// String str="i love Java";
// String a[]=str.split(" ");
// StringBuilder result=new StringBuilder();

// for(String ele:a){
//     StringBuilder val=new StringBuilder(ele);
//     result.append(val.reverse().append(" "));
// }
// System.out.println(result);
// }
// }

//aabbcab
 public static void main(String[] args){
    String str="aabbcab";
    StringBuilder result=new StringBuilder();
    int count=1;
     for(int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;

        }else{
            result.append (str.charAt(i-1)).append(count);
            count=1;
        }
     }
     result.append (str.charAt(str.length()-1)).append(count);
     System.out.println(result);
    }
}