import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class p4advisor extends javax.swing.JFrame {

    /**
     * Creates new form p4advisor
     */
    public p4advisor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        seemm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sidd = new javax.swing.JTextField();
        cr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student ID");

        jLabel2.setText("Semester");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Options");

        jMenuItem1.setText("Check Student Result");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Chect Student Personal Information");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Check Student Guardian Information");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Check Student Guardian Remark");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(235, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sidd, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seemm, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sidd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seemm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       try
        {            
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentM","admin3","admin3");
            String Query = "select  STUDENT_ID, SEMESTER from STUDENTRESULT where STUDENT_ID LIKE '%"+sidd.getText()+"%'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbasesemester=result.getString("STUDENT_ID").toString().trim();
                String enteredsemester=sidd.getText().trim();
                if(dbasesemester.equals(enteredsemester))
                {cr.setText("Welcome");
                advisorcheckresult h=new advisorcheckresult(dbasesemester);
                
                 
                           close();
                         p7advisor k=new p7advisor(dbasesemester);
                           k.setVisible(true);
                          
                
                
                }
                
                else
  			cr.setText("Sorry you are unauthorized");        
            }                     
            else
            {                  
               cr.setText("This ID is not registered");              
            }                      
            statement.close();
            con.close();        
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            cr.setText("Exception occurred while searching in the STUDENTREG table");
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      try
        {            
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentM","admin3","admin3");
            String Query = "select  STUDENT_ID from STUDENTREG where STUDENT_ID LIKE '%"+sidd.getText()+"%'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbasesemester=result.getString("STUDENT_ID").toString().trim();
                String enteredsemester=sidd.getText().trim();
                if(dbasesemester.equals(enteredsemester))
                {cr.setText("Welcome");
                advisorcheckpersonalinfo k=new advisorcheckpersonalinfo(dbasesemester);
                
                          close();
                         p8advisor l =new p8advisor(dbasesemester);
                           l.setVisible(true);
                          
                
                
                }
                
                else
  			cr.setText("Sorry you are unauthorized");        
            }                     
            else
            {                  
               cr.setText("This ID is not registered");              
            }                      
            statement.close();
            con.close();        
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            cr.setText("Exception occurred while searching in the STUDENTREG table");
        } 
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try
        {            
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentM","admin3","admin3");
            String Query = "select  STUDENT_ID from STUDENTREG where STUDENT_ID LIKE '%"+sidd.getText()+"%'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbasesemester=result.getString("STUDENT_ID").toString().trim();
                String enteredsemester=sidd.getText().trim();
                if(dbasesemester.equals(enteredsemester))
                {cr.setText("Welcome");
                advisorcheckguardianpersonalinfo k=new advisorcheckguardianpersonalinfo(dbasesemester);
                
                          close();
                         p9advisor l =new p9advisor(dbasesemester);
                           l.setVisible(true);
                          
                
                
                }
                
                else
  			cr.setText("Sorry you are unauthorized");        
            }                     
            else
            {                  
               cr.setText("This ID is not registered");              
            }                      
            statement.close();
            con.close();        
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            cr.setText("Exception occurred while searching in the STUDENTREG table");
        } 
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      try
        {            
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentM","admin3","admin3");
            String Query = "select  STUDENT_ID from GUARDIANREMARK where STUDENT_ID LIKE '%"+sidd.getText()+"%'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbasesemester=result.getString("STUDENT_ID").toString().trim();
                String enteredsemester=sidd.getText().trim();
                if(dbasesemester.equals(enteredsemester))
                {cr.setText("Welcome");
                advisorcheckguardianremark k=new advisorcheckguardianremark(dbasesemester);
                
                          close();
                         p10advisor l =new p10advisor(dbasesemester);
                           l.setVisible(true);
                          
                
                
                }
                
                else
  			cr.setText("Sorry you are unauthorized");        
            }                     
            else
            {                  
               cr.setText("This ID is not registered");              
            }                      
            statement.close();
            con.close();        
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            cr.setText("Exception occurred while searching in the STUDENTREG table");
        } 
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       close();
                         padvisor l =new padvisor();
                           l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
public void close()
{
    this.setVisible(false);
    this.dispose();
}
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(p4advisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p4advisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p4advisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p4advisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p4advisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField seemm;
    private javax.swing.JTextField sidd;
    // End of variables declaration//GEN-END:variables
}