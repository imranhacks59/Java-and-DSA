import javax.lang.model.element.Name;

public abstract class Person {

    String Name;
    String address;
    private int Salary;

//    public Person(String s){
//        this.Name= Name;
//    }

   public void run(){

        System.out.println("running");
    }

    public void sendMail(String name,int salary){
        this.Name=name;
        this.Salary=salary;

        System.out.println("send salary slip of "+this.Name + " with salary "+this.Salary);
    }
    public void sendMail(String name,String address, int salary){
        this.Name=name;
        this.address=address;
        this.Salary=salary;
        System.out.println("send salary slip of "+this.Name + " with salary "+this.Salary + " on address of "+this.address);
    }

    public void teach(){
        System.out.println("teacher");
    }

//    public Person(String name,String address,int salary){
//        this.Name=name;
//        this.address=address;
//        this.Salary=salary;
//    }

    void setSalary(int num){
       this.Salary=num;
    }
    public int getSalary(){
       return Salary;
    }

}
