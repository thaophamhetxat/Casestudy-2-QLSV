
package com.codegym.management;

import com.codegym.help.HuongDan;
import com.codegym.quanlysinhvien.SortStudent;
import com.codegym.quanlysinhvien.Student;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TableStudent extends javax.swing.JFrame {
    private final  List<Student>students;
    private final DefaultTableModel tblModel;
    private int selected;
    private boolean rootPanelCheckingEnabled;
    static SortStudent sortStudent = new SortStudent();
    static File sinhVien = new File("sinhVien.csv");
    
    public TableStudent() {
        initComponents();
        this.setTitle("Thông tin sinh viên");
        this.setLocationRelativeTo(null);
        students = new ArrayList<>();           
        tblModel = (DefaultTableModel) tblResult.getModel();  
        
        
        LoginStudent login = new LoginStudent(this,true);
        login.setVisible(true);
    }
    public void addStudent(Student student){
        students.add(student);
        showData();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnWrite = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnMenuDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnMenuLogOut = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        btnMenuTBmax = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        btnMenuTBmin = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        btnMenuQuaModule = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        btnMenuChuaQuaModule = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSV", "Tên sinh viên", "Tuổi", "Số điện thoại", "Địa chỉ", "Giới tính", "Điểm thực hành", "Điểm lý thuyết", "Tổng trung bình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResult);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sinh viên");

        btnWrite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Save-icon.png"))); // NOI18N
        btnWrite.setText("Ghi File");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        btnSort.setText("Xắp xếp");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/new-icon-16.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/open-file-icon-16.png"))); // NOI18N
        btnOpen.setText("Mở File");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/search-icon-16.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCheck.setText("Lấy DS TB");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnSort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWrite, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch)
                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAdd)
                                    .addComponent(btnWrite))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOpen))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addComponent(btnCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Home-icon-16.png"))); // NOI18N
        jMenu1.setText("Hệ thống");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        btnMenuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/logout-icon-16.png"))); // NOI18N
        btnMenuDangXuat.setText("Đăng xuất");
        btnMenuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuDangXuat);
        jMenu1.add(jSeparator3);

        btnMenuLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Button-Close-icon-16.png"))); // NOI18N
        btnMenuLogOut.setText("Thoát");
        btnMenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuLogOut);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        jMenu3.setText("Nâng cao");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        btnMenuTBmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnMenuTBmax.setText("Lấy thông tin sinh viên có điểm trung bình cao nhất");
        btnMenuTBmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTBmaxActionPerformed(evt);
            }
        });
        jMenu3.add(btnMenuTBmax);
        jMenu3.add(jSeparator6);

        btnMenuTBmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnMenuTBmin.setText("Lấy thông tin sinh viên có điểm trung bình thấp nhất");
        btnMenuTBmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTBminActionPerformed(evt);
            }
        });
        jMenu3.add(btnMenuTBmin);
        jMenu3.add(jSeparator7);

        btnMenuQuaModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnMenuQuaModule.setText("Lấy thông tin các sinh viên đạt điều kiện qua Module");
        btnMenuQuaModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuQuaModuleActionPerformed(evt);
            }
        });
        jMenu3.add(btnMenuQuaModule);
        jMenu3.add(jSeparator8);

        btnMenuChuaQuaModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btnMenuChuaQuaModule.setText("Lấy thông tin các sinh viên chưa đạt điều kiện qua Module");
        btnMenuChuaQuaModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuChuaQuaModuleActionPerformed(evt);
            }
        });
        jMenu3.add(btnMenuChuaQuaModule);
        jMenu3.add(jSeparator9);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Đếm sinh viên qua Module");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator10);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        jMenuItem2.setText("Đếm sinh viên chưa qua Module");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Actions-help-about-icon-16.png"))); // NOI18N
        jMenu2.setText("Trợ giúp");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Question-Help-icon-16.png"))); // NOI18N
        jMenuItem3.setText("Hướng dẫn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator4);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codegym/poly/app/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        jMenuItem4.setText("Thông tin sản phẩm");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator5)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 471, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddStudent add = new AddStudent(this,rootPanelCheckingEnabled);
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        selected = tblResult.getSelectedRow();
            if(students.isEmpty()){
        JOptionPane.showMessageDialog(this,"không có sinh viên, mời thêm sinh viên");
            }else if(students.size()== -1){
        JOptionPane.showMessageDialog(this,"chọn sinh viên cần sửa");
            }else{
        UpdateStudent update = new UpdateStudent(this,rootPanelCheckingEnabled);
        update.setEditData(students.get(selected));
        update.setVisible(true);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tblResult.getSelectedRow();
            if(students.isEmpty()){
        JOptionPane.showMessageDialog(this,"không có sinh viên, mời thêm sinh viên");
            }else if(students.size()== -1){
            DeleteStudent delete = new DeleteStudent(this,rootPanelCheckingEnabled);
            }else{
        students.remove(index);
        showData();
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sinhVien.csv"));
            String tieuDe = "Mã sinh viên,Tên sinh viên ,Tuổi,Số điện thoại,Địa chỉ,Giới tính,Điểm lý thuyết,Điểm thực hành";
            bufferedWriter.write(tieuDe);
            for (Student sv : students) {
                bufferedWriter.newLine();
                bufferedWriter.write(sv.list());
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnWriteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    Collections.sort(students, sortStudent); 
    showData();
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txtSearch.equals("")){
            sb.append("Mời bạn nhập mã sinh viên để tìm kiếm!");
            return;
            }
        String maSV = txtSearch.getText();
        for(Student sv:students){
            if(sv.getMaSinhVien().equals(maSV)){
                JOptionPane.showMessageDialog(this,sv);
                txtSearch.setText("");
            return;
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnMenuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDangXuatActionPerformed
        LoginStudent login = new LoginStudent(this, true);
        login.setVisible(true);
        

    }//GEN-LAST:event_btnMenuDangXuatActionPerformed

    private void btnMenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLogOutActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnMenuLogOutActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    Infor infor = new Infor(this,true);
    infor.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    HuongDan huongDan = new HuongDan(this,true);
    huongDan.setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        for(Student s:students){
            System.out.println(s);
            System.out.println(s.getDiemTrungBinh());
            
    }

    }//GEN-LAST:event_btnCheckActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnMenuTBmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTBmaxActionPerformed
        double max = 0;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()> max){
                max = students.get(i).getDiemTrungBinh();
                index = i;
            }  
        }
        JOptionPane.showMessageDialog(this,students.get(index),"Thông tin sinh viên điểm cao nhất",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnMenuTBmaxActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void btnMenuTBminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTBminActionPerformed
        double min = 0;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()< min){
                min = students.get(i).getDiemTrungBinh();
                index = i;
            }
        }
        JOptionPane.showMessageDialog(this,students.get(index),"Thông tin sinh viên điểm thấp nhất",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnMenuTBminActionPerformed

    private void btnMenuQuaModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuQuaModuleActionPerformed
            double max = 7.5;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()>= max){
                index = i;
            }
            JOptionPane.showMessageDialog(this,students.get(index),"Thông tin sinh viên",JOptionPane.PLAIN_MESSAGE);
        }   
    }//GEN-LAST:event_btnMenuQuaModuleActionPerformed

    private void btnMenuChuaQuaModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuChuaQuaModuleActionPerformed
                double min = 7.5;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()< min){
                min = students.get(i).getDiemTrungBinh();
                index = i;
            }
            JOptionPane.showMessageDialog(this,students.get(index),"Thông tin sinh viên",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnMenuChuaQuaModuleActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        double min = 7.5;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()< min){
                index++;
            }   
        }   
        JOptionPane.showMessageDialog(this,index,"Đếm số lượng sinh viên chưa qua module",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                double max = 7.5;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getDiemTrungBinh()>= max){
                index++;
            }   
        }   
        JOptionPane.showMessageDialog(this,index,"Đếm số lượng sinh viên qua module",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TableStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JMenuItem btnMenuChuaQuaModule;
    private javax.swing.JMenuItem btnMenuDangXuat;
    private javax.swing.JMenuItem btnMenuLogOut;
    private javax.swing.JMenuItem btnMenuQuaModule;
    private javax.swing.JMenuItem btnMenuTBmax;
    private javax.swing.JMenuItem btnMenuTBmin;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnWrite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void showData() {
        tblModel.setRowCount(0); //reseet bảng về  0
        students.forEach(std -> {
            tblModel.addRow(new Object[]{std.getMaSinhVien(),std.getTenSinhVien(),std.getTuoiSinhVien(),std.getSoDienThoai(),
           std.getDiaChi() ,std.getGioiTinh(),std.getDiemThucHanh(),std.getDiemLyThuyet(),std.getDiemTrungBinh()});
        }); 
    }

    void updateStudent(Student student) {
        students.remove(selected);
        this.addStudent(student);
    }
}
