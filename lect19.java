// //multithreading
// class MyThread extends Thread{
//     public void start(){
//         // System.out.println("main");
//         // System.out.println(Thread.currentThread().getName());
//         for(int i=0;i<5;i++){
//             System.out.println("downloading file............."+(i*30)+"%");
//             try{
//                 Thread.sleep(1000);
//             }catch(Exception e){

//             }
//         }
//     }
// }
//             System.out.println(i+"mt");
//             try{
//                 Thread.sleep(2000);
//             } catch(Exception e){


//             }

//         }
//     }
// }

// public class lect19 {
//     public static void main(String[] args) {
//         System.out.println(Thread.currentThread().getName());
//         MyThread mt=new MyThread();
//         mt.start();
        // try{
        //     mt.join();

        // }catch(Exception e){

        // }
    //     for(int i=0;i<5;i++){
    //         System.out.println(i+"hello");
    //     }
    


    
// }
//    public class lect19 {
   
//     public static void main(String[] args) {
//         System.out.println(Thread.currentThread().getName());
//         MyThread mt=new MyThread();
//         mt.start();

        
//     }
//    }

// class bank{
//     int balance= 100;
//     void withdraw(int amt){
//         System.out.println(Thread.currentThread().getName()+"check balance");
//         if(balance>=amt){
//             System.out.println(Thread.currentThread().getName()+"proceed withdraw");
//             balance=balance-amt;
//             System.out.println(Thread.currentThread().getName()+"withdraw successful");

            
//         }else{
//             System.out.println(Thread.currentThread().getName()+"insufficient balance");

//         }

//     }
//        public class lect19 {
   
//    public static void main(String[] args) {
//         synchronized (bank.class) {
//    }
//         System.out.println(Thread.currentThread().getName());
// bank b=new bank();
// Thread t1=new Thread(){
//     public void run(){
//         b.withdraw(80);

        
//     }
//    };      Thread t2=new Thread(){
//         public void run(){
//             b.withdraw(80);
    
            
//         }
//        };
//        t1.start();
//        t2.start();
// }
//        }
//     }