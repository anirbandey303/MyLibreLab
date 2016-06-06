/*
MyOpenLab by Carmelo Salafia www.myopenlab.de
Copyright (C) 2004  Carmelo Salafia cswi@gmx.de

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package VisualLogic;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileView;

/**
 *
 * @author  Carmelo
 */
public class DialogNewProject extends javax.swing.JDialog
{
    private FrameMain parent;
    
    /** Creates new form DialogNewProject */
    public DialogNewProject(FrameMain parent, boolean modal)
    {
        super(parent, modal);
        
        this.parent=parent;
        initComponents();
        
        String path=new File(parent.settings.getOldProjectPath()).getAbsolutePath();
        jTextField2.setText(path);
        
        make();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jCheckSPSProjekt = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("VisualLogic/DialogNewProject"); // NOI18N
        setTitle(bundle.getString("New_Project")); // NOI18N

        jButton2.setText(bundle.getString("Cancel")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText(bundle.getString("OK")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("NAME_AND_LOCATION"))); // NOI18N

        jLabel1.setText(bundle.getString("Project_Name_:_")); // NOI18N

        jTextField1.setText(bundle.getString("project1")); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel2.setText(bundle.getString("Project_Location_:_")); // NOI18N

        jLabel3.setText(bundle.getString("Project_Folder_:")); // NOI18N

        jTextField3.setEditable(false);

        jButton3.setText(bundle.getString("Browse...")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox2.setSelected(true);
        jCheckBox2.setText(bundle.getString("Create_Main_VM")); // NOI18N
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField4.setText("Main");

        jCheckSPSProjekt.setText(bundle.getString("MYOPENLAB_SPS_PROJEKT")); // NOI18N
        jCheckSPSProjekt.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckSPSProjekt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckSPSProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSPSProjektActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckSPSProjekt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckSPSProjekt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void make()
    {
        jTextField3.setText(jTextField2.getText()+"\\"+jTextField1.getText()); //NOI18N
    }
    
    
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField2KeyReleased
    {//GEN-HEADEREND:event_jTextField2KeyReleased
        make();
    }//GEN-LAST:event_jTextField2KeyReleased
    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField1KeyReleased
    {//GEN-HEADEREND:event_jTextField1KeyReleased
        make();
    }//GEN-LAST:event_jTextField1KeyReleased
    
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField1KeyPressed
    {//GEN-HEADEREND:event_jTextField1KeyPressed
        
    }//GEN-LAST:event_jTextField1KeyPressed
    
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextField1MouseClicked
    {//GEN-HEADEREND:event_jTextField1MouseClicked
        
    }//GEN-LAST:event_jTextField1MouseClicked
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1ActionPerformed
    {//GEN-HEADEREND:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextField2KeyPressed
    {//GEN-HEADEREND:event_jTextField2KeyPressed
        
    }//GEN-LAST:event_jTextField2KeyPressed
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField2ActionPerformed
    {//GEN-HEADEREND:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        OnlyDirectoryFilter filter= new OnlyDirectoryFilter();
        chooser.setFileFilter(filter);
        
        chooser.setDialogTitle(java.util.ResourceBundle.getBundle("VisualLogic/DialogNewProject").getString("Browse..."));
        chooser.setDialogType(JFileChooser.DIRECTORIES_ONLY);
        
        chooser.setCurrentDirectory(new File(".")); //NOI18N
        
        //chooser.setFileFilter(filter);
        FileView view = new JavaFileView();
        chooser.setFileView(view);
        
        int value = chooser.showSaveDialog(this);
        
        if (value == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            
            String fileName=file.getPath();
            jTextField2.setText(fileName);
            make();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        result=false;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
                   
        if (jCheckSPSProjekt.isSelected())
        {
          projectType="SPS"; //NOI18N
        }
        projectName=jTextField3.getText();
        if (!new File(projectName).exists())
        {
            result=true;
            createMainVM=jCheckBox2.isSelected();
            
            if (createMainVM)
            {
                mainVMFilename=jTextField4.getText();
                
                if (mainVMFilename.length()==0)
                {
                    mainVMFilename="Main";
                }
            }
            
            parent.settings.setOldProjectPath(jTextField2.getText());
            dispose();
        }
        else
        {
            Tools.showMessage(java.util.ResourceBundle.getBundle("VisualLogic/DialogNewProject").getString("Folder_already_exist_:_")+"\""+projectName+"\"");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckSPSProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSPSProjektActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckSPSProjektActionPerformed
    
    
    public static String projectName="";
    public static boolean result=false;
    public static boolean createMainVM=true;
    public static String mainVMFilename="Main";
    public static String projectType="";
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    public static javax.swing.JCheckBox jCheckSPSProjekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    
}
