package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import vo.AlunoVO;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public interface CrudControl {
    
    public ArrayList<AlunoVO> buscar() throws SQLException, Exception;
}
