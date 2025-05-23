package gui;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


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
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;



public class Mainmenu extends javax.swing.JFrame {

    boolean a = false;
    private DataEntry currentLoadedDataEntry;
    private List<DataEntry> dataHistory;
  private List<Double> data1 = new ArrayList<>();
private List<Double> data2 = new ArrayList<>();
private DefaultTableModel model;
    
    
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
        populateComboBox();
            
            
            
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
        populateComboBox();
        dataComboBox = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableModel = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        extraAnalysis = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datatwo = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultsOutput = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tTestOneSampleHypothesizedMeanField = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        zTestHypothesizedMeanField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        zTestPopulationStdDevField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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
        analysisPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisPageActionPerformed(evt);
            }
        });
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
        dataComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(dataComboBox);

        jButton3.setText("Load Selected Data to Main");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton5.setText(" Delete Selected Data");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        historyPage.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(750, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Raw Data Details")));

        tableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Index", "Data 1", "Data 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableModel);
        if (tableModel.getColumnModel().getColumnCount() > 0) {
            tableModel.getColumnModel().getColumn(0).setResizable(false);
            tableModel.getColumnModel().getColumn(1).setResizable(false);
        }

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

        extraAnalysis.setLayout(new java.awt.BorderLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Currently Loaded Data")));
        jPanel11.setPreferredSize(new java.awt.Dimension(750, 60));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));

        jLabel1.setText("Data 1: ");
        jPanel11.add(jLabel1);

        dataone.setText("Data placeholder");
        jPanel11.add(dataone);

        jLabel4.setText("Data 2:");
        jPanel11.add(jLabel4);

        datatwo.setText("Data Placeholder");
        jPanel11.add(datatwo);

        extraAnalysis.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Statistical Tests"))));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Analysis Result")));
        jPanel19.setPreferredSize(new java.awt.Dimension(730, 65));
        jPanel19.setLayout(new java.awt.BorderLayout());

        resultsOutput.setColumns(20);
        resultsOutput.setRows(5);
        jScrollPane5.setViewportView(resultsOutput);

        jPanel19.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jButton4.setText("Export Analysis to PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton4, java.awt.BorderLayout.PAGE_END);

        jPanel14.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel20.setBackground(new java.awt.Color(204, 204, 0));
        jPanel20.setPreferredSize(new java.awt.Dimension(730, 130));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Skewness")));

        jButton10.setText("Calculate Skewness");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton10);

        jPanel20.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel21.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "T-Test & Z-Test  (Two Sample Test)"))));
        jPanel21.setPreferredSize(new java.awt.Dimension(65, 65));

        jButton8.setText("Run Two Sample T-Test");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton8);

        jButton9.setText("Run Two Sample Z-Test");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton9);

        jPanel20.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        jPanel14.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel15.setPreferredSize(new java.awt.Dimension(730, 115));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "T-Test (One Sample) - Uses Data 1")));
        jPanel16.setPreferredSize(new java.awt.Dimension(730, 57));

        jLabel9.setText("Hypothesized Mean:");

        jButton7.setText("Run T-Test");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tTestOneSampleHypothesizedMeanField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(362, 362, 362))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tTestOneSampleHypothesizedMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton7))
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel17.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Z-Test (One Sample) - Uses Data 1")));
        jPanel17.setPreferredSize(new java.awt.Dimension(730, 57));

        jLabel7.setText("Hypothesized Mean:");

        zTestHypothesizedMeanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zTestHypothesizedMeanFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Population Standard Deviation: ");

        jButton6.setText("Run Z-Test");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zTestHypothesizedMeanField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zTestPopulationStdDevField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(zTestHypothesizedMeanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(zTestPopulationStdDevField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6))
        );

        jPanel15.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        extraAnalysis.add(jPanel12, java.awt.BorderLayout.CENTER);

        content.add(extraAnalysis, "card4");

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
        System.exit(0);
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

    private void dataComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataComboBoxActionPerformed
        displaySelectedData();
    }//GEN-LAST:event_dataComboBoxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        deleteSelectedData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadSelectedData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void analysisPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisPageActionPerformed
        setTitle("Data Analysis Software - Analysis Page");
        CardLayout layout = (CardLayout) content.getLayout();
        layout.show(content, "card4");
        headerText.setText("                          Analysis Page");
       updateDataPreviewsFromTextAreas();
    }//GEN-LAST:event_analysisPageActionPerformed

    private void zTestHypothesizedMeanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zTestHypothesizedMeanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zTestHypothesizedMeanFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       performZTestOneSample();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       performTTestOneSample();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       performTTestTwoSample();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        performZTestTwoSample();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         performSkewnessCalculation();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        generateSummaryPdf();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    // duplicate
    
    // Prevent duplicate entries in the database
private boolean isDuplicateDataEntry(String name) {
    for (DataEntry entry : dataHistory) {
        if (entry.getName().equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}

//for text data
private void updateDataPreviewsFromTextAreas() {
    if (dataone == null || datatwo == null) {
        System.err.println("Preview labels (dataone, datatwo) are not initialized");
        return;
    }

    try {
        List<Double> data1 = parseData(rawDataInput1.getText());
        List<Double> data2 = parseData(rawDataInput2.getText());

        String data1Preview = data1.isEmpty()
                ? "No data for Data 1."
                : data1.stream().limit(20).map(String::valueOf).collect(Collectors.joining(", "));

        if (data1.size() > 20) {
            data1Preview += "... (Total " + data1.size() + " values)";
        }

        String data2Preview = data2.isEmpty()
                ? "No data for Data 2."
                : data2.stream().limit(20).map(String::valueOf).collect(Collectors.joining(", "));

        if (data2.size() > 20) {
            data2Preview += "... (Total " + data2.size() + " values)";
        }

        dataone.setText(data1Preview);
        datatwo.setText(data2Preview);

    } catch (Exception e) {
        dataone.setText("Invalid input in Data 1");
        datatwo.setText("Invalid input in Data 2");
        e.printStackTrace();
    }
}


// functionss
private void loadData() {
    String name = dataSetNameField.getText().trim();
    if (isDuplicateDataEntry(name)) {
        JOptionPane.showMessageDialog(this, "A data set with this name already exists. Please choose a different name.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
        return;
    }

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

        List<Double> parsedData2 = new ArrayList<>();
        if (!rawText2.trim().isEmpty()) {
            parsedData2 = parseData(rawText2);
        }

        if (parsedData1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No valid numbers found in 'Raw Data Input 1'.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update instance variables here so other methods can use latest data
        this.data1 = parsedData1;
        this.data2 = parsedData2;

        DataEntry newDataEntry = new DataEntry(name, parsedData1, parsedData2);
        if (DatabaseManager.saveDataEntry(newDataEntry)) {
            dataHistory = DatabaseManager.getAllDataEntries();
            currentLoadedDataEntry = newDataEntry;

            double mean1 = DataAnalyzer.calculateMean(parsedData1);
            double median1 = DataAnalyzer.calculateMedian(parsedData1);
            double mode1 = DataAnalyzer.calculateMode(parsedData1);
            double min1 = Collections.min(parsedData1);
            double max1 = Collections.max(parsedData1);
            int count1 = parsedData1.size();
            double stdDev1 = DataAnalyzer.calculateStandardDeviation(parsedData1, false);

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Data Set Name: %s%n", newDataEntry.getName()));
            sb.append(String.format("Time Added: %s%n%n", newDataEntry.getTimestamp()));
            sb.append(String.format("Data Count (Data 1): %d%n", count1));
            sb.append(String.format("Mean (Data 1): %.4f%n", mean1));
            sb.append(String.format("Median (Data 1): %.4f%n", median1));
            sb.append(String.format("Mode (Data 1): %.4f%n", mode1));
            sb.append(String.format("Minimum (Data 1): %.4f%n", min1));
            sb.append(String.format("Maximum (Data 1): %.4f%n", max1));
            sb.append(String.format("Sample Standard Deviation (Data 1): %.4f%n", stdDev1));

            if (!parsedData2.isEmpty()) {
                double mean2 = DataAnalyzer.calculateMean(parsedData2);
                double median2 = DataAnalyzer.calculateMedian(parsedData2);
                double mode2 = DataAnalyzer.calculateMode(parsedData2);
                double min2 = Collections.min(parsedData2);
                double max2 = Collections.max(parsedData2);
                int count2 = parsedData2.size();
                double stdDev2 = DataAnalyzer.calculateStandardDeviation(parsedData2, false);

                sb.append(String.format("%nData Count (Data 2): %d%n", count2));
                sb.append(String.format("Mean (Data 2): %.4f%n", mean2));
                sb.append(String.format("Median (Data 2): %.4f%n", median2));
                sb.append(String.format("Mode (Data 2): %.4f%n", mode2));
                sb.append(String.format("Minimum (Data 2): %.4f%n", min2));
                sb.append(String.format("Maximum (Data 2): %.4f%n", max2));
                sb.append(String.format("Sample Standard Deviation (Data 2): %.4f%n", stdDev2));
            } else {
                sb.append("\nNo data loaded for Data 2.");
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
                sb.append(String.format("Median (Data 2): %.4f%n", median));
                sb.append(String.format("Mode (Data 2): %.4f%n", mode));
                sb.append(String.format("Minimum (Data 2): %.4f%n", min));
                sb.append(String.format("Maximum (Data 2): %.4f%n", max));
                sb.append(String.format("Sample Standard Deviation (Data 2): %.4f%n", sampleStdDev));
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
    String[] numbers = rawText.trim().split("[,\s]+"); // split by commas or whitespace
    for (String numStr : numbers) {
        if (!numStr.isEmpty()) {
            dataList.add(Double.parseDouble(numStr));
        }
    }
    return dataList;
}
    
    
    // end of functions
    
    
    // table functionss
    
private void populateComboBox() {
    if (dataComboBox == null) {
        System.err.println("dataComboBox is null");
        return;
    }

    dataComboBox.removeAllItems();
    System.out.println("Cleared comboBox items");

    if (dataHistory == null) {
        dataHistory = new ArrayList<>();
    } else {
        dataHistory.clear();
    }

    List<DataEntry> entries = DatabaseManager.getAllDataEntries();
    if (entries == null || entries.isEmpty()) {
        System.out.println("No entries found in database");
        return;
    }

    dataHistory.addAll(entries);
    for (DataEntry entry : dataHistory) {
        System.out.println("Adding entry: " + entry.getName());
        dataComboBox.addItem(entry.getName()); // Use .getName() to show readable label
    }
}


    /**
     * Displays the raw data of the currently selected DataEntry in the JTable.
     */
private void displaySelectedData() {
    if (!(tableModel instanceof javax.swing.JTable)) {
        System.err.println("tableModel is not a JTable");
        return;
    }

    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ((javax.swing.JTable) tableModel).getModel();
    model.setRowCount(0); // Clear table rows

    String selectedName = (String) dataComboBox.getSelectedItem();
    if (selectedName == null) {
        System.err.println("No item selected in combo box");
        return;
    }

    DataEntry selectedEntry = null;
    for (DataEntry entry : dataHistory) {
        if (entry.getName().equals(selectedName)) {
            selectedEntry = entry;
            break;
        }
    }

    if (selectedEntry == null) {
        System.err.println("No matching DataEntry found for selection: " + selectedName);
        return;
    }

    List<Double> data1 = selectedEntry.getData1();
    List<Double> data2 = selectedEntry.getData2();
    int maxRows = Math.max(data1.size(), data2 != null ? data2.size() : 0);

    for (int i = 0; i < maxRows; i++) {
        Vector<Object> row = new Vector<>();
        row.add(i); // Index
        row.add(i < data1.size() ? String.format("%.4f", data1.get(i)) : "");
        row.add(data2 != null && i < data2.size() ? String.format("%.4f", data2.get(i)) : "");
        model.addRow(row);
    }

    System.out.println("Displayed " + maxRows + " rows in table for: " + selectedName);
}


    
private void loadSelectedData() {
    String selectedName = (String) dataComboBox.getSelectedItem();
    DataEntry selectedEntry = null;
    for (DataEntry entry : dataHistory) {
        if (entry.getName().equals(selectedName)) {
            selectedEntry = entry;
            break;
        }
    }

    if (selectedEntry != null) {
        loadDataEntryIntoInputs(selectedEntry);

        // Assign loaded data to global variables so other methods can access them
        this.data1 = selectedEntry.getData1();
        this.data2 = selectedEntry.getData2();

        // Show the Data Analysis Workbench panel
        CardLayout layout = (CardLayout) content.getLayout();
        layout.show(content, "card2"); // Assumes "card2" is the name for dataAnalysisWorkbench

        headerText.setText("                          Data Analysis Workbench");
        setTitle("Data Analysis Software - Workbench");

        JOptionPane.showMessageDialog(this, "Data '" + selectedEntry.getName() + "' loaded into Main Page.", "Data Loaded", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a data set to load.", "No Selection", JOptionPane.WARNING_MESSAGE);
    }
}


private void deleteSelectedData() {
    String selectedName = (String) dataComboBox.getSelectedItem();
    if (selectedName == null) {
        JOptionPane.showMessageDialog(this, "Please select a data set to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    DataEntry selectedEntry = null;
    for (DataEntry entry : dataHistory) {
        if (entry.getName().equals(selectedName)) {
            selectedEntry = entry;
            break;
        }
    }

    if (selectedEntry == null) {
        JOptionPane.showMessageDialog(this, "Selected data not found in history.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete data set '" + selectedEntry.getName() + "'?",
            "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        if (DatabaseManager.deleteDataEntry(selectedEntry)) {
            JOptionPane.showMessageDialog(this, "Data set '" + selectedEntry.getName() + "' deleted from database.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
            populateComboBox(); // Refresh the combo box after deletion
            displaySelectedData(); // Update table display
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete data set '" + selectedEntry.getName() + "'.", "Deletion Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



// calculation


private void performZTestOneSample() {
        try {
            double hypothesizedMean = Double.parseDouble(zTestHypothesizedMeanField.getText());
            double populationStdDev = Double.parseDouble(zTestPopulationStdDevField.getText());

            if (populationStdDev <= 0) {
                JOptionPane.showMessageDialog(this, "Population Standard Deviation must be positive.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double sampleMean = DataAnalyzer.calculateMean(data1);
            int n = data1.size();

            if (n == 0) {
                JOptionPane.showMessageDialog(this, "No data loaded for analysis.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double zScore = (sampleMean - hypothesizedMean) / (populationStdDev / Math.sqrt(n));

            resultsOutput.setText(String.format("--- Z-Test (One Sample) Results ---%n"));
            resultsOutput.append(String.format("Hypothesized Mean (\u03BC\u2080): %.4f%n", hypothesizedMean));
            resultsOutput.append(String.format("Population Std Dev (\u03C3): %.4f%n", populationStdDev));
            resultsOutput.append(String.format("Sample Mean: %.4f%n", sampleMean));
            resultsOutput.append(String.format("Sample Size (n): %d%n", n));
            resultsOutput.append(String.format("Calculated Z-Score: %.4f%n", zScore));
            resultsOutput.append("Interpretation: (Requires Z-table lookup or p-value calculation for full interpretation)\n");
            resultsOutput.append("A Z-score indicates how many standard deviations an element is from the mean.\n");
            resultsOutput.append("Typically, Z-scores greater than 1.96 or less than -1.96 (for 95% confidence) suggest significance.\n");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format for Z-test parameters.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Performs a one-sample T-test based on user input.
     * This is a placeholder for actual statistical calculation.
     */
    private void performTTestOneSample() {
        try {
            double hypothesizedMean = Double.parseDouble(tTestOneSampleHypothesizedMeanField.getText());

            double sampleMean = DataAnalyzer.calculateMean(data1);
            double sampleStdDev = DataAnalyzer.calculateStandardDeviation(data1, false);
            int n = data1.size();

            if (n <= 1) {
                JOptionPane.showMessageDialog(this, "Not enough data for T-test (n must be > 1).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double tScore = (sampleMean - hypothesizedMean) / (sampleStdDev / Math.sqrt(n));
            int degreesOfFreedom = n - 1;

            resultsOutput.setText(String.format("--- T-Test (One Sample) Results ---%n"));
            resultsOutput.append(String.format("Hypothesized Mean (\u03BC\u2080): %.4f%n", hypothesizedMean));
            resultsOutput.append(String.format("Sample Mean: %.4f%n", sampleMean));
            resultsOutput.append(String.format("Sample Standard Deviation: %.4f%n", sampleStdDev));
            resultsOutput.append(String.format("Sample Size (n): %d%n", n));
            resultsOutput.append(String.format("Degrees of Freedom (df): %d%n", degreesOfFreedom));
            resultsOutput.append(String.format("Calculated T-Score: %.4f%n", tScore));
            resultsOutput.append("Interpretation: (Requires T-table lookup or p-value calculation for full interpretation)\n");
            resultsOutput.append("A T-score indicates the difference between sample and hypothesized mean in terms of standard error.\n");
            resultsOutput.append("The significance depends on the T-score and degrees of freedom.\n");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format for T-test parameters.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Performs a two-sample T-test based on user input for the second sample.
     * This method prioritizes data passed from MainFrame (data2), then falls back to local input.
     */
    private void performTTestTwoSample() {
        List<Double> actualData2 = this.data2; // Start with data passed from MainFrame

        // If data2 from MainFrame is null or empty, try to parse from local input field
        if (actualData2 == null || actualData2.isEmpty()) {
            String rawText2 = rawDataInput2.getText();
            if (rawText2.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter data for the second sample or load it from the Main Page.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                actualData2 = parseData(rawText2);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid number format in second sample data.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (actualData2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No valid numbers found in second sample input.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double mean1 = DataAnalyzer.calculateMean(data1);
        double stdDev1 = DataAnalyzer.calculateStandardDeviation(data1, false);
        int n1 = data1.size();

        double mean2 = DataAnalyzer.calculateMean(actualData2);
        double stdDev2 = DataAnalyzer.calculateStandardDeviation(actualData2, false);
        int n2 = actualData2.size();

        if (n1 <= 1 || n2 <= 1) {
            JOptionPane.showMessageDialog(this, "Both samples must have more than one data point for T-test.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double numerator = mean1 - mean2;
        double denominator = Math.sqrt((stdDev1 * stdDev1 / n1) + (stdDev2 * stdDev2 / n2));

        double tScore = numerator / denominator;

        int degreesOfFreedom = Math.min(n1 - 1, n2 - 1); // Simplified df

        resultsOutput.setText(String.format("--- T-Test (Two Sample) Results ---%n"));
        resultsOutput.append(String.format("Sample 1 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean1, n1, stdDev1));
        resultsOutput.append(String.format("Sample 2 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean2, n2, stdDev2));
        resultsOutput.append(String.format("Calculated T-Score: %.4f%n", tScore));
        resultsOutput.append(String.format("Degrees of Freedom (Simplified): %d%n", degreesOfFreedom));
        resultsOutput.append("Interpretation: (Requires T-table lookup or p-value calculation for full interpretation)\n");
        resultsOutput.append("This test assesses if there is a significant difference between the means of two independent samples.\n");
    }
    
    private void performZTestTwoSample() {
    // Ensure both samples are loaded
    if (data1 == null || data1.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No data loaded for sample 1.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (data2 == null || data2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No data loaded for sample 2.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int n1 = data1.size();
    int n2 = data2.size();

    if (n1 < 1 || n2 < 1) {
        JOptionPane.showMessageDialog(this, "Samples must have at least one data point each.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double mean1 = DataAnalyzer.calculateMean(data1);
    double mean2 = DataAnalyzer.calculateMean(data2);

    // For Z-test, typically population std dev known; here use sample std dev as proxy
    double stdDev1 = DataAnalyzer.calculateStandardDeviation(data1, false);
    double stdDev2 = DataAnalyzer.calculateStandardDeviation(data2, false);

    // Calculate standard error
    double stdError = Math.sqrt((stdDev1 * stdDev1) / n1 + (stdDev2 * stdDev2) / n2);

    if (stdError == 0) {
        JOptionPane.showMessageDialog(this, "Standard error is zero, can't compute Z-score.", "Calculation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double zScore = (mean1 - mean2) / stdError;

    resultsOutput.setText(String.format("--- Z-Test (Two Sample) Results ---%n"));
    resultsOutput.append(String.format("Sample 1 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean1, n1, stdDev1));
    resultsOutput.append(String.format("Sample 2 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean2, n2, stdDev2));
    resultsOutput.append(String.format("Calculated Z-Score: %.4f%n", zScore));
    resultsOutput.append("Interpretation: (Requires Z-table lookup or p-value calculation for full interpretation)\n");
    resultsOutput.append("The Z-score indicates how many standard errors the sample means differ by.\n");
}


    /**
     * Calculates and displays the skewness of the loaded data.
     */
    private void performSkewnessCalculation() {
        if (data1.size() < 3) {
            JOptionPane.showMessageDialog(this, "Not enough data to calculate skewness (requires at least 3 data points).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double skewness = DataAnalyzer.calculateSkewness(data1);

        resultsOutput.setText(String.format("--- Skewness Calculation ---%n"));
        resultsOutput.append(String.format("Skewness: %.4f%n", skewness));
        resultsOutput.append("Interpretation:\n");
        resultsOutput.append("  If Skewness > 0: Positively skewed (right-skewed), tail is on the right.\n");
        resultsOutput.append("  If Skewness < 0: Negatively skewed (left-skewed), tail is on the left.\n");
        resultsOutput.append("  If Skewness \u2248 0: Approximately symmetrical distribution.\n");
    }
    
private void generateSummaryPdf() {
    if (data1 == null || data1.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No data available to generate a summary.", "No Data", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (data2 == null) {
        data2 = new ArrayList<>();
    }

    StringBuilder summaryText = new StringBuilder();
    summaryText.append("--- Data Analysis Summary Report ---\n\n");

    // Data 1 Stats
    summaryText.append("Data 1 Statistics:\n");
    summaryText.append(String.format("  Count: %d%n", data1.size()));
    summaryText.append(String.format("  Mean: %.4f%n", DataAnalyzer.calculateMean(data1)));
    summaryText.append(String.format("  Median: %.4f%n", DataAnalyzer.calculateMedian(data1)));
    summaryText.append(String.format("  Mode: %.4f%n", DataAnalyzer.calculateMode(data1)));
    summaryText.append(String.format("  Min: %.4f%n", Collections.min(data1)));
    summaryText.append(String.format("  Max: %.4f%n", Collections.max(data1)));
    summaryText.append(String.format("  Sample Std Dev: %.4f%n", DataAnalyzer.calculateStandardDeviation(data1, false)));
    summaryText.append(String.format("  Skewness: %.4f%n", DataAnalyzer.calculateSkewness(data1)));
    summaryText.append("\n");

    if (!data2.isEmpty()) {
        summaryText.append("Data 2 Statistics:\n");
        summaryText.append(String.format("  Count: %d%n", data2.size()));
        summaryText.append(String.format("  Mean: %.4f%n", DataAnalyzer.calculateMean(data2)));
        summaryText.append(String.format("  Median: %.4f%n", DataAnalyzer.calculateMedian(data2)));
        summaryText.append(String.format("  Mode: %.4f%n", DataAnalyzer.calculateMode(data2)));
        summaryText.append(String.format("  Min: %.4f%n", Collections.min(data2)));
        summaryText.append(String.format("  Max: %.4f%n", Collections.max(data2)));
        summaryText.append(String.format("  Sample Std Dev: %.4f%n", DataAnalyzer.calculateStandardDeviation(data2, false)));
        summaryText.append("\n");
    }

    try {
        double hypothesizedMean = Double.parseDouble(tTestOneSampleHypothesizedMeanField.getText());
        if (data1.size() > 1) {
            double sampleMean = DataAnalyzer.calculateMean(data1);
            double sampleStdDev = DataAnalyzer.calculateStandardDeviation(data1, false);
            int n = data1.size();
            double tScore = (sampleMean - hypothesizedMean) / (sampleStdDev / Math.sqrt(n));
            int df = n - 1;

            summaryText.append("--- One-Sample T-Test ---\n");
            summaryText.append(String.format("  Hypothesized Mean: %.4f%n", hypothesizedMean));
            summaryText.append(String.format("  Sample Mean: %.4f%n", sampleMean));
            summaryText.append(String.format("  Sample Std Dev: %.4f%n", sampleStdDev));
            summaryText.append(String.format("  Sample Size: %d%n", n));
            summaryText.append(String.format("  Degrees of Freedom: %d%n", df));
            summaryText.append(String.format("  T-Score: %.4f%n", tScore));
            summaryText.append("\n");
        }
    } catch (NumberFormatException e) {
        // Ignore if no valid hypothesized mean entered
    }

    if (!data2.isEmpty() && data1.size() > 1 && data2.size() > 1) {
        double mean1 = DataAnalyzer.calculateMean(data1);
        double stdDev1 = DataAnalyzer.calculateStandardDeviation(data1, false);
        int n1 = data1.size();

        double mean2 = DataAnalyzer.calculateMean(data2);
        double stdDev2 = DataAnalyzer.calculateStandardDeviation(data2, false);
        int n2 = data2.size();

        double numerator = mean1 - mean2;
        double denominator = Math.sqrt((stdDev1 * stdDev1 / n1) + (stdDev2 * stdDev2 / n2));
        double tScore = numerator / denominator;
        int df = Math.min(n1 - 1, n2 - 1);

        summaryText.append("--- Two-Sample T-Test ---\n");
        summaryText.append(String.format("  Sample 1 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean1, n1, stdDev1));
        summaryText.append(String.format("  Sample 2 Mean: %.4f (n=%d, Std Dev=%.4f)%n", mean2, n2, stdDev2));
        summaryText.append(String.format("  Degrees of Freedom (Simplified): %d%n", df));
        summaryText.append(String.format("  T-Score: %.4f%n", tScore));
        summaryText.append("\n");
    }

    if (!data2.isEmpty() && data1.size() > 1 && data2.size() > 1) {
        double mean1 = DataAnalyzer.calculateMean(data1);
        double mean2 = DataAnalyzer.calculateMean(data2);
        int n1 = data1.size();
        int n2 = data2.size();

        double stdDev1 = DataAnalyzer.calculateStandardDeviation(data1, false);
        double stdDev2 = DataAnalyzer.calculateStandardDeviation(data2, false);

        double numerator = mean1 - mean2;
        double denominator = Math.sqrt((stdDev1*stdDev1)/n1 + (stdDev2*stdDev2)/n2);
        double zScore = numerator / denominator;

        summaryText.append("--- Two-Sample Z-Test ---\n");
        summaryText.append(String.format("  Sample 1 Mean: %.4f (n=%d)%n", mean1, n1));
        summaryText.append(String.format("  Sample 2 Mean: %.4f (n=%d)%n", mean2, n2));
        summaryText.append(String.format("  Z-Score: %.4f%n", zScore));
        summaryText.append("  Note: Z-Test assumes known population standard deviations or large samples.\n\n");
    }

    summaryText.append("Analysis Results (from current session):\n");
    summaryText.append(resultsOutput.getText());

    // Show file chooser dialog for user to pick save location & file name
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save Summary Report PDF");
    fileChooser.setSelectedFile(new File("summary-report.pdf"));
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection != JFileChooser.APPROVE_OPTION) {
        // User canceled or closed dialog
        return;
    }

    File fileToSave = fileChooser.getSelectedFile();

    // Export to PDF using PDFBox
    try (PDDocument document = new PDDocument()) {
        PDPage page = new PDPage(PDRectangle.LETTER);
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.beginText();

        contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 10);
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(50, 700);

        // Replace unsupported chars like '≈' (U+2248) with ~=
        String safeText = summaryText.toString().replace("\u2248", "~=");
        String[] lines = safeText.split("\n");
        int lineCount = 0;

        for (String line : lines) {
            contentStream.showText(line);
            contentStream.newLine();
            lineCount++;

            if (lineCount >= 45) { // start new page after 45 lines
                contentStream.endText();
                contentStream.close();

                page = new PDPage(PDRectangle.LETTER);
                document.addPage(page);

                contentStream = new PDPageContentStream(document, page);
                contentStream.beginText();
                contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 10);
                contentStream.setLeading(14.5f);
                contentStream.newLineAtOffset(50, 700);

                lineCount = 0;
            }
        }

        contentStream.endText();
        contentStream.close();

        document.save(fileToSave);

        JOptionPane.showMessageDialog(this, "PDF saved as '" + fileToSave.getAbsolutePath() + "'", "Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Failed to save PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}




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
    public javax.swing.JComboBox<String> dataComboBox;
    private javax.swing.JTextField dataSetNameField;
    private javax.swing.JLabel dataone;
    private javax.swing.JLabel datatwo;
    private javax.swing.JButton exportCSV;
    private javax.swing.JPanel extraAnalysis;
    private javax.swing.JLabel fullmax;
    private javax.swing.JLabel headerText;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JButton history;
    private javax.swing.JPanel historyPage;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JButton importCSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JButton loadData;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JTextArea rawDataInput1;
    private javax.swing.JTextArea rawDataInput2;
    private javax.swing.JTextArea resultsOutput;
    private javax.swing.JPanel setting;
    private javax.swing.JTextField tTestOneSampleHypothesizedMeanField;
    public javax.swing.JTable tableModel;
    private javax.swing.JTextField zTestHypothesizedMeanField;
    private javax.swing.JTextField zTestPopulationStdDevField;
    // End of variables declaration//GEN-END:variables

}
