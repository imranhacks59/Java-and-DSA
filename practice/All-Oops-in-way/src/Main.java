public class Main {
    public static void main(String[] args) {


// Inheritence
      /*
       Teacher t1=new Teacher();
        t1.Name="imran khan";
        System.out.println(t1.Name);
        t1.run();

        Doctor D1=new Doctor();
//        D1.salary=5000;
        System.out.print(D1.salary=1000);
        System.out.println(D1.Name="Rahul");
      */
//polymorphism

     //compile time polymorphism-define during compile time
//        Person p1=new Person();
//        p1.sendMail("imran","delhi",2000);
//        Person p2 = new Person();
//        p2.sendMail("Rahul",4000);
//
//        System.out.println();

        //Run time polymorphism--its ovveridden during run time
//         Person p3=new Teacher();
//         p3.teach();

//         Teacher t1=new Person();
//         t1.teach(); // downcasting not possible in java

// Encapsulation-- Hides data and methods in single purpose,
        //used to more securety purpose
        //and abstraction is its implementatiom
//        Person p1=new Person();
//        p1.setSalary(3000);
//        System.out.println("Salary of Rahul is "+p1.getSalary());

//Abstraction  -- it show only funtionality and hides internal class, it is a implementation of encapsulation
        //ex-- in above teach,
        //Abstract class-- if we want create abstract give abstract name to before class
        //in abstract we cant intantiate these class
        //to access this we will have to create another class and extends abstract class

        Person p1=new Teacher();
        p1.teach();
    }
}