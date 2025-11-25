

class lect5{
    public static void main(String[] args) {
        String str="aabbcc"; // a2b2c1
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
// class Main{
//     public static void main(String[] args) {
//         String str="aabbcc"; // a2b2c1
//         StringBuilder result=new StringBuilder();
//         int count=1;
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==str.charAt(i-1)){
//                 count++;
//             }else{
//                 result.append(str.charAt(i-1)).append(count);
//                 count=1;
//             }
//         }
//         result.append(str.charAt(str.length()-1)).append(count);
//         System.out.println(result);



// public static void main(String[] args) {
//     //     }

    //     System.out.println(result);
    }
    // }

}

