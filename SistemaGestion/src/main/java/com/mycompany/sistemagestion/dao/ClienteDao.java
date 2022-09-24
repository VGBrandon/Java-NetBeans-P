/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion.dao;

import com.mycompany.sistemagestion.models.Cliente;
import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eldan
 */
public class ClienteDao {
    
    public Connection conectar(){
        //Coneccion a la base de datos mysql
        String baseDeDatos = "java";
        String usuario = "root";
        String password = "mysql";
        String host = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://"+ host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";
        
        Connection conexion = null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    
    public void agregar(Cliente cliente){
        
        try {
            Connection conexion  = conectar();
            
            String sql = "INSERT INTO `java`.`tb_clientes` (`id`,`nombre`, `apellido`, `email`, `telefono`) VALUES (NULL,'"+cliente.getNombre()+"','"+cliente.getApellido()+ "','"+cliente.getEmail()+"','"+cliente.getTelefono()+"');";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizar(Cliente cliente){
        
        try {
            Connection conexion  = conectar();
            
            String sql = "UPDATE `java`.`tb_clientes` SET `nombre` = '"+ cliente.getNombre() +"',`apellido` = '"+ cliente.getApellido()+"',`email` = '"+ cliente.getEmail()+"',`telefono` = '"+ cliente.getTelefono()+"' WHERE `id` = " + cliente.getId() + ";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente>listar(){
        
        List<Cliente> listado = new ArrayList<>();
        
        try {
            Connection conexion  = conectar();
            
            String sql = "SELECT * FROM java.tb_clientes;";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
            //bucle para recorrer las filas de las tablas
            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setId(resultado.getString("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("apellido"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
                listado.add(cliente);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;   
    }
    
    public void eliminar(String id){
        
        
        try {
            Connection conexion  = conectar();
            
            String sql = "DELETE FROM `java`.`tb_clientes` WHERE `id` = " + id + ";";
            Statement statement = conexion.createStatement();
            statement.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardar(Cliente cliente) {
        if(StringUtils.isEmptyOrWhitespaceOnly(cliente.getId())){
            agregar(cliente);
        }else{
            actualizar(cliente);
        }
    }
}
