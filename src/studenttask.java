import java.util.Scanner;
public class studenttask extends Advisortask {
    
  private String student_id;
  private String semester;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
  
  
  

    public studenttask(String student_id, String semester, String sec, double course_code1_result, double course_code2_result, double course_code3_result, double course_code4_result) {
        super(student_id, semester, sec, course_code1_result, course_code2_result, course_code3_result, course_code4_result);
    }

    public studenttask(String student_id, String semester, String sec, String course_code1, String course_code2, String course_code3, String course_code4) {
        super(student_id, semester, sec, course_code1, course_code2, course_code3, course_code4);
    }
   

    public studenttask(String student_id, String semester) {
        super(student_id, semester);
    }
   
    String add()
    {
        return("added");
    }
    
    String advising()
    {
        return("advised");
    }
    String result()
    {
        return("result");
    }
    
    
    
    
    
    
    
    
}
