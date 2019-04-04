import java.util.Scanner;
public class Advisortask {
    
  String student_name;
   String student_email;
   String student_id;
   String advisor_name;
   String course_code1;
   String course_code2;
   String course_code3;
   String course_code4;
   String sec;
   String semester;
   double course_code1_result;
    double course_code2_result;
    double course_code3_result;
    double course_code4_result;

    public Advisortask(String student_id, String semester) {
        this.student_id = student_id;
        this.semester = semester;
    }
    
    
    
    
    

    public Advisortask(String student_id, String semester, String sec, double course_code1_result, double course_code2_result, double course_code3_result, double course_code4_result) {
        this.student_id = student_id;
        this.sec = semester;
        this.semester = sec;
        this.course_code1_result = course_code1_result;
        this.course_code2_result = course_code2_result;
        this.course_code3_result = course_code3_result;
        this.course_code4_result = course_code4_result;
    }
    
    
    
    
    

     Advisortask(String student_name, String student_email, String student_id, String advisor_name) {
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_id = student_id;
        this.advisor_name = advisor_name;
    }

   Advisortask(String student_name, String student_email, String student_id, String advisor_name,String course_code1, String course_code2, String course_code3, String course_code4, String sec ) 
    {
        this.student_name = student_name;
        this.student_email = student_email;
        this.student_id = student_id;
        this.advisor_name = advisor_name;
        this.course_code1 = course_code1;
        this.course_code2 = course_code2;
        this.course_code3 = course_code3;
        this.course_code4 = course_code4;
        this.sec = sec;
    }

    public Advisortask(String student_id,String semester,String sec, String course_code1, String course_code2, String course_code3, String course_code4) {
        this.student_id = student_id;
        this.semester=semester;
        this.sec = sec;
        this.course_code1 = course_code1;
        this.course_code2 = course_code2;
        this.course_code3 = course_code3;
        this.course_code4 = course_code4;
        
        
    }

   String add()
   {
       
     
        return(""+student_name+"\n"+","+student_email+"\n"+","+student_id+"\n"+","+advisor_name+"");
        
   }
   
    String advising() 
   {
    
       return(""+student_id+"\n"+",,"+semester+"\n"+","+sec+""+course_code1+"\n"+","+course_code2+"\n"+","+course_code3+","+course_code4+"\n"+"");
       
       
  }
   
  }
   
   
   
    

class reggstudent extends Advisortask 
   {

     reggstudent(String student_name, String student_email, String student_id, String advisor_name, String course_code1, String course_code2, String course_code3, String course_code4, String sec) {
        super(student_name, student_email, student_id, advisor_name, course_code1, course_code2, course_code3, course_code4, sec);
    }

    reggstudent(String student_name, String student_email, String student_id, String advisor_name) {
        super(student_name, student_email,student_id, advisor_name);
    }

    String add ()
    {
      return ("add info");
        
    }
    
    
    
 }


    
       
       
  class advising extends Advisortask
           
  {

    public advising(String student_id, String semester) {
        super(student_id, semester);
    }
   
 advising(String student_id,String semester,String sec, String course_code1, String course_code2, String course_code3, String course_code4) {
        super( student_id, semester, sec,course_code1,course_code2, course_code3, course_code4);
    }

    public advising(String student_id, String sec, String semester, double course_code1_result, double course_code2_result, double course_code3_result, double course_code4_result) {
        super(student_id, sec, semester, course_code1_result, course_code2_result, course_code3_result, course_code4_result);
    }
  
  String advising() 
   {
        return ("adcvising info");
       
   }
    
    String result() 
   {
       double cgpa;
       cgpa=((course_code1_result+ course_code2_result+ course_code3_result+course_code4_result)/4);
       return ("cgpa"+cgpa);
   }
    
    String add()
    {
      return(""+student_id+"\n"+","+semester+"");  
    }
    
    }
  
    
    

