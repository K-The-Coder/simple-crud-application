
package com.desktop.crudapp.bean;

/**
 * Getters and Setters
 * @author Keketso Mabule
 */
public class EmpBean
{
    private int id;
    private String name, password, email, country;
    
    /**
     * Gets the Employee ID.
     * @return The Employee ID.
     */
    public int getId()
    {
        return id;
    }
    /**
     * Sets the Employee ID.
     * @param id The Employee's ID.
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Gets the employee's name.
     * @return The employee's name.
     */
    public String getName()
    {
        return name;
    }
    /**
     * Sets the employee's name.
     * @param name The employee's name.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Gets the employee's password.
     * @return The employee's password.
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * Sets the employee's password.
     * @param password The employee's password.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
     /**
     * Gets the employee's email.
     * @return The employee's email.
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * Sets the employee's email.
     * @param email The employee's email.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
   
    /**
     * Gets the employee's country.
     * @return The employee's country.
     */
    public String getCountry()
    {
        return country;
    }
    /**
     * Sets the employee's country.
     * @param country The employee's country.
     */
    public void setCountry(String country)
    {
        this.country = country;
    }
    
}
