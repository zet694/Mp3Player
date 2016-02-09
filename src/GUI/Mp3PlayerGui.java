/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objects.MP3;
import Objects.MP3Player;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javazoom.jl.player.Player;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import utils.*;

/**
 *
 * @author Виталий
 */
public class Mp3PlayerGui extends javax.swing.JFrame implements BasicPlayerListener{

    private DefaultListModel mp3ListModel = new DefaultListModel();
    private MP3Player player = new MP3Player(this);
    private long duration;
    private int  bytesLen;
    private long secondAmount;
    private boolean movingFromJump = false;
    private boolean moveAutomatic = false;
    private double posValue = 0.0;
    
    
    /**
     * Creates new form Mp3PlayerGui
     */
    public Mp3PlayerGui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        panelSearch = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jtextSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAddSong = new javax.swing.JButton();
        btnDeleteSong = new javax.swing.JButton();
        btnPostSong = new javax.swing.JButton();
        javax.swing.JButton btnNextSong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        slideVolume = new javax.swing.JSlider();
        btnPastSongMain = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnPlaySong = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnNextSongMain = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblVolue = new javax.swing.JLabel();
        progressSlider = new javax.swing.JSlider();
        lblSongName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Врублевский Виталий");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Поиск"));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/find (2).png"))); // NOI18N
        btnSearch.setText("Поиск");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jtextSearch.setText("Введите название песни...");
        jtextSearch.setToolTipText("Назваине песни на русском или английском языке");
        jtextSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextSearchActionPerformed(evt);
            }
        });
        jtextSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtextSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextSearchFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtextSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextSearch)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Главное окно"));

        btnAddSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_add_4245.png"))); // NOI18N
        btnAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSongActionPerformed(evt);
            }
        });

        btnDeleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit_remove_3432.png"))); // NOI18N
        btnDeleteSong.setToolTipText("");
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        btnPostSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/up_6177.png"))); // NOI18N
        btnPostSong.setToolTipText("");
        btnPostSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostSongActionPerformed(evt);
            }
        });

        btnNextSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/down_3836.png"))); // NOI18N
        btnNextSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSongActionPerformed(evt);
            }
        });

        jList1.setModel(mp3ListModel);
        jScrollPane1.setViewportView(jList1);

        slideVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideVolumeStateChanged(evt);
            }
        });

        btnPastSongMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1leftarrow_6308.png"))); // NOI18N

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/amarok_4785.png"))); // NOI18N
        jToggleButton1.setToolTipText("");
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sound-off.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player_play_5276.png"))); // NOI18N
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player_pause_1545.png"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player_stop_3632.png"))); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnNextSongMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/right.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblVolue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblVolue.setText("Громоксть:50");

        progressSlider.setValue(0);
        progressSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progressSliderStateChanged(evt);
            }
        });

        lblSongName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSongName.setText("Сейчас играет:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPostSong, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slideVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnPastSongMain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlaySong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNextSongMain, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(progressSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVolue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSongName))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteSong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPostSong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVolue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSongName)
                .addGap(13, 13, 13)
                .addComponent(progressSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(slideVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNextSongMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlaySong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPastSongMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("Файл");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/32x32-green-folder-open.png"))); // NOI18N
        jMenuItem1.setText("Открыть Playlist");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/32x32-oxygen-actions-document-save.png"))); // NOI18N
        jMenuItem3.setText("Сохранить Playlist");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Сервис");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/32x32-oxygen-actions-select-rectangular.png"))); // NOI18N
        jMenu3.setText("Выбрать внешний вид");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1450282549_microsoft.png"))); // NOI18N
        jMenuItem4.setText("Системный");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1450282439_miscellaneous-12.png"))); // NOI18N
        jMenuItem5.setText("Сталь");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextSearchActionPerformed

    private void btnPostSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostSongActionPerformed
         int nextindex = jList1.getSelectedIndex() - 1;
         if (nextindex >= 0 ){
             jList1.setSelectedIndex(nextindex);
         }
    }//GEN-LAST:event_btnPostSongActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        SkinUtils.changeSkin(this, UIManager.getSystemLookAndFeelClassName());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        SkinUtils.changeSkin(this, new AluminiumLookAndFeel());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jtextSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextSearchFocusGained
        TextField.CheckTextField(jtextSearch);
    }//GEN-LAST:event_jtextSearchFocusGained

    private void jtextSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextSearchFocusLost
        TextField.checkLostField(jtextSearch);
    }//GEN-LAST:event_jtextSearchFocusLost

    private void btnAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSongActionPerformed
        MyMp3FileFilter mp3FileFilter = new MyMp3FileFilter("mp3", "Аудио файл"); // Задано жестко так как не работало обычно
        
        FileUtils.addFileFilter(fileChooser, mp3FileFilter);
        
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION){
            
           File [] selectFiles = fileChooser.getSelectedFiles();
           
           for(File file: selectFiles){
               MP3 mp3 = new MP3(file.getName(), file.getPath());
               mp3ListModel.addElement(mp3);
           }
        }
    }//GEN-LAST:event_btnAddSongActionPerformed
// Удаление из листа
    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
       int[] indexPlayList = jList1.getSelectedIndices();
       if (indexPlayList.length > 0){
           ArrayList<MP3> mp3ListForRemove = new ArrayList<MP3>();
           for (int i = 0; i < indexPlayList.length; i++){
               MP3 mp3 = (MP3) mp3ListModel.getElementAt(indexPlayList[i]);
               mp3ListForRemove.add(mp3);
           }
           
           // DELETE
           for (MP3 mp3 : mp3ListForRemove){
               mp3ListModel.removeElement(mp3);
           }
       }
       
        
    }//GEN-LAST:event_btnDeleteSongActionPerformed

    private void btnNextSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSongActionPerformed
            int nextindex = jList1.getSelectedIndex() + 1;
            if (nextindex <= jList1.getModel().getSize() - 1 ){
                jList1.setSelectedIndex(nextindex);
            }
    }//GEN-LAST:event_btnNextSongActionPerformed

    private void btnPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySongActionPerformed
        
        
        int[] indexPlaylist = jList1.getSelectedIndices();
        if(indexPlaylist.length > 0){
            MP3 mp3 = (MP3) mp3ListModel.getElementAt(indexPlaylist[0]);
            player.play(mp3.getPath());
            player.setVolume(slideVolume.getValue(), slideVolume.getMaximum());
            
        }
    }//GEN-LAST:event_btnPlaySongActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MyMp3FileFilter myMp3FileFilter = new MyMp3FileFilter("pls", "Сохранить плей лист");
        FileUtils.addFileFilter(fileChooser, myMp3FileFilter);
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            
            File selectedFile = fileChooser.getSelectedFile();
            if(selectedFile.exists()){
            
            int resultOvveride = JOptionPane.showConfirmDialog(this, "Файл существует", "Перезаписать?", JOptionPane.YES_NO_CANCEL_OPTION);
            switch (resultOvveride){
                case JOptionPane.NO_OPTION:
                    jMenuItem3ActionPerformed(evt);
                    return;
                case JOptionPane.CANCEL_OPTION:
                    fileChooser.cancelSelection();
                    return;
            }
            fileChooser.approveSelection();
           }
            
            String fileExtension = FileUtils.getaFileExtension(selectedFile);
            
            String fileNameForSave = (fileExtension != null && fileExtension.equals("pls") ? selectedFile.getPath() : selectedFile.getPath() + "." + "pls");
            FileUtils.serialize(mp3ListModel, fileNameForSave);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MyMp3FileFilter myMp3FileFilter = new MyMp3FileFilter("pls", "Открыть плей лист");
        FileUtils.addFileFilter(fileChooser, myMp3FileFilter);
        int result  = fileChooser.showOpenDialog(this);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File selecFile = fileChooser.getSelectedFile();
            DefaultListModel mp3ListModel = (DefaultListModel) FileUtils.deserialize(selecFile.getPath());
            this.mp3ListModel = mp3ListModel;
            jList1.setModel(mp3ListModel);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchStr = jtextSearch.getText();
        
        
        if (searchStr == null || searchStr.trim().equals("")) {
            return;
        }
        //Индекс поиска
        ArrayList<Integer> mp3FindedIndex = new ArrayList<>();
        
        //Проход коллекции и поиск
        for (int i = 0; i<mp3ListModel.size(); i++){
            MP3 mp3 = (MP3) mp3ListModel.getElementAt(i);
            // Поск вхождения строки 
            if(mp3.getName().toUpperCase().contains(searchStr.toUpperCase()));{
            mp3FindedIndex.add(i);
               }
        }
        
        // Коллекцию индексов в массив
        int [] selectedIndex = new int[mp3FindedIndex.size()];
        
        if(selectedIndex.length == 0){
            JOptionPane.showMessageDialog(this, "Поиск в строке \'" + searchStr + "\' не дал результатов");
            jtextSearch.requestFocus();
            jtextSearch.selectAll();
            return;
        }
        
        for (int i = 0; i < selectedIndex.length ; i++){
        selectedIndex[i] = mp3FindedIndex.get(i).intValue();
    }
        jList1.setSelectedIndices(selectedIndex);
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        player.stop();
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        player.pause();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void slideVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideVolumeStateChanged
        player.setVolume(slideVolume.getValue(),slideVolume.getMaximum());
        
        lblVolue.setText("Громкость:" + slideVolume.getValue());
        if(slideVolume.getValue() == 0){
            jToggleButton1.setSelected(true);
        }else{
            jToggleButton1.setSelected(false);
        }
    }//GEN-LAST:event_slideVolumeStateChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()){
            slideVolume.setValue(0);
        }else{
            slideVolume.setValue(40);// Доделать!
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void progressSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progressSliderStateChanged
        if (progressSlider.getValueIsAdjusting() == false){
            if (moveAutomatic == true){
                moveAutomatic = false;
                posValue = progressSlider.getValue() * 1.0 / 1000;
                processSeek(posValue);
            }
        }else{
            moveAutomatic = true;
            movingFromJump = true;
        }
    }//GEN-LAST:event_progressSliderStateChanged

    public void processSeek(double bytes){
       try{
        long skipBytes = (long) Math.round(((Integer) bytesLen).intValue() * bytes);
        player.jump(skipBytes);
       }catch(Exception e){
           e.printStackTrace();
           movingFromJump = false;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mp3PlayerGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSong;
    private javax.swing.JButton btnDeleteSong;
    private javax.swing.JButton btnNextSongMain;
    private javax.swing.JButton btnPastSongMain;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlaySong;
    private javax.swing.JButton btnPostSong;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStop;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jtextSearch;
    private javax.swing.JLabel lblSongName;
    private javax.swing.JLabel lblVolue;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JSlider progressSlider;
    private javax.swing.JSlider slideVolume;
    // End of variables declaration//GEN-END:variables
 
    public void opened(Object o, Map map) {
       duration = (long) Math.round((((Long) map.get ("duration")).longValue()) / 1000000);
       bytesLen = (int) Math.round(((Integer) map.get("mp3.length.bytes")).intValue());
   
       String songName = map.get("title") == null ? map.get("title").toString() : FileUtils.getFileNameWithouExtension(new File(o.toString()).getName());
       
       
       // Укоротить название
       if(songName.length() > 30){
         songName =  songName.substring(0,30) + "...";
       }
       map.get("title");
       lblSongName.setText("Сейчас играет:" + songName);
    }

    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map proparties) {
       float progress = -1.0f;
       
       if((bytesread > 0) && (duration > 0)){
           progress = bytesread * 1.0f / bytesLen * 1.0f;
       }
       
       // Сколько сек прошло
       secondAmount = (long) (duration * progress);
       
       if (duration != 0){
           if(movingFromJump == false){
               progressSlider.setValue(((int) Math.round(secondAmount * 1000 / duration)));
           }
       }
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
       int state = bpe.getCode();
       
       if(state == BasicPlayerEvent.PLAYING){
           movingFromJump = false;
       }esle if (state == BasicPlayerEvent.SEEKING){
           movingFromJump = true; 
       }else if (state == BasicPlayerEvent.EOM){
           System.out.println(""); /// Доделать что бы при конце песни воспр.следуйщая
       }
    }

    @Override
    public void setController(BasicController bc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
