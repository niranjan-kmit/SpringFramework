package com.niranjan.spring.web.Dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;
@Component
public class jobsDao {
private JdbcTemplate jdbc;
public jobsDao()
{
	System.out.println("Dao Object Sucessfully Created");
	
}
//@Autowired
public void Datasource(DataSource jdbc) {
	this.jdbc = new JdbcTemplate(jdbc);
}
public void Insert(int id,String company,String postdate,String lastdate,String place)
{
	//Inserting values to Databases;
    jdbc.update(
            "INSERT INTO jobsadda(id,company,place,postdate,lastdate) values(?,?,?,?,?)",
            id,company,place,postdate,lastdate);
    
	
}
// total number of records
public int getTotalnumberofrecords()
{
	String query="select count(*) from jobsadda";
	
	return jdbc.queryForInt(query);
	
}


//Inserting Values Using Prepared Statements
/*
public void InsertusingPreparedStatements(final int id,final String company,final String place,final String postdate,final String lastdate)
{
	String query="insert into jobsadd values(?,?,?,?)";
	jdbc.query(query,new PreparedStatementCallback<Boolean>() {

		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			ps.setInt(1, id);
			ps.setString(2, company);
			ps.setString(3, place);
			ps.setString(4, postdate);
			ps.setString(5, lastdate);
			return ps.execute();
		}

		
	});
}*/
public List<jobsadda> GetData()
{
	return jdbc.query("select id,company,place from jobsadda ", new RowMapper<jobsadda>() {

		public jobsadda mapRow(ResultSet rs,
				int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			jobsadda da=new jobsadda();
			da.setId(rs.getInt("id"));
			da.setCompany(rs.getString("company"));
			da.setPlace(rs.getString("place"));
			
			return da;
		}
	});
	
	
}
// Update Methods
public int updateCompany(int id,String name)
{
	String query="update jobsadda set company=? where id=?";
	
	return jdbc.update(query,name,id);
	
}
}
