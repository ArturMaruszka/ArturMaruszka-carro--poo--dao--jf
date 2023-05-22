/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;
import servicos.PessoaServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182120013
 */
public class JFPessoa extends javax.swing.JFrame {

    /**
     * Creates new form JFPessoa
     */
    public JFPessoa() {
        initComponents();
        jbDeletar.setVisible(false);
        this.setLocationRelativeTo(null);
        addRowToTable();
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtPessoas.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        for (Pessoa pessoa : pessoaS.getPessoas()) {
            rowData[0] = pessoa.getCpf();
            rowData[1] = pessoa.getNome();
            rowData[2] = pessoa.getTelefone();
            rowData[3] = pessoa.getEndereco();
            model.addRow(rowData);
        }
    }

    public boolean validInputs() {
        if (jtfCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo CPF obrigatório!");
            jtfCPF.requestFocus();
            return false;
        } else if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Nome obrigatório!");
            jtfNome.requestFocus();
            return false;
        } else if (jtffEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Endereco obrigatório!");
            jtffEndereco.requestFocus();
            return false;
        } else if (jftfTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo Telefone obrigatório!");
            jftfTelefone.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jtffEndereco = new javax.swing.JTextField();
        jbFechar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPessoas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Gerencia Pessoa");

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("*Gerencia Pessoa*");

        jLabel2.setText("*Nome:");
        jLabel2.setToolTipText("");

        jLabel3.setText("cpf:");

        jtfCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCPFFocusLost(evt);
            }
        });
        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });
        jtfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCPFKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefone");

        try {
            jftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Endereço: ");

        jtffEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtffEnderecoActionPerformed(evt);
            }
        });

        jbFechar.setText("Exit");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jtPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Endereco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPessoas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbDeletar)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpar)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNome)
                                    .addComponent(jtfCPF)
                                    .addComponent(jftfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jtffEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jbFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(767, 767, 767)
                .addComponent(jSeparator1))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtffEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbFechar)
                            .addComponent(jbLimpar)
                            .addComponent(jbSalvar)
                            .addComponent(jbEditar)
                            .addComponent(jbDeletar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed

    private void jtffEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtffEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtffEnderecoActionPerformed

    private void jtPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPessoasMouseClicked
        // TODO add your handling code here:
        jbDeletar.setVisible(true);
        jbEditar.setEnabled(true);
    }//GEN-LAST:event_jtPessoasMouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        jbDeletar.setVisible(false);
        jbSalvar.setText("Confirmar");
        jbLimpar.setText("Cancelar");
        jtfCPF.setEnabled(false);
        int linha = jtPessoas.getSelectedRow();
        String cpf = (String) jtPessoas.getValueAt(linha, 0);
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        Pessoa p = pessoaS.getPessoaByDoc(cpf);
        jtfNome.setText(p.getNome());
        jtfCPF.setText(p.getCpf());
        jftfTelefone.setText(p.getTelefone());
        jtffEndereco.setText(p.getEndereco());
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        if (jbLimpar.getText().equals("Limpar")) {
            limparCampos();

        } else {
            jbEditar.setEnabled(false);
            jbLimpar.setText("Limpar");
            limparCampos();
        }
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        int linha = jtPessoas.getSelectedRow();
        String cpf = (String) jtPessoas.getValueAt(linha, 0);
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        String nome = pessoaS.getPessoaByDoc(cpf).getNome();
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja realmente deletar " + nome, "Deletar Pessoa", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG[0]);
        if(resp == 0){
            pessoaS.deletarPessoa(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Cadastro removido");
        }else{
            JOptionPane.showMessageDialog(this, "Operação cancelada pelo usuário");
        }jbLimpar.doClick();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        if (validInputs()) {
            String cpf = jtfCPF.getText().toUpperCase();
            String nome = jtfNome.getText().toUpperCase();
            String endereco = jtffEndereco.getText().toUpperCase();
            String telefone = jftfTelefone.getText().toUpperCase();
            PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
            Pessoa p = new Pessoa(0, nome, cpf, endereco, telefone);
            if (jbSalvar.getText().equals("Salvar")) {
                pessoaS.cadastroPessoa(p);
            } else {
                pessoaS.atualizarPessoa(p);
            }
            addRowToTable();
            limparCampos();

        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCPFFocusLost
        // TODO add your handling code here:
        PessoaServicos pessoaS = ServicosFactory.getPessoaServicos();
        if (pessoaS.getPessoaByDoc(jtfCPF.getText()).getCpf() != null) {
            JOptionPane.showMessageDialog(this, "CPF já cadastrado!");
            jtfCPF.setText("");
            jtfCPF.requestFocus();
        }
    }//GEN-LAST:event_jtfCPFFocusLost

    private void jtfCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCPFKeyTyped
        // TODO add your handling code here:
        String num = "0123456789";
        if (!num.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCPFKeyTyped
    public void limparCampos() {
        jtfNome.setText("");
        jtfCPF.setText("");
        jtffEndereco.setText("");
        jftfTelefone.setText("");
    }

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
            java.util.logging.Logger.getLogger(JFPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JTable jtPessoas;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtffEndereco;
    // End of variables declaration//GEN-END:variables
}
