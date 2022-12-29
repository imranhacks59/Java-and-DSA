package oops;

public abstract class Person {

        private String name;
        private String  address;

        public Person(String name,String address){
                this.name=name;
                this.address=address;
        }

//        public void setName(){
//                this.name=name;
//        }
        public String getName(){
                return name;
        }
        public void sendEmail(){
                System.out.println("Send salary slip to "+this.name+" with address "+this.address);
        }
        int fee(){
                return 0;
        }
}


