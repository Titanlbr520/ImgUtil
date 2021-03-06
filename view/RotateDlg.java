/**
 * @author Titanlbr520
 * @function 旋转
 */
package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateDlg extends javax.swing.JDialog {

    public RotateDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {
        angleSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        angleEdit = new javax.swing.JTextField();
        resizeBox = new javax.swing.JCheckBox();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gridBagConstraints1;

        angleSlider.setMaximum(360);
        angleSlider.setMinimum(-360);
        angleSlider.setValue(0);
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 0;
        gridBagConstraints1.gridwidth = 2;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints1.insets = new java.awt.Insets(15, 10, 15, 1);
        getContentPane().add(angleSlider, gridBagConstraints1);
        angleSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                angleChanged(evt);
            }
        });

        jLabel1.setText("旋转角度");
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.insets = new java.awt.Insets(3, 20, 3, 20);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel1, gridBagConstraints1);

        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 1;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.ipadx = 80;
        gridBagConstraints1.insets = new java.awt.Insets(3, 20, 3, 20);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(angleEdit, gridBagConstraints1);

        resizeBox.setSelected(true);
        resizeBox.setText("Resize");
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 2;
        gridBagConstraints1.gridwidth = 2;
        gridBagConstraints1.insets = new java.awt.Insets(3, 20, 10, 20);
        gridBagConstraints1.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(resizeBox, gridBagConstraints1);

        okBtn.setText("确定(O)");
        okBtn.setMnemonic('O');
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 2;
        gridBagConstraints1.gridy = 0;
        gridBagConstraints1.insets = new java.awt.Insets(10, 10, 1, 20);
        getContentPane().add(okBtn, gridBagConstraints1);
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                okPerformed(e);
            }
        });

        cancelBtn.setText("取消(C)");
        cancelBtn.setMnemonic('C');
        gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 2;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.insets = new java.awt.Insets(1, 10, 1, 20);
        getContentPane().add(cancelBtn, gridBagConstraints1);
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelPerformed(e);
            }
        });

        pack();
        angleEdit.setText("0");
    }

    private void okPerformed(java.awt.event.ActionEvent evt) {
        modResult = JOptionPane.OK_OPTION;
        dispose();
    }

    private void cancelPerformed(java.awt.event.ActionEvent evt) {
        modResult = JOptionPane.CANCEL_OPTION;
        dispose();
    }

    private void angleChanged(javax.swing.event.ChangeEvent evt) {
        angleEdit.setText(String.valueOf(angleSlider.getValue()));
    }

    public int showModal() {
        show();
        return modResult;
    }


    public float getAngle() {
        return (float) (angleSlider.getValue() * Math.PI / 180);
    }

    public boolean getIsResize() {
        return resizeBox.isSelected();
    }


    private javax.swing.JSlider    angleSlider;
    private javax.swing.JLabel     jLabel1;
    private javax.swing.JTextField angleEdit;
    private javax.swing.JButton    okBtn;
    private javax.swing.JButton    cancelBtn;
    private javax.swing.JCheckBox  resizeBox;

    private int modResult = JOptionPane.CANCEL_OPTION;
}
