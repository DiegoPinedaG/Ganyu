package ICO_POO_2258._Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblCasa;
    private JTextField txtCasa;
    private JLabel lblTipoSangre;
    private JTextField txtTipoSangre;
    private JLabel lblActor;
    private JTextField txtActor;
    private JLabel lblFoto;
    private JTextField txtFoto;
    private JLabel lblImagen;
    private JLabel lblActualizar;
    private JTextField txtActualizar;
    private JLabel lblDelete;
    private JTextField txtDelete;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnDelete;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1700,1075);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(108, 218, 204));
        lblId = new JLabel("ID:");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        lblNombre = new JLabel("Nombre del Personaje:");
        txtNombre = new JTextField(25);
        lblCasa = new JLabel("Casa a la que pertenece:");
        txtCasa = new JTextField(15);
        lblTipoSangre = new JLabel("Tipo de sangre:");
        txtTipoSangre = new JTextField(15);
        lblActor = new JLabel("Actor que lo interpreta:");
        txtActor = new JTextField(35);
        lblFoto = new JLabel("URL de la imagen:");
        txtFoto = new JTextField(55);
        btnAgregar = new JButton("Agregar a la tabla");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblCasa);
        panel1.add(txtCasa);
        panel1.add(lblTipoSangre);
        panel1.add(txtTipoSangre);
        panel1.add(lblActor);
        panel1.add(txtActor);
        panel1.add(lblFoto);
        panel1.add(txtFoto);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(204, 125, 84));
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        btnCargar = new JButton("Cargar datos");

        panel2.add(btnCargar);
        panel2.add(scroll);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(218, 194, 91));
        lblImagen = new JLabel("...");
        panel3.add(lblImagen);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(157, 84, 218));
        lblActualizar = new JLabel("Actualizar");
        txtActualizar = new JTextField(60);
        lblDelete = new JLabel("Borrar");
        txtDelete = new JTextField(5);
        btnActualizar = new JButton("Actualizar");
        btnDelete = new JButton("Borrar");
        panel4.add(lblActualizar);
        panel4.add(txtActualizar);
        panel4.add(btnActualizar);
        panel4.add(lblDelete);
        panel4.add(txtDelete);
        panel4.add(btnDelete);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLblCasa() {
        return lblCasa;
    }

    public void setLblCasa(JLabel lblCasa) {
        this.lblCasa = lblCasa;
    }

    public JTextField getTxtCasa() {
        return txtCasa;
    }

    public void setTxtCasa(JTextField txtCasa) {
        this.txtCasa = txtCasa;
    }

    public JLabel getLblTipoSangre() {
        return lblTipoSangre;
    }

    public void setLblTipoSangre(JLabel lblTipoSangre) {
        this.lblTipoSangre = lblTipoSangre;
    }

    public JTextField getTxtTipoSangre() {
        return txtTipoSangre;
    }

    public void setTxtTipoSangre(JTextField txtTipoSangre) {
        this.txtTipoSangre = txtTipoSangre;
    }

    public JLabel getLblActor() {
        return lblActor;
    }

    public void setLblActor(JLabel lblActor) {
        this.lblActor = lblActor;
    }

    public JTextField getTxtActor() {
        return txtActor;
    }

    public void setTxtActor(JTextField txtActor) {
        this.txtActor = txtActor;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(JTextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblActualizar() {
        return lblActualizar;
    }

    public void setLblActualizar(JLabel lblActualizar) {
        this.lblActualizar = lblActualizar;
    }

    public JTextField getTxtActualizar() {
        return txtActualizar;
    }

    public void setTxtActualizar(JTextField txtActualizar) {
        this.txtActualizar = txtActualizar;
    }

    public JLabel getLblDelete() {
        return lblDelete;
    }

    public void setLblDelete(JLabel lblDelete) {
        this.lblDelete = lblDelete;
    }

    public JTextField getTxtDelete() {
        return txtDelete;
    }

    public void setTxtDelete(JTextField txtDelete) {
        this.txtDelete = txtDelete;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }
}
