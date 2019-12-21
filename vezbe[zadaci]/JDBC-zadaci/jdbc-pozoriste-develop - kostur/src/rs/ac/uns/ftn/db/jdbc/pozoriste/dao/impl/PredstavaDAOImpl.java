package rs.ac.uns.ftn.db.jdbc.pozoriste.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import rs.ac.uns.ftn.db.jdbc.pozoriste.connection.HikariCP;
import rs.ac.uns.ftn.db.jdbc.pozoriste.dao.PredstavaDAO;
import rs.ac.uns.ftn.db.jdbc.pozoriste.model.Predstava;

public class PredstavaDAOImpl implements PredstavaDAO {

	@Override
	public int count() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Predstava entity) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Predstava> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Predstava> findAllById(Iterable<Integer> ids) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predstava findById(Integer id) throws SQLException {
		String query = "select idpred, nazivpred, trajanje,godinapre from predstava where idpred = ?";
		Predstava predstava = null;

		try (Connection connection = HikariCP.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {

			preparedStatement.setInt(1, id);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.isBeforeFirst()) {
					resultSet.next();

					predstava = new Predstava(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
							resultSet.getInt(4));
				}
			}
		}

		return predstava;
	}

	@Override
	public void save(Predstava entity) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveAll(Iterable<Predstava> entities) throws SQLException {
		// TODO Auto-generated method stub

	}

}
