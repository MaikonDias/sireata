package br.edu.utfpr.dv.sireata.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilDAO {

	public void closeConn(Connection conn, Statement stmt, ResultSet rs) throws SQLException{
		if((rs != null) && !rs.isClosed())
			rs.close();
		if((stmt != null) && !stmt.isClosed())
			stmt.close();
		if((conn != null) && !conn.isClosed())
			conn.close();
	}
}
