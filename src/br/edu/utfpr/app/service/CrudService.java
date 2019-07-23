package br.edu.utfpr.app.service;

import br.edu.utfpr.app.entity.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public interface CrudService {
    
    public ArrayList<Aluno> buscar() throws SQLException, Exception;
}
