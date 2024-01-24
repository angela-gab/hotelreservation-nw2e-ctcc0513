
package dsa_final_requirement;



import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Admin_User1's
 */
public class AdminRecord extends javax.swing.JFrame {



    private ArrayList<String> data;
    private ArrayList<String> room;
    
    public AdminRecord() {
        initComponents();
        
        data = new ArrayList<>();
        data.add("Krizel - Deluxe Room 110");
        data.add("Angela - Single Standard Room 127");
        data.add("Nyx - Standard Room 101");
        data.add("Mika - Family Room 116");
        data.add("Apple - Barkada Room 209");
        data.add("Jelai - Barkada Room 115");
        data.add("Rhiccel - Deluxe Room 113");
        data.add("Marie - Single Standard Room 171");
        data.add("Cen - Standard Room 211");
        data.add("Erin - Family Room 243");
        data.add("Donna - Family Room 197");
        data.add("Ashley - Family Room 221");
        
        room = new ArrayList<>();
        room.add("Available - Deluxe Room 132");
        room.add("Available - Single Standard Room 130");
        room.add("Available - Standard Room 212");
        room.add("Available - Family Room 120");
        room.add("Available - Barkada Room 211");
        room.add("Available - Barkada Room 219");
        room.add("Available - Deluxe Room 143");
        room.add("Available - Single Standard Room 136");
        room.add("Available - Standard Room 256");
        room.add("Available - Family Room 245");
        room.add("Available - Family Room 263");
        room.add("Available - Family Room 241");        

    }

        private void performSearch1() {
        String searchTerm = search1.getText().toLowerCase();
        ArrayList<String> searchResults = new ArrayList<>();

        for (String item : data) {
            if (item.toLowerCase().contains(searchTerm)) {
                searchResults.add(item);
            }
        }

        displayResults1(searchResults);
    }
        
        private void performSearch2() {
        String searchTerm = search2.getText().toLowerCase();
        ArrayList<String> searchResults = new ArrayList<>();

        for (String item : room) {
            if (item.toLowerCase().contains(searchTerm)) {
                searchResults.add(item);
            }
        }

        displayResults2(searchResults);
    }   

    private void displayResults1(ArrayList<String> results) {
        resultA.setText("");
        if (results.isEmpty()) {
            resultA.append("No matching results found.");
        } else {
            for (String result : results) {
                resultA.append(result + "\n");
            }
        }
    }
    
    private void displayResults2(ArrayList<String> results) {
        resultAv.setText("");
        if (results.isEmpty()) {
            resultAv.append("No matching results found.");
        } else {
            for (String result : results) {
                resultAv.append(result + "\n");
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        searchButton2 = new javax.swing.JButton();
        search2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        done = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultAv = new javax.swing.JTextArea();
        jLabel128 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultA = new javax.swing.JTextArea();
        clear1 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 90, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(1176, 865));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel107.setFont(new java.awt.Font("PT Serif", 1, 48)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("ADMIN");
        jPanel1.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 180, 72));

        jPanel2.setBackground(new java.awt.Color(67, 118, 108));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel127.setFont(new java.awt.Font("Kefa", 0, 30)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Availability");
        jPanel2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 240, 49));

        searchButton2.setBackground(new java.awt.Color(177, 148, 112));
        searchButton2.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        searchButton2.setForeground(new java.awt.Color(255, 255, 255));
        searchButton2.setText("Check");
        searchButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(searchButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 170, 40));

        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search2KeyTyped(evt);
            }
        });
        jPanel2.add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 330, 38));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 717, 883, -1));

        jPanel4.setBackground(new java.awt.Color(125, 90, 80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 514, 890, 10));

        done.setBackground(new java.awt.Color(177, 148, 112));
        done.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        done.setForeground(new java.awt.Color(255, 255, 255));
        done.setText("DONE");
        done.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        jPanel2.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 247, 50));

        resultAv.setEditable(false);
        resultAv.setColumns(20);
        resultAv.setRows(5);
        jScrollPane1.setViewportView(resultAv);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 330, 310));

        jLabel128.setFont(new java.awt.Font("Kefa", 0, 30)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Room Record");
        jPanel2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, 49));

        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search1KeyTyped(evt);
            }
        });
        jPanel2.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 330, 38));

        searchButton1.setBackground(new java.awt.Color(177, 148, 112));
        searchButton1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        searchButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchButton1.setText("Search Room / Guest");
        searchButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 200, 40));

        resultA.setEditable(false);
        resultA.setColumns(20);
        resultA.setRows(5);
        jScrollPane2.setViewportView(resultA);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 330, 310));

        clear1.setBackground(new java.awt.Color(177, 148, 112));
        clear1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        clear1.setForeground(new java.awt.Color(255, 255, 255));
        clear1.setText("Clear");
        clear1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel2.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, 40));

        clear2.setBackground(new java.awt.Color(177, 148, 112));
        clear2.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        clear2.setForeground(new java.awt.Color(255, 255, 255));
        clear2.setText("Clear");
        clear2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel2.add(clear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 890, 620));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel108.setFont(new java.awt.Font("PT Serif", 1, 48)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("MORRIS HOTEL");
        jPanel1.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 375, 72));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search2ActionPerformed

    private void search2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search2KeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_search2KeyTyped

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
            Admin_User1 u = new Admin_User1();
            u.show();
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_doneActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void search1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_search1KeyTyped

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        String Search1 = search1.getText().trim();
           
        if (Search1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Input Details.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
             performSearch1();       

        }

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed

        String Search2 = search2.getText().trim();
            
        if (Search2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Input Details.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            performSearch2();
        }
            
    }//GEN-LAST:event_searchButton2ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        resultA.setText("");
        search1.setText("");
    }//GEN-LAST:event_clear1ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        resultAv.setText("");
        search2.setText("");
    }//GEN-LAST:event_clear2ActionPerformed
        
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
            java.util.logging.Logger.getLogger(AdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdminRecord().setVisible(true);
            
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear2;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultA;
    private javax.swing.JTextArea resultAv;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    private javax.swing.JButton searchButton1;
    private javax.swing.JButton searchButton2;
    // End of variables declaration//GEN-END:variables


        }