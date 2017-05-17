package videodb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static videodb.VideoDB.conn;


public class JFrame extends javax.swing.JFrame{
    Connection con;
    Statement stmt;
    ResultSet rs;
    public static String selec="";

    public JFrame() throws SQLException {
        initComponents(); 
    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        videos = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        overdue = new javax.swing.JButton();
        rented = new javax.swing.JButton();
        doRent = new javax.swing.JButton();
        doReturn = new javax.swing.JButton();
        addC = new javax.swing.JButton();
        addV = new javax.swing.JButton();
        renting = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        videoT = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        customerT = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 204, 255));

        videos.setText("All videos");
        videos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videosActionPerformed(evt);
            }
        });

        customers.setText("All customers");
        customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersActionPerformed(evt);
            }
        });

        overdue.setText("Overdue items");
        overdue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overdueActionPerformed(evt);
            }
        });

        rented.setText("Rented videos");
        rented.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentedActionPerformed(evt);
            }
        });

        doRent.setText("Rent selected");
        doRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doRentActionPerformed(evt);
            }
        });

        doReturn.setText("Return selected");
        doReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doReturnActionPerformed(evt);
            }
        });

        addC.setText("Add a customer");
        addC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCActionPerformed(evt);
            }
        });

        addV.setText("Add a video");
        addV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVActionPerformed(evt);
            }
        });

        renting.setText("Renting customers");
        renting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentingActionPerformed(evt);
            }
        });

        videoT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Video's name", "Director's name", "Publishing year", "Art", "Duration", "VideoID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(videoT);

        customerT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Family Name", "First Name", "Address", "Social Security Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(customerT);

        rentT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RentID", "Video's name", "CustomerID", "Rental price", "Duedate", "Rent date", "VideoID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rentT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(videos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doRent, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rented, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(overdue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(renting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(videos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doRent))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(renting))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rented)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overdue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doReturn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void videosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videosActionPerformed

  allVideos();
  
    }//GEN-LAST:event_videosActionPerformed

    private void customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersActionPerformed
        allCustomers();
    }//GEN-LAST:event_customersActionPerformed

    private void overdueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overdueActionPerformed
        overdue();
    }//GEN-LAST:event_overdueActionPerformed

    private void rentedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentedActionPerformed
        rented();
    }//GEN-LAST:event_rentedActionPerformed

    private void addCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }//GEN-LAST:event_addCActionPerformed

    private void addVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Video().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_addVActionPerformed

    private void doRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doRentActionPerformed
    rentSelected();

    }//GEN-LAST:event_doRentActionPerformed

    private void doReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doReturnActionPerformed
        
            String selected = (rentT.getValueAt(rentT.getSelectedRow(), 0)).toString();
            
            DefaultTableModel model = (DefaultTableModel)rentT.getModel();
            rentT.setModel(model);
            
            try {
                
                //get last rentID to decrement it after the deletion
            Statement st = conn.createStatement();  
            ResultSet rs = st.executeQuery("SELECT * FROM rent");
            while(rs.next())
            {                
                VideoDB.rID=rs.getInt("RentID");               
            }
            
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM rent WHERE RentID LIKE "+selected); //remove selected row from MySQL Rent table
            
            if(VideoDB.rID>0)
            VideoDB.rID--;
            
            } catch (SQLException e) {
           System.out.println("Connection failed");
           System.err.println ("Error message: " + e.getMessage ());
            }
             model.removeRow(rentT.getSelectedRow());  //remove selected row from rentT JTable
    }//GEN-LAST:event_doReturnActionPerformed

    private void rentingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentingActionPerformed
       renting();
    }//GEN-LAST:event_rentingActionPerformed

    public static void main(String args[]) throws SQLException{
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/VideoStore" , "root" , "password");
            System.out.println("Connection successful");
            Statement stmt = con.createStatement();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
           System.out.println("Connection failed");
           System.err.println ("Error message: " + e.getMessage ());
        }
         
    }
    private void allVideos()
    {
              try{      
                  String Vname="", Dname="", year="", art="", duration="", vID="";
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Video"); 
            
            DefaultTableModel model = (DefaultTableModel)rentT.getModel();
            rentT.setModel(model);
            
            DefaultTableModel model1 = (DefaultTableModel)customerT.getModel();
            customerT.setModel(model1);
            
            DefaultTableModel model3 = (DefaultTableModel)videoT.getModel();
            videoT.setModel(model3);
            
            //clears the Video table from the previous output
            int rows3=model3.getRowCount();
            for(int m=rows3-1; m>=0; m--)
            model3.removeRow(m); 
            
            int i=0;
       while (rs.next()) 
        {
         Vname=rs.getString("Video name");
         Dname=rs.getString("Director name");
         year=rs.getString("Publishing year");
         art=rs.getString("Art");
         duration=rs.getString("Duration");
         vID=rs.getString("VideoID");
                model3.addRow(new Object[]{Vname, Dname, year, art, duration, vID});
                i++; 
        }   
        if(i <1)
        {
         JOptionPane.showMessageDialog(null, "No Record Found","Error",
         JOptionPane.ERROR_MESSAGE);
        }
        if(i ==1)
        {
         System.out.println(i+" Record Found");
        }
        else
        {
         System.out.println(i+" Records Found");
        }

            
         } catch (SQLException e) {
                    System.err.println ("Error message: " + e.getMessage ());
                    System.err.println ("Error number: " + e.getErrorCode ());
         }
    }

    
    private void allCustomers()
    {
        try{        
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customer"); 
        
            DefaultTableModel model1 = (DefaultTableModel)customerT.getModel();
            customerT.setModel(model1);
            
            
            //clears the Customer table from the previous output
            int rows1=model1.getRowCount();
            for(int j=rows1-1; j>=0; j--)
            model1.removeRow(j); 
            
            String surname="", name="", address="", SSN="", cID="";
            int i =0;
        while (rs.next())
        {
         surname=rs.getString("Family name");
         name=rs.getString("First Name");
         address=rs.getString("Address");
         SSN=rs.getString("Social Security Number");
         cID=rs.getString("CustomerID");
         model1.addRow(new Object[]{cID, surname, name, address, SSN});
         i++;
        }
        if(i <1)
        {
         JOptionPane.showMessageDialog(null, "No Record Found","Error",
         JOptionPane.ERROR_MESSAGE);
        }
        if(i ==1)
        {
         System.out.println(i+" Record Found");
        }
        else
        {
         System.out.println(i+" Records Found");
        }

                       
        } catch (SQLException e) {
                    System.err.println ("Error message: " + e.getMessage ());
                    System.err.println ("Error number: " + e.getErrorCode ());
         }
    }
    
    private void overdue()
    {
        try{    
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Rent WHERE Duedate < CURDATE()"); 
            
            DefaultTableModel model = (DefaultTableModel)rentT.getModel();
            rentT.setModel(model);           
            
            //clears the Renting table from the previous output
            int rows=model.getRowCount();
            for(int j=rows-1; j>=0; j--)
            model.removeRow(j); 
            
            String rID="",Vname="", cID="", RentPrice="", Duedate="", RentDate="", vID="";
            int i =0;
        while (rs.next())
        {
            rID=rs.getString("RentID");
         Vname=rs.getString("Video name");
         cID=rs.getString("CustomerID");
         RentPrice=rs.getString("Rental Price");
         Duedate=rs.getString("Duedate");
         RentDate=rs.getString("Rent date");
         vID=rs.getString("VideoID");
         model.addRow(new Object[]{rID,Vname, cID, RentPrice, Duedate, RentDate, vID});
         i++;
        }
        if(i <1)
        {
         JOptionPane.showMessageDialog(null, "No Record Found","Error",
         JOptionPane.ERROR_MESSAGE);
        }
        if(i ==1)
        {
         System.out.println(i+" Record Found");
        }
        else
        {
         System.out.println(i+" Records Found");
        }
             } catch (SQLException e) {
                    System.err.println ("Error message: " + e.getMessage ());
                    System.err.println ("Error number: " + e.getErrorCode ());
         }
        }
    
    private void rented()
    {
        try{    
                Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Rent"); 
            
            DefaultTableModel model = (DefaultTableModel)rentT.getModel();
            rentT.setModel(model);
            
            //clears the Renting table from the previous output
            int rows=model.getRowCount();
            for(int j=rows-1; j>=0; j--)
            model.removeRow(j); 

            String rID="",Vname="", cID="", RentPrice="", Duedate="", RentDate="", vID="";
            int i =0;
        while (rs.next())
        {
            rID=rs.getString("RentID");
         Vname=rs.getString("Video name");
         cID=rs.getString("CustomerID");
         RentPrice=rs.getString("Rental Price");
         Duedate=rs.getString("Duedate");
         RentDate=rs.getString("Rent date");
         vID=rs.getString("VideoID");
         model.addRow(new Object[]{rID,Vname, cID, RentPrice, Duedate, RentDate, vID});
         i++;
        }
        if(i <1)
        {
         JOptionPane.showMessageDialog(null, "No Record Found","Error",
         JOptionPane.ERROR_MESSAGE);
        }
        if(i ==1)
        {
         System.out.println(i+" Record Found");
        }
        else
        {
         System.out.println(i+" Records Found");
        }
             } catch (SQLException e) {
                    System.err.println ("Error message: " + e.getMessage ());
                    System.err.println ("Error number: " + e.getErrorCode ());
         }
    }
    
    private void renting()
    {
        try{        
            Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Rent"); //only renting customers
            String surname="", name="", address="", SSN="";
            String rID="", Vname="", RentPrice="", Duedate="", RentDate="", vID="";
            int i=0;
            String cID="";
            
            DefaultTableModel model = (DefaultTableModel)rentT.getModel();
            rentT.setModel(model);
            
            DefaultTableModel model1 = (DefaultTableModel)customerT.getModel();
            customerT.setModel(model1);            
            
            //clears the Renting table from the previous output
            int rows=model.getRowCount();
            for(int j=rows-1; j>=0; j--)
            model.removeRow(j); 
            
            //clears the Customer table from the previous output
            int rows1=model1.getRowCount();
            for(int j=rows1-1; j>=0; j--)
            model1.removeRow(j);            
            
            
        while (rs.next())
        {
         rID=rs.getString("RentID");
         Vname=rs.getString("Video name");
         cID=rs.getString("CustomerID");
         RentPrice=rs.getString("Rental Price");
         Duedate=rs.getString("Duedate");
         RentDate=rs.getString("Rent date");
         vID=rs.getString("VideoID");
         
         model.addRow(new Object[]{rID, Vname, cID, RentPrice, Duedate, RentDate, vID});
         
         Statement st = conn.createStatement();
         ResultSet rst = st.executeQuery("SELECT * FROM Customer WHERE CustomerID LIKE "+cID); //only renting customers
         
            
        while (rst.next())
        {
         surname=rst.getString("Family name");
         name=rst.getString("First Name");
         address=rst.getString("Address");
         SSN=rst.getString("Social Security Number");
         model1.addRow(new Object[]{cID, surname, name, address, SSN});
        }
        i++;
        }
        } catch (SQLException e) {
                    System.err.println ("Error message: " + e.getMessage ());
                    System.err.println ("Error number: " + e.getErrorCode ());
         }
    }
    
    private void rentSelected() 
    {                                           
            if(videoT.getSelectedRow()!=-1)
            {               
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rent().setVisible(true);
            }
        });
            }
            
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addC;
    private javax.swing.JButton addV;
    public static javax.swing.JTable customerT;
    private javax.swing.JButton customers;
    private javax.swing.JButton doRent;
    private javax.swing.JButton doReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton overdue;
    public static javax.swing.JTable rentT;
    private javax.swing.JButton rented;
    private javax.swing.JButton renting;
    public static javax.swing.JTable videoT;
    private javax.swing.JButton videos;
    // End of variables declaration//GEN-END:variables

}
