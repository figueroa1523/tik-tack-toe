
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;

public class FormInicio1 extends javax.swing.JFrame {

    public FormInicio1() {
        init();
    }
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();
        panelFondo.setOpaque(false);
        Border bordeBoton = BorderFactory.createLineBorder(new Color (243,211,246),2);
        panelBoton1vs1.setBorder(bordeBoton);
        panelBoton1vsCPU.setBorder(bordeBoton);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelBoton1vs1 = new javax.swing.JPanel();
        lbl1vs1 = new javax.swing.JLabel();
        panelBoton1vsCPU = new javax.swing.JPanel();
        lbl1vsCPU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(380, 10, 20, 30);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIK TACK TOE");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 40, 420, 45);

        panelBoton1vs1.setBackground(new java.awt.Color(42, 22, 79));

        lbl1vs1.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N
        lbl1vs1.setForeground(new java.awt.Color(241, 227, 252));
        lbl1vs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1vs1.setText("1 VS 1 ");
        lbl1vs1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1vs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl1vs1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl1vs1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1vs1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1vs1Layout = new javax.swing.GroupLayout(panelBoton1vs1);
        panelBoton1vs1.setLayout(panelBoton1vs1Layout);
        panelBoton1vs1Layout.setHorizontalGroup(
            panelBoton1vs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1vs1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl1vs1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBoton1vs1Layout.setVerticalGroup(
            panelBoton1vs1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1vs1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl1vs1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelBoton1vs1);
        panelBoton1vs1.setBounds(40, 120, 160, 50);

        panelBoton1vsCPU.setBackground(new java.awt.Color(42, 22, 79));

        lbl1vsCPU.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N
        lbl1vsCPU.setForeground(new java.awt.Color(241, 227, 252));
        lbl1vsCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1vsCPU.setText("1 VS CPU");
        lbl1vsCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1vsCPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1vsCPUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl1vsCPUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl1vsCPUMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1vsCPUMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1vsCPULayout = new javax.swing.GroupLayout(panelBoton1vsCPU);
        panelBoton1vsCPU.setLayout(panelBoton1vsCPULayout);
        panelBoton1vsCPULayout.setHorizontalGroup(
            panelBoton1vsCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1vsCPULayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl1vsCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBoton1vsCPULayout.setVerticalGroup(
            panelBoton1vsCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1vsCPULayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl1vsCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelBoton1vsCPU);
        panelBoton1vsCPU.setBounds(220, 120, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.red);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lbl1vs1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vs1MousePressed
        this.dispose();
        FormInicio formInicio = new FormInicio();
        formInicio.setVisible(true);
    }//GEN-LAST:event_lbl1vs1MousePressed

    private void lbl1vs1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vs1MouseExited
        panelBoton1vs1.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lbl1vs1MouseExited

    private void lbl1vs1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vs1MouseEntered
        panelBoton1vs1.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lbl1vs1MouseEntered

    private void lbl1vsCPUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vsCPUMouseEntered
        panelBoton1vsCPU.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lbl1vsCPUMouseEntered

    private void lbl1vsCPUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vsCPUMouseExited
        panelBoton1vsCPU.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lbl1vsCPUMouseExited

    private void lbl1vsCPUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vsCPUMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl1vsCPUMousePressed

    private void lbl1vsCPUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1vsCPUMouseClicked
        
    }//GEN-LAST:event_lbl1vsCPUMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1vs1;
    private javax.swing.JLabel lbl1vsCPU;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelBoton1vs1;
    private javax.swing.JPanel panelBoton1vsCPU;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
