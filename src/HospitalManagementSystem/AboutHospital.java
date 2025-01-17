/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HospitalManagementSystem;

/**
 *
 * @author Software Engineers
 */
public class AboutHospital extends javax.swing.JFrame {

    /**
     * Creates new form AboutHospital
     */
    public AboutHospital() {
        initComponents();
        aboutTextArea.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(4665, 3468));

        closeButton.setBackground(new java.awt.Color(255, 0, 51));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        aboutTextArea.setBackground(new java.awt.Color(255, 204, 255));
        aboutTextArea.setColumns(20);
        aboutTextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aboutTextArea.setRows(5);
        aboutTextArea.setText("Welcome to [Hospital Name], a beacon of excellence in healthcare where compassion meets innovation.\n\nFor over [X years], we have been dedicated to providing comprehensive and high-quality medical services tailored to meet the diverse needs of our community.\n\nAt [Hospital Name], we believe in a patient-centric approach that combines advanced medical technology with a warm, personal touch. Our team of highly skilled \nphysicians, nurses, and healthcare professionals work tirelessly to ensure the well-being and comfort of each patient. From preventive care and routine checkups to \nspecialized treatments and complex surgeries, \n\nour facilities are equipped to handle a broad range of medical conditions with precision and care.\n\nWe take pride in fostering a healing environment that prioritizes safety, dignity, and respect. Our state-of-the-art infrastructure and commitment to continuous \nimprovement empower us to stay at the forefront of medical advancements. Moreover, we offer a variety of supportive services including counseling, rehabilitation, \nand patient education to guide you every step of the way on your path to recovery.\n\nWhether you are visiting us for a short appointment or an extended stay, [Hospital Name] is devoted to making your experience as comfortable and reassuring as possible. \nThank you for trusting us with your health. \n\nYour well-being is our highest priority.\n\n");
        jScrollPane1.setViewportView(aboutTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);    
        new Home().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutTextArea;
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
