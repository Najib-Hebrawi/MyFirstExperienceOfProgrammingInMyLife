package traning16;

public class Person {

    String name, address, nationalatity;
    double age;
    int salary;






    public Person(String n, double a , String ad , String nat, int salary){
        this.name=n;
        this.address=ad;
        this.age=a;
        this.nationalatity=nat;
        this.salary=salary;


    }

    public void setName( String n ){
        this.name=n;
    }
    public String getName(){
        return name;
    }

    public void setAddress( String  ad){
        this.address=ad;
    }
    public String getAddress(){
        return address;
    }

    public void setNationalatity(String nat){
        this.nationalatity=nat;
    }

    public String getNationalatity(){
        return nationalatity;
    }
    public void setAge(double a ){
        this.age=a;
    }
    public double getAge(){
        return age;

    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }







}
