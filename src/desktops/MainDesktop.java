/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktops;
import views.forms.masterfile.companyViews.CompanyListForm;
import views.forms.masterfile.supplierViews.SupplierListForm;
/**
 *
 * @author chris
 */
public class MainDesktop extends javax.swing.JFrame {

    /**
     * Creates new form MainDesktop
     */
    public MainDesktop() {
        initComponents();
        addListForms();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        companyAccess = new javax.swing.JMenuItem();
        suppliersAccess = new javax.swing.JMenuItem();
        transacAccess = new javax.swing.JMenu();
        requisiitionAccess = new javax.swing.JMenuItem();
        poAccess = new javax.swing.JMenuItem();
        recieveAccess = new javax.swing.JMenuItem();
        transferAccess = new javax.swing.JMenuItem();
        aboutAcces = new javax.swing.JMenu();
        erpAboutAccess = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lewis - 1   Micro ERP");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setModalExclusionType(null);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        desktopPane.setToolTipText("");
        desktopPane.setDesktopManager(null);
        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        companyAccess.setText("Company");
        companyAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyAccessActionPerformed(evt);
            }
        });
        fileMenu.add(companyAccess);

        suppliersAccess.setText("Suppliers");
        suppliersAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersAccessActionPerformed(evt);
            }
        });
        fileMenu.add(suppliersAccess);

        menuBar.add(fileMenu);

        transacAccess.setText("Transactions");

        requisiitionAccess.setText("Purchase Requisition");
        requisiitionAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requisiitionAccessActionPerformed(evt);
            }
        });
        transacAccess.add(requisiitionAccess);

        poAccess.setText("Purchase Order");
        poAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poAccessActionPerformed(evt);
            }
        });
        transacAccess.add(poAccess);

        recieveAccess.setText("Recieving Report");
        recieveAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recieveAccessActionPerformed(evt);
            }
        });
        transacAccess.add(recieveAccess);

        transferAccess.setText("Transfer");
        transferAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferAccessActionPerformed(evt);
            }
        });
        transacAccess.add(transferAccess);

        menuBar.add(transacAccess);

        aboutAcces.setText("About");

        erpAboutAccess.setText("Micro ERP");
        erpAboutAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erpAboutAccessActionPerformed(evt);
            }
        });
        aboutAcces.add(erpAboutAccess);

        menuBar.add(aboutAcces);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 961, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requisiitionAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requisiitionAccessActionPerformed
      //  desktopPane.add(new PurchaseRequisitionForm()).setVisible(true);
    }//GEN-LAST:event_requisiitionAccessActionPerformed

    private void poAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poAccessActionPerformed
     //   desktopPane.add(new PurchaseOrderForm()).setVisible(true);
    }//GEN-LAST:event_poAccessActionPerformed

    private void recieveAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recieveAccessActionPerformed
      //  desktopPane.add(new RecievingReportForm()).setVisible(true);
    }//GEN-LAST:event_recieveAccessActionPerformed

    private void transferAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferAccessActionPerformed
      // desktopPane.add(new TransferForm()).setVisible(true);
    }//GEN-LAST:event_transferAccessActionPerformed

    private void erpAboutAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erpAboutAccessActionPerformed
       // desktopPane.add(new AboutMicroERP()).setVisible(true);
    }//GEN-LAST:event_erpAboutAccessActionPerformed

    private void companyAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyAccessActionPerformed
      //  desktopPane.add(new CompanyProfileForm()).setVisible(true);
      companyLs.setVisible(true);
    }//GEN-LAST:event_companyAccessActionPerformed

    private void suppliersAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersAccessActionPerformed
      //  desktopPane.add(new SuppliersProfileForm()).setVisible(true);
      supplierLs.setVisible(true);
    }//GEN-LAST:event_suppliersAccessActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutAcces;
    private javax.swing.JMenuItem companyAccess;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem erpAboutAccess;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem poAccess;
    private javax.swing.JMenuItem recieveAccess;
    private javax.swing.JMenuItem requisiitionAccess;
    private javax.swing.JMenuItem suppliersAccess;
    private javax.swing.JMenu transacAccess;
    private javax.swing.JMenuItem transferAccess;
    // End of variables declaration//GEN-END:variables

    public CompanyListForm companyLs; 
    public SupplierListForm supplierLs;
    
    public final void addListForms(){
        companyLs = new CompanyListForm();
        desktopPane.add(companyLs);
        supplierLs = new SupplierListForm();
        desktopPane.add(supplierLs);
    }
}