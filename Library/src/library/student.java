package library;

    import java.util.ArrayList;
    import java.util.Scanner;
public class student extends person
   {
   Scanner input=new Scanner(System.in);
   protected String facultyname;
   protected int stage;

   public student() 
   {
       facultyname="fci";
       stage=2;
   }

    public student(String facultyname, int stage, String name, int id, int age) {
       super(name, id, age);
       this.facultyname = facultyname;
       this.stage = stage;
    }
    
    //to add student record.
     public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
    public String getFacultyname() {
        return facultyname;
    }

    public int getStage() {
        return stage;
    } 
      
    
}

