/**
 * Copyright (C) 2013 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingml.sensgui.desktop;

import org.thingml.sensgui.adapters.SensGUIAdapter;

public class SensorPanel extends javax.swing.JPanel {

    protected SensGUIAdapter sensor;

    public SensGUIAdapter getSensor() {
        return sensor;
    }
    
    public SensorPanel(SensGUIAdapter sensor) {
        this.sensor = sensor;
        initComponents();
        jLabelSensorName.setText(sensor.getSensorName());
    }

    public void refresh() {
        if (! sensor.isConnected()) {
            jButtonDisconnect.setEnabled(false);
            jButtonGUI.setEnabled(false);
        }
        if (sensor != null) jLabelSensorName.setText(sensor.getSensorName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDisconnect = new javax.swing.JButton();
        jLabelSensorName = new javax.swing.JLabel();
        jButtonGUI = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(32767, 60));
        setMinimumSize(new java.awt.Dimension(200, 60));
        setPreferredSize(new java.awt.Dimension(487, 60));

        jButtonDisconnect.setText("Disconnect");
        jButtonDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectActionPerformed(evt);
            }
        });

        jLabelSensorName.setText("Sensor Name");

        jButtonGUI.setText("Open GUI...");
        jButtonGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSensorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jButtonGUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDisconnect)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSensorName)
                    .addComponent(jButtonGUI)
                    .addComponent(jButtonDisconnect))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGUIActionPerformed
        jLabelSensorName.setText(sensor.getSensorName());
        sensor.showgui();
    }//GEN-LAST:event_jButtonGUIActionPerformed

    public void do_disconnect() {
        if (sensor.isConnected()) sensor.disconnect();
        jButtonDisconnect.setEnabled(false);
        jButtonGUI.setEnabled(false);
    }
    
    private void jButtonDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisconnectActionPerformed
        do_disconnect();
    }//GEN-LAST:event_jButtonDisconnectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDisconnect;
    private javax.swing.JButton jButtonGUI;
    private javax.swing.JLabel jLabelSensorName;
    // End of variables declaration//GEN-END:variables
}
