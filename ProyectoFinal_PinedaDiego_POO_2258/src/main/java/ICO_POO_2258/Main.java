package ICO_POO_2258;

import ICO_POO_2258._ConexionBaseDeDatos.AlumnosHDAO;
import ICO_POO_2258._Controlador.ControladorAlumnosH;
import ICO_POO_2258._Modelo.AlumnoHogwarts;
import ICO_POO_2258._Vista.Ventana;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Ventana view = new Ventana("Alumnos de Hogwarts");
        ControladorAlumnosH controler = new ControladorAlumnosH(view);
    }
}