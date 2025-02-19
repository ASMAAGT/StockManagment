/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.ProductController;
import Controller.PurchaseController;
import Model.Product;
import Model.Purchase;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iyed
 */
public class MakePurchase extends javax.swing.JInternalFrame {

    /**
     * Creates new form Export
     */
    public MakePurchase() {
        initComponents();
       GetToday();
         TxtprId.setEnabled(false);
        
        ArrayList<Product>  myproductlist = new ProductController().retrieveAll();
        DefaultTableModel model = new DefaultTableModel() ;
        productList.setModel(model) ; 
        model.addColumn("idPro");
        model.addColumn("namePro");
        model.addColumn("category");
        model.addColumn("quantity");
        model.addColumn("price");
       

        for (Product p : myproductlist) {            
            Object[] row =   new Object[]{p.getIdPro(), p.getNamePro(), p.getCategorie(), p.getQte(), p.getPrice() };
            model.addRow(  row);
        }
        productList.setModel(model);
        /////////////////////////////////////
    }
    public void refresh()
    {
        TxtprId.setText("");
        TxtProductName.setText("");
        TxtPrice.setText("");
        TxtQuantity.setText("");
        Amountlbl.setText("");
    }
    public void GetToday()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        datelbl.setText(dtf.format(now));
    }
    
        public void Amount()
    {  if(!TxtQuantity.getText().isEmpty()){
        Amountlbl.setText(String.valueOf(Float.valueOf(TxtPrice.getText()) * Integer.valueOf(TxtQuantity.getText())));
    }else
    {
        Amountlbl.setText("Please specify the quantity needed ! ");
    }}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productList = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtprId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtProductName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtQuantity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtPrice = new javax.swing.JTextField();
        datelbl = new javax.swing.JLabel();
        AddButn1 = new com.k33ptoo.components.KButton();
        CancelBtn = new com.k33ptoo.components.KButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Amountlbl = new javax.swing.JLabel();
        Txtsearch = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Make Purchase");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(900);
        kGradientPanel1.setkStartColor(new java.awt.Color(15, 95, 134));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchasing Management");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/money_bag_y8voit0gtqim_64.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 110));

        productList.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        productList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        productList.setDragEnabled(true);
        productList.setOpaque(false);
        productList.setSelectionBackground(new java.awt.Color(15, 95, 134));
        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 780, 310));

        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Products List");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("PurchaseId");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        TxtprId.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(TxtprId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 120, 30));

        jLabel15.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("ProductName");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));
        jPanel1.add(TxtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 30));

        jLabel18.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Quantity to add");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, -1, -1));
        jPanel1.add(TxtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 120, 30));

        jLabel16.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Price");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, -1, -1));
        jPanel1.add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 120, 30));

        datelbl.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        datelbl.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        AddButn1.setText("Buy");
        AddButn1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        AddButn1.setkBorderRadius(50);
        AddButn1.setkEndColor(new java.awt.Color(102, 204, 255));
        AddButn1.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        AddButn1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        AddButn1.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        AddButn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButn1ActionPerformed(evt);
            }
        });
        jPanel1.add(AddButn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 710, -1, -1));

        CancelBtn.setText("Cancel");
        CancelBtn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        CancelBtn.setkBorderRadius(50);
        CancelBtn.setkEndColor(new java.awt.Color(102, 204, 255));
        CancelBtn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        CancelBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        CancelBtn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 710, -1, -1));

        jLabel20.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Date");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        jLabel21.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("Amount to pay");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, -1, -1));

        Amountlbl.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Amountlbl.setForeground(new java.awt.Color(204, 0, 102));
        jPanel1.add(Amountlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, -1, -1));

        Txtsearch.setBackground(new Color (0,0,0,0));
        Txtsearch.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        Txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        Txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(15, 95, 134)));
        Txtsearch.setOpaque(false);
        jPanel1.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 310, 33));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/search_r3mpefxhd0uh_32.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1150, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        int x= productList.getSelectedRow();
        if(x == -1){
            JOptionPane.showMessageDialog(this,
                "Select row please !",
                "Information Message", JOptionPane.INFORMATION_MESSAGE);
        } else{

            int id = Integer.parseInt(""+productList.getValueAt(x, 0));
            String Name = (String) productList.getValueAt(x, 1);
            Float price = Float.parseFloat(""+productList.getValueAt(x, 4));

            TxtProductName.setText(Name);
            TxtPrice.setText(String.valueOf(price));

        }

    }//GEN-LAST:event_productListMouseClicked

    private void AddButn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButn1ActionPerformed
        Product product = new Product ();
        int x= productList.getSelectedRow();
        int id = Integer.parseInt(""+productList.getValueAt(x, 0));
        int qte = Integer.parseInt(""+productList.getValueAt(x, 3));
        String Name = (String) productList.getValueAt(x, 1);
        Float price = Float.parseFloat(""+productList.getValueAt(x, 4));
        String cat = (String) productList.getValueAt(x, 2);
        System.out.println( qte);
                product.setQte(qte+(Integer.valueOf(TxtQuantity.getText())));
                product.setNamePro(Name);
                product.setCategorie(cat);
                product.setPrice(price);

                boolean result1 = new ProductController().update(id, product);
                if(result1){

                    JOptionPane.showMessageDialog(this,
                        product.getNamePro().toUpperCase()+" est modifié avec success ",
                        "Modifier utilisateur", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Product>  myproductlist = new ProductController().retrieveAll();
                    DefaultTableModel model1 = new DefaultTableModel() ;
                    productList.setModel(model1) ;
                    model1.addColumn("IdPro");
                    model1.addColumn("NamePro");
                    model1.addColumn("CategoryPro");
                    model1.addColumn("QuantityPro");
                    model1.addColumn("PricePro");

                    for (Product pr : myproductlist) {
                        Object[] row =   new Object[]{pr.getIdPro(), pr.getNamePro(), pr.getCategorie(), pr.getQte(), pr.getPrice() };
                        model1.addRow(row);
                    }
                    productList.setModel(model1);
                }
                     
        Purchase purchase = new Purchase();
        if (TxtProductName.getText().isEmpty()||TxtQuantity.getText().isEmpty()||TxtPrice.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Informations ! Please Select a product or client and Enter the Quantity");
           
       }else
          {
        
        purchase.setPrice (Float.valueOf(TxtPrice.getText()));
        purchase.setTotal (purchase.getPrice() * Integer.valueOf(TxtQuantity.getText()));
        purchase.setNamePro(TxtProductName.getText());
        purchase.setQte(Integer.valueOf(TxtQuantity.getText()));
        purchase.setDate(datelbl.getText());
  
        boolean result = new PurchaseController().create(purchase);
       
       if(result){              
            JOptionPane.showMessageDialog(this,
            purchase.getNamePro()+" Is successfuly added  ",
            "New Order", JOptionPane.INFORMATION_MESSAGE);
            //new userList().setVisible(true);
            ShowOrders orders = new ShowOrders();
                     ArrayList<Purchase>  mypurchaselist = new PurchaseController().retrieveAll();
                    DefaultTableModel model1 = new DefaultTableModel() ;
                    orders.OrdersList.setModel(model1) ; 
                    model1.addColumn("Id");
                    model1.addColumn("NameProduct");
                    model1.addColumn("Quantity");
                    model1.addColumn("Price");
                    model1.addColumn("Total");
                    model1.addColumn("Date");

                    for (Purchase u : mypurchaselist) {            
                        Object[] row =   new Object[]{u.getId(), u.getNamePro(), u.getQte(), u.getPrice(),u.getTotal(),u.getDate() };
                        model1.addRow(  row);
                    }
                    orders.OrdersList.setModel(model1);
            refresh();
            
        } }

    }//GEN-LAST:event_AddButn1ActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        refresh();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
         String keyword= Txtsearch.getText();
        ArrayList<Product>  myproductlist = new ProductController().retrieveByKeyWord(keyword);
        DefaultTableModel model = new DefaultTableModel() ;
        productList.setModel(model) ; 
        model.addColumn("idPro");
        model.addColumn("namePro");
        model.addColumn("category");
        model.addColumn("quantity");
        model.addColumn("price");
        model.addColumn("Type");

        for (Product p : myproductlist) {            
            Object[] row =   new Object[]{p.getIdPro(), p.getNamePro(), p.getCategorie(), p.getQte(), p.getPrice() };
            model.addRow(  row);
        }
        productList.setModel(model);
    }//GEN-LAST:event_SearchMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Amount();
    }//GEN-LAST:event_jLabel21MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton AddButn1;
    private javax.swing.JLabel Amountlbl;
    private com.k33ptoo.components.KButton CancelBtn;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtProductName;
    private javax.swing.JTextField TxtQuantity;
    private javax.swing.JTextField TxtprId;
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable productList;
    // End of variables declaration//GEN-END:variables
}
