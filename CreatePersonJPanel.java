/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui.person;
import model.IntegerVerifier;
import model.StringVerifier;
import model.Person;
import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Keerthi
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatientJPanel
     */
    private final PersonDirectory personDirectory;
    private final JPanel userProcessContainer;
    
    public CreatePersonJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier integerVerifier = new IntegerVerifier();
        personAgeJTextField.setInputVerifier(integerVerifier);
        InputVerifier stringVerifier = new StringVerifier();
        pesonNameJTextField.setInputVerifier(stringVerifier);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personAgeJTextField = new javax.swing.JTextField();
        addPersonJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        weightjLabel = new javax.swing.JLabel();
        personWeightJTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        personAddressJTextField = new javax.swing.JTextField();
        personCityJTextField = new javax.swing.JTextField();
        personCommunityJTextField = new javax.swing.JLabel();
        personCommunityjComboBox = new javax.swing.JComboBox<>();
        personCommunityJTextField1 = new javax.swing.JLabel();
        listHospital = new javax.swing.JComboBox<>();
        personCommunityJTextField2 = new javax.swing.JLabel();
        listDoctors = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 255));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(500, 700));

        addPersonJButton.setText("Create");
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person Profile");

        patientNameJLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        patientNameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        patientNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientNameJLabel.setText("Person Name: ");

        AgeJLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        AgeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AgeJLabel.setText("Age : ");

        backJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        backJButton.setText("<");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        weightjLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        weightjLabel.setForeground(new java.awt.Color(255, 255, 255));
        weightjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightjLabel.setText("Weight: ");

        personWeightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personWeightJTextFieldActionPerformed(evt);
            }
        });

        addressjLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        addressjLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address:");

        cityjLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cityjLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityjLabel.setText("City:");

        personCityJTextField.setEditable(false);
        personCityJTextField.setText("Boston");

        personCommunityJTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        personCommunityJTextField.setForeground(new java.awt.Color(255, 255, 255));
        personCommunityJTextField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personCommunityJTextField.setText("Community:");

        personCommunityjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roxbury", "Fenway", "Downtown", "Kenmore" }));
        personCommunityjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCommunityjComboBoxActionPerformed(evt);
            }
        });

        personCommunityJTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        personCommunityJTextField1.setForeground(new java.awt.Color(255, 255, 255));
        personCommunityJTextField1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personCommunityJTextField1.setText("Hospital:");

        personCommunityJTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        personCommunityJTextField2.setForeground(new java.awt.Color(255, 255, 255));
        personCommunityJTextField2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personCommunityJTextField2.setText("Doctor:");

        listDoctors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentist", "Neurologist", "Dermatologist", "Pediatrition" }));
        listDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(patientNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weightjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(personCommunityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(personCommunityJTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(personCommunityJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personAgeJTextField)
                            .addComponent(pesonNameJTextField)
                            .addComponent(personWeightJTextField)
                            .addComponent(personAddressJTextField)
                            .addComponent(personCityJTextField)
                            .addComponent(personCommunityjComboBox, 0, 150, Short.MAX_VALUE)
                            .addComponent(listHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listDoctors, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addPersonJButton))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personWeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressjLabel)
                    .addComponent(personAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityjLabel)
                    .addComponent(personCityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personCommunityJTextField)
                    .addComponent(personCommunityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personCommunityJTextField1)
                    .addComponent(listHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personCommunityJTextField2)
                    .addComponent(listDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPersonJButton)
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setweight(Integer.parseInt(personWeightJTextField.getText()));
            person.setCommunity((String)personCommunityjComboBox.getSelectedItem());
            person.setDoctor((String)listDoctors.getSelectedItem());
            person.setCity(personCityJTextField.getText());
            person.setAddress(personAddressJTextField.getText());
            
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonJButtonActionPerformed
    private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
        personWeightJTextField.setText("");
        personAddressJTextField.setText("");
        personCityJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0)
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

    private void personWeightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personWeightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personWeightJTextFieldActionPerformed

    private void personCommunityjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCommunityjComboBoxActionPerformed
        // TODO add your handling code here:
        if(personCommunityjComboBox.getSelectedItem().equals("Roxbury"))
        {
            listHospital.removeAllItems();
            listHospital.addItem("NEU Hospital");
            listHospital.addItem("Mass Hospital");
            listHospital.addItem("Boston Hospital");
        }
        else
        {
            if(personCommunityjComboBox.getSelectedItem().equals("Fenway"))
            {
                listHospital.removeAllItems();
                listHospital.addItem("ABC Hospital");
                listHospital.addItem("XYZ Hospital");
                listHospital.addItem("PQR Hospital");
            }
            else
            {
                listHospital.removeAllItems();
                listHospital.addItem("UHCS Hospital");
                listHospital.addItem("Dhirubhai Hospital");
                listHospital.addItem("BMC Hospital");
            }
        }
    }//GEN-LAST:event_personCommunityjComboBoxActionPerformed

    private void listDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDoctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listDoctorsActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listDoctors;
    private javax.swing.JComboBox<String> listHospital;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField personAddressJTextField;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField personCityJTextField;
    private javax.swing.JLabel personCommunityJTextField;
    private javax.swing.JLabel personCommunityJTextField1;
    private javax.swing.JLabel personCommunityJTextField2;
    private javax.swing.JComboBox<String> personCommunityjComboBox;
    private javax.swing.JTextField personWeightJTextField;
    private javax.swing.JTextField pesonNameJTextField;
    private javax.swing.JLabel weightjLabel;
    // End of variables declaration//GEN-END:variables
}
