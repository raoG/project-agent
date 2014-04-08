/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.view;

import com.gaurav.rao.initializer.MapInitializer;
import com.gaurav.rao.map.Location;
import com.gaurav.rao.map.RegionMap;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Gaurav
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    RegionMap rm ; 
    List<JLabel> labels;
    
    
    
    public MainJFrame(){
        initComponents();
        
        rm = new RegionMap();
        labels = new ArrayList<>();
               
        labels.add(lblBarnstable);
        labels.add(lblCambridge);
        labels.add(lblDedham);
        labels.add(lblEdgartown);
        labels.add(lblGreenfield);
        labels.add(lblNantucket);
        labels.add(lblNorthampton);
        labels.add(lblPittsfield);
        labels.add(lblPlymouth);
        labels.add(lblPlymouth);
        labels.add(lblSalem);
        labels.add(lblSpringfield);
        labels.add(lblTaunton);
        labels.add(lblWorcester);
        
        MapInitializer.initRegionMap(rm, labels);
        
        initComboBoxes();
    }
    
    public void initComboBoxes(){
        cmbFrom.removeAllItems();
        
        for(Location l : rm.getLocations())
            cmbFrom.addItem(l);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MonitoringTabbedPanel = new javax.swing.JTabbedPane();
        CreateAgentPanel = new javax.swing.JPanel();
        cmbFrom = new javax.swing.JComboBox();
        cmbTo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        MapViewScrollPane = new javax.swing.JScrollPane();
        MapViewPanel = new javax.swing.JPanel();
        lblWorcester = new javax.swing.JLabel();
        lblNorthampton = new javax.swing.JLabel();
        lblPittsfield = new javax.swing.JLabel();
        lblSpringfield = new javax.swing.JLabel();
        lblSalem = new javax.swing.JLabel();
        lblDedham = new javax.swing.JLabel();
        lblTaunton = new javax.swing.JLabel();
        lblPlymouth = new javax.swing.JLabel();
        lblBarnstable = new javax.swing.JLabel();
        lblNantucket = new javax.swing.JLabel();
        lblEdgartown = new javax.swing.JLabel();
        lblGreenfield = new javax.swing.JLabel();
        lblCambridge = new javax.swing.JLabel();
        map = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateAgentPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFromActionPerformed(evt);
            }
        });

        cmbTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Run");

        javax.swing.GroupLayout CreateAgentPanelLayout = new javax.swing.GroupLayout(CreateAgentPanel);
        CreateAgentPanel.setLayout(CreateAgentPanelLayout);
        CreateAgentPanelLayout.setHorizontalGroup(
            CreateAgentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAgentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateAgentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateAgentPanelLayout.createSequentialGroup()
                        .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        CreateAgentPanelLayout.setVerticalGroup(
            CreateAgentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAgentPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(CreateAgentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MonitoringTabbedPanel.addTab("New Agent ", CreateAgentPanel);

        getContentPane().add(MonitoringTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 450, 140));

        MapViewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MapViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWorcester.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblWorcester.setForeground(new java.awt.Color(102, 102, 102));
        lblWorcester.setText("Worcester");
        MapViewPanel.add(lblWorcester, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 90, 20));

        lblNorthampton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblNorthampton.setForeground(new java.awt.Color(102, 102, 102));
        lblNorthampton.setText("Northampton");
        MapViewPanel.add(lblNorthampton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 90, 20));

        lblPittsfield.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblPittsfield.setForeground(new java.awt.Color(102, 102, 102));
        lblPittsfield.setText("Pittsfield");
        MapViewPanel.add(lblPittsfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, 20));

        lblSpringfield.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblSpringfield.setForeground(new java.awt.Color(102, 102, 102));
        lblSpringfield.setText("Springfield");
        MapViewPanel.add(lblSpringfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 90, 20));

        lblSalem.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblSalem.setForeground(new java.awt.Color(102, 102, 102));
        lblSalem.setText("Salem");
        MapViewPanel.add(lblSalem, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 90, 20));

        lblDedham.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblDedham.setForeground(new java.awt.Color(102, 102, 102));
        lblDedham.setText("Dedham");
        MapViewPanel.add(lblDedham, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 90, 20));

        lblTaunton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblTaunton.setForeground(new java.awt.Color(102, 102, 102));
        lblTaunton.setText("Taunton");
        MapViewPanel.add(lblTaunton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 90, 20));

        lblPlymouth.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblPlymouth.setForeground(new java.awt.Color(102, 102, 102));
        lblPlymouth.setText("Plymouth");
        MapViewPanel.add(lblPlymouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 90, 20));

        lblBarnstable.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblBarnstable.setForeground(new java.awt.Color(102, 102, 102));
        lblBarnstable.setText("Barnstable");
        MapViewPanel.add(lblBarnstable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 90, 20));

        lblNantucket.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblNantucket.setForeground(new java.awt.Color(102, 102, 102));
        lblNantucket.setText("Nantucket");
        MapViewPanel.add(lblNantucket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 590, 70, 20));

        lblEdgartown.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblEdgartown.setForeground(new java.awt.Color(102, 102, 102));
        lblEdgartown.setText("Edgartown");
        MapViewPanel.add(lblEdgartown, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 90, 20));

        lblGreenfield.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblGreenfield.setForeground(new java.awt.Color(102, 102, 102));
        lblGreenfield.setText("Greenfield");
        MapViewPanel.add(lblGreenfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 20));

        lblCambridge.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lblCambridge.setForeground(new java.awt.Color(102, 102, 102));
        lblCambridge.setText("Cambridge");
        MapViewPanel.add(lblCambridge, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 90, 20));

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/map/massachusetts-county-map.png"))); // NOI18N
        map.setText("  ");
        MapViewPanel.add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1130, 640));

        MapViewScrollPane.setViewportView(MapViewPanel);

        getContentPane().add(MapViewScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1150, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFromActionPerformed
        
        if(cmbFrom == null){
            return;
        }
        Location from = (Location) cmbFrom.getSelectedItem();
        
        cmbTo.removeAllItems();
        for(Location l : rm.getLocations())
            cmbTo.addItem(l);
        cmbTo.removeItem(from);
        
    }//GEN-LAST:event_cmbFromActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateAgentPanel;
    private javax.swing.JPanel MapViewPanel;
    private javax.swing.JScrollPane MapViewScrollPane;
    private javax.swing.JTabbedPane MonitoringTabbedPanel;
    private javax.swing.JComboBox cmbFrom;
    private javax.swing.JComboBox cmbTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBarnstable;
    private javax.swing.JLabel lblCambridge;
    private javax.swing.JLabel lblDedham;
    private javax.swing.JLabel lblEdgartown;
    private javax.swing.JLabel lblGreenfield;
    private javax.swing.JLabel lblNantucket;
    private javax.swing.JLabel lblNorthampton;
    private javax.swing.JLabel lblPittsfield;
    private javax.swing.JLabel lblPlymouth;
    private javax.swing.JLabel lblSalem;
    private javax.swing.JLabel lblSpringfield;
    private javax.swing.JLabel lblTaunton;
    private javax.swing.JLabel lblWorcester;
    private javax.swing.JLabel map;
    // End of variables declaration//GEN-END:variables
}
