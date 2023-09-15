/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Lenovo
 */
public class Persona {
//Atributos
public String Nombre;
public int Cedula;       
public int Año_nacimiento;
//no parametrizado
public Persona(){
}
//parametrizado
    public Persona(String Nombre, int Cedula, int Año_nacimiento) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Año_nacimiento = Año_nacimiento;
    }
//setter

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setAño_nacimiento(int Año_nacimiento) {
        this.Año_nacimiento = Año_nacimiento;
    }
    //getter

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public int getAño_nacimiento() {
        return Año_nacimiento;
    }
    
}

