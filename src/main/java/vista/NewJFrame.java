/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.Button;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Banco;
import logica.Cliente;
import logica.Cuenta;
import logica.Movimiento;


/**
 *
 * @author Lenovo
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Banco bank = new Banco();
    ArrayList<Cuenta> Cuentas ;
    DefaultTableModel modelMovs = new DefaultTableModel();
    
    public NewJFrame() {
        initComponents();
        this.setTitle("banco Ut");
        this.setLocationRelativeTo(null);
        this.SetSize(labelIcon, "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Cajero_ut\\src\\main\\java\\imagenes\\logoBanco.png");
        this.SetSize(labelCliente, "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Cajero_ut\\src\\main\\java\\imagenes\\user.png");
        this.SetSize(labelCuenta,"C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Cajero_ut\\src\\main\\java\\imagenes\\cuenta.png");
        modelMovs.addColumn("Numero Cuenta");
        modelMovs.addColumn("Tipo de cuenta");
        modelMovs.addColumn("Monto");
        modelMovs.addColumn("Movimietno");
        listaMovimientos.setModel(modelMovs);
        
        
        
        
    
    }
    
    public void SetSize(JLabel e, String root){
        ImageIcon imagen = new ImageIcon(root);
        Icon  icon =  new ImageIcon(
                imagen.getImage().getScaledInstance(e.getWidth(), e.getHeight(), Image.SCALE_DEFAULT)
        );
        e.setIcon(icon);
        this.repaint();
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTlf = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregarCliente2 = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNCuenta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        btnAgregarCliente = new javax.swing.JButton();
        labelCuenta = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        btnVerInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistCuentas = new javax.swing.JList<>();
        btnInfoCuentas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaMovimientos = new javax.swing.JTable();
        btnRealizarMovimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(514,793, 793, 514);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Telefono:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 34, -1, -1));

        jLabel3.setText("C.C:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));
        jPanel1.add(txtTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        txtcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtccActionPerformed(evt);
            }
        });
        jPanel1.add(txtcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, -1));

        btnAgregarCliente2.setText("Agregar Cliente");
        btnAgregarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliente2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 40));
        jPanel1.add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 30, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Tipo de cuenta:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Numero de cuenta:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setText("Saldo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel2.add(txtNCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, -1));
        jPanel2.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente" }));
        jPanel2.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, -1));

        btnAgregarCliente.setText("Agregar Cuenta");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, 40));
        jPanel2.add(labelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de clientes"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(ListaClientes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 110));

        btnVerInfo.setText("ver Info Cuentas");
        btnVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoActionPerformed(evt);
            }
        });
        jPanel3.add(btnVerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));

        jScrollPane2.setViewportView(JlistCuentas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 80, 110));

        btnInfoCuentas.setText("info");
        btnInfoCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCuentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnInfoCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Saldo Total:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        jScrollPane3.setViewportView(listaMovimientos);

        btnRealizarMovimiento.setBackground(new java.awt.Color(102, 255, 102));
        btnRealizarMovimiento.setText("Realizar Movimiento");
        btnRealizarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarMovimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRealizarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRealizarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        String Ncuenta = txtNCuenta.getText();
        String monto = txtSaldo.getText();
        double saldo = Double.parseDouble(monto);   
        String Cliente = ListaClientes.getSelectedValue().toString();
        String tipo = comboTipo.getSelectedItem().toString();
        bank.CrearCuenta(Cliente, Ncuenta, saldo,tipo);
        System.out.print(Cliente);
        JOptionPane.showConfirmDialog(null, "Cuenta agregada Correctamente"); 
        vaciarCuentas();

    }//GEN-LAST:event_btnAgregarClienteActionPerformed
    public void vaciarCuentas(){
         DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("");
        JlistCuentas.setModel(modelo);
    }
   
    private void btnAgregarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente2ActionPerformed
        // TODO add your handling code here
        capturarDatos();
        limpiarCliente();
        mostrarClientes();
        limpiarTabla();
        
    }//GEN-LAST:event_btnAgregarCliente2ActionPerformed
    
    public void mostrarCuentas(){
      DefaultListModel modelo = new DefaultListModel();
      String Cliente = ListaClientes.getSelectedValue().toString();
        Cuentas = bank.verCuentas(Cliente);
        if(!Cuentas.isEmpty()){
            for(Cuenta e: Cuentas){
             modelo.addElement(e.getTipoCuenta());
             JlistCuentas.setModel(modelo);
            
            }
        }else{
            modelo.addElement("Sin cuentas");
            JlistCuentas.setModel(modelo);
        }
        
        
    }
    public void capturarDatos(){
        String nombre = txtNombre.getText();
        String cc = txtcc.getText();
        String tlf = txtTlf.getText();
        bank.Capturardatos(nombre, cc, tlf);
        JOptionPane.showConfirmDialog(null, "Cliente agregado Correctamente"); 
    }
    
    public void mostrarClientes(){
        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Cliente> Clientes = bank.listarClientes();
        for(Cliente e: Clientes){
             modelo.addElement(e.getNombre());
            ListaClientes.setModel(modelo);
            
        }
   
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtccActionPerformed

    private void btnVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoActionPerformed
        // TODO add your handling code here:
        mostrarCuentas();
        verMovimientos();
   
        
    }//GEN-LAST:event_btnVerInfoActionPerformed

    private void btnInfoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCuentasActionPerformed
        // TODO add your handling code here:
        verCuentas();
        verMovimientos();
        
    }//GEN-LAST:event_btnInfoCuentasActionPerformed
    public void verCuentas(){
        String Cliente = ListaClientes.getSelectedValue().toString();
        Cuentas = bank.verCuentas(Cliente);
        String cuenta = JlistCuentas.getSelectedValue().toString();
        System.out.println(cuenta);
        for(Cuenta e: Cuentas){
            if(cuenta.equals(e.getTipoCuenta())){
                String monto = String.valueOf(e.getBalance());
                System.out.println(cuenta);
                lblSaldo.setText(monto);
            }
        }
    }
    private void btnRealizarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarMovimientoActionPerformed
        // TODO add your handling code here
        String Cliente = ListaClientes.getSelectedValue().toString();
        String cuenta = JlistCuentas.getSelectedValue().toString();
        bank.agregarMov(Cliente, cuenta);
        verCuentas();
        verMovimientos ();
        
    }//GEN-LAST:event_btnRealizarMovimientoActionPerformed
    
    public void limpiarCliente(){
        txtNombre.setText(""); 
       txtcc.setText("");
        txtTlf.setText("");
    }
    
    public void limpiarTabla(){
         while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
            listaMovimientos.setModel(modelMovs);
        }
    }
    /**
     * @param args the command line arguments
     */
    public void verMovimientos (){
        String Cliente = ListaClientes.getSelectedValue().toString();
        String cuenta = JlistCuentas.getSelectedValue().toString();
        ArrayList<Cuenta> Cuentas= bank.verCuentas(Cliente);
        Cuenta Actual = bank.CuentaActual(cuenta, Cuentas);
        while(modelMovs.getRowCount()>0){
            modelMovs.removeRow(0);
        }
         
        for(Movimiento m: Actual.getMisMovimientos()){
            Object Mov[] = new Object[4];
            Mov[0] = Actual.getnCuenta();
            Mov[1] = Actual.getTipoCuenta();
            Mov[2] = m.getMonto();
            Mov[3] = m.getTipoMovimiento();
            modelMovs.addRow(Mov);  
        }
        listaMovimientos.setModel(modelMovs);
        
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistCuentas;
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCliente2;
    private javax.swing.JButton btnInfoCuentas;
    private javax.swing.JButton btnRealizarMovimiento;
    private javax.swing.JButton btnVerInfo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCuenta;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTable listaMovimientos;
    private javax.swing.JTextField txtNCuenta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTlf;
    private javax.swing.JTextField txtcc;
    // End of variables declaration//GEN-END:variables
}
