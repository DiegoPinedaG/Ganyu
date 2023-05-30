package ICO_POO_2258._Modelo;

import ICO_POO_2258._ConexionBaseDeDatos.AlumnosHDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    public static final int COLS = 6;
    private ArrayList<AlumnoHogwarts> alumnos;
    private AlumnosHDAO aDAO;

    public ModeloTabla() {
    }

    public ModeloTabla(ArrayList<AlumnoHogwarts> alumnos) {
        this.alumnos = alumnos;
        alumnos = new ArrayList<>();
        aDAO = new AlumnosHDAO();
    }

    @Override
    public int getRowCount() {
        return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nomCol = "";
        switch (columnIndex){
            case 0:
                nomCol = "ID";
                break;
            case 1:
                nomCol = "Nombre del Alumno";
                break;
            case 2:
                nomCol = "Casa";
                break;
            case 3:
                nomCol = "Tipo de Sangre";
                break;
            case 4:
                nomCol = "Actor que interpreta al personaje";
                break;
            case 5:
                nomCol = "URL de la Foto del Alumno";
                break;
            default:
                nomCol = "";
        }
        return nomCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
            return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AlumnoHogwarts tmp = alumnos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getCasa();
            case 3:
                return tmp.getTipoSangre();
            case 4:
                return tmp.getActor();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                System.out.println("No se puede modificar");
                break;
            case 1:
                alumnos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                alumnos.get(rowIndex).setCasa((String) aValue);
                break;
            case 3:
                alumnos.get(rowIndex).setTipoSangre((String) aValue);
                break;
            case 4:
                alumnos.get(rowIndex).setActor((String) aValue);
                break;
            case 5:
                alumnos.get(rowIndex).setUrl((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");

        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try {
            ArrayList<AlumnoHogwarts> alum = aDAO.obtenerTodo();
            System.out.println(alum);
            alumnos = alum;
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
}
