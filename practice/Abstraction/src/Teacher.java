package oops;

// public class Teacher extends Person{
//
//
////    int fee(){
////        return 20;
////    }
//
//}

public class Teacher extends Person{

    private double salary;
    public Teacher(String name,String address, double salary){
        super(name,address);
        setSalary(salary);
    }


    public void setSalary(double newSalary){
        salary=newSalary;
    }
    public double getSalary(){
        return salary;
    }
    public void sendEmail(){
        System.out.println("Send salary slip to "+getName()+" with salary "+salary);
    }
    int fee(){
        return 20;
    }

}

