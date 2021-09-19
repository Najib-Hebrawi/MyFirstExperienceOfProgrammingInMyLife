package traning16;

public class Student  extends Person{

    int study_level;
    String specialization;
    double GPA;
    int bonus_salary;




    public Student (String n, double a,
                    String ad, String nat,int salary,
                    int lvl, String special ,
                    double gpa, int bonus_salary){

        super(n, a, ad, nat,salary);
        this.study_level=lvl;
        this.specialization=special;
        this.GPA=gpa;
        this.bonus_salary=bonus_salary;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGPA() {
        return GPA;
    }
    public void setBonus_salary(int bonus_salary){
        this.bonus_salary=bonus_salary;
    }
    public int getBonus_salary(){
        return bonus_salary;
    }

    @Override
    public int getSalary(){
        return salary+bonus_salary;


    }

}
