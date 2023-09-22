/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryImplementation;

import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBNomina implements IDBConnection
{

    public DBNomina() 
    {
        initDatabase("a");
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("Nomina:");
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("Conectando a la tabla nomina");
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("Desonectando la tabla nomina");
    }
    
}
