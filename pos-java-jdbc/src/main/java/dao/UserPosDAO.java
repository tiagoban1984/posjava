package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexaojdbc.SingleConnection;
import model.Userposjava;

public class UserPosDAO {

	private Connection connection;

	public UserPosDAO() throws ClassNotFoundException, SQLException {
		connection = SingleConnection.getConnection();
	}

	public void salvar(Userposjava userposjava) throws SQLException {
		try {

			String sql = "INSERT INTO userposjava(nome, email, cpf, setor)	VALUES (?, ?, ?, ?);";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(2, userposjava.getNome());
			insert.setString(3, userposjava.getEmail());
			insert.setString(4, userposjava.getCpf());
			insert.setString(5, userposjava.getSetor());
			insert.execute();
			connection.commit();
			connection.rollback();
		} catch (Exception e) {

			
			e.printStackTrace();
		}
	}

}
