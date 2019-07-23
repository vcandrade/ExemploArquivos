package br.edu.utfpr.app.service;

import br.edu.utfpr.app.dao.AlunoDAO;
import br.edu.utfpr.app.entity.Aluno;
import br.edu.utfpr.app.exception.ValidacaoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */
public class AlunoService implements CrudService {

    public AlunoService() {

    }

    public void cadastrar(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException, IOException, SQLException, Exception {

        this.validarCamposObrigatorios(ra, nome, curso, periodo, coeficiente, situacao);

        Aluno aluno = new Aluno();

        aluno.setRa(Integer.parseInt(ra));
        aluno.setNome(nome);
        aluno.setCurso(curso);
        aluno.setPeriodo(Integer.parseInt(periodo));
        aluno.setCoeficiente(Double.parseDouble(coeficiente));
        aluno.setSituacao(situacao);

        AlunoDAO alunoDao = new AlunoDAO(aluno);
        alunoDao.cadastrar();
    }

    @Override
    public ArrayList<Aluno> buscar() throws IOException, SQLException, Exception {

        AlunoDAO alunoDao = new AlunoDAO();
        return alunoDao.buscar();
    }

    public ArrayList<Aluno> buscarAluno(String nome) throws IOException, SQLException, Exception {

        AlunoDAO alunoDao = new AlunoDAO();
        ArrayList<Aluno> alunos = alunoDao.buscar();
        
        ArrayList<Aluno> alunosFiltrados = new ArrayList<>();
        
        for (Aluno aluno : alunos) {
            
            if(aluno.getNome().contains(nome)){
                
                alunosFiltrados.add(aluno);
            }
        }
        return alunosFiltrados;
    }

    public void editar(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException, IOException, SQLException, Exception {

        this.validarCamposObrigatorios(ra, nome, curso, periodo, coeficiente, situacao);

        Aluno aluno = new Aluno();

        aluno.setRa(Integer.parseInt(ra));
        aluno.setNome(nome);
        aluno.setCurso(curso);
        aluno.setPeriodo(Integer.parseInt(periodo));
        aluno.setCoeficiente(Double.parseDouble(coeficiente));
        aluno.setSituacao(situacao);

        ArrayList<Aluno> alunos = this.buscar();

        for (int i = 0; i < alunos.size(); i++) {

            Aluno novoAluno = alunos.get(i);

            if (novoAluno.getRa() == aluno.getRa()) {

                alunos.remove(i);
                alunos.add(aluno);
            }
        }

        AlunoDAO alunoDAO = new AlunoDAO(alunos);
        alunoDAO.editar();
    }

    public void excluir(String ra) throws IOException, SQLException, Exception {

        ArrayList<Aluno> alunos = this.buscar();

        for (int i = 0; i < alunos.size(); i++) {

            Aluno aluno = alunos.get(i);

            if (Integer.parseInt(ra) == aluno.getRa()) {

                alunos.remove(i);
            }
        }

        AlunoDAO alunoDAO = new AlunoDAO(alunos);
        alunoDAO.excluir();
    }

    public boolean verificarExistencia(String nomeArquivo) throws IOException, SQLException, Exception {

        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.verificarExistencia(nomeArquivo);
    }

    public void gerarRelatorio(String nomeArquivo) throws IOException, SQLException, Exception {

        ArrayList<Aluno> alunos = this.buscar();

        AlunoDAO alunoDAO = new AlunoDAO(alunos);
        alunoDAO.gerarRelatorio(nomeArquivo);
    }

    private void validarCamposObrigatorios(String ra, String nome, String curso, String periodo, String coeficiente, String situacao) throws ValidacaoException {

        if (ra.isEmpty()) {

            throw new ValidacaoException("Campo RA é obrigatório.");

        } else if (nome.isEmpty()) {

            throw new ValidacaoException(("Campo Nome é obrigatório."));

        } else if (Integer.parseInt(periodo) <= 0) {

            throw new ValidacaoException("O Período deve ser um número maior ou igual a 1.");

        } else if (coeficiente.isEmpty()) {

            throw new ValidacaoException("Campo Coeficiente é obrigatório.");

        } else if (Double.parseDouble(coeficiente) < 0.0 || Double.parseDouble(coeficiente) > 1.0) {

            throw new ValidacaoException("Campo Coeficiente deve ser preenchudo com um valor entre 0,0 e 1,0.");
        }
    }
}
