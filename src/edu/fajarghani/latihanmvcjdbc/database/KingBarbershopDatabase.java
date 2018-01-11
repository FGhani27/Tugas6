/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fajarghani.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.fajarghani.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.fajarghani.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Flow
 * NIM  : 10116520
 * Nama : Fajar Abdul Ghani
 * Kelas: PBO-12
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
            
        }
        return connection;
    }
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
        
    }

    public static PelangganDao getPelangganDao(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
