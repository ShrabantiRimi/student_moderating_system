import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class padvisor extends javax.swing.JFrame {

    /**
     * Creates new form padvisor
     */
    public padvisor() {
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

        jLabel2 = new javax.swing.JLabel();
        ss = new javax.swing.JTextField();
        fi = new javax.swing.JTextField();
        s_info = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        check = new javax.swing.JMenuItem();
        add2 = new javax.swing.JMenuItem();
        advising2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Student ID");

        fi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiActionPerformed(evt);
            }
        });

        s_info.setText("Student_Information");
        s_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_infoActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jMenu3.setText("Options");

        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jMenu3.add(check);

        add2.setText("ADD(New Student)");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jMenu3.add(add2);

        advising2.setText("Advising");
        advising2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advising2ActionPerformed(evt);
            }
        });
        jMenu3.add(advising2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(fi, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(s_info, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_info))
                .addGap(36, 36, 36)
                .addComponent(fi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       close();
       loginadvisor i=new loginadvisor ();
        i.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void s_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_infoActionPerformed
        close();
       p4advisor i=new p4advisor ();
        i.setVisible(true);
    }//GEN-LAST:event_s_infoActionPerformed

    private void fiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
         try
        {            
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentM","admin3","admin3");
            String Query = "select  STUDENT_ID from STUDENTREG where STUDENT_ID LIKE '%"+ss.getText()+"%'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery(); 
            if (result.next())
            {   
                String dbaseid=result.getString("STUDENT_ID").toString().trim();
                String enteredid=ss.getText().trim();
                if(dbaseid.equals(enteredid))
                {fi.setText("Already Registered"); 
                           //close();
                         //studentprotal1 sel=new studentprotal1 ();
                           //sel.setVisible(true);
                
                
                }
                
                else
  			fi.setText("Not Registered");        
            }                     
            else
            {                  
                fi.setText("This ID is not registered");              
            }                      
            statement.close();
            con.close();        
        }
        catch(SQLException se){
             se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();     
            fi.setText("Exception occurred while searching in the STUDENTREG table");
        } 
        
    }//GEN-LAST:event_checkActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
         close();
       p2advisor i=new p2advisor ();
        i.setVisible(true);
    }//GEN-LAST:event_add2ActionPerformed

    private void advising2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advising2ActionPerformed
         close();
       p3advisor i=new p3advisor ();
        i.setVisible(true);
    }//GEN-LAST:event_advising2ActionPerformed
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
            java.util.logging.Logger.getLogger(padvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(padvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(padvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(padvisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new padvisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add2;
    private javax.swing.JMenuItem advising2;
    private javax.swing.JButton back;
    private javax.swing.JMenuItem check;
    private javax.swing.JTextField fi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton s_info;
    private javax.swing.JTextField ss;
    // End of variables declaration//GEN-END:variables
}