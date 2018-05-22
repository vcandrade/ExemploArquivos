package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import vo.AlunoVO;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public interface CrudDAO {
    
    public void cadastrar() throws SQLException, Exception;

    public ArrayList<AlunoVO> buscar() throws SQLException, Exception;

    public void editar() throws SQLException, Exception;

    public void excluir() throws SQLException, Exception;
}
