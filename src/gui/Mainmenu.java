package gui;

import utils.DataEntry;
import utils.DataAnalyzer;
import JDBC.DatabaseManager;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Mainmenu extends javax.swing.JFrame {

    boolean a = false;
    private DataEntry currentLoadedDataEntry;
    private List<DataEntry> dataHistory;
    
    public Mainmenu() {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }catch(Exception ex){
            
        }
        
        initComponents();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Buttonmax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        headerText = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        lineseting = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        Buttonsetting = new javax.swing.JLabel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        linehidemenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        analysis = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        history = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        dataAnalysisWorkbench = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rawDataInput1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rawDataInput2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        basicStatsOutput = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        loadData = new javax.swing.JButton();
        analysisPage = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        importCSV = new javax.swing.JButton();
        exportCSV = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dataSetNameField = new javax.swing.JTextField();
        historyPage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dataComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(5, 10, 46));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(5, 10, 46));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(5, 10, 46));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Buttonmax.setBackground(new java.awt.Color(5, 10, 46));
        Buttonmax.setLayout(new java.awt.BorderLayout());

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });
        Buttonmax.add(fullmax, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        Header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        headerText.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText.setText("                          Data Analysis Workbench");
        Header.add(headerText, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(50, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(5, 10, 46));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineseting.setBackground(new java.awt.Color(5, 10, 46));
        lineseting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linesetingLayout = new javax.swing.GroupLayout(lineseting);
        lineseting.setLayout(linesetingLayout);
        linesetingLayout.setHorizontalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesetingLayout.setVerticalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(lineseting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        setting.setBackground(new java.awt.Color(5, 10, 46));
        setting.setLayout(new java.awt.BorderLayout());

        Buttonsetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buttonsetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/settings_32px.png"))); // NOI18N
        Buttonsetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buttonsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonsettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonsettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonsettingMouseExited(evt);
            }
        });
        setting.add(Buttonsetting, java.awt.BorderLayout.CENTER);

        MenuIcon.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 50));

        hidemenu.setBackground(new java.awt.Color(5, 10, 46));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu_32px.png"))); // NOI18N
        buttonhidemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.CENTER);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        linehidemenu.setBackground(new java.awt.Color(5, 10, 46));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(25, 29, 74));
        menuhide.setLayout(new java.awt.GridLayout(6, 1));

        jButton1.setText("Home Page");
        menuhide.add(jButton1);

        analysis.setText("Start Analysis");
        analysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisActionPerformed(evt);
            }
        });
        menuhide.add(analysis);

        jButton2.setText("Graph Page");
        menuhide.add(jButton2);

        history.setText("History Page");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        menuhide.add(history);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        content.setBackground(new java.awt.Color(73, 128, 242));
        content.setLayout(new java.awt.CardLayout());

        dataAnalysisWorkbench.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(750, 275));
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Raw Data Input 1")));

        rawDataInput1.setColumns(20);
        rawDataInput1.setLineWrap(true);
        rawDataInput1.setRows(5);
        rawDataInput1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(rawDataInput1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel8);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "  Raw Data Input 2")));

        rawDataInput2.setColumns(20);
        rawDataInput2.setLineWrap(true);
        rawDataInput2.setRows(5);
        rawDataInput2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(rawDataInput2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel9);

        jPanel5.add(jPanel4);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Basic Statistics")));

        basicStatsOutput.setColumns(20);
        basicStatsOutput.setLineWrap(true);
        basicStatsOutput.setRows(5);
        basicStatsOutput.setWrapStyleWord(true);
        jScrollPane3.setViewportView(basicStatsOutput);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel6);

        dataAnalysisWorkbench.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel7.setPreferredSize(new java.awt.Dimension(750, 75));

        loadData.setText("Calculate Basic Statistics");
        loadData.setPreferredSize(new java.awt.Dimension(180, 50));
        loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataActionPerformed(evt);
            }
        });
        jPanel7.add(loadData);

        analysisPage.setText("Analysis Page");
        analysisPage.setPreferredSize(new java.awt.Dimension(115, 50));
        jPanel7.add(analysisPage);

        clr.setText("Clear Data");
        clr.setPreferredSize(new java.awt.Dimension(95, 50));
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        jPanel7.add(clr);

        importCSV.setText("Import CSV Data");
        importCSV.setPreferredSize(new java.awt.Dimension(127, 50));
        importCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCSVActionPerformed(evt);
            }
        });
        jPanel7.add(importCSV);

        exportCSV.setText("Expore CSV Data");
        exportCSV.setPreferredSize(new java.awt.Dimension(131, 50));
        exportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCSVActionPerformed(evt);
            }
        });
        jPanel7.add(exportCSV);

        dataAnalysisWorkbench.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(750, 35));

        jLabel5.setText("Data Set Name:    ");
        jPanel3.add(jLabel5);

        dataSetNameField.setPreferredSize(new java.awt.Dimension(200, 23));
        dataSetNameField.setSize(new java.awt.Dimension(100, 23));
        jPanel3.add(dataSetNameField);

        dataAnalysisWorkbench.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        content.add(dataAnalysisWorkbench, "card2");

        historyPage.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));

        jLabel2.setText("Select Data Set:");
        jPanel1.add(jLabel2);

        dataComboBox.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel1.add(dataComboBox);

        jButton3.setText("Load Selected Data to Main");
        jPanel1.add(jButton3);

        jButton5.setText(" Delete Selected Data");
        jPanel1.add(jButton5);

        historyPage.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(750, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Raw Data Details")));

        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableModel);

        jPanel2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        historyPage.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setPreferredSize(new java.awt.Dimension(750, 50));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        historyPage.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        content.add(historyPage, "card3");

        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        if(numberbool == 1){
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        }
        else{
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Icon/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Icon/back_32px.png");
        }
        
    }
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(25, 29, 74));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(5, 10, 46));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
        WelcomeFrame welcome = new WelcomeFrame();
        welcome.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        changecolor(Buttonmax, new Color(25, 29, 74));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        changecolor(Buttonmax, new Color(5, 10, 46));
    }//GEN-LAST:event_fullmaxMouseExited

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        if(this.getExtendedState()!= Mainmenu.MAXIMIZED_BOTH){
          this.setExtendedState(Mainmenu.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Mainmenu.NORMAL);
        }
    }//GEN-LAST:event_fullmaxMouseClicked

    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
        changecolor(linehidemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(5, 10, 46));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
        clickmenu(hidemenu, setting, 1);
        //create void for methode hide and show panel menu
        if(a==true){
          hideshow(menu, a, buttonhidemenu);
          SwingUtilities.updateComponentTreeUI(this);
          //create methode change image
          
          a=false;
        }
        else{
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
        
    }//GEN-LAST:event_buttonhidemenuMouseClicked

    private void ButtonsettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonsettingMouseEntered
        changecolor(lineseting, new Color(8, 177, 150));
    }//GEN-LAST:event_ButtonsettingMouseEntered

    private void ButtonsettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonsettingMouseExited
        changecolor(lineseting, new Color(5, 10, 46));
    }//GEN-LAST:event_ButtonsettingMouseExited

    private void ButtonsettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonsettingMouseClicked
        clickmenu(setting, hidemenu, 1);
    }//GEN-LAST:event_ButtonsettingMouseClicked

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        CardLayout layout = (CardLayout) content.getLayout();
        layout.show(content, "card3"); 
        headerText.setText("                          History Page");
        setTitle("Data Analysis Software - History");
    }//GEN-LAST:event_historyActionPerformed

    private void analysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisActionPerformed
        CardLayout layout = (CardLayout) content.getLayout();
        layout.show(content, "card2");
        headerText.setText("                          Data Analysis Workbench");
        setTitle("Data Analysis Software - Workbench");
    }//GEN-LAST:event_analysisActionPerformed

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        loadData();
    }//GEN-LAST:event_loadDataActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        clearAllData();
    }//GEN-LAST:event_clrActionPerformed

    private void importCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCSVActionPerformed
        importCsvData();
    }//GEN-LAST:event_importCSVActionPerformed

    private void exportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCSVActionPerformed
        exportDataToCsv();
    }//GEN-LAST:event_exportCSVActionPerformed

// functionss
    private void loadData() {
        String name = dataSetNameField.getText().trim();
        String rawText1 = rawDataInput1.getText();
        String rawText2 = rawDataInput2.getText();

        if (rawText1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter some data in 'Raw Data Input 1'.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name for this data set.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            List<Double> parsedData1 = parseData(rawText1);
            List<Double> parsedData2 = parseData(rawText2); // Parse second data set

            if (parsedData1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No valid numbers found in 'Raw Data Input 1'.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create a new DataEntry and add to database
            DataEntry newDataEntry = new DataEntry(name, parsedData1, parsedData2);
            if (DatabaseManager.saveDataEntry(newDataEntry)) {
                // Refresh dataHistory from DB after saving
                dataHistory = DatabaseManager.getAllDataEntries();
                currentLoadedDataEntry = newDataEntry; // Set this as the currently active data

                // Calculate basic statistics for Data 1 (currentLoadedDataEntry.getData1())
                double mean = DataAnalyzer.calculateMean(currentLoadedDataEntry.getData1());
                double median = DataAnalyzer.calculateMedian(currentLoadedDataEntry.getData1());
                double mode = DataAnalyzer.calculateMode(currentLoadedDataEntry.getData1());
                double min = Collections.min(currentLoadedDataEntry.getData1());
                double max = Collections.max(currentLoadedDataEntry.getData1());
                long count = currentLoadedDataEntry.getData1().size();
                double sampleStdDev = DataAnalyzer.calculateStandardDeviation(currentLoadedDataEntry.getData1(), false);

                // Display results for Data 1
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Data Set Name: %s%n", currentLoadedDataEntry.getName()));
                sb.append(String.format("Time Added: %s%n%n", currentLoadedDataEntry.getTimestamp()));
                sb.append(String.format("Data Count (Data 1): %d%n", count));
                sb.append(String.format("Mean (Data 1): %.4f%n", mean));
                sb.append(String.format("Median (Data 1): %.4f%n", median));
                sb.append(String.format("Mode (Data 1): %.4f%n", mode));
                sb.append(String.format("Minimum (Data 1): %.4f%n", min));
                sb.append(String.format("Maximum (Data 1): %.4f%n", max));
                sb.append(String.format("Sample Standard Deviation (Data 1): %.4f%n", sampleStdDev));

                if (!currentLoadedDataEntry.getData2().isEmpty()) {
                    sb.append(String.format("%nData Count (Data 2): %d%n", currentLoadedDataEntry.getData2().size()));
                    sb.append(String.format("Mean (Data 2): %.4f%n", DataAnalyzer.calculateMean(currentLoadedDataEntry.getData2())));
                    sb.append(String.format("Median (Data 2): %.4f%n", median));
                    sb.append(String.format("Mode (Data 2): %.4f%n", mode));
                    sb.append(String.format("Minimum (Data 2): %.4f%n", min));
                    sb.append(String.format("Maximum (Data 2): %.4f%n", max));
                    sb.append(String.format("Sample Standard Deviation (Data 2): %.4f%n", sampleStdDev));
                } else {
                    sb.append("%nNo data loaded for Data 2.");
                }

                basicStatsOutput.setText(sb.toString());
                JOptionPane.showMessageDialog(this, "Data '" + name + "' loaded and added to history.", "Data Loaded", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save data to database.", "Database Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format in input. Please enter only numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            basicStatsOutput.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            basicStatsOutput.setText("");
        }
    }

    
    public void loadDataEntryIntoInputs(DataEntry entry) {
        this.currentLoadedDataEntry = entry;
        dataSetNameField.setText(entry.getName());
        rawDataInput1.setText(entry.getData1().stream().map(String::valueOf).collect(Collectors.joining(", ")));
        rawDataInput2.setText(entry.getData2().stream().map(String::valueOf).collect(Collectors.joining(", ")));
        // Recalculate and display basic stats for the loaded data
        // This part is crucial to refresh the UI after loading from history
        try {
            double mean = DataAnalyzer.calculateMean(currentLoadedDataEntry.getData1());
            double median = DataAnalyzer.calculateMedian(currentLoadedDataEntry.getData1());
            double mode = DataAnalyzer.calculateMode(currentLoadedDataEntry.getData1());
            double min = Collections.min(currentLoadedDataEntry.getData1());
            double max = Collections.max(currentLoadedDataEntry.getData1());
            long count = currentLoadedDataEntry.getData1().size();
            double sampleStdDev = DataAnalyzer.calculateStandardDeviation(currentLoadedDataEntry.getData1(), false);

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Data Set Name: %s%n", currentLoadedDataEntry.getName()));
            sb.append(String.format("Time Added: %s%n%n", currentLoadedDataEntry.getTimestamp()));
            sb.append(String.format("Data Count (Data 1): %d%n", count));
            sb.append(String.format("Mean (Data 1): %.4f%n", mean));
            sb.append(String.format("Median (Data 1): %.4f%n", median));
            sb.append(String.format("Mode (Data 1): %.4f%n", mode));
            sb.append(String.format("Minimum (Data 1): %.4f%n", min));
            sb.append(String.format("Maximum (Data 1): %.4f%n", max));
            sb.append(String.format("Sample Standard Deviation (Data 1): %.4f%n", sampleStdDev));

            if (!currentLoadedDataEntry.getData2().isEmpty()) {
                sb.append(String.format("%nData Count (Data 2): %d%n", currentLoadedDataEntry.getData2().size()));
                sb.append(String.format("Mean (Data 2): %.4f%n", DataAnalyzer.calculateMean(currentLoadedDataEntry.getData2())));
            } else {
                sb.append("%nNo data loaded for Data 2.");
            }
            basicStatsOutput.setText(sb.toString());
        } catch (Exception e) {
            basicStatsOutput.setText("Error displaying loaded data: " + e.getMessage());
        }
    }

    /**
     * Imports data from a selected CSV file into the raw data input fields.
     * Assumes CSV has two columns, or one if only Data 1 is present.
     */
    private void importCsvData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Import Data from CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(fileToLoad))) {
                StringBuilder data1Builder = new StringBuilder();
                StringBuilder data2Builder = new StringBuilder();
                String line;
                boolean headerSkipped = false; // Simple header skip

                while ((line = br.readLine()) != null) {
                    if (!headerSkipped) { // Skip first line if it's a header
                        headerSkipped = true;
                        continue;
                    }
                    String[] values = line.split(","); // Assuming comma-separated
                    if (values.length > 0) {
                        data1Builder.append(values[0].trim()).append("\n");
                    }
                    if (values.length > 1) {
                        data2Builder.append(values[1].trim()).append("\n");
                    }
                }
                rawDataInput1.setText(data1Builder.toString().trim());
                rawDataInput2.setText(data2Builder.toString().trim());
                dataSetNameField.setText(fileToLoad.getName().replace(".csv", "")); // Suggest name from filename
                JOptionPane.showMessageDialog(this, "Data imported successfully from " + fileToLoad.getName(), "Import Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading CSV file: " + ex.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "An unexpected error occurred during CSV import: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Exports the currently loaded data (Data 1 and Data 2) to a CSV file.
     */
    private void exportDataToCsv() {
        if (currentLoadedDataEntry == null) {
            JOptionPane.showMessageDialog(this, "No data loaded to export.", "No Data", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Export Data to CSV");
        fileChooser.setSelectedFile(new File(currentLoadedDataEntry.getName().isEmpty() ? "exported_data.csv" : currentLoadedDataEntry.getName() + ".csv"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            // Ensure .csv extension
            if (!fileToSave.getName().toLowerCase().endsWith(".csv")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileToSave))) {
                List<Double> data1 = currentLoadedDataEntry.getData1();
                List<Double> data2 = currentLoadedDataEntry.getData2();

                // Write header
                bw.write("Data1");
                if (!data2.isEmpty()) {
                    bw.write(",Data2");
                }
                bw.newLine();

                int maxRows = Math.max(data1.size(), data2.size());
                for (int i = 0; i < maxRows; i++) {
                    StringBuilder row = new StringBuilder();
                    if (i < data1.size()) {
                        row.append(data1.get(i));
                    } else {
                        row.append(""); // Empty if no data
                    }

                    if (!data2.isEmpty()) {
                        row.append(",");
                        if (i < data2.size()) {
                            row.append(data2.get(i));
                        } else {
                            row.append(""); // Empty if no data
                        }
                    }
                    bw.write(row.toString());
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Data exported successfully to " + fileToSave.getName(), "Export Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing CSV file: " + ex.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "An unexpected error occurred during CSV export: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    private void clearAllData() {
        dataSetNameField.setText("");
        rawDataInput1.setText("");
        rawDataInput2.setText("");
        basicStatsOutput.setText("");
        currentLoadedDataEntry = null; // Clear the currently active data
        // Note: This does NOT clear the history list, only the current inputs.
        // History items must be deleted from the HistoryFrame.
        JOptionPane.showMessageDialog(this, "Current data inputs and results have been cleared.", "Inputs Cleared", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private List<Double> parseData(String rawText) throws NumberFormatException {
        List<Double> dataList = new ArrayList<>();
        String[] numbers = rawText.trim().split("[,\\s]+");
        for (String numStr : numbers) {
            if (!numStr.isEmpty()) {
                dataList.add(Double.parseDouble(numStr));
            }
        }
        return dataList;
    }
    
    
    // end of functions
    
    
    // table functionss
    
//    private void populateComboBox() {
//        dataComboBox.removeAllItems();
//        // Re-fetch from database to ensure up-to-date list
//        dataHistory.clear();
//        dataHistory.addAll(DatabaseManager.getAllDataEntries());
//        for (DataEntry entry : dataHistory) {
//            dataComboBox.addItem(entry);
//        }
//    }
//
//    /**
//     * Displays the raw data of the currently selected DataEntry in the JTable.
//     */
//    private void displaySelectedData() {
//        tableModel.setRowCount(0); // Clear existing rows
//
//        DataEntry selectedEntry = (DataEntry) dataComboBox.getSelectedItem();
//        if (selectedEntry != null) {
//            List<Double> data1 = selectedEntry.getData1();
//            List<Double> data2 = selectedEntry.getData2();
//
//            int maxRows = Math.max(data1.size(), data2 != null ? data2.size() : 0);
//
//            for (int i = 0; i < maxRows; i++) {
//                Vector<Object> row = new Vector<>();
//                row.add(i); // Index
//
//                // Data 1 value
//                row.add(i < data1.size() ? String.format("%.4f", data1.get(i)) : "");
//
//                // Data 2 value
//                row.add(data2 != null && i < data2.size() ? String.format("%.4f", data2.get(i)) : "");
//                tableModel.addRow(row);
//            }
//        }
//    }
//    
//       private void loadSelectedData() {
//        DataEntry selectedEntry = (DataEntry) dataComboBox.getSelectedItem();
//        if (selectedEntry != null) {
//            mainFrame.loadDataEntryIntoInputs(selectedEntry);
//            JOptionPane.showMessageDialog(this, "Data '" + selectedEntry.getName() + "' loaded into Main Page.", "Data Loaded", JOptionPane.INFORMATION_MESSAGE);
//            Timer disposeTimer = new Timer(10, new ActionListener() {
//                float opacity = 1f;
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    opacity -= 0.05f;
//                    if (opacity <= 0f) {
//                        opacity = 0f;
//                        ((Timer)e.getSource()).stop();
//                        HistoryFrame.this.dispose();
//                        mainFrame.setVisible(true);
//                        mainFrame.fadeIn();
//                    }
//                    setOpacity(opacity);
//                }
//            });
//            disposeTimer.start();
//        } else {
//            JOptionPane.showMessageDialog(this, "Please select a data set to load.", "No Selection", JOptionPane.WARNING_MESSAGE);
//        }
//    }
//
//    /**
//     * Deletes the currently selected data entry from the history.
//     */
//    private void deleteSelectedData() {
//        DataEntry selectedEntry = (DataEntry) dataComboBox.getSelectedItem();
//        if (selectedEntry != null) {
//            int confirm = JOptionPane.showConfirmDialog(this,
//                    "Are you sure you want to delete data set '" + selectedEntry.getName() + "'?",
//                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);
//            if (confirm == JOptionPane.YES_OPTION) {
//                if (DatabaseManager.deleteDataEntry(selectedEntry)) {
//                    JOptionPane.showMessageDialog(this, "Data set '" + selectedEntry.getName() + "' deleted from database.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
//                    populateComboBox(); // Refresh the combo box after deletion
//                    displaySelectedData(); // Update table display
//                } else {
//                    JOptionPane.showMessageDialog(this, "Failed to delete data set '" + selectedEntry.getName() + "'.", "Deletion Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Please select a data set to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
//        }
//    }
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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JLabel Buttonsetting;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JButton analysis;
    private javax.swing.JButton analysisPage;
    private javax.swing.JTextArea basicStatsOutput;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JButton clr;
    private javax.swing.JPanel content;
    private javax.swing.JPanel dataAnalysisWorkbench;
    private javax.swing.JComboBox<String> dataComboBox;
    private javax.swing.JTextField dataSetNameField;
    private javax.swing.JButton exportCSV;
    private javax.swing.JLabel fullmax;
    private javax.swing.JLabel headerText;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JButton history;
    private javax.swing.JPanel historyPage;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JButton importCSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JButton loadData;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JTextArea rawDataInput1;
    private javax.swing.JTextArea rawDataInput2;
    private javax.swing.JPanel setting;
    private javax.swing.JTable tableModel;
    // End of variables declaration//GEN-END:variables

}
