package traning2;

public class Student {


    private String sNr;
    private String navn;

    // klasse variabel
    private static final String universitet = "DTU";

    public Student(String sNr, String navn) {
        this.sNr = sNr;
        this.navn = navn;
    }

    public String toString() {
        return "Student [sNr=" + sNr + ", navn="
                + navn + ", universitet=" + universitet + "]";
    }
}



