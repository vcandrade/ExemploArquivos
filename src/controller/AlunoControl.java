package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import dao.AlunoDAO;
import vo.AlunoVO;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */
public class AlunoControl implements CrudControl {

    public AlunoControl() {

    }

    public void cadastrar(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException, SQLException, Exception {

        this.validarCamposObrigatorios(ra, nome, curso, periodo, coeficiente, situacao);

        AlunoVO alunoVO = new AlunoVO();

        alunoVO.setRa(Integer.parseInt(ra));
        alunoVO.setNome(nome);
        alunoVO.setCurso(curso);
        alunoVO.setPeriodo(Integer.parseInt(periodo));
        alunoVO.setCoeficiente(Double.parseDouble(coeficiente));
        alunoVO.setSituacao(situacao);

        AlunoDAO alunoDao = new AlunoDAO(alunoVO);
        alunoDao.cadastrar();
    }

    @Override
    public ArrayList<AlunoVO> buscar() throws SQLException, Exception {

        AlunoDAO alunoDao = new AlunoDAO();
        return alunoDao.buscar();
    }

    public void editar(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException, SQLException, Exception {

        this.validarCamposObrigatorios(ra, nome, curso, periodo, coeficiente, situacao);

        AlunoVO alunoVO = new AlunoVO();

        alunoVO.setRa(Integer.parseInt(ra));
        alunoVO.setNome(nome);
        alunoVO.setCurso(curso);
        alunoVO.setPeriodo(Integer.parseInt(periodo));
        alunoVO.setCoeficiente(Double.parseDouble(coeficiente));
        alunoVO.setSituacao(situacao);
        
        ArrayList<AlunoVO> alunos = this.buscar();
        
        for(int i = 0; i < alunos.size(); i++) {
            
            AlunoVO aluno = alunos.get(i);
            
            if(aluno.getRa() == alunoVO.getRa()) {
                
                alunos.remove(i);
                alunos.add(alunoVO);
            }
        }
        
        AlunoDAO alunoPers = new AlunoDAO(alunos);
        alunoPers.editar();
    }

    public void excluir(String ra) throws SQLException, Exception {

        ArrayList<AlunoVO> alunos = this.buscar();
        
        for(int i = 0; i < alunos.size(); i++) {
            
            AlunoVO alunoVO = alunos.get(i);
            
            if(Integer.parseInt(ra) == alunoVO.getRa()) {
                
                alunos.remove(i);
            }
        }
        
        AlunoDAO alunoPers = new AlunoDAO(alunos);
        alunoPers.excluir();
    }

    private void validarCamposObrigatorios(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException {

        if (ra.equals("")) {

            throw new ValidacaoException("Campo RA é obrigatório.");

        } else if (nome.equals("")) {

            throw new ValidacaoException(("Campo Nome é obrigatório."));

        } else if (Integer.parseInt(periodo) <= 0) {

            throw new ValidacaoException("O Período deve ser um número maior ou igual a 1.");

        } else if (coeficiente.equals("")) {

            throw new ValidacaoException("Campo Coeficiente é obrigatório.");

        } else if (Double.parseDouble(coeficiente) < 0.0 || Double.parseDouble(coeficiente) > 1.0) {

            throw new ValidacaoException("Campo Coeficiente deve ser preenchudo com um valor entre 0,0 e 1,0.");
        }
    }
}
