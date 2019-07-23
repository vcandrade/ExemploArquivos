package br.edu.utfpr.app.dao;

import br.edu.utfpr.app.entity.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public interface CrudDAO {
    
    public void cadastrar() throws SQLException, Exception;

    public ArrayList<Aluno> buscar() throws SQLException, Exception;

    public void editar() throws SQLException, Exception;

    public void excluir() throws SQLException, Exception;
}
