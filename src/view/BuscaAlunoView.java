package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.AlunoControl;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import vo.AlunoVO;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */
public class BuscaAlunoView extends javax.swing.JFrame {

    public BuscaAlunoView() {

        initComponents();
        this.setLocationRelativeTo(null);

        this.popularTabelaAlunos();
    }

    public void popularTabelaAlunos() {

        try {

            DefaultTableModel dtmAluno = (DefaultTableModel) tAlunos.getModel();
            dtmAluno.fireTableDataChanged();
            dtmAluno.setRowCount(0);

            AlunoControl alunoControl = new AlunoControl();
            ArrayList<AlunoVO> alunos = alunoControl.buscar();

            for (AlunoVO alunoVO : alunos) {

                dtmAluno.addRow(new Object[]{alunoVO.getRa(), alunoVO.getNome(), alunoVO.getCurso(), alunoVO.getPeriodo(), alunoVO.getCoeficiente(), alunoVO.getSituacao()});// adiciona na jtbale
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro de comunicação com o Banco de Dados.", "Bucsar Alunos", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela.", "Bucsar Alunos", JOptionPane.ERROR_MESSAGE);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlunos = new javax.swing.JTable();
        bNovo = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGerarRelatorio = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alunos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(153, 153, 153))); // NOI18N

        tAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Nome", "Curso", "Período", "Coeficiente", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tAlunos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        menuGerarRelatorio.setText("Gerar Relatório");
        menuGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerarRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(menuGerarRelatorio);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenu2.add(menuSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(bExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed

        FormularioAlunoView formularioAlunoVisao = new FormularioAlunoView(this);
        formularioAlunoVisao.setVisible(true);

    }//GEN-LAST:event_bNovoActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

        try {

            AlunoVO alunoVO = new AlunoVO();

            alunoVO.setRa(Integer.parseInt(this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 0).toString()));
            alunoVO.setNome((String) this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 1));
            alunoVO.setCurso((String) this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 2));
            alunoVO.setPeriodo(Integer.parseInt(this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 3).toString()));
            alunoVO.setCoeficiente(Double.parseDouble(this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 4).toString()));
            alunoVO.setSituacao((String) this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 5));

            FormularioAlunoView formularioAlunoVisao = new FormularioAlunoView(this, alunoVO);
            formularioAlunoVisao.setVisible(true);

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(rootPane, "Selecione um registro na tabela", "Edição de Registro", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bEditarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed

        try {

            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir permanentemente o aluno " + this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 1).toString() + "?", "Exclusão de Registro", JOptionPane.YES_NO_CANCEL_OPTION);

            if (confirmacao == 0) {

                AlunoControl alunoControl = new AlunoControl();
                alunoControl.excluir(this.tAlunos.getValueAt(this.tAlunos.getSelectedRow(), 0).toString());

                JOptionPane.showMessageDialog(rootPane, "Registro excluído com sucesso!", "Exclusão de Registro", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(rootPane, "Selecione um registro na tabela", "Exclusão de Registro", JOptionPane.WARNING_MESSAGE);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir o registro!", "Exclusão de Registro", JOptionPane.ERROR_MESSAGE);

        } finally {

            this.popularTabelaAlunos();
        }

    }//GEN-LAST:event_bExcluirActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed

        this.dispose();

    }//GEN-LAST:event_bFecharActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed

        Sobre sobre = new Sobre();
        sobre.setVisible(true);

    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerarRelatorioActionPerformed

        try {

            int confirmacao = 0;
            String extensao = "";
            JFileChooser jFileChooser = new JFileChooser();

            FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Documento de texto (*.txt)", "txt");
            FileNameExtensionFilter filtroDoc = new FileNameExtensionFilter("Documento do word (*.doc)", "txt");
            FileNameExtensionFilter filtroXls = new FileNameExtensionFilter("Pasta de Trabalho do Excel (*.xls)", "txt");

            jFileChooser.setFileFilter(filtroDoc);
            jFileChooser.setFileFilter(filtroXls);
            jFileChooser.setFileFilter(filtroTxt);

            int valorRetorno = jFileChooser.showSaveDialog(null);

            if (valorRetorno == JFileChooser.APPROVE_OPTION) {

                if (jFileChooser.getFileFilter().getDescription().equals("Documento de texto (*.txt)")) {

                    extensao = ".txt";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Documento do word (*.doc)")) {

                    extensao = ".doc";

                } else if (jFileChooser.getFileFilter().getDescription().equals("Pasta de Trabalho do Excel (*.xls)")) {

                    extensao = ".xls";

                }

                String nomeArquivo = jFileChooser.getSelectedFile().getAbsolutePath() + extensao;

                AlunoControl alunoControl = new AlunoControl();
                boolean arquivoExiste = alunoControl.verificarExistencia(nomeArquivo);

                if (arquivoExiste) {

                    confirmacao = JOptionPane.showConfirmDialog(null, jFileChooser.getSelectedFile().getName() + " já existe.\nDeseja substituí-lo?", "Confirmar Salvar Arquivo", JOptionPane.YES_NO_OPTION);
                }

                if (confirmacao == 0) {

                    alunoControl.gerarRelatorio(nomeArquivo);
                    JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!", "Gerar Relatório", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (IOException ioe) {

            JOptionPane.showMessageDialog(null, "Erro: " + ioe.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (SQLException sqle) {

            JOptionPane.showMessageDialog(null, "Erro: " + sqle.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_menuGerarRelatorioActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed

        this.dispose();

    }//GEN-LAST:event_menuSairActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bNovo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuGerarRelatorio;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JTable tAlunos;
    // End of variables declaration//GEN-END:variables
}
