package com.learnSpring.Spring.springJDBC.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.learnSpring.Spring.entities.Employee;
import com.learnSpring.Spring.springJDBC.employee.dao.EmployeeDAO;
import com.learnSpring.Spring.springJDBC.employee.dao.rowmapper.EmployeeRowMapper;


@Component("EDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	

	@Override
	public int create(Employee employee) {
		
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee employee) {
		
		String sql = "update employee set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id = ?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Employee read(int id) {
		
		String sql = "select * from employee where id=?";
		
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
		
		
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql= "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);

		return result;
	}


}
