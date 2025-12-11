  //first no.
// import java.util.ArrayList;
// import java.util.Collections;

// public class lect16 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(2);
//         list.add(7);
//         list.add(0);
//         list.add(4);
//         list.add(1);

//         Collections.sort(list);//[0, 1, 2, 4, 7] output
//         System.out.println(list);
//     }
    
// }
//second no.

// import java.util.ArrayList;
// import java.util.Collections;

// class student implements Comparable<student>{

//     String name;
  
//     int marks;
//    public student(String name,int marks){
//         this.name=name;
//         this.marks=marks;




//     }
//     public int compareTo(student s2){
//         return this.marks-s2.marks;



//     }
//     public String toString(){
//         return this.name+" "+this.marks;



//     }



    


    
// }
// public class lect16{
//     public static void main(String[] args) {
//         ArrayList<student> list=new ArrayList<>();

// list.add(new student("rahul",69 ));
// list.add(new student("ajay",94 ));
// list.add(new student("Ghansu", 90));


// Collections.sort(list);
// System.out.println(list.toString());
// }
// }


// class lect16{
//     static void fun(int a){
//         if(a>0){
//         fun(--a);
//         System.out.println(a);
//         fun(--a);
//     }
// }
//      public static void main(String[] args) {
//         fun(2);
//      }
//     }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class student{
//     String name;
//     int RollN;
//     public student(String name,int RollN){
//         this.name=name;
//         this.RollN=RollN;

//     }
//  }



//  class RollNSorted implements Comparator<student>{
//     public int compare(student s2,student s3){
//         return s2.name.compareTo(s3.name);


//     }
//  }
//  public class lect16{
//     public static void main(String[] args) {
//         ArrayList<student> list =new ArrayList<>();
//         list.add(new student("babulal", 89));
//         list.add(new student("babuarora", 90));
//          list.add(new student("balram", 48));
//         list.add(new student("babuji", 50));

//         Collections.sort(list,new RollNSorted ());
//         for(student s: list){
//             System.out.println(s.RollN+ " "+s.name);
//         }
//     }


//  }
//two sum problem
