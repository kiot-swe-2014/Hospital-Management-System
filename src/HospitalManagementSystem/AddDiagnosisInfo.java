package HospitalManagementSystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Software Engineers
 */
 class AddDiagnosisInfo extends javax.swing.JFrame {

    /**
     * Creates new form AddDiagnosisInfo
     */
    public AddDiagnosisInfo() {
        initComponents();
        
        wardTypeLabel.setVisible(false);
        wardTypeComboBox.setVisible(false);
        errorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        toSearchIdLabel = new javax.swing.JLabel();
        toSearchIdTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewRecordTable = new javax.swing.JTable();
        symptomLabel = new javax.swing.JLabel();
        diagnosisLabel = new javax.swing.JLabel();
        medicineLabel = new javax.swing.JLabel();
        symptomTextField = new javax.swing.JTextField();
        diagnosisTextField = new javax.swing.JTextField();
        medicineTextField = new javax.swing.JTextField();
        isWardLabel = new javax.swing.JLabel();
        wardTypeLabel = new javax.swing.JLabel();
        isWardCheckBox = new javax.swing.JCheckBox();
        wardTypeComboBox = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(4665, 3468));

        closeButton.setBackground(new java.awt.Color(255, 102, 51));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 153, 153));
        titleLabel.setText("Add Diagnosis Information of The Patient Here");

        toSearchIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toSearchIdLabel.setText("Patient ID");

        toSearchIdTextField.setText("4");

        searchButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        viewRecordTable.setBackground(new java.awt.Color(204, 255, 204));
        viewRecordTable.setForeground(new java.awt.Color(204, 51, 255));
        viewRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone Number", "Age", "Sex", "Address", "Previos Disease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        viewRecordTable.setGridColor(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(viewRecordTable);

        symptomLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        symptomLabel.setForeground(new java.awt.Color(204, 153, 255));
        symptomLabel.setText("Symptoms");

        diagnosisLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        diagnosisLabel.setForeground(new java.awt.Color(204, 153, 255));
        diagnosisLabel.setText("Diagnosis");

        medicineLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        medicineLabel.setForeground(new java.awt.Color(204, 153, 255));
        medicineLabel.setText("Medicines");

        isWardLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isWardLabel.setForeground(new java.awt.Color(153, 153, 255));
        isWardLabel.setText("Is Ward Necessary?");

        wardTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        wardTypeLabel.setForeground(new java.awt.Color(153, 153, 255));
        wardTypeLabel.setText("Type of Ward");

        isWardCheckBox.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        isWardCheckBox.setText("yes");
        isWardCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isWardCheckBoxActionPerformed(evt);
            }
        });

        wardTypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        wardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", " " }));
        wardTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardTypeComboBoxActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(153, 153, 153));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 51, 0));
        errorLabel.setText("Patient With This ID Does Not Exist!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(symptomLabel)
                            .addComponent(diagnosisLabel)
                            .addComponent(medicineLabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(diagnosisTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(symptomTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isWardLabel)
                            .addComponent(wardTypeLabel)
                            .addComponent(closeButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isWardCheckBox)
                            .addComponent(wardTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(saveButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(613, 613, 613)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(toSearchIdLabel)
                        .addGap(37, 37, 37)
                        .addComponent(toSearchIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addComponent(titleLabel))
                .addGap(100, 127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addGap(605, 605, 605))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(titleLabel)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toSearchIdLabel)
                    .addComponent(toSearchIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(31, 31, 31)
                .addComponent(errorLabel)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symptomLabel)
                    .addComponent(symptomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diagnosisLabel)
                            .addComponent(diagnosisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isWardLabel)
                            .addComponent(isWardCheckBox))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wardTypeLabel)
                            .addComponent(wardTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineLabel)
                    .addComponent(medicineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(closeButton))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        new DoctorPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void isWardCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isWardCheckBoxActionPerformed
          
               
        if(isWardCheckBox.isSelected()) {
              wardTypeLabel.setVisible(true);
              wardTypeComboBox.setVisible(true);
           }
           else{
           wardTypeLabel.setVisible(false);
              wardTypeComboBox.setVisible(false);
           } 
    }//GEN-LAST:event_isWardCheckBoxActionPerformed

    private void wardTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardTypeComboBoxActionPerformed
      
    }//GEN-LAST:event_wardTypeComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       int pID;
    try {
        pID = Integer.parseInt(toSearchIdTextField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter a numeric value.");
        return;
    }
        String symptom=symptomTextField.getText();
        String diagnosis=diagnosisTextField.getText();
        String medicine=medicineTextField.getText();
        String wardRequired;
        String wardType;
        
        if(isWardCheckBox.isSelected()){
           wardRequired="yes";
           wardType=(String)wardTypeComboBox.getSelectedItem();
           
        }
        else{
            
             wardRequired="no";
             wardType="---";
        }   
        try{
       String query="insert into patientinformation(patientId,symptom,diagnosis,medicine,wardRequired,wardType) values (?,?,?,?,?,?) ";
       Connection connection =JDBCconn.startConnection();
       PreparedStatement prepare=connection.prepareStatement(query);
       
       prepare.setInt(1, pID);
       prepare.setString(2, symptom);
       prepare.setString(3, diagnosis);
       prepare.setString(4, medicine);
       prepare.setString(5, wardRequired);
       prepare.setString(6, wardType);
     
       prepare.executeUpdate();
           JOptionPane.showMessageDialog(null, "patient diagnosis information saved successfuly");
           setVisible(false);
           new AddDiagnosisInfo().setVisible(true);
           prepare.close();
           connection.close();
       }
       catch(Exception e){
    JOptionPane.showMessageDialog(null, "incorrect input please try again");
       }
// TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int pID;
    try {
        pID = Integer.parseInt(toSearchIdTextField.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter a numeric value.");
        return;
    }

    try {
        Connection connection = JDBCconn.startConnection();
        String query = "SELECT * FROM patient WHERE patientId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, pID);
        
        ResultSet result = preparedStatement.executeQuery();
        
        String[] columnNames = {"Id", "Name","Phone Number","Age","Sex","Address","Any Disease"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        if (!result.isBeforeFirst()) { // Checks if ResultSet is empty
            errorLabel.setVisible(true);
        } else {
            errorLabel.setVisible(false);
            toSearchIdTextField.setEditable(false);
            
            // Example to read and display data from the ResultSet (adjust as needed)
           while (result.next()) {
                Object[] rowData = {
                    result.getInt("patientId"),      // Assuming 'id' is an integer
                    result.getString("patientName"),  // Assuming 'name' is a string
                    result.getString("patientPhone"),
                    result.getInt("patientAge"),
                    result.getString("patientSex"), 
                    result.getString("patientAddress"),
                     result.getString("patientDisease")
                };
                tableModel.addRow(rowData);
            }

            // Set the model to the JTable
            viewRecordTable.setModel(tableModel);
        }

        // Close the connection and statement
        result.close();
        preparedStatement.close();
        connection.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Connection error: " + e.getMessage());
        e.printStackTrace();
    }

// TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel diagnosisLabel;
    private javax.swing.JTextField diagnosisTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JCheckBox isWardCheckBox;
    private javax.swing.JLabel isWardLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineLabel;
    private javax.swing.JTextField medicineTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel symptomLabel;
    private javax.swing.JTextField symptomTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel toSearchIdLabel;
    private javax.swing.JTextField toSearchIdTextField;
    private javax.swing.JTable viewRecordTable;
    private javax.swing.JComboBox<String> wardTypeComboBox;
    private javax.swing.JLabel wardTypeLabel;
    // End of variables declaration//GEN-END:variables
}
