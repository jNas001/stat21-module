/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.sun.java.swing.plaf.windows.WindowsButtonUI;
import com.sun.java.swing.plaf.windows.WindowsLabelUI;
import com.sun.java.swing.plaf.windows.WindowsMenuBarUI;
import com.sun.java.swing.plaf.windows.WindowsMenuUI;
import java.awt.Color;
import java.awt.Point;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Nas
 */
public class srMain extends javax.swing.JFrame {

    /**
     * Creates new form srMain
     */
    public srMain() {
        initComponents();
        setLocationRelativeTo(null);
        setDesign();
    }

    private void setDesign(){
        jMenuBar1.setUI(new WindowsMenuBarUI());
        jMenuBar1.setBorderPainted(true);
        jMenuBar1.setLocation(new Point(20, 110));
        jMenuBar1.setBackground(Color.red);
        jMenu4.setUI(new WindowsMenuUI());
        jMenu5.setUI(new WindowsMenuUI());
        jMenu6.setUI(new WindowsMenuUI());
        btn_chap1.setUI(new WindowsButtonUI());
        btn_chap2.setUI(new WindowsButtonUI());
        btn_chap3.setUI(new WindowsButtonUI());
        btn_chap4.setUI(new WindowsButtonUI());
        btn_chap5.setUI(new WindowsButtonUI());
        btn_chap6.setUI(new WindowsButtonUI());
        btn_chap7.setUI(new WindowsButtonUI());
        btn_chap8.setUI(new WindowsButtonUI());
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblANOVA.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        renderer.setUI(new WindowsLabelUI());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDefinition = new javax.swing.JTextArea();
        txtReplication = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInputData = new javax.swing.JTable();
        txtTitleOfTable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtObservation = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoOfTable = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTreatment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCOnstruct = new javax.swing.JButton();
        jSeparatorOfResult = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCRD = new javax.swing.JTable();
        lblNameOfTable = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblANOVA = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_chap1 = new javax.swing.JButton();
        btn_chap2 = new javax.swing.JButton();
        btn_chap3 = new javax.swing.JButton();
        btn_chap4 = new javax.swing.JButton();
        btn_chap5 = new javax.swing.JButton();
        btn_chap6 = new javax.swing.JButton();
        btn_chap7 = new javax.swing.JButton();
        btn_chap8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        txtDefinition.setColumns(20);
        txtDefinition.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDefinition.setLineWrap(true);
        txtDefinition.setRows(5);
        txtDefinition.setText("Consider an experiment conducted by the Department of Entomology of the International Rice Research Institute to investigate the effects of foliar and granular applications of some selected insecticides for the control of the brown planthopper");
        txtDefinition.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDefinition);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel9.setText("Enter the name of observation:");

        tblInputData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblInputData);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel3.setText("Title of the table:");

        btnNext.setText("Next");

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel1.setText("Definition:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel6.setText("Enter the number of replication:");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel8.setText("Input the data in the table.");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel5.setText("Enter the number of treatments:");

        jLabel7.setText("NOTE: This is only for equal replication");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel2.setText("Table No.");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel4.setText("CONSTRUCTING TABLE");

        btnCOnstruct.setText("Construct CRD");

        jSeparatorOfResult.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblCRD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Treatment", "No. of Observation", "Treatment Total", "Treatment Mean"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCRD);

        lblNameOfTable.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        lblNameOfTable.setText("Table No.");

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        jLabel11.setText("Analysis of Varience");

        tblANOVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Source of Variation", "df", "Sum of Squares", "Mean Square", "Observed F", "tF @ 5%", "tf @ 1%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblANOVA.getTableHeader().setResizingAllowed(false);
        tblANOVA.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblANOVA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNoOfTable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTitleOfTable))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtReplication, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNext))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtObservation))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(btnCOnstruct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorOfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNameOfTable)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorOfResult)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtNoOfTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtTitleOfTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txtObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtReplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNext)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCOnstruct))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblNameOfTable)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Module");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Stat 21: Modules");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_chap1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap1.setText("   Chapter 1: Introduction");
        btn_chap1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap1.setPreferredSize(new java.awt.Dimension(73, 35));
        btn_chap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chap1ActionPerformed(evt);
            }
        });

        btn_chap2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap2.setText("   Chapter 2: Methods of Data Collection and Presentation");
        btn_chap2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap2.setPreferredSize(new java.awt.Dimension(73, 35));

        btn_chap3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap3.setText("   Chapter 3: Frequency Distributions");
        btn_chap3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap3.setPreferredSize(new java.awt.Dimension(73, 35));

        btn_chap4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap4.setText("   Chapter 4: Common Measures of Location and Variation");
        btn_chap4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap4.setPreferredSize(new java.awt.Dimension(73, 35));

        btn_chap5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap5.setText("   Chapter 5: Probability and Probability Distributions");
        btn_chap5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap5.setPreferredSize(new java.awt.Dimension(73, 35));
        btn_chap5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chap5ActionPerformed(evt);
            }
        });

        btn_chap6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap6.setText("   Chapter 6:");
        btn_chap6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap6.setPreferredSize(new java.awt.Dimension(73, 35));

        btn_chap7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap7.setText("   Chapter 7:");
        btn_chap7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap7.setPreferredSize(new java.awt.Dimension(73, 35));

        btn_chap8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_chap8.setText("   Chapter 8: Experimental Designs");
        btn_chap8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_chap8.setPreferredSize(new java.awt.Dimension(73, 35));
        btn_chap8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chap8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_chap3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_chap6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_chap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chap8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Samples");

        jMenu4.setText("Presentation");

        jMenuItem1.setText("Textual");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Tabular");
        jMenu4.add(jMenuItem2);

        jMenu5.setText("Graphical");

        jMenuItem3.setText("Line Chart");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Column Chart");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Horizontal Bar Chart");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Pie Chart");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Statistical Map");
        jMenu5.add(jMenuItem7);

        jMenu4.add(jMenu5);

        jMenu3.add(jMenu4);

        jMenu6.setText("Experimental Designs");

        jMenuItem8.setText("CRD");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("RCBD");
        jMenu6.add(jMenuItem9);

        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chap5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chap5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chap5ActionPerformed

    private void btn_chap8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chap8ActionPerformed
        // TODO add your handling code here:
        new jdCRD(this, true).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_chap8ActionPerformed

    private void btn_chap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chap1ActionPerformed
        // TODO add your handling code here:
        new jfChapterOne().setVisible(true);
        
    }//GEN-LAST:event_btn_chap1ActionPerformed

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
            java.util.logging.Logger.getLogger(srMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(srMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(srMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(srMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new srMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCOnstruct;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btn_chap1;
    private javax.swing.JButton btn_chap2;
    private javax.swing.JButton btn_chap3;
    private javax.swing.JButton btn_chap4;
    private javax.swing.JButton btn_chap5;
    private javax.swing.JButton btn_chap6;
    private javax.swing.JButton btn_chap7;
    private javax.swing.JButton btn_chap8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorOfResult;
    private javax.swing.JLabel lblNameOfTable;
    private javax.swing.JTable tblANOVA;
    private javax.swing.JTable tblCRD;
    private javax.swing.JTable tblInputData;
    private javax.swing.JTextArea txtDefinition;
    private javax.swing.JTextField txtNoOfTable;
    private javax.swing.JTextField txtObservation;
    private javax.swing.JTextField txtReplication;
    private javax.swing.JTextField txtTitleOfTable;
    private javax.swing.JTextField txtTreatment;
    // End of variables declaration//GEN-END:variables
}
