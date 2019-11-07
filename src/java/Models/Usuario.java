/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author MarioGastonFerrufino
 */
public class Usuario {
    private int legajo;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String mail;
    private String fechaNac;
    private int rol;

    public Usuario(int legajo, String contraseña, String nombre, String apellido, String mail, String fechaNac, int rol) {
        this.legajo = legajo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.fechaNac = fechaNac;
        this.rol = rol;
    }

    public Usuario() {
    }

    public Usuario(int legajo, String contraseña) {
        this.legajo = legajo;
        this.contraseña = contraseña;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "legajo=" + legajo + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", fechaNac=" + fechaNac + ", rol=" + rol + '}';
    }
}
