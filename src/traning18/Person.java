package traning18;

import traning7.A;

public class Person {


    private String Name, Job, Adresse ;
    private int Age;




    public Person(String name, String job , String adresse , int age){

        Name=name;
        Job=job;
        Adresse=adresse;
        Age=age;
    }

    public String getName(){
        return Name;
    }
    public String getJob(){
        return Job;
    }

    public String getAdresse(){
        return Adresse;
    }

    public int getAge (){
        return Age;
    }

    public void setName(String name){

    }
    public void setJob(String job){

    }

    public void setAdresse(String adresse){

    }
    public void setAge(int age){

    }

    public String toString(){
        return Name+Age;
    }





}
