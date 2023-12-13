package pos_java_jdbc.pos_java_jdbc;


import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() throws ClassNotFoundException, SQLException {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		try{
		userposjava.setNome("Silvia Perin");
		userposjava.setEmail("silvia@haitoyota.com.br");
		userposjava.setCpf("05219911224");
		userposjava.setSetor("RH");
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}