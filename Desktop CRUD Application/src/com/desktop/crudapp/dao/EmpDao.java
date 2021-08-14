
package com.desktop.crudapp.dao;

import java.sql.*;
import javax.swing.*;
import java.util.*;
import com.desktop.crudapp.bean.EmpBean;

/**
 * Database handler class
 * @author Keketso Mabule
 */
public class EmpDao
{
    /**
     * This method initializes the database connection.
     * @return Database connection.
     */
    public static Connection getConnection()
    {
        final String DB_URL = "jdbc:mysql://localhost:3306/employeedb";
        final String DB_NAME = "root";
        final String DB_PASS = "";
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASS);
        }
        catch (ClassNotFoundException|SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return conn;
    }
    
    /**
     * Adds the employee's details to the database.
     * @param emp The employee.
     * @return The status.
     */
    public static int AddEmp(EmpBean emp)
    {
        int status = 0;
        
        try {
            Connection conn = EmpDao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO emp_management(full_name, password, email, country) VALUES(?, ?, ?, ?)");
            
            pstmt.setString(1, emp.getName());
            pstmt.setString(2, emp.getPassword());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getCountry());
            
            status = pstmt.executeUpdate();
            
            conn.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
    
    /**
     * Updates the employee's details in the database.
     * @param emp The employee.
     * @return The status.
     */
    public static int updateEmp(EmpBean emp)
    {
        int status = 0;
        
        try {
            Connection conn = EmpDao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("UPDATE emp_management SET full_name=?, password=?, email=?, country=? WHERE id=?");
            
            pstmt.setString(1, emp.getName());
            pstmt.setString(2, emp.getPassword());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getCountry());
            pstmt.setInt(5, emp.getId());
            
            status = pstmt.executeUpdate();
            
            conn.close();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
    
    /**
     * Deletes the employee's details from the database.
     * @param id The employee's ID.
     * @return The status.
     */
    public static int delete(int id)
    {
        int status = 0;
        
        try{
            Connection conn = EmpDao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM emp_management WHERE id=?");
            
            pstmt.setInt(1, id);
            
            status = pstmt.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return status;
    }
    
    /**
     * This method gets all the employee's records.
     * @return The list of employees.
     */
    public static List<EmpBean> getAllEmployees()
    {
        List<EmpBean> list = new ArrayList<>();
        
        try{
            Connection conn = EmpDao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp_management");
            
            ResultSet results = pstmt.executeQuery();
            
            while(results.next()){
                EmpBean emp = new EmpBean();
                emp.setId(results.getInt(1));
                emp.setName(results.getString(2));
                emp.setPassword(results.getString(3));
                emp.setEmail(results.getString(4));
                emp.setCountry(results.getString(5));
                list.add(emp);
            }
        }
        catch (SQLException | NullPointerException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage() + "\nCan't fetch records", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return list;
    }
    
    /**
     * This method retrieves an individual employee's details.
     * @param id The employee ID
     * @return 
     */
    public static EmpBean getEmployeeById(int id)
    { 
        EmpBean e = new EmpBean(); 
        
        try{
            Connection conn = EmpDao.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp_management WHERE id=?");
            
            pstmt.setInt(1, id);
            
            ResultSet result = pstmt.executeQuery();
            if (result.next()){
                e.setId(result.getInt(1));
                e.setName(result.getString(2));
                e.setPassword(result.getString(3));
                e.setEmail(result.getString(4));
                e.setCountry(result.getString(5));
            }
            else{
                JOptionPane.showMessageDialog(null, "This ID doesn't exist in the system", "Error", JOptionPane.ERROR_MESSAGE);
            }
            conn.close();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return e;
    }
}
