/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui.patient;

import model.StringVerifier;
import model.Patient;
import model.Person;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Keerthi
 */
public class CreatePatientJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatientJPanel
     */
    private final Person person;
    private final JPanel userProcessContainer;
    
    public CreatePatientJPanel(JPanel upc, Person person) {
        initComponents();
        this.userProcessContainer = upc;
        this.person=person;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier stringVerifier = new StringVerifier();
        patientIDJTextField.setInputVerifier(stringVerifier);
        primaryDocNameJTextField.setInputVerifier(stringVerifier);
        prefferedPharmacyJTextField.setInputVerifier(stringVerifier);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primaryDocNameJTextField = new javax.swing.JTextField();
        prefferedPharmacyJTextField = new javax.swing.JTextField();
        addPatientJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientIDJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        prefferedPharmacyJLabel = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        addPatientJButton.setText("Add Patient");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        patientIDJLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        patientIDJLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientIDJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientIDJLabel.setText("Patient ID");

        primaryDocNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        primaryDocNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        primaryDocNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        primaryDocNameJLabel.setText(" Doctor Name");

        prefferedPharmacyJLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        prefferedPharmacyJLabel.setForeground(new java.awt.Color(255, 255, 255));
        prefferedPharmacyJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        prefferedPharmacyJLabel.setText("Preffered Pharmacy");

        patientIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDJTextFieldActionPerformed(evt);
            }
        });

        backJButton.setText("<");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(primaryDocNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patientIDJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prefferedPharmacyJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientIDJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPatientJButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientIDJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(primaryDocNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prefferedPharmacyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(addPatientJButton)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patientIDJLabel, patientIDJTextField, prefferedPharmacyJLabel, prefferedPharmacyJTextField, primaryDocNameJLabel, primaryDocNameJTextField});

    }// </editor-fold>//GEN-END:initComponents

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput())
        {
            Patient patient = new Patient();
            patient.setPatientID(patientIDJTextField.getText());
            patient.setPrimaryDoctorName(primaryDocNameJTextField.getText());
            patient.setPrefferedPharmacy(prefferedPharmacyJTextField.getText());
            //Adding Patient to Person
            person.setPatient(patient);
            JOptionPane.showMessageDialog(this, "Patient added!!", "Update", 
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPatientJButtonActionPerformed
    private void clearFields()
    {
        patientIDJTextField.setText("");
        primaryDocNameJTextField.setText("");
        prefferedPharmacyJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(patientIDJTextField.getText().length()==0
                ||primaryDocNameJTextField.getText().length()==0
                ||prefferedPharmacyJTextField.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void patientIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDJTextFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel prefferedPharmacyJLabel;
    private javax.swing.JTextField prefferedPharmacyJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField primaryDocNameJTextField;
    // End of variables declaration//GEN-END:variables
}
