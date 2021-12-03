package Calculadora;

import java.awt.Color;
import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author vicente
 */
public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtoperacion = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        btnoscuro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnresultado = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnpotencia = new javax.swing.JButton();
        btnporciento = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtoperacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtoperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtoperacion.setName(" "); // NOI18N
        jPanel1.add(txtoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 40));
        txtoperacion.getAccessibleContext().setAccessibleDescription("");

        txtresultado.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtresultado.setToolTipText("");
        jPanel1.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 70));

        btnoscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
        btnoscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoscuroActionPerformed(evt);
            }
        });
        jPanel1.add(btnoscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_minimize.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 10, 10));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnresultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnresultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btnresultado.setText("=");
        btnresultado.setFocusPainted(false);
        btnresultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnresultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnresultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btnpotencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnpotencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnpotencia.setText("<-");
        btnpotencia.setFocusPainted(false);
        btnpotencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpotencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnpotencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnpotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnporciento.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        btnporciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnporciento.setText("%");
        btnporciento.setFocusPainted(false);
        btnporciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnporciento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnporciento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnporciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporcientoActionPerformed(evt);
            }
        });
        jPanel2.add(btnporciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btndivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btndivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btndivision.setText("/");
        btndivision.setFocusPainted(false);
        btndivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btndivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btndivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btnX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnX.setText("X");
        btnX.setFocusPainted(false);
        btnX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnX.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel2.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btnmenos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnmenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnmenos.setText("-");
        btnmenos.setFocusPainted(false);
        btnmenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnmenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });
        jPanel2.add(btnmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btnmas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnmas.setText("+");
        btnmas.setFocusPainted(false);
        btnmas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnmas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        jPanel2.add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btnpunto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnpunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnpunto.setText(".");
        btnpunto.setFocusPainted(false);
        btnpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnpunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultadoActionPerformed
     try{
        String resultado = se.eval(txtoperacion.getText()).toString();
        txtresultado.setText(resultado);
     }catch (ScriptException e){
         //btnC.doClick();
     }    
    }//GEN-LAST:event_btnresultadoActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
      agregarNumero("/");
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        agregarNumero("*");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
      agregarNumero("-");
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
    agregarNumero("+");
    }//GEN-LAST:event_btnmasActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtoperacion.setText("");
        txtresultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        agregarNumero("7");
        btnresultado.doClick();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        agregarNumero("8");
        btnresultado.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       agregarNumero("9");
       btnresultado.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        agregarNumero("4");
        btnresultado.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       agregarNumero("5");
       btnresultado.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       agregarNumero("6");
       btnresultado.doClick();
    }//GEN-LAST:event_btn6ActionPerformed
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       agregarNumero("1");
       btnresultado.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       agregarNumero("2");
       btnresultado.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       agregarNumero("3");
       btnresultado.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       agregarNumero("0");
       btnresultado.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotenciaActionPerformed
       String texto = txtoperacion.getText().substring(0,txtoperacion.getText().length()-1);
       txtoperacion.setText(texto);
       btnresultado.doClick();
    }//GEN-LAST:event_btnpotenciaActionPerformed

    private void btnporcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporcientoActionPerformed
       agregarNumero("%");
    }//GEN-LAST:event_btnporcientoActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        agregarNumero(".");
        btnresultado.doClick();
    }//GEN-LAST:event_btnpuntoActionPerformed

    boolean modoOscuro = false;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnoscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoscuroActionPerformed
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#152740"));
            jPanel2.setBackground(Color.decode("#243651"));
            //cambio de color de botones
            cambiarbtn(btn0);
            cambiarbtn(btn1);
            cambiarbtn(btn2);
            cambiarbtn(btn3);
            cambiarbtn(btn4);
            cambiarbtn(btn5);
            cambiarbtn(btn6);
            cambiarbtn(btn7);
            cambiarbtn(btn8);
            cambiarbtn(btn9);
            cambiarbtn(btnpunto);
            //btnoperadores
            cambiarbtn1(btnC);
            cambiarbtn1(btnX);
            cambiarbtn1(btndivision);
            cambiarbtn1(btnmas);
            cambiarbtn1(btnmenos);
            cambiarbtn1(btnporciento);
            cambiarbtn1(btnpotencia);
            //btnresultado
            btnresultado.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btnresultado.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btnresultado.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png")));
            btnresultado.setForeground(Color.decode("#2c294a"));
            //btnmodooscuro
            btnoscuro.setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
            //txtfond
            txtoperacion.setForeground(Color.decode("#00b988"));
            txtresultado.setForeground(Color.decode("#00b988"));
            modoOscuro=true;
        }
        else{
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnoscuroActionPerformed
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarbtn(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#a3beaf"));
    }
    public void cambiarbtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#a3beaf"));
    }
    
    
    public void agregarNumero(String digito){
        txtoperacion.setText(txtoperacion.getText() +digito);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnoscuro;
    private javax.swing.JButton btnporciento;
    private javax.swing.JButton btnpotencia;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresultado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtoperacion;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables
}
