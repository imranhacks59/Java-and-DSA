package oops;

public class main {

    //    Link- polymorphism https://www.javatpoint.com/runtime-polymorphism-in-java
    public static void main(String[] args) {

//      Teacher p1=new Teacher();
//        p1.name="imran";
//        System.out.println(p1.name);

//        doctor d1 = new doctor(1000);
//        System.out.println(d1.fee);
//        System.out.println(d1.name="imran khan");

//        Person p1= new Teacher(); //upcasting --here refrence variable of parent class refer to child object
//        System.out.println("Fee of Teacher is "+ p1.fee());

//      ** Abstraction--
        Person p1=new Teacher("Imran","patna",400.00);
        p1.sendEmail();

        Teacher t1=new Teacher("Rahul","Delhi",700.00);
        t1.sendEmail();
    }
}
