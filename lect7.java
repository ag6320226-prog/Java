// public class lect7{
//     class Car{
        
//         Car(String str){
//             System.out.println(str);
//         }
//     }
// }
    

// class Main{
//     public static void main(String[] args) {
//         Car obj=new Car("hello");
//         Car obj1=new Car("Java");
//         // System.out.println("Car");




        
//     }

// }

// // class Car{
// //     int a;

//create a bankaccount with field ac.no. balance,deposit withdral

// public class lect7 {


//     class bankaccount{
//         String ac_no;
//         double balance;
//         bankaccount(String ac_noString,double balance){
//             this.ac_no=ac_noString;
//             this.balance=balance;

//         }
//         void deposite(double amount){
//             balance=+amount;

//         }
//         void withdral(double amount){
//             balance=-amount;
//         }
      

//     }
// }

// class Student{
//     String name;
//     int rollNumbe;
//     double marks;
//     void display(){
//         System.out.println("Name");
//     }
// }
// }
// class Main{
//      public static void main(String[] args){
// //  public static void main(String[] args){
//         Student s1=new Student();
//         s1.name="ram";
//         s1.roll=1;
//          s1.marks=90;
//          s1.display();
//          Student s2=new Student();
//          s2.name="ashu";
//          s2.roll=2;
//          s2.marks=80;
//          s2.display();

//         Student s3=new Student();
//          s3.name="syam";
//       s3.roll=3;
//          s3.marks=70;
//          s3.display();
//      }
// class Student{
//      String name;
//      int roll;
//      int marks;
//     void display(){
//         System.out.println();

//    }
    
//  }
//  }
// class Parent {
//     int x = 10;
//     Parent() {
//         System.out.println("Parent constructor: x = " + x);
//     }
// }

// class Main{
// class Child extends Parent {
//     int x = 20;

//     Child() {
//         // this.x refers to Child's x
//         System.out.println("Child this.x = " + this.x);
//         // super.x refers to Parent's x
//         System.out.println("Child super.x = " + super.x);
//     }

//     void show() {
//         int x = 30;
//         System.out.println("local x = " + x);       // local variable
//         System.out.println("this.x = " + this.x);   // child's field
//         System.out.println("super.x = " + super.x); // parent's field
//     }

//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="om";
//         s1.rollNumber=155;
//         s1.marks=96.0;
//         Student s2=new Student();
//        s2.name="ram";
//        s2.rollNumber=101;
//        s2.marks=96.0;
//        s1.display();
//        s2.display();
//         Child c = new Child(); // calls Parent then Child constructor
//         c.show();
//     }
// }
// // }

// // //   class Hello{

// // //     public Hello() {
// // //         this(5);
// // //         System.out.println("hiii");
// // //     }
// // //     public Hello(int a) {
// // //         this(5,6);
// // //         System.out.println(a);
// // //     }
// // //     public Hello(int a, int b) {
// // //         System.out.println(a);
// // //     }
    
// // //   }

// // // class Main{
// // //     public static void main(String[] args) {
// //         Hello obj =new Hello();
  



// //     }
// // }
// // //     }
// // }


// // class Animal{
// //     void eat(){
// //         System.out.println("pizza");
// //     }
// // }
// // class Dog extends Animal{
//     void bark(){
//         System.out.println("hehe");

//     }
// }
// class cat  extends  Animal{

// }

// class Main{
//     public static void main(String[] args) {
//         Dog s1=new Dog();
//         s1.bark();
//         s1.eat();
        
//     }
// }



