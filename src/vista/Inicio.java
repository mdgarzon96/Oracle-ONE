package vista;

import controlador.Convertir;
import modelo.EventoDeCaracters;
import controlador.MiUrl;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Mitchel
 */
public class Inicio extends javax.swing.JFrame {

    EventoDeCaracters tipoCaracter = new EventoDeCaracters();
    Convertir convertir = new Convertir();
    MiUrl miUrl = new MiUrl();

    public Inicio() {
        initComponents();
        setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbed1 = new tabbed.MaterialTabbed();
        Divisa = new javax.swing.JPanel();
        panelCantidad = new panel.design.PanelShadow();
        jLabel5 = new javax.swing.JLabel();
        panelRound1 = new panel.design.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadImporte = new textfield_suggestion.TextFieldShadown();
        panelCambio = new panel.design.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        panelRound2 = new panel.design.PanelRound();
        panelRound3 = new panel.design.PanelRound();
        divisaOrigen = new combo_suggestion.ComboBoxSuggestion();
        panelRound4 = new panel.design.PanelRound();
        panelRound5 = new panel.design.PanelRound();
        divisaDestino = new combo_suggestion.ComboBoxSuggestion();
        jLabel1 = new javax.swing.JLabel();
        btnConvertir = new panel.design.PanelGradient();
        lblConvertir = new javax.swing.JLabel();
        txtResultadoDivisa = new textfield_suggestion.TextFieldShadown();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oracle ONE");
        setMinimumSize(new java.awt.Dimension(316, 474));
        setResizable(false);

        materialTabbed1.setForeground(new java.awt.Color(9, 40, 70));
        materialTabbed1.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N

        Divisa.setBackground(new java.awt.Color(247, 247, 247));

        panelCantidad.setBackground(new java.awt.Color(23, 27, 36));
        panelCantidad.setColorGradient(new java.awt.Color(64, 73, 139));
        panelCantidad.setGradientType(panel.design.PanelShadow.GradientType.DIAGONAL_1);
        panelCantidad.setMinimumSize(new java.awt.Dimension(291, 100));
        panelCantidad.setRadius(20);
        panelCantidad.setShadowType(panel.design.PanelShadow.ShadowType.CENTER);
        panelCantidad.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Importe la cantidad total");
        panelCantidad.add(jLabel5);
        jLabel5.setBounds(65, 15, 135, 15);

        panelRound1.setBackground(new java.awt.Color(51, 58, 112));
        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setRoundTopLeft(100);
        panelRound1.setRoundTopRight(100);
        panelRound1.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Currency Dollar.png"))); // NOI18N
        panelRound1.add(jLabel4);
        jLabel4.setBounds(0, 0, 40, 40);

        panelCantidad.add(panelRound1);
        panelRound1.setBounds(20, 25, 40, 40);

        txtCantidadImporte.setBackground(new java.awt.Color(51, 58, 112));
        txtCantidadImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadImporte.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCantidadImporte.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtCantidadImporte.setShadowColor(new java.awt.Color(64, 73, 139));
        txtCantidadImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadImporteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadImporteKeyTyped(evt);
            }
        });
        panelCantidad.add(txtCantidadImporte);
        txtCantidadImporte.setBounds(60, 30, 200, 39);

        panelCambio.setRadius(20);
        panelCambio.setShadowType(panel.design.PanelShadow.ShadowType.CENTER);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(" De");

        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(null);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(15);
        panelRound3.setRoundBottomRight(15);
        panelRound3.setRoundTopLeft(15);
        panelRound3.setRoundTopRight(15);
        panelRound3.setLayout(null);

        divisaOrigen.setBorder(null);
        divisaOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COP - Peso colombiano", "USD - Dólar estadounidense", "EUR - Euro", "GPB - Libra Esterlina", "JPY - Yen Japonés", "KRW - Won surcoreano" }));
        divisaOrigen.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        divisaOrigen.setName(""); // NOI18N
        panelRound3.add(divisaOrigen);
        divisaOrigen.setBounds(10, 3, 210, 30);

        panelRound2.add(panelRound3);
        panelRound3.setBounds(5, 5, 230, 35);

        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(null);

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(15);
        panelRound5.setRoundBottomRight(15);
        panelRound5.setRoundTopLeft(15);
        panelRound5.setRoundTopRight(15);
        panelRound5.setLayout(null);

        divisaDestino.setBorder(null);
        divisaDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD - Dólar estadounidense", "COP - Peso colombiano", "EUR - Euro", "GPB - Libra Esterlina", "JPY - Yen Japonés", "KRW - Won surcoreano" }));
        divisaDestino.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        panelRound5.add(divisaDestino);
        divisaDestino.setBounds(10, 3, 210, 30);

        panelRound4.add(panelRound5);
        panelRound5.setBounds(5, 5, 230, 35);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText(" A (Estimado)");

        btnConvertir.setBackground(new java.awt.Color(23, 27, 36));
        btnConvertir.setColorGradient(new java.awt.Color(64, 73, 139));
        btnConvertir.setRadius(15);
        btnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMouseClicked(evt);
            }
        });

        lblConvertir.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblConvertir.setForeground(new java.awt.Color(255, 255, 255));
        lblConvertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/swap_vert.png"))); // NOI18N
        lblConvertir.setText("Convertir");
        lblConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMouseClicked(evt);
            }
        });
        btnConvertir.add(lblConvertir);
        lblConvertir.setBounds(0, 0, 230, 40);

        txtResultadoDivisa.setEditable(false);
        txtResultadoDivisa.setForeground(new java.awt.Color(1, 164, 109));
        txtResultadoDivisa.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtResultadoDivisa.setShadowColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelCambioLayout = new javax.swing.GroupLayout(panelCambio);
        panelCambio.setLayout(panelCambioLayout);
        panelCambioLayout.setHorizontalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoDivisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCambioLayout.setVerticalGroup(
            panelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultadoDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DivisaLayout = new javax.swing.GroupLayout(Divisa);
        Divisa.setLayout(DivisaLayout);
        DivisaLayout.setHorizontalGroup(
            DivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(panelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DivisaLayout.setVerticalGroup(
            DivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("Divisa", Divisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/style=bulk.png"));
        return retValue;
    }
    
    private void txtCantidadImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadImporteKeyTyped
        tipoCaracter.numberKeyPress(evt);
        if (txtCantidadImporte.getText().length() > 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadImporteKeyTyped

    private void txtCantidadImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadImporteKeyReleased
        if (txtCantidadImporte.getText().isEmpty()) {
            txtResultadoDivisa.setText("");
        }
    }//GEN-LAST:event_txtCantidadImporteKeyReleased

    private void btnConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseClicked
        try {
            if (txtCantidadImporte.getText().isEmpty()) {
                txtResultadoDivisa.setText("$ " + "0.00");
            } else {
                BigDecimal cantidad = new BigDecimal(txtCantidadImporte.getText());
                String divisa = convertir.Symbols(divisaOrigen.getSelectedItem().toString());
                String divisaDos = convertir.Symbols(divisaDestino.getSelectedItem().toString());

                URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=f9f7038adb5642d89ea7123623b822ac");
                Scanner urlScanner = new Scanner(url.openStream());
                String json = urlScanner.useDelimiter("\\Z").next();
                urlScanner.close();

                JSONObject obj = new JSONObject(json);
                BigDecimal tasaOrigen = obj.getJSONObject("rates").getBigDecimal(divisa);
                BigDecimal tasaDestino = obj.getJSONObject("rates").getBigDecimal(divisaDos);
                BigDecimal resultado = cantidad.multiply(tasaDestino).divide(tasaOrigen, 2, BigDecimal.ROUND_HALF_UP);
                txtResultadoDivisa.setText("$ " + cantidad.toString() + " " + divisa + " = " + resultado + " " + divisaDos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConvertirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Divisa;
    private panel.design.PanelGradient btnConvertir;
    private combo_suggestion.ComboBoxSuggestion divisaDestino;
    private combo_suggestion.ComboBoxSuggestion divisaOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblConvertir;
    private tabbed.MaterialTabbed materialTabbed1;
    private panel.design.PanelShadow panelCambio;
    private panel.design.PanelShadow panelCantidad;
    private panel.design.PanelRound panelRound1;
    private panel.design.PanelRound panelRound2;
    private panel.design.PanelRound panelRound3;
    private panel.design.PanelRound panelRound4;
    private panel.design.PanelRound panelRound5;
    private textfield_suggestion.TextFieldShadown txtCantidadImporte;
    private textfield_suggestion.TextFieldShadown txtResultadoDivisa;
    // End of variables declaration//GEN-END:variables
}
