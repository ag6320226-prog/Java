//encapsulation  ATM balance ,deposit money,show balance
// class ATM{

//     private int TotalBalance=50000;


//     public void getTotalB(){


//         System.out.println(TotalBalance);

//     }
   

//     }

//  public void setBalance(int amount){
// // if(amount>0 && TotalBalance>=amount){
// //     TotalBalance=TotalBalance-amount;

//     System.out.println("collect case");
// }



//  }


    
//     public class lect12{
//         public static void main(String[] args) {
//             ATM a1 =new ATM();
//           a1.getTotalB();
       
    

//         }
//     }

//youtub channel subscriber count channelname

// class YoutubChannel{
//     private int subscriber=0;
//     public void subscriberCount(){
//         System.out.println(subscriber);


//     }


//     public void setsubscriberCount(int count){

//         if(count>0){
//             subscriber=count;
//             System.out.println("subscriber count:"+subscriber);

            

//         }
        

//     }



// }
// public class lect12{
//     public static void main(String[] args) {
//         YoutubChannel y1=new YoutubChannel();
//          y1.subscriberCount();
//         y1.setsubscriberCount(5000);
       
//     }
// }
//}
// instagram profile//encapsulation//bina password ke profile na khule
class instagramProfile{

    private String profilename;

    private String password;
    private int followers;
    private int following;

    public String getprofilename(){
        return profilename;

    }
    public void setprofilename(String name){
        profilename=name;
        System.out.println("Profile Name:" + getprofilename());
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String pass){
        password=pass;
        System.out.println("password set successfull");
    }
    public int getfollower(){
        return followers;
    }
    public void setfollowers(int count){
    followers=count;
    System.out.println("follwers :"+ getfollower());
    }
    public int getfollowing(){
        return following;
    }
    public void setfollowing(int count){
        following = count;
        System.out.println("following:"+ getfollowing());
    }
    public void login(String pass){
        if(pass.equals(password)){
            System.out.println("login successful!  welcome " + profilename);

        }else{
            System.out.println("login faild! incorrect password!");
        }
    }



}
public class lect12{
    public static void main(String[] args) {
        instagramProfile ip1=new instagramProfile();
    ip1.setprofilename("attitude babulal");
    ip1.setpassword("12345");
    ip1.setfollowers(15000);
    ip1.setfollowing(300);
    ip1.login("94855");
    ip1.login("12345");

    }
    

}




