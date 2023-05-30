package ICO_POO_2258._Controlador;

import ICO_POO_2258._Modelo.ModeloTabla;
import ICO_POO_2258._Vista.Ventana;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorAlumnosH extends MouseAdapter {
    private Ventana view;
    private ModeloTabla modelo;

    public ControladorAlumnosH(Ventana view) {
        this.view = view;
        this.view.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo = new ModeloTabla();
            modelo.cargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
    }
}
