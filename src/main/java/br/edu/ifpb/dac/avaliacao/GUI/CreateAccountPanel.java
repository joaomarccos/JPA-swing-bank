/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.avaliacao.GUI;

import br.edu.ifpb.dac.avaliacao.daojpa.Dao;
import br.edu.ifpb.dac.avaliacao.daojpa.DaoFactory;
import br.edu.ifpb.dac.avaliacao.q6.entidades.Cliente;
import br.edu.ifpb.dac.avaliacao.q6.entidades.Conta;
import br.edu.ifpb.dac.avaliacao.q6.entidades.ContaCorrente;
import br.edu.ifpb.dac.avaliacao.q6.entidades.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class CreateAccountPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;

    /**
     * Creates new form CriarContaPanel
     */
    public CreateAccountPanel() {
        initComponents();
    }

    public CreateAccountPanel(MainFrame mainFrame) {
        this();
        this.mainFrame = mainFrame;
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoConta = new javax.swing.ButtonGroup();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCriarConta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonPoupanca = new javax.swing.JRadioButton();
        jRadioButtonCorrente = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jPasswordFieldConta = new javax.swing.JPasswordField();

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Banco DAC");

        jLabel2.setText("Usuario");

        jLabel3.setText("Senha");

        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel6.setText("RG");

        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGActionPerformed(evt);
            }
        });

        jLabel7.setText("Criar Conta");

        jLabel8.setText("Tipo de conta:");

        TipoConta.add(jRadioButtonPoupanca);
        jRadioButtonPoupanca.setSelected(true);
        jRadioButtonPoupanca.setText("Poupança");
        jRadioButtonPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPoupancaActionPerformed(evt);
            }
        });

        TipoConta.add(jRadioButtonCorrente);
        jRadioButtonCorrente.setText("Corrente");
        jRadioButtonCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCorrenteActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Senha da Conta (Senha usada em transaçoes)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 20, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(jPasswordFieldLogin))))
                            .addComponent(jPasswordFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(12, 82, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonPoupanca)
                                            .addComponent(jRadioButtonCorrente))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonCriarConta)
                                        .addContainerGap())))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7))
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButtonPoupanca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCorrente)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCriarConta)
                    .addComponent(jPasswordFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGActionPerformed

    private void jRadioButtonPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPoupancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPoupancaActionPerformed

    private void jRadioButtonCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCorrenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCorrenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.mainFrame.setContentPane(new LoginPanel(mainFrame));
        this.mainFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        if (!jTextFieldNome.getText().isEmpty() && !jTextFieldCPF.getText().isEmpty()
                && !jPasswordFieldLogin.getText().isEmpty() && !jTextFieldRG.getText().isEmpty()
                && !jTextFieldUserName.getText().isEmpty() && !jPasswordFieldConta.getText().isEmpty()){
                        
            Cliente novoCliente = new Cliente(jTextFieldNome.getText(), jTextFieldCPF.getText(), jTextFieldRG.getText(), jTextFieldUserName.getText(), new String(jPasswordFieldLogin.getPassword()));
            
            Conta conta;
            if(jRadioButtonPoupanca.isSelected())
                conta = new ContaPoupanca(new String(jPasswordFieldConta.getPassword()));
            else
                conta = new ContaCorrente(new String(jPasswordFieldConta.getPassword()));
            
            novoCliente.setConta(conta);
            
            Dao<Cliente> daoCliente = DaoFactory.createDaoJpa();
            daoCliente.salvar(novoCliente);            
            
            JOptionPane.showMessageDialog(mainFrame, "Sua conta foi criada com sucesso!");
            this.mainFrame.setContentPane(new LoginPanel(mainFrame));
            this.mainFrame.setVisible(true);
            
        }
    }//GEN-LAST:event_jButtonCriarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldConta;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JRadioButton jRadioButtonCorrente;
    private javax.swing.JRadioButton jRadioButtonPoupanca;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
