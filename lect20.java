
// import java.util.*;
// // class myThread implements Runnable{
// //     public void run(){
// //         // System.out.println("main");
// //         for(int i=0;i<5;i++){
// //               System.out.println(i);
// //               try{
// //                 Thread.sleep(2000);
// //               }catch (Exception e){

// //               }
// //         }

// //     }



// // }
// public class lect20 {

// //     public static void main(String[] args) {
// //         myThread task=new myThread();
// //         Thread t1= new Thread(task);
// //         Thread t2=new Thread(task);
// //         t1.start();
// //         t2.start();
// //     }
// // }
// //transform


// public static void main(String[] args){
// ArrayList<Integer> list=new ArrayList();
// list.add(10);
// list.add(20);
// list.add(30);
// list.add(40);
// list.add(50);
// list.add(60);
// list.add(70);
// List<Integer>Res= list.stream().filter(n->n>60).toList();
// List<Integer> mapRes=list.stream().map(n->n*2).toList();
// // int data=list.stream().reduce(0,(a,b)->a+b);
// // System.out.println(data);
// // System.out.println(mapRes);
// System.out.println(Res);
// }

 
// }




//5 se badi odd value print
// public class lect20{
//     public static void main(String[] args) {
//         ArrayList<Integer>list=new ArrayList<>();
//         list.add(50);
//             list.add(60);
//                 list.add(67);
//                     list.add(52);
//                         list.add(54);
//                             list.add(57);
                            //   List<Integer> limit= list.stream().limit(2).toList();
                            //   System.out.println(limit);              
//  List<Integer> sort= list.stream().sorted((a,b)->a-b).toList();
//                                System.out.println(sort);  
            //                   List<Integer> skip= list.stream().skip(2).toList();
            //                   System.out.println(skip);
            // //   List<Integer> Res= list.stream().filter(n->n>50 && n%2!=0).toList();
            //   System.out.println(Res); 

            // List<Integer> dis=list.stream().distinct().toList();
            // System.out.println(dis);

        
//     }
// }


