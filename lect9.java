// class Hello{
//     void sum(){
//         System.out.println("hello");
//     }
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
// }

// public class lect9 {
//     public static void main(String[] args) {

//     Hello obj=new Hello();
//     obj.sum(5,3);
// }
// }

// Create a class with multiple sum methods where one takes two integers, another takes three integers, and another takes two double values. All methods should print the sum of the arguments passed.

// class Addition{
//     void sum(int a,int b){
//         System.out.println(a+b);

//     }
//     void sum(int a,int b,int c){
//         System.out.println(a+b+c);
//     }
//     void sum(double a,double b){
//         System.out.println(a+b);

//     }

// }
// public class lect9{
//     public static void main(String[] args) {
//         Addition obj=new Addition();
//         obj.sum(4,5);
//         obj.sum(4,6,7);
//         obj.sum(6.4,4.5);

//     }
// }
// // Matrix Print (2D array ko print karo
// public class lect9 {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {6,7,9}
//         };

//         System.out.println("2D Array Elements:");

//         for (int i = 0; i < 2 i++) {          
//             for (int j = 0; j <2 j++) {   
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println(); 
//         }
//     }
// }

// class hello
// {
//     int Sum(int arr[][])
//     {
//         int data=0;
//         for (int i=0;i<2;i++)
//         for(int j=0;j<2;j++)
//     {
//         data=arr[i][j];
//     }
//     }
//     return data;
// }

// public static void main(String[]args)
// {
//     int arr[][]={{1,2},{3,4}};
//     hello s1=new hello();
//     int val=s1.Sum(arr);
//     System.out.println(val);
    
// }





// 2. Sum of All Elements (Poore matrix ka sum nikaalo)
//  public class lect9 {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {6,7,9}
//         };
//         System.out.println("2D array elements:");

 
//     }
// }


// int sum = 0;

//  for(int i = 0; i <2;i++) {
//     for (int j = 0; j < 2; j++) {
//         sum += arr[i][j];
//         System.out.print(arr[i][j] + " ");
//     }
//  }
