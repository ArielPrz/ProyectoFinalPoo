/*
UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE
NOMBRES: Panata Kevin, Mateo Perez, Puedmag Erika.
NRC: 4609
TEMA: Proyecto Biblioteca Alexandría
Número de lista: 19, 20, 21
 */
package proyectopoo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

//Clase que muestra la ventana cliente y permite buscar un libro deseado mediante un filtro
public class VentanaCliente extends javax.swing.JFrame{
    DefaultTableModel model = new DefaultTableModel();
    //Atributos
    TableRowSorter trsFiltro;   //Filtro en la tabla
    private String filtro;
    

    //CONSTRUCTOR
    public VentanaCliente() {
        setLocation(250,250);//Ubicación de la ventana
        setResizable(false);//No se pueda cambiar de tamaño a la ventana
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("!!Bienvenidos Clientes¡¡");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar su libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Perpetua Titling MT", 2, 18))); // NOI18N

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1984", "George Orwell", "0001", "$12"},
                {"Amor en tiempos de colera", "Gabriel Garcia marquez", "0002", "$23"},
                {"Boca cerrada", "Simonetta Agnello Hornby", "0003", "$18"},
                {"Cementerio de Animales", "Stephen King", "0004", "$12"},
                {"Cien años de soledad", "Gabriel García Márquez", "0005", "$15"},
                {"Crimen y castigo", "Fiódor Dostoyevski", "0006", "$16"},
                {"Don Quijote de la Mancha", "Miguel de Cervantes", "0007", "$10"},
                {"El Ciclo del Hombre Lobo", "Stephen King", "0008", "$24"},
                {"El cuento de la criada", "Margaret Atwood", "0009", "$15"},
                {"El retrato de Dorian Gray", "Oscar Wilde", "0010", "$17"},
                {"El señor de los anillos", "John Ronald Reuel Tolkien", "0011", "$25"},
                {"El testamento maya", "Steve Alten", "0012", "$17"},
                {"El tiempo mientras tanto", "Carmen Amoraga", "0013", "$15"},
                {"Emma", "Jane Austen", "0014", "$21"},
                {"En busca del Tiempo Perdido", "Marcel Proust", "0015", "$11"},
                {"Guerra y paz", "León Tolstói", "0016", "$19"},
                {"Hábitos atomicos", "James Clear", "0017", "$18"},
                {"It", "Stephen King", "0018", "$23"},
                {"La abadía de Northanger", "Jane Austen", "0019", "$17"},
                {"La otra ciudad", "Pablo Aranda", "0020", "$18"},
                {"La piedra lunar", "Wilkie Collins", "0021", "$20"},
                {"La Tormenta del Siglo", "Stephen King", "0022", "$13"},
                {"La suma de los días", "Isabel Allende", "0023", "$13"},
                {"Lolita", "Vladimir Nabokov", "0024", "$13"},
                {"Madame Bovary", "Gustave Flaubert", "0025", "$15"},
                {"Mansfield Park", "Jane Austen", "0026", "$17"},
                {"Todo se desmorona", "Chinua Achebe", "0027", "$14"},
                {"Orgullo y prejuicio", "Jane Austen", "0028", "$16"},
                {"Padre rico Padre pobre", "Robert Kiyosaky", "0029", "$10"},
                {"Que empiece la fiesta", "Niccolo Ammaniti", "0030", "$17"},
                {"Ulises", "James Joyce", "0031", "$13"},
                {"Un mundo feliz", "Aldous Huxley", "0032", "$19"}
            },
            new String [] {
                "Nombre del Libro", "Autor", "Código", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jTextField2.setText("COPIE EL CÓDIGO DEL LIBRO Y DIRÍGASE A CAJA PARA REALIZAR EL PAGO");

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("BUSQUE SU LIBRO CON EL AUTOR (Use Mayúsculas para los nombres):");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //PARA SALIR DEL PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1ComponentAdded
    //Método para filtrar una búsqueda
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
       jTextField1.addKeyListener(new KeyAdapter(){
           @Override
           public void keyReleased(KeyEvent e) {
            trsFiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 1));     
          }
        });
        trsFiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsFiltro);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new VentanaBienvenida().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}