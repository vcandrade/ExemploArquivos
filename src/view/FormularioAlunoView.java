package view;

import javax.swing.JOptionPane;
import controller.AlunoControl;
import controller.ValidacaoException;
import vo.AlunoVO;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public class FormularioAlunoView extends javax.swing.JFrame {
    
    private BuscaAlunoView buscaAlunoView;

    public FormularioAlunoView(BuscaAlunoView buscaAlunoVisao) {

        initComponents();
        this.setTitle("Cadastro de Aluno");
        this.bEditar.setEnabled(false);
        this.setLocationRelativeTo(null);
        
        this.buscaAlunoView = buscaAlunoVisao;      
    }
    
    public FormularioAlunoView(BuscaAlunoView buscaAlunoView, AlunoVO alunoVO) {

        initComponents();
        this.setTitle("Edição de Registro de Aluno");
        this.bCadastrar.setEnabled(false);
        this.tRA.setEnabled(false);
        this.setLocationRelativeTo(null);
        
        this.buscaAlunoView = buscaAlunoView;
        
        popularCampos(alunoVO);
    }
    
    public void popularCampos(AlunoVO alunoVO) {
        
        this.gettRA().setText(String.valueOf(alunoVO.getRa()));
        this.gettNome().setText(alunoVO.getNome());
        this.getCbCurso().setSelectedItem(alunoVO.getCurso());
        this.getsPeriodo().setValue(alunoVO.getPeriodo());
        this.gettCoeficiente().setText(String.valueOf(alunoVO.getCoeficiente()));
        this.getCbSituacao().setSelectedItem(alunoVO.getSituacao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        cbCurso = new javax.swing.JComboBox<>();
        sPeriodo = new javax.swing.JSpinner();
        cbSituacao = new javax.swing.JComboBox<>();
        tRA = new javax.swing.JFormattedTextField();
        bCancelar = new javax.swing.JButton();
        bCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tCoeficiente = new javax.swing.JTextField();
        bEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluno");

        jLabel1.setText("RA:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Curso:");

        jLabel4.setText("Período:");

        jLabel5.setText("Coeficiente:");

        jLabel6.setText("Situação:");

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacharelado em Ciência da Computação", "Engenharia de Bioprocessos e Biotecnologia", "Engenharia de Produção", "Engenharia Elétrica", "Engenharia Eletrônica", "Engenharia Mecânica", "Engenharia Química", "Licenciatura em Ciências Biológicas", "Tecnologia em Análise e Desenvolvimento de Sistemas", "Tecnologia em Automação Industrial", "Tecnologia em Fabricação Mecânica" }));

        sPeriodo.setValue(1);

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Formado", "Trancado", "Desistente", "Jubilado" }));

        tRA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        tCoeficiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCoeficienteKeyReleased(evt);
            }
        });

        bEditar.setText("Concluir Edição");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tRA, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed

        try {
            
            AlunoControl alunoControl = new AlunoControl();
            alunoControl.cadastrar(this.tRA.getText(), 
                    this.tNome.getText(), 
                    this.cbCurso.getSelectedItem().toString(), 
                    this.sPeriodo.getValue().toString(), 
                    this.tCoeficiente.getText(), 
                    this.cbSituacao.getSelectedItem().toString());
            
            this.buscaAlunoView.buscarAlunos();
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Cadastro Cliente", JOptionPane.WARNING_MESSAGE);
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar o cadastro!", "Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void tCoeficienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCoeficienteKeyReleased

        this.gettCoeficiente().setText(this.gettCoeficiente().getText().replace(',', '.'));

    }//GEN-LAST:event_tCoeficienteKeyReleased

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

        try {
            
            AlunoControl alunoControl = new AlunoControl();
            alunoControl.editar(this.tRA.getText(), 
                    this.tNome.getText(), 
                    this.cbCurso.getSelectedItem().toString(), 
                    this.sPeriodo.getValue().toString(), 
                    this.tCoeficiente.getText(), 
                    this.cbSituacao.getSelectedItem().toString());
            
            this.buscaAlunoView.buscarAlunos();
            
            JOptionPane.showMessageDialog(rootPane, "Edição realizada com sucesso!", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
            
        } catch (ValidacaoException validacaoException) {
            
            JOptionPane.showMessageDialog(rootPane, validacaoException.getMessage(), "Editar Cliente", JOptionPane.WARNING_MESSAGE);
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao efetuar a edição!", "Editar Cliente", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_bEditarActionPerformed

    public javax.swing.JComboBox<String> getCbCurso() {
        return cbCurso;
    }

    public javax.swing.JComboBox<String> getCbSituacao() {
        return cbSituacao;
    }

    public javax.swing.JSpinner getsPeriodo() {
        return sPeriodo;
    }

    public javax.swing.JTextField gettCoeficiente() {
        return tCoeficiente;
    }

    public javax.swing.JTextField gettNome() {
        return tNome;
    }

    public javax.swing.JFormattedTextField gettRA() {
        return tRA;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner sPeriodo;
    private javax.swing.JTextField tCoeficiente;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tRA;
    // End of variables declaration//GEN-END:variables

}
