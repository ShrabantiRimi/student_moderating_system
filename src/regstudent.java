import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class regstudent extends javax.swing.JFrame {

    public regstudent() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentname = new javax.swing.JLabel();
        av = new javax.swing.JLabel();
        fo = new javax.swing.JLabel();
        preadd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        studentmother = new javax.swing.JLabel();
        dateofbirth = new javax.swing.JLabel();
        sscgpa = new javax.swing.JLabel();
        hsc = new javax.swing.JLabel();
        hscgpa = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        se = new javax.swing.JLabel();
        gpn = new javax.swing.JLabel();
        fai = new javax.swing.JLabel();
        mo = new javax.swing.JLabel();
        mai = new javax.swing.JLabel();
        lc = new javax.swing.JLabel();
        stuname = new javax.swing.JTextField();
        stufather = new javax.swing.JTextField();
        stumother = new javax.swing.JTextField();
        gpassc = new javax.swing.JTextField();
        hscc = new javax.swing.JTextField();
        gpahsc = new javax.swing.JTextField();
        localg = new javax.swing.JTextField();
        dateofb = new javax.swing.JTextField();
        ssc = new javax.swing.JTextField();
        gpnt = new javax.swing.JTextField();
        ste = new javax.swing.JTextField();
        adn = new javax.swing.JTextField();
        validation = new javax.swing.JButton();
        studentid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        fao = new javax.swing.JTextField();
        faani = new javax.swing.JTextField();
        paddt = new javax.swing.JTextField();
        padd2 = new javax.swing.JPasswordField();
        mao = new javax.swing.JTextField();
        ids = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        padd = new javax.swing.JLabel();
        maai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                            REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        studentname.setText("Student Name");

        av.setText("Advisor name");

        fo.setText("Father occupation");

        preadd.setText("present Address");

        jLabel10.setText("S.S.C(School name)");

        studentmother.setText("Student Father Name");

        dateofbirth.setText("Date of Birth");

        sscgpa.setText("S.S.C(GPA)");

        hsc.setText("H.S.C(College name)");

        hscgpa.setText("H.S.C(GPA)");

        jLabel18.setText("Student Mother Name");

        se.setText("Student Email");

        gpn.setText("Guardien phone number");

        fai.setText("Father Annual Income");

        mo.setText("Mother occupation");

        mai.setText("Mother Annual Income");

        lc.setText("Local Guardien");

        ssc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sscActionPerformed(evt);
            }
        });

        validation.setText("Validation");
        validation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationActionPerformed(evt);
            }
        });

        studentid.setText("student id");

        jLabel3.setText("student password");

        exit.setText("submit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        padd.setText("permanent Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(validation, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(150, 150, 150)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(stuname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(stufather, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(stumother, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateofb, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ssc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gpassc, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(padd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(preadd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(faani, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fai, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adn)
                                        .addComponent(ste)
                                        .addComponent(maai)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(mao, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(paddt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(90, 90, 90)
                                            .addComponent(localg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hscgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(74, 74, 74)
                                            .addComponent(gpahsc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sscgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(studentmother, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(hscc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hsc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(153, 153, 153)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(gpn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gpnt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(padd2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mai, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentname)
                            .addComponent(stuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentmother)
                            .addComponent(stufather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stumother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preadd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateofbirth)
                            .addComponent(dateofb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ssc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gpassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sscgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(padd)
                            .addComponent(fao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(faani, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fo)
                            .addComponent(mao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hscc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hsc)
                    .addComponent(fai)
                    .addComponent(maai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hscgpa)
                    .addComponent(gpahsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mo)
                    .addComponent(ste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(se)
                            .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lc)
                            .addComponent(localg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mai, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paddt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validation)
                    .addComponent(exit))
                .addGap(305, 305, 305))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sscActionPerformed

    private void validationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationActionPerformed
    close();
        validation og=new validation ();
        og.setVisible(true);


                
    }//GEN-LAST:event_validationActionPerformed
public void close()
{
    this.setVisible(false);
    this.dispose();
}
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
     
      String Student_Name =stuname.getText().toString();
       String Student_Father_Name =stufather.getText().toString();
        String Student_Mother_Name =stumother.getText().toString();
         String Date_of_Birth =dateofb.getText().toString();
          String SSC_Schoolname =ssc.getText().toString();
           String ssc_gpa =gpassc.getText().toString();
            String hsc_collegeName =hscc.getText().toString();
             String hsc_gpa =gpahsc.getText().toString();
              String Local_Guardien =localg.getText().toString();
               String Guardien_phone_number =gpnt.getText().toString();
                String student_id =paddt.getText().toString();
                 String student_password =padd2.getText().toString();
                  String permanent_Address =fao.getText().toString();
                   String present_Address =faani.getText().toString();
                    String Father_occupation =mao.getText().toString();
                     String Father_Annual_Income =maai.getText().toString();
                      String Mother_occupation =ste.getText().toString();
                       String Mother_Annual_Income =adn.getText().toString();
                        String Student_Email =ids.getText().toString();
                         String Advisor_name =pass.getText().toString();
        
        if(Student_Name.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Student_Name is Mandatory");   
        }
        if(Student_Father_Name.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Student_Father_Name is Mandatory");   
        }
        if(Student_Mother_Name.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Student_Mother_Name is Mandatory");   
        }
        if(Date_of_Birth.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Date_of_Birth is Mandatory");   
        }
        if(SSC_Schoolname.equals(""))
        {
         JOptionPane.showMessageDialog(null,"SSC_Schoolname is Mandatory");   
        }
        if(ssc_gpa.equals(""))
        {
         JOptionPane.showMessageDialog(null,"ssc_gpa is Mandatory");   
        }
        if(hsc_collegeName.equals(""))
        {
         JOptionPane.showMessageDialog(null,"hsc_collegeName is Mandatory");   
        }
        if(hsc_gpa.equals(""))
        {
         JOptionPane.showMessageDialog(null,"hsc_gpa is Mandatory");   
        }
        if(Local_Guardien.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Local_Guardien is Mandatory");   
        }
        if(Guardien_phone_number.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Guardien_phone_number is Mandatory");   
        }
        if(student_id.equals(""))
        {
         JOptionPane.showMessageDialog(null,"student_id is Mandatory");   
        }
        if(student_password.equals(""))
        {
         JOptionPane.showMessageDialog(null,"student_password is Mandatory");   
        }
        if(permanent_Address.equals(""))
        {
         JOptionPane.showMessageDialog(null,"permanent_Address is Mandatory");   
        }
        if(present_Address.equals(""))
        {
         JOptionPane.showMessageDialog(null,"present_Address is Mandatory");   
        }
        if(Father_occupation.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Father_occupation is Mandatory");   
        }
        if(Father_Annual_Income.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Father_Annual_Income is Mandatory");   
        }
        if(Mother_occupation.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Mother_occupation is Mandatory");   
        }
        if(Mother_Annual_Income.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Mother_Annual_Income is Mandatory");   
        }
        if(Student_Email.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Student_Email is Mandatory");   
        }
        if(Advisor_name.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Advisor_name is Mandatory");   
        }
        
        
        JOptionPane.showMessageDialog(null,"enter data successfull");   
        
        
        
        
        
        try{
    String url="jdbc:derby://localhost:1527/studentM";
        String username="admin3";
        String password="admin3";
        
        Connection con =DriverManager.getConnection(url,username, password);
        Statement stmt=con.createStatement();
        String Query="INSERT INTO STUDENTREG(STUDENT_NAME,STUDENT_FATHER_NAME,STUDENT_MOTHER_NAME,SSC_SCHOOLNAME,HSC_COLLEGENAME,LOCAL_GUARDIAN,GUARDIAN_PHONENUM,PERMANENT_ADDRESS,PRESENT_ADDRESS,FATHER_OCCUPATION,MOTHER_OCCUPATION,ADVISOR,STUDENT_PASSWORD,SSC_GPA,HSC_GPA,MOTHER_ANNUAL_INCOME,FATHER_ANNUAL_INCOME,DATE_OF_BATH,STUDENT_ID,STUDENT_EMAIL)VALUES('"+stuname.getText()+"' ,'"
                      +stufather.getText()+ "'  , '"+stumother.getText()+"' , '" +ssc.getText() +"','"+hscc.getText() +"' , '"+localg.getText()+"', '"+gpnt.getText()+"', '"+fao.getText()+"','"+faani.getText()+"','"+mao.getText()+"','"+ste.getText()+"','"+pass.getText()+"','"+padd2.getText()+"','"+gpassc.getText()+"','"+gpahsc.getText() +"','"+adn.getText()+"','"+maai.getText()+"','"+dateofb.getText()+"','"+paddt.getText()+"','"+ids.getText()+"')";
        
        
        String Query1="INSERT INTO NEWTRY(LOCAL_GUARDIAN,GUARDIAN_PHONENUM,STUDENT_PASSWORD)VALUES('"+localg.getText()+"' ,'"
                      +gpnt.getText()+ "'  , '"+padd2.getText()+"' )";
        
        
        stmt.execute(Query);
        stmt.execute(Query1);
        
       
        
        
        
        JOptionPane.showMessageDialog(null,"Student Information added ");
        JOptionPane.showMessageDialog(null,"Guardian phone "+gpnt.getText());
        JOptionPane.showMessageDialog(null,"Guardian password "+padd2.getText());
        
        
        
        
        
        
        stuname.setText(null);
        stufather.setText(null);
        stumother.setText(null);
        ssc.setText(null);
        hscc.setText(null);
        localg.setText(null);
        gpnt.setText(null);
        fao.setText(null);
        faani.setText(null);
        mao.setText(null);
        ste.setText(null);
        pass.setText(null);
        padd2.setText(null);
        gpassc.setText(null);
        gpahsc.setText(null);
        adn.setText(null);
        maai.setText(null);
        dateofb.setText(null);
        paddt.setText(null);
        ids.setText(null);
        
        
        
        
    }//GEN-LAST:event_exitActionPerformed
catch(SQLException ex)
{
  JOptionPane.showMessageDialog(null,ex.toString());
}
    
     
    } 
    
    
        
        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regstudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adn;
    private javax.swing.JLabel av;
    private javax.swing.JTextField dateofb;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JButton exit;
    private javax.swing.JTextField faani;
    private javax.swing.JLabel fai;
    private javax.swing.JTextField fao;
    private javax.swing.JLabel fo;
    private javax.swing.JTextField gpahsc;
    private javax.swing.JTextField gpassc;
    private javax.swing.JLabel gpn;
    private javax.swing.JTextField gpnt;
    private javax.swing.JLabel hsc;
    private javax.swing.JTextField hscc;
    private javax.swing.JLabel hscgpa;
    private javax.swing.JTextField ids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lc;
    private javax.swing.JTextField localg;
    private javax.swing.JTextField maai;
    private javax.swing.JLabel mai;
    private javax.swing.JTextField mao;
    private javax.swing.JLabel mo;
    private javax.swing.JLabel padd;
    private javax.swing.JPasswordField padd2;
    private javax.swing.JTextField paddt;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel preadd;
    private javax.swing.JLabel se;
    private javax.swing.JTextField ssc;
    private javax.swing.JLabel sscgpa;
    private javax.swing.JTextField ste;
    private javax.swing.JLabel studentid;
    private javax.swing.JLabel studentmother;
    private javax.swing.JLabel studentname;
    private javax.swing.JTextField stufather;
    private javax.swing.JTextField stumother;
    private javax.swing.JTextField stuname;
    private javax.swing.JButton validation;
    // End of variables declaration//GEN-END:variables
}
    

