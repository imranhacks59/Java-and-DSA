package oops;

public class main {

    static class Human{
         String name;
       private int height;
       Human(String name,int height){
           this.name = name;

       }
       Human(){

       }
       void set(int d){
           this.height = d;
       }
       int get(){
           return height;
       }
   }

   static class child extends Human{

   }
    public static void main(String[] args) {
//     Human h1 = new Human();
//     h1.name = "imarn";
//        System.out.println(h1.height);
        child h1 = new child();

//        System.out.println(h1.name);
        h1.set(40);
     System.out.println(h1.get());

    }
}
