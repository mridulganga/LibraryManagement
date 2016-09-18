//Imports
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
//Imports Ends

public class MainForm extends javax.swing.JFrame {

    /** Creates new form Sample */
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TABPosBG = new javax.swing.ButtonGroup();
        TAB = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Book = new javax.swing.JTable();
        BTN_AddBook = new javax.swing.JButton();
        BTN_RemoveBook = new javax.swing.JButton();
        BTN_ModifyBook = new javax.swing.JButton();
        BTN_IssueBook = new javax.swing.JButton();
        BTN_SearchBook = new javax.swing.JButton();
        T_SBook = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        T_Issue = new javax.swing.JTable();
        B_IssueNBook = new javax.swing.JButton();
        B_ReturnBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BTN_AddMember = new javax.swing.JButton();
        BTN_RemMember = new javax.swing.JButton();
        BTN_ModifyMember = new javax.swing.JButton();
        BTN_SearchMember = new javax.swing.JButton();
        T_SMember = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_Member = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        BTN_AddSub = new javax.swing.JButton();
        BTN_RemSub = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        T_Subscription = new javax.swing.JTable();
        T_SSub = new javax.swing.JTextField();
        BTN_SearchSub = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BTN_AddSup = new javax.swing.JButton();
        BTN_RemSup = new javax.swing.JButton();
        BTN_ModifySup = new javax.swing.JButton();
        BTN_SearchSup = new javax.swing.JButton();
        T_SSup = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        T_Supplier = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SL_TRow = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        B_Logout = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        B_GAccess = new javax.swing.JButton();
        P_Admin = new javax.swing.JPasswordField();
        L_ACC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TAB.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TAB.setFocusable(false);
        TAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABMouseClicked(evt);
            }
        });

        T_Book.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        T_Book.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        T_Book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book", "Author", "Date of Purchase", "Available", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Book.setNextFocusableComponent(T_SBook);
        T_Book.setRowHeight(20);
        T_Book.setShowVerticalLines(false);
        jScrollPane1.setViewportView(T_Book);

        BTN_AddBook.setText("Add Book");
        BTN_AddBook.setFocusable(false);
        BTN_AddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_AddBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddBookActionPerformed(evt);
            }
        });

        BTN_RemoveBook.setText("Remove Book");
        BTN_RemoveBook.setFocusable(false);
        BTN_RemoveBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_RemoveBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_RemoveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemoveBookActionPerformed(evt);
            }
        });

        BTN_ModifyBook.setText("Modify Book");
        BTN_ModifyBook.setFocusable(false);
        BTN_ModifyBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_ModifyBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_ModifyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifyBookActionPerformed(evt);
            }
        });

        BTN_IssueBook.setText("Issue Book");
        BTN_IssueBook.setFocusable(false);
        BTN_IssueBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_IssueBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_IssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_IssueBookActionPerformed(evt);
            }
        });

        BTN_SearchBook.setText("Search");
        BTN_SearchBook.setFocusable(false);
        BTN_SearchBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_SearchBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_SearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchBookActionPerformed(evt);
            }
        });

        T_SBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_SBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BTN_AddBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_RemoveBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_ModifyBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_IssueBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addComponent(T_SBook, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_SearchBook)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_AddBook)
                    .addComponent(BTN_SearchBook)
                    .addComponent(T_SBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_RemoveBook)
                    .addComponent(BTN_ModifyBook)
                    .addComponent(BTN_IssueBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Books", jPanel1);

        jPanel2.setBorder(null);

        T_Issue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book ID", "MemberID", "Date", "Book", "Member"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T_Issue.setShowVerticalLines(false);
        jScrollPane3.setViewportView(T_Issue);
        T_Issue.getColumnModel().getColumn(0).setMaxWidth(50);
        T_Issue.getColumnModel().getColumn(1).setMaxWidth(50);
        T_Issue.getColumnModel().getColumn(2).setMaxWidth(50);
        T_Issue.getColumnModel().getColumn(4).setMinWidth(100);
        T_Issue.getColumnModel().getColumn(5).setMinWidth(100);

        B_IssueNBook.setText("Issue New Book");
        B_IssueNBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_IssueNBookActionPerformed(evt);
            }
        });

        B_ReturnBook.setText("Return Book");
        B_ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ReturnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B_IssueNBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_ReturnBook)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_IssueNBook)
                    .addComponent(B_ReturnBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Issue / Return", jPanel2);

        BTN_AddMember.setText("Add Member");
        BTN_AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddMemberActionPerformed(evt);
            }
        });

        BTN_RemMember.setText("Remove Member");
        BTN_RemMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemMemberActionPerformed(evt);
            }
        });

        BTN_ModifyMember.setText("Modify Details");
        BTN_ModifyMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifyMemberActionPerformed(evt);
            }
        });

        BTN_SearchMember.setText("Search");
        BTN_SearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchMemberActionPerformed(evt);
            }
        });

        T_Member.setFont(new java.awt.Font("Droid Sans", 0, 14));
        T_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Sex", "Age", "Address", "Issued"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Member.setRowHeight(20);
        T_Member.setShowVerticalLines(false);
        jScrollPane2.setViewportView(T_Member);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BTN_AddMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_RemMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_ModifyMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                        .addComponent(T_SMember, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_SearchMember)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_AddMember)
                    .addComponent(BTN_RemMember)
                    .addComponent(BTN_ModifyMember)
                    .addComponent(BTN_SearchMember)
                    .addComponent(T_SMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Members", jPanel3);

        BTN_AddSub.setText("Add Subscription");
        BTN_AddSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddSubActionPerformed(evt);
            }
        });

        BTN_RemSub.setText("Remove Subscription");
        BTN_RemSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemSubActionPerformed(evt);
            }
        });

        T_Subscription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "From", "To", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Subscription.setShowVerticalLines(false);
        jScrollPane4.setViewportView(T_Subscription);

        BTN_SearchSub.setText("Search");
        BTN_SearchSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchSubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BTN_AddSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_RemSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                        .addComponent(T_SSub, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_SearchSub)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_AddSub)
                    .addComponent(BTN_RemSub)
                    .addComponent(BTN_SearchSub)
                    .addComponent(T_SSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Subscriptions", jPanel4);

        BTN_AddSup.setText("Add Supplier");
        BTN_AddSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AddSupActionPerformed(evt);
            }
        });

        BTN_RemSup.setText("Remove Supplier");
        BTN_RemSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RemSupActionPerformed(evt);
            }
        });

        BTN_ModifySup.setText("Modify");
        BTN_ModifySup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifySupActionPerformed(evt);
            }
        });

        BTN_SearchSup.setText("Search");
        BTN_SearchSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SearchSupActionPerformed(evt);
            }
        });

        T_Supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Mobile", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        T_Supplier.setShowVerticalLines(false);
        jScrollPane5.setViewportView(T_Supplier);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BTN_AddSup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_RemSup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_ModifySup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                        .addComponent(T_SSup, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_SearchSup)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_AddSup)
                    .addComponent(BTN_RemSup)
                    .addComponent(BTN_ModifySup)
                    .addComponent(BTN_SearchSup)
                    .addComponent(T_SSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        TAB.addTab("Suppliers", jPanel5);

        jLabel1.setText("Table Row Height");

        SL_TRow.setMaximum(40);
        SL_TRow.setMinimum(18);
        SL_TRow.setValue(18);
        SL_TRow.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SL_TRowStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Droid Sans", 0, 18));
        jLabel2.setText("Developer : Mridul Ganga");

        jLabel3.setFont(new java.awt.Font("Droid Sans", 0, 36));
        jLabel3.setText("Project : Library Management");

        jLabel4.setText("Tabs Position");

        TABPosBG.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Top");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        TABPosBG.add(jRadioButton2);
        jRadioButton2.setText("Left");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        TABPosBG.add(jRadioButton3);
        jRadioButton3.setText("right");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        TABPosBG.add(jRadioButton4);
        jRadioButton4.setText("Bottom");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        B_Logout.setText("Log Out");
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Droid Sans", 0, 18));
        jLabel5.setText("Get Admin Privilages");

        jLabel6.setText("Enter Admin Password");

        B_GAccess.setText("Grant Access");
        B_GAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_GAccessActionPerformed(evt);
            }
        });

        P_Admin.setText("admin1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SL_TRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton3))
                                    .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(L_ACC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(P_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(7, 7, 7)))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(B_GAccess)))
                                        .addGap(62, 62, 62))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SL_TRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(489, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(P_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(B_GAccess))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(L_ACC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        TAB.addTab("Settings", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TAB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    /* 
     * Custom Code Startes Here
     */
private void BTN_AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddBookActionPerformed
    if (DBC.currentUser.equals("admin")) {
        new AddBookForm().setVisible(true);
    }
}//GEN-LAST:event_BTN_AddBookActionPerformed

private void BTN_RemoveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemoveBookActionPerformed
    if (DBC.currentUser.equals("admin")) {
        int res = JOptionPane.showConfirmDialog(null, "Sure you wish to delete this Book?");
        if (res==0)
        {
            DefaultTableModel model = (DefaultTableModel) T_Book.getModel();
            String val = "" + model.getValueAt(T_Book.getSelectedRow(), 0);
            Connection con = DBC.ConnectDB();
            DBC.ExecuteSQL(con, "Delete from books where bid=" + val);
            DBC.DisconnectDB(con);
            loadBooks();
        }
    }
    else
    {JOptionPane.showMessageDialog(null, "You don't have the required permission.");
    }
}//GEN-LAST:event_BTN_RemoveBookActionPerformed

private void BTN_ModifyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifyBookActionPerformed
    if (DBC.currentUser.equals("admin")) {
        DefaultTableModel model = (DefaultTableModel) T_Book.getModel();
        int val = Integer.parseInt("" + model.getValueAt(T_Book.getSelectedRow(), 0));
        new ModifyBookForm().UpdateFields(val);
    }
}//GEN-LAST:event_BTN_ModifyBookActionPerformed

private void BTN_SearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchBookActionPerformed
    Connection con = DBC.ConnectDB();
    ResultSet R = DBC.getTable(con, "select * from books where bname like '%" + T_SBook.getText() + "%' or author like '%" + T_SBook.getText() + "%'");
    this.setTitle("Books");
    DefaultTableModel model = (DefaultTableModel) T_Book.getModel();
    model.setRowCount(0);

    try {
        while (R.next()) {
            int mid = R.getInt("bid");
            String mname = R.getString("bname");
            String auth = R.getString("author");
            String DOP = "" + R.getDate("DOP");
            int mA = R.getInt("available");
            boolean AVA = mA == 1 ? true : false;
            float price = R.getFloat("price");
            model.addRow(new Object[]{mid, mname, auth, DOP, AVA, price});
            T_Book.setModel(model);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    DBC.DisconnectDB(con);
}//GEN-LAST:event_BTN_SearchBookActionPerformed

private void T_SBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_SBookActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_T_SBookActionPerformed

private void BTN_AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddMemberActionPerformed
    if (DBC.currentUser.equals("admin")) {
        new AddMemberForm().setVisible(true);
    }
}//GEN-LAST:event_BTN_AddMemberActionPerformed

private void BTN_RemMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemMemberActionPerformed
    if (DBC.currentUser.equals("admin")) {
                int res = JOptionPane.showConfirmDialog(null, "Sure you wish to delete this Member?");
        if (res==0)
        {
            DefaultTableModel model = (DefaultTableModel) T_Member.getModel();
            String val = "" + model.getValueAt(T_Member.getSelectedRow(), 0);
            Connection con = DBC.ConnectDB();
            DBC.ExecuteSQL(con, "Delete from members where id=" + val);

            DBC.DisconnectDB(con);
            loadMembers();
        }
    }
}//GEN-LAST:event_BTN_RemMemberActionPerformed

private void BTN_ModifyMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifyMemberActionPerformed
    DefaultTableModel model = (DefaultTableModel) T_Member.getModel();
    String val = "" + model.getValueAt(T_Member.getSelectedRow(), 1);
    Connection con = DBC.ConnectDB();
    ResultSet R = DBC.getTable(con, "select * from members where name='" + val + "'");
    try {
        R.first();

        //Only let admin and the member himself to edit his entry.
        if (R.getString("name").toLowerCase().equals(DBC.currentUser.toLowerCase()) || DBC.currentUser.equals("admin")) {
            //let member edit it
            new ModifyMemberForm().UpdateFields(R.getInt("id"));
            System.out.println("Can Modify");
            loadMembers();
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    DBC.DisconnectDB(con);
}//GEN-LAST:event_BTN_ModifyMemberActionPerformed

private void BTN_SearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchMemberActionPerformed
    Connection con = DBC.ConnectDB();
    ResultSet R = DBC.getTable(con, "select * from members where name like '%" + T_SMember.getText() + "%'");

    DefaultTableModel model = (DefaultTableModel) T_Member.getModel();
    model.setRowCount(0);

    try {
        while (R.next()) {
            int mid = R.getInt("id");
            String mname = R.getString("name");
            String msex = R.getString("sex");
            int age = R.getInt("age");
            String addr = R.getString("address");
            int issu = R.getInt("issued");

            model.addRow(new Object[]{mid, mname, msex, age, addr, issu});
            T_Member.setModel(model);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    DBC.DisconnectDB(con);
}//GEN-LAST:event_BTN_SearchMemberActionPerformed

private void TABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABMouseClicked
    this.setTitle(TAB.getTitleAt(TAB.getSelectedIndex()));
    switch (TAB.getSelectedIndex()) {
        case 0: //Books
            loadBooks();
            break;
        case 1: //Issue / Return
            loadIssues();
            break;
        case 2: //Members
            loadMembers();
            break;
        case 3: //Subscriptions
            loadSubscriptions();
            break;
        case 4: //Suppliers
            loadSuppliers();
            break;
    }
}//GEN-LAST:event_TABMouseClicked

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    this.setTitle("Books");
    loadBooks();
    loadIssues();
    loadMembers();
    loadSuppliers();
    loadSubscriptions();
}//GEN-LAST:event_formWindowActivated

private void B_IssueNBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_IssueNBookActionPerformed
    if (DBC.currentUser.equals("admin"))
        new IssueBookForm().UpdateFields(-1);
}//GEN-LAST:event_B_IssueNBookActionPerformed

private void BTN_IssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_IssueBookActionPerformed
if (DBC.currentUser.equals("admin"))
{
    DefaultTableModel model = (DefaultTableModel) T_Book.getModel();
    String val = "" + model.getValueAt(T_Book.getSelectedRow(), 0);
    int bid = Integer.parseInt(val);
    new IssueBookForm().UpdateFields(bid);
}

}//GEN-LAST:event_BTN_IssueBookActionPerformed

private void B_ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ReturnBookActionPerformed
    if (DBC.currentUser.equals("admin"))
    {
        DefaultTableModel model = (DefaultTableModel) T_Issue.getModel();
        int val = Integer.parseInt("" + model.getValueAt(T_Issue.getSelectedRow(), 0));
        int bid = Integer.parseInt("" + model.getValueAt(T_Issue.getSelectedRow(), 1));
        Connection con = DBC.ConnectDB();
        DBC.ExecuteSQL(con, "delete from issue where id=" + val);
        DBC.ExecuteSQL(con, "update books set available=1 where bid=" + bid);
        loadIssues();
        DBC.DisconnectDB(con);
    }
}//GEN-LAST:event_B_ReturnBookActionPerformed

private void BTN_AddSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddSubActionPerformed
    if (DBC.currentUser.equals("admin")) {
        new AddSubForm().setVisible(true);
    }
}//GEN-LAST:event_BTN_AddSubActionPerformed

private void BTN_AddSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AddSupActionPerformed
    if (DBC.currentUser.equals("admin")) {
        new AddSupForm().setVisible(true);
    }
}//GEN-LAST:event_BTN_AddSupActionPerformed

private void BTN_RemSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemSubActionPerformed
    if (DBC.currentUser.equals("admin")) {
                int res = JOptionPane.showConfirmDialog(null, "Sure you wish to delete this Subscription?");
        if (res==0)
        {
            DefaultTableModel model = (DefaultTableModel) T_Subscription.getModel();
            String val = "" + model.getValueAt(T_Subscription.getSelectedRow(), 0);

            Connection con = DBC.ConnectDB();
            DBC.ExecuteSQL(con, "Delete from subscriptions where id=" + val);

            DBC.DisconnectDB(con);
            loadSubscriptions();
        }
    }
}//GEN-LAST:event_BTN_RemSubActionPerformed

private void BTN_RemSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RemSupActionPerformed
    if (DBC.currentUser.equals("admin")) {
                int res = JOptionPane.showConfirmDialog(null, "Sure you wish to delete this Supplier?");
        if (res==0)
        {
            DefaultTableModel model = (DefaultTableModel) T_Supplier.getModel();
            String val = "" + model.getValueAt(T_Supplier.getSelectedRow(), 0);

            Connection con = DBC.ConnectDB();
            DBC.ExecuteSQL(con, "Delete from suppliers where id=" + val);

            DBC.DisconnectDB(con);
            loadSuppliers();
        }
    }
}//GEN-LAST:event_BTN_RemSupActionPerformed

private void BTN_SearchSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchSubActionPerformed
    Connection con = DBC.ConnectDB();
    ResultSet R = DBC.getTable(con, "select * from subscriptions where name like '%" + T_SSub.getText() + "%'");

    DefaultTableModel model = (DefaultTableModel) T_Subscription.getModel();
    model.setRowCount(0);

    try {
        while (R.next()) {
                        int mid = R.getInt("id");
            String mname = R.getString("name");
            String fd = R.getString("fdate");
            String td = R.getString("tdate");
            float price = R.getFloat("price");

            model.addRow(new Object[]{mid, mname, fd,td,price});
            T_Subscription.setModel(model);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    DBC.DisconnectDB(con);
}//GEN-LAST:event_BTN_SearchSubActionPerformed

private void BTN_SearchSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SearchSupActionPerformed
    Connection con = DBC.ConnectDB();
    ResultSet R = DBC.getTable(con, "select * from suppliers where name like '%" + T_SSup.getText() + "%'");

    DefaultTableModel model = (DefaultTableModel) T_Supplier.getModel();
    model.setRowCount(0);

    try {
        while (R.next()) {
            int mid = R.getInt("id");
            String mname = R.getString("name");
            String mob = R.getString("mobile");
            String addr = R.getString("address");

            model.addRow(new Object[]{mid, mname, mob,addr});
            T_Supplier.setModel(model);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    DBC.DisconnectDB(con);
}//GEN-LAST:event_BTN_SearchSupActionPerformed

private void BTN_ModifySupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifySupActionPerformed
    DefaultTableModel model = (DefaultTableModel) T_Supplier.getModel();
    int val = Integer.parseInt("" + model.getValueAt(T_Supplier.getSelectedRow(), 0));
    new ModifySupForm().UpdateFields(val);

}//GEN-LAST:event_BTN_ModifySupActionPerformed

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
TAB.setTabPlacement(1);
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
TAB.setTabPlacement(2);
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
TAB.setTabPlacement(4);
}//GEN-LAST:event_jRadioButton3ActionPerformed

private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
TAB.setTabPlacement(3);
}//GEN-LAST:event_jRadioButton4ActionPerformed

private void SL_TRowStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_TRowStateChanged
    T_Book.setRowHeight(SL_TRow.getValue());
    T_Member.setRowHeight(SL_TRow.getValue());
    T_Issue.setRowHeight(SL_TRow.getValue());
    T_Subscription.setRowHeight(SL_TRow.getValue());
    T_Supplier.setRowHeight(SL_TRow.getValue());
    
}//GEN-LAST:event_SL_TRowStateChanged

private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LogoutActionPerformed
DBC.currentUser="";
new LoginForm().setVisible(true);
this.dispose();
}//GEN-LAST:event_B_LogoutActionPerformed

private void B_GAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_GAccessActionPerformed
String pass= new String(P_Admin.getPassword());
Connection con = DBC.ConnectDB();
    ResultSet R=DBC.getTable(con,"select * from members where name='admin'");
        try {
            R.first();
            String passG=R.getString("password");
            if (passG.equals(pass))
            {
                DBC.currentUser="admin";
            L_ACC.setText("Access Granted");
            }
            else
            {L_ACC.setText("Access Denied");
            }
        }
catch(Exception e){}

}//GEN-LAST:event_B_GAccessActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    this.setLocationRelativeTo(null);
}//GEN-LAST:event_formWindowOpened

//Other Methods
    private void loadBooks() {
        Connection con = DBC.ConnectDB();
        ResultSet R = DBC.getTable(con, "select * from books");

        DefaultTableModel model = (DefaultTableModel) T_Book.getModel();
        model.setRowCount(0);

        try {
            while (R.next()) {
                int mid = R.getInt("bid");
                String mname = R.getString("bname");
                String auth = R.getString("author");
                String DOP = "" + R.getDate("DOP");
                int mA = R.getInt("available");
                boolean AVA = mA == 1 ? true : false;
                float price = R.getFloat("price");
                model.addRow(new Object[]{mid, mname, auth, DOP, AVA, price});
                T_Book.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        DBC.DisconnectDB(con);
    }

    private void loadMembers() {
        Connection con = DBC.ConnectDB();
        ResultSet R = DBC.getTable(con, "select * from members");

        DefaultTableModel model = (DefaultTableModel) T_Member.getModel();
        model.setRowCount(0);

        try {
            while (R.next()) {
                int mid = R.getInt("id");
                String mname = R.getString("name");
                String msex = R.getString("sex");
                int age = R.getInt("age");
                String addr = R.getString("address");
                int issu = R.getInt("issued");

                model.addRow(new Object[]{mid, mname, msex, age, addr, issu});
                T_Member.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        DBC.DisconnectDB(con);
    }

    private void loadIssues() {
        Connection con = DBC.ConnectDB();
        ResultSet R = DBC.getTable(con, "select * from issue");

        DefaultTableModel model = (DefaultTableModel) T_Issue.getModel();
        model.setRowCount(0);

        try {
            while (R.next()) {

                int id = R.getInt("id");
                int bid = R.getInt("bid");
                int mid = R.getInt("mid");
                String doi = R.getString("DOI");
                ResultSet R1 = DBC.getTable(con, "select * from books where bid=" + bid);
                ResultSet R2 = DBC.getTable(con, "select * from members where id=" + mid);
                R1.first();
                R2.first();
                String bName = R1.getString("bname");
                String mName = R2.getString("name");

                model.addRow(new Object[]{id, bid, mid, doi, bName, mName});
                T_Issue.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        DBC.DisconnectDB(con);
    }

    private void loadSubscriptions() {
        Connection con = DBC.ConnectDB();
        ResultSet R = DBC.getTable(con, "select * from subscriptions");

        DefaultTableModel model = (DefaultTableModel) T_Subscription.getModel();
        model.setRowCount(0);

        try {
            while (R.next()) {
                int mid = R.getInt("id");
                String mname = R.getString("name");
                String fd = R.getString("fdate");
                String td = R.getString("tdate");
                float price = R.getFloat("price");

                model.addRow(new Object[]{mid, mname, fd, td, price});
                T_Subscription.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        DBC.DisconnectDB(con);
    }

    private void loadSuppliers() {
        Connection con = DBC.ConnectDB();
        ResultSet R = DBC.getTable(con, "select * from suppliers");

        DefaultTableModel model = (DefaultTableModel) T_Supplier.getModel();
        model.setRowCount(0);

        try {
            while (R.next()) {
                int mid = R.getInt("id");
                String mname = R.getString("name");
                String mob = R.getString("mobile");
                String addr = R.getString("address");


                model.addRow(new Object[]{mid, mname, mob, addr});

                T_Supplier.setModel(model);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        DBC.DisconnectDB(con);
    }

//Other Methods Ends
    
/*
 * Custom Code Ends Here
 */
    
    
    
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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AddBook;
    private javax.swing.JButton BTN_AddMember;
    private javax.swing.JButton BTN_AddSub;
    private javax.swing.JButton BTN_AddSup;
    private javax.swing.JButton BTN_IssueBook;
    private javax.swing.JButton BTN_ModifyBook;
    private javax.swing.JButton BTN_ModifyMember;
    private javax.swing.JButton BTN_ModifySup;
    private javax.swing.JButton BTN_RemMember;
    private javax.swing.JButton BTN_RemSub;
    private javax.swing.JButton BTN_RemSup;
    private javax.swing.JButton BTN_RemoveBook;
    private javax.swing.JButton BTN_SearchBook;
    private javax.swing.JButton BTN_SearchMember;
    private javax.swing.JButton BTN_SearchSub;
    private javax.swing.JButton BTN_SearchSup;
    private javax.swing.JButton B_GAccess;
    private javax.swing.JButton B_IssueNBook;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_ReturnBook;
    private javax.swing.JLabel L_ACC;
    private javax.swing.JPasswordField P_Admin;
    private javax.swing.JSlider SL_TRow;
    private javax.swing.JTabbedPane TAB;
    private javax.swing.ButtonGroup TABPosBG;
    private javax.swing.JTable T_Book;
    private javax.swing.JTable T_Issue;
    private javax.swing.JTable T_Member;
    private javax.swing.JTextField T_SBook;
    private javax.swing.JTextField T_SMember;
    private javax.swing.JTextField T_SSub;
    private javax.swing.JTextField T_SSup;
    private javax.swing.JTable T_Subscription;
    private javax.swing.JTable T_Supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
