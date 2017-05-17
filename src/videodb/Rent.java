
package videodb;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import static videodb.JFrame.rentT;
import static videodb.JFrame.videoT;
import static videodb.VideoDB.conn;

public class Rent extends javax.swing.JFrame {
    public static String nameeV="", rentPricee="", duee="", rentDatee="", nameC="";
    public static int selec;
    public Rent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jLabel4.setText("Rental price");

        jLabel5.setText("Duedate (YYYY-MM-DD)");

        jLabel6.setText("Rent date (YYYY-MM-DD)");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel1.setText("CustomerID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                 
        DefaultTableModel model = (DefaultTableModel)rentT.getModel();
        rentT.setModel(model);            
                  
        try {  

            setVisible(false);
            
            //get last rentID
            Statement st = conn.createStatement();  
            ResultSet rs = st.executeQuery("SELECT * FROM rent");
            while(rs.next())
            {                
                VideoDB.rID=rs.getInt("RentID");               
            }
            VideoDB.rID++;

            nameeV=(String)videoT.getValueAt(videoT.getSelectedRow(), 0);
 
            nameC=jTextField1.getText(); //get customerID            
            rentPricee=jFormattedTextField4.getText();
            duee=jFormattedTextField5.getText();
            rentDatee=jFormattedTextField6.getText();
            String temp = (String)videoT.getValueAt(videoT.getSelectedRow(), 5);
            selec =Integer.parseInt(temp); 

            Statement stmt = conn.createStatement();
             String sql = "INSERT INTO rent VALUES ('"+VideoDB.rID+"', '"+nameeV+"', '"+nameC+"', '"+rentPricee+"', '"+duee+"', '"+rentDatee+"', '"+selec+"')";
            stmt.executeUpdate(sql);
          
            model.addRow(new Object[]{VideoDB.rID, nameeV, VideoDB.cID, rentPricee, duee, rentDatee, selec});  //add row to rent JTable
            
        } catch (SQLException e) {
           System.out.println("Connection failed");
           System.err.println ("Error message: " + e.getMessage ());
                }
               
    }//GEN-LAST:event_saveActionPerformed


    

    
    public static void main(String args[]) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/VideoStore" , "root" , "password");
            System.out.println("Connection successful");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
           System.out.println("Connection failed");
           System.err.println ("Error message: " + e.getMessage ());
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
