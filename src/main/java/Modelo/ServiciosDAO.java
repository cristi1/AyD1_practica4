/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ServiciosDAO {
    Conexion conexion;
    public ServiciosDAO(){
        conexion = new Conexion();
    }
    
    public int getSaldo(String noCuenta){
        int resp = -1;
        ResultSet rs;
        try{
        Connection accesoBD = conexion.getConexion();
        CallableStatement cs = accesoBD.prepareCall("{call sp_consultarSaldo(?)}");
        cs.setString(1,noCuenta);
        rs = cs.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(Exception e){
            System.out.println("exception ocurrida en login: " + e.getMessage());
        }
        return resp;
        
    }
    
    public boolean existCuenta(String noCuenta){
        boolean resp = false;
        ResultSet rs;
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_existCuenta(?)}");
            cs.setString(1,noCuenta);
            rs = cs.executeQuery();
            if(rs.next()){
                return true; //si existe el usuario
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resp;
    }
    
    public boolean disponibilidadSaldo(String noCuenta, int cantidad){
        boolean resp = false;
        ResultSet rs;
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_verSaldo(?,?)}");
            cs.setString(1,noCuenta);
            cs.setInt(2, cantidad);
            rs = cs.executeQuery();
            if(rs.next()){
                return true; //si existe el usuario
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return resp;
    }
    
    public boolean pagoServicio(String noCuentaCliente, String noCuentaServicio, int cantidad ){
        boolean resp = false;
        ResultSet rs;
        try{
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{call sp_pagarServicio(?,?,?)}");
            cs.setString(1,noCuentaCliente);
            cs.setString(2,noCuentaServicio);
            cs.setInt(3, cantidad);
            rs = cs.executeQuery();
            resp = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            resp = false;
        }
        return resp;
    }
    
}

