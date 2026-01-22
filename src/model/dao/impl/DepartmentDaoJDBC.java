package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	public Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO department" + "(Id, Name) " + "Values " + "(?,?) ",
					Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DbException(e.getMessage());	
		}

	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
