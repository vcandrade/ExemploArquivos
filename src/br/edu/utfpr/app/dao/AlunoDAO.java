package br.edu.utfpr.app.dao;

import br.edu.utfpr.app.entity.Aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */
public class AlunoDAO implements CrudDAO {

    private File arquivo;
    private Aluno aluno;
    private ArrayList<Aluno> alunos;

    public AlunoDAO() {

        arquivo = new File("");
    }

    public AlunoDAO(Aluno aluno) {

        arquivo = new File("");
        this.aluno = aluno;
    }

    public AlunoDAO(ArrayList<Aluno> alunos) {

        arquivo = new File("");
        this.alunos = alunos;
    }

    @Override
    public void cadastrar() throws IOException, SQLException, Exception {

        String linha;

        BufferedWriter documento = new BufferedWriter(new FileWriter(arquivo.getAbsolutePath() + "\\data\\Alunos.xls", true));

        String texto = aluno.getRa() + "\t" + aluno.getNome() + "\t" + aluno.getCurso() + "\t" + aluno.getPeriodo() + "\t" + aluno.getCoeficiente() + "\t" + aluno.getSituacao();
        StringTokenizer st = new StringTokenizer(texto, "\n");

        while (st.hasMoreTokens()) {

            linha = st.nextToken();

            documento.write(linha);
            documento.newLine();
        }

        documento.close();
    }

    @Override
    public ArrayList<Aluno> buscar() throws IOException, SQLException, Exception {

        ArrayList<Aluno> arrayAlunos = new ArrayList<>();

        BufferedReader documento = new BufferedReader(new FileReader(arquivo.getAbsolutePath() + "\\data\\Alunos.xls"));

        String linha = documento.readLine();

        while (linha != null) {

            String[] alunoSplit = linha.split("\t");

            Aluno novoAluno = new Aluno();

            novoAluno.setRa(Integer.parseInt(alunoSplit[0]));
            novoAluno.setNome(alunoSplit[1]);
            novoAluno.setCurso(alunoSplit[2]);
            novoAluno.setPeriodo(Integer.parseInt(alunoSplit[3]));
            novoAluno.setCoeficiente(Double.parseDouble(alunoSplit[4]));
            novoAluno.setSituacao(alunoSplit[5]);

            arrayAlunos.add(novoAluno);

            linha = documento.readLine();
        }

        documento.close();

        return arrayAlunos;
    }

    @Override
    public void editar() throws IOException, SQLException, Exception {

        String linha;
        String texto;

        BufferedWriter documento = new BufferedWriter(new FileWriter(arquivo.getAbsolutePath() + "\\data\\Alunos.xls"));

        for (int i = 0; i < this.alunos.size(); i++) {

            Aluno alunoEditado = alunos.get(i);

            texto = alunoEditado.getRa() + "\t" + alunoEditado.getNome() + "\t" + alunoEditado.getCurso() + "\t" + alunoEditado.getPeriodo() + "\t" + alunoEditado.getCoeficiente() + "\t" + alunoEditado.getSituacao();
            StringTokenizer st = new StringTokenizer(texto, "\n");

            while (st.hasMoreTokens()) {

                linha = st.nextToken();

                documento.write(linha);
                documento.newLine();
            }
        }

        documento.close();
    }

    @Override
    public void excluir() throws IOException, SQLException, Exception {

        String linha;
        String texto;

        BufferedWriter documento = new BufferedWriter(new FileWriter(arquivo.getAbsolutePath() + "\\data\\Alunos.xls"));

        for (int i = 0; i < this.alunos.size(); i++) {

            Aluno aluno = alunos.get(i);

            texto = aluno.getRa() + "\t" + aluno.getNome() + "\t" + aluno.getCurso() + "\t" + aluno.getPeriodo() + "\t" + aluno.getCoeficiente() + "\t" + aluno.getSituacao();
            StringTokenizer st = new StringTokenizer(texto, "\n");

            while (st.hasMoreTokens()) {

                linha = st.nextToken();

                documento.write(linha);
                documento.newLine();
            }
        }

        documento.close();
    }

    public boolean verificarExistencia(String nomeArquivo) throws IOException, SQLException, Exception {
        
        File arquivoVerificado = new File(nomeArquivo);

        return arquivoVerificado.exists();        
    }
    
    public void gerarRelatorio(String nomeArquivo) throws IOException, SQLException, Exception {
        
        String linha;
        String texto;

        BufferedWriter documento = new BufferedWriter(new FileWriter(nomeArquivo));

        for (int i = 0; i < this.alunos.size(); i++) {

            Aluno novoAluno = alunos.get(i);

            texto = novoAluno.getRa() + "\t" + novoAluno.getNome() + "\t" + novoAluno.getCurso() + "\t" + novoAluno.getPeriodo() + "\t" + novoAluno.getCoeficiente() + "\t" + novoAluno.getSituacao();
            StringTokenizer st = new StringTokenizer(texto, "\n");

            while (st.hasMoreTokens()) {

                linha = st.nextToken();

                documento.write(linha);
                documento.newLine();
            }
        }

        documento.close();
    }
}
