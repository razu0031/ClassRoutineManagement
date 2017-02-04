/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package routine7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author rAZU
 */
public class Teacher extends javax.swing.JFrame {

    Connection Data_Con;
    Statement Data_State;
    Statement Data_State1,Data_State2,Data_State3;
    ResultSet Data_Resultset;
    ResultSet Data_Resultset1,Data_Resultset2,Data_Resultset3;
    PreparedStatement Data_Pre_State;
    
    JFrame f;
    
    String search_by=null;
    String name=null;
    String field=null;
    
    int int_day2;
    String String_day;
    
    JLabel jLabel_Day;
    Calendar current_calender;
    
    String time_1st="",time_2nd="",time_3rd="",time_4th="",time_5th="",time_6th="",time_7th="",time_8th="",time_9th="",time_10th="",time_11th="",time_12th="",
            time_13th="";
    
    String sat_class_1st_sub,sat_class_1st_room,sat_class_1st_tn,sat_class_2nd_sub,sat_class_2nd_room,sat_class_2nd_tn,
            sat_class_3rd_sub,sat_class_3rd_room,sat_class_3rd_tn,sat_class_4th_sub,sat_class_4th_room,sat_class_4th_tn,
            sat_class_5th_sub,sat_class_5th_room,sat_class_5th_tn,sat_class_6th_sub,sat_class_6th_room,sat_class_6th_tn,
            sat_class_7th_sub,sat_class_7th_room,sat_class_7th_tn,sat_class_8th_sub,sat_class_8th_room,sat_class_8th_tn,
            sat_class_9th_sub,sat_class_9th_room,sat_class_9th_tn,sat_class_10th_sub,sat_class_10th_room,sat_class_10th_tn,
            sat_class_11th_sub,sat_class_11th_room,sat_class_11th_tn,sat_class_12th_sub,sat_class_12th_room,sat_class_12th_tn,
            sat_class_13th_sub,sat_class_13th_room,sat_class_13th_tn;
    
    String sun_class_1st_sub,sun_class_1st_room,sun_class_1st_tn,sun_class_2nd_sub,sun_class_2nd_room,sun_class_2nd_tn,
            sun_class_3rd_sub,sun_class_3rd_room,sun_class_3rd_tn,sun_class_4th_sub,sun_class_4th_room,sun_class_4th_tn,
            sun_class_5th_sub,sun_class_5th_room,sun_class_5th_tn,sun_class_6th_sub,sun_class_6th_room,sun_class_6th_tn,
            sun_class_7th_sub,sun_class_7th_room,sun_class_7th_tn,sun_class_8th_sub,sun_class_8th_room,sun_class_8th_tn,
            sun_class_9th_sub,sun_class_9th_room,sun_class_9th_tn,sun_class_10th_sub,sun_class_10th_room,sun_class_10th_tn,
            sun_class_11th_sub,sun_class_11th_room,sun_class_11th_tn,sun_class_12th_sub,sun_class_12th_room,sun_class_12th_tn,
            sun_class_13th_sub,sun_class_13th_room,sun_class_13th_tn;
    
    String mon_class_1st_sub,mon_class_1st_room,mon_class_1st_tn,mon_class_2nd_sub,mon_class_2nd_room,mon_class_2nd_tn,
            mon_class_3rd_sub,mon_class_3rd_room,mon_class_3rd_tn,mon_class_4th_sub,mon_class_4th_room,mon_class_4th_tn,
            mon_class_5th_sub,mon_class_5th_room,mon_class_5th_tn,mon_class_6th_sub,mon_class_6th_room,mon_class_6th_tn,
            mon_class_7th_sub,mon_class_7th_room,mon_class_7th_tn,mon_class_8th_sub,mon_class_8th_room,mon_class_8th_tn,
            mon_class_9th_sub,mon_class_9th_room,mon_class_9th_tn,mon_class_10th_sub,mon_class_10th_room,mon_class_10th_tn,
            mon_class_11th_sub,mon_class_11th_room,mon_class_11th_tn,mon_class_12th_sub,mon_class_12th_room,mon_class_12th_tn,
            mon_class_13th_sub,mon_class_13th_room,mon_class_13th_tn;
    
    String tues_class_1st_sub,tues_class_1st_room,tues_class_1st_tn,tues_class_2nd_sub,tues_class_2nd_room,tues_class_2nd_tn,
            tues_class_3rd_sub,tues_class_3rd_room,tues_class_3rd_tn,tues_class_4th_sub,tues_class_4th_room,tues_class_4th_tn,
            tues_class_5th_sub,tues_class_5th_room,tues_class_5th_tn,tues_class_6th_sub,tues_class_6th_room,tues_class_6th_tn,
            tues_class_7th_sub,tues_class_7th_room,tues_class_7th_tn,tues_class_8th_sub,tues_class_8th_room,tues_class_8th_tn,
            tues_class_9th_sub,tues_class_9th_room,tues_class_9th_tn,tues_class_10th_sub,tues_class_10th_room,tues_class_10th_tn,
            tues_class_11th_sub,tues_class_11th_room,tues_class_11th_tn,tues_class_12th_sub,tues_class_12th_room,tues_class_12th_tn,
            tues_class_13th_sub,tues_class_13th_room,tues_class_13th_tn;
    
    String wed_class_1st_sub,wed_class_1st_room,wed_class_1st_tn,wed_class_2nd_sub,wed_class_2nd_room,wed_class_2nd_tn,
            wed_class_3rd_sub,wed_class_3rd_room,wed_class_3rd_tn,wed_class_4th_sub,wed_class_4th_room,wed_class_4th_tn,
            wed_class_5th_sub,wed_class_5th_room,wed_class_5th_tn,wed_class_6th_sub,wed_class_6th_room,wed_class_6th_tn,
            wed_class_7th_sub,wed_class_7th_room,wed_class_7th_tn,wed_class_8th_sub,wed_class_8th_room,wed_class_8th_tn,
            wed_class_9th_sub,wed_class_9th_room,wed_class_9th_tn,wed_class_10th_sub,wed_class_10th_room,wed_class_10th_tn,
            wed_class_11th_sub,wed_class_11th_room,wed_class_11th_tn,wed_class_12th_sub,wed_class_12th_room,wed_class_12th_tn,
            wed_class_13th_sub,wed_class_13th_room,wed_class_13th_tn;
    
    String thurs_class_1st_sub,thurs_class_1st_room,thurs_class_1st_tn,thurs_class_2nd_sub,thurs_class_2nd_room,thurs_class_2nd_tn,
            thurs_class_3rd_sub,thurs_class_3rd_room,thurs_class_3rd_tn,thurs_class_4th_sub,thurs_class_4th_room,thurs_class_4th_tn,
            thurs_class_5th_sub,thurs_class_5th_room,thurs_class_5th_tn,thurs_class_6th_sub,thurs_class_6th_room,thurs_class_6th_tn,
            thurs_class_7th_sub,thurs_class_7th_room,thurs_class_7th_tn,thurs_class_8th_sub,thurs_class_8th_room,thurs_class_8th_tn,
            thurs_class_9th_sub,thurs_class_9th_room,thurs_class_9th_tn,thurs_class_10th_sub,thurs_class_10th_room,thurs_class_10th_tn,
            thurs_class_11th_sub,thurs_class_11th_room,thurs_class_11th_tn,thurs_class_12th_sub,thurs_class_12th_room,thurs_class_12th_tn,
            thurs_class_13th_sub,thurs_class_13th_room,thurs_class_13th_tn;
    
    public Teacher() {
        
        connect();
        
        f = new JFrame();
        f.setTitle("Teacher");       
        f.setBounds(30,10,1300,700);        
        f.setResizable(false);
        
        f.setDefaultCloseOperation(0);
        
        
       
        
        initComponents();
        Get_Day();
        
        Full_Routine();
        
        System.out.println(Get_Day());
        
     //   jLabel1.setText(String_day);
        
        jPanel_Search.setVisible(false);
        
    //    jPanel_Teacher_Under.add(jLayeredPane2);
        f.add(jPanel_Teacher_Under);
        f.show();
        
    }

    public String Get_Day()
    {
        current_calender=new GregorianCalendar();
        
        int int_day= current_calender.get(Calendar.DAY_OF_WEEK);
        
        if(int_day==1)String_day="Sunday";
        else if(int_day==2)String_day="Monday";
        else if(int_day==3)String_day="Tuesday";
        else if(int_day==4)String_day="Wednesday";
        else if(int_day==5)String_day="Thursday";
        else if(int_day==6)String_day="Friday";
        else if(int_day==7)String_day="Saturday";
        

        return String_day;
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel_Teacher_Under = new javax.swing.JPanel();
        jButton_Back_From_Teacher = new javax.swing.JButton();
        jTextField_Search = new javax.swing.JTextField();
        button_Search = new java.awt.Button();
        jPanel_Search = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        label1 = new java.awt.Label();
        jPanel_Full_Routine = new javax.swing.JPanel();
        jTextField_Time_Class_1st = new javax.swing.JTextField();
        jTextField_Time_Class_2nd = new javax.swing.JTextField();
        jTextField_Saturday = new javax.swing.JTextField();
        jTextField_Time_Class_3rd = new javax.swing.JTextField();
        jTextField_Time_Class_4th = new javax.swing.JTextField();
        jTextField_Time_Class_5th = new javax.swing.JTextField();
        jTextField_Time_Class_6th = new javax.swing.JTextField();
        jTextField_Time_Class_7th = new javax.swing.JTextField();
        jTextField_Time_Class_8th = new javax.swing.JTextField();
        jTextField_Time_Class_9th = new javax.swing.JTextField();
        jTextField_Time_Class_10th = new javax.swing.JTextField();
        jTextField_Time_Class_11th = new javax.swing.JTextField();
        jTextField_Time_Class_12th = new javax.swing.JTextField();
        jTextField_Time_Class_13th = new javax.swing.JTextField();
        jTextField_Sunday = new javax.swing.JTextField();
        jTextField_Monday = new javax.swing.JTextField();
        jTextField_Tuesday = new javax.swing.JTextField();
        jTextField_Wednesday = new javax.swing.JTextField();
        jTextField_Thursday = new javax.swing.JTextField();
        list_Sturday_Class_1st = new java.awt.List();
        list_Sunday_Class_1st = new java.awt.List();
        list_Sturday_Class_2nd = new java.awt.List();
        list_Sturday_Class_3rd = new java.awt.List();
        list_Sturday_Class_4th = new java.awt.List();
        list_Sturday_Class_5th = new java.awt.List();
        list_Sturday_Class_6th = new java.awt.List();
        list_Sturday_Class_7th = new java.awt.List();
        list_Sturday_Class_8th = new java.awt.List();
        list_Sturday_Class_9th = new java.awt.List();
        list_Sturday_Class_10th = new java.awt.List();
        list_Sturday_Class_11th = new java.awt.List();
        list_Sturday_Class_12th = new java.awt.List();
        list_Sturday_Class_13th = new java.awt.List();
        list_Monday_Class_1st = new java.awt.List();
        list_Tuesday_Class_1st = new java.awt.List();
        list_Wednesday_Class_1st = new java.awt.List();
        list_Thursday_Class_1st = new java.awt.List();
        list_Sunday_Class_2nd = new java.awt.List();
        list_Sunday_Class_3rd = new java.awt.List();
        list_Sunday_Class_4th = new java.awt.List();
        list_Sunday_Class_5th = new java.awt.List();
        list_Sunday_Class_6th = new java.awt.List();
        list_Sunday_Class_7th = new java.awt.List();
        list_Sunday_Class_8th = new java.awt.List();
        list_Sunday_Class_9th = new java.awt.List();
        list_Sunday_Class_10th = new java.awt.List();
        list_Monday_Class_2nd = new java.awt.List();
        list_Sunday_Class_11th = new java.awt.List();
        list_Sunday_Class_12th = new java.awt.List();
        list_Sunday_Class_13th = new java.awt.List();
        list_Monday_Class_3rd = new java.awt.List();
        list_Monday_Class_5th = new java.awt.List();
        list_Monday_Class_6th = new java.awt.List();
        list_Monday_Class_4th = new java.awt.List();
        list_Monday_Class_7th = new java.awt.List();
        list_Monday_Class_8th = new java.awt.List();
        list_Monday_Class_9th = new java.awt.List();
        list_Monday_Class_10th = new java.awt.List();
        list_Monday_Class_11th = new java.awt.List();
        list_Monday_Class_12th = new java.awt.List();
        list_Monday_Class_13th = new java.awt.List();
        list_Thursday_Class_2nd = new java.awt.List();
        list_Wednesday_Class_2nd = new java.awt.List();
        list_Tuesday_Class_2nd = new java.awt.List();
        list_Thursday_Class_3rd = new java.awt.List();
        list_Wednesday_Class_3rd = new java.awt.List();
        list_Tuesday_Class_3rd = new java.awt.List();
        list_Wednesday_Class_4th = new java.awt.List();
        list_Tuesday_Class_4th = new java.awt.List();
        list_Thursday_Class_4th = new java.awt.List();
        list_Tuesday_Class_5th = new java.awt.List();
        list_Wednesday_Class_5th = new java.awt.List();
        list_Thursday_Class_5th = new java.awt.List();
        list_Tuesday_Class_6th = new java.awt.List();
        list_Wednesday_Class_6th = new java.awt.List();
        list_Thursday_Class_6th = new java.awt.List();
        list_Tuesday_Class_7th = new java.awt.List();
        list_Wednesday_Class_7th = new java.awt.List();
        list_Thursday_Class_7th = new java.awt.List();
        list_Tuesday_Class_8th = new java.awt.List();
        list_Wednesday_Class_8th = new java.awt.List();
        list_Thursday_Class_8th = new java.awt.List();
        list_Wednesday_Class_9th = new java.awt.List();
        list_Thursday_Class_9th = new java.awt.List();
        list_Tuesday_Class_9th = new java.awt.List();
        list_Tuesday_Class_10th = new java.awt.List();
        list_Wednesday_Class_10th = new java.awt.List();
        list_Thursday_Class_10th = new java.awt.List();
        list_Tuesday_Class_11th = new java.awt.List();
        list_Wednesday_Class_11th = new java.awt.List();
        list_Thursday_Class_11th = new java.awt.List();
        list_Tuesday_Class_12th = new java.awt.List();
        list_Wednesday_Class_12th = new java.awt.List();
        list_Thursday_Class_12th = new java.awt.List();
        list_Tuesday_Class_13th = new java.awt.List();
        list_Wednesday_Class_13th = new java.awt.List();
        list_Thursday_Class_13th = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Teacher_Under.setBackground(new java.awt.Color(0, 204, 204));

        jButton_Back_From_Teacher.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Back_From_Teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/routine7/10.png"))); // NOI18N
        jButton_Back_From_Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Back_From_TeacherActionPerformed(evt);
            }
        });

        jTextField_Search.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jTextField_Search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        button_Search.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        button_Search.setForeground(new java.awt.Color(0, 102, 0));
        button_Search.setLabel("Search");
        button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SearchActionPerformed(evt);
            }
        });

        jPanel_Search.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel_Search.setPreferredSize(new java.awt.Dimension(1280, 601));

        button1.setBackground(new java.awt.Color(0, 153, 153));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 204, 204));
        button1.setLabel("Back to Full Routine");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(153, 255, 153));
        jTable1.setFont(new java.awt.Font("DialogInput", 0, 21)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Day", "Class_Time", "Room_Number", "Subject", "Teacher_Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        button2.setBackground(new java.awt.Color(0, 153, 153));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(204, 204, 204));
        button2.setLabel("Shedule for Today");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 153, 153));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(204, 204, 204));
        button3.setLabel("Shedule for Whole Week");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("DialogInput", 1, 26)); // NOI18N
        label1.setText("Search Area");

        javax.swing.GroupLayout jPanel_SearchLayout = new javax.swing.GroupLayout(jPanel_Search);
        jPanel_Search.setLayout(jPanel_SearchLayout);
        jPanel_SearchLayout.setHorizontalGroup(
            jPanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel_SearchLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 234, Short.MAX_VALUE))
            .addGroup(jPanel_SearchLayout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_SearchLayout.setVerticalGroup(
            jPanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SearchLayout.createSequentialGroup()
                        .addGroup(jPanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_Full_Routine.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_Full_Routine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel_Full_Routine.setPreferredSize(new java.awt.Dimension(1196, 556));
        jPanel_Full_Routine.setLayout(null);

        jTextField_Time_Class_1st.setEditable(false);
        jTextField_Time_Class_1st.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_1st.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_1st.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_1st.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_1st.setText("12:00-12:50");
        jTextField_Time_Class_1st.setPreferredSize(new java.awt.Dimension(83, 22));
        jTextField_Time_Class_1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Time_Class_1stActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Time_Class_1st);
        jTextField_Time_Class_1st.setBounds(122, 59, 83, 22);

        jTextField_Time_Class_2nd.setEditable(false);
        jTextField_Time_Class_2nd.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_2nd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_2nd.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_2nd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_2nd.setText("12:00-12:50");
        jTextField_Time_Class_2nd.setPreferredSize(new java.awt.Dimension(83, 22));
        jPanel_Full_Routine.add(jTextField_Time_Class_2nd);
        jTextField_Time_Class_2nd.setBounds(211, 59, 83, 22);

        jTextField_Saturday.setEditable(false);
        jTextField_Saturday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Saturday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Saturday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Saturday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Saturday.setText("Saturday");
        jPanel_Full_Routine.add(jTextField_Saturday);
        jTextField_Saturday.setBounds(12, 91, 104, 78);

        jTextField_Time_Class_3rd.setEditable(false);
        jTextField_Time_Class_3rd.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_3rd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_3rd.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_3rd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_3rd.setText("12:00-12:50");
        jTextField_Time_Class_3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Time_Class_3rdActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Time_Class_3rd);
        jTextField_Time_Class_3rd.setBounds(300, 59, 83, 22);

        jTextField_Time_Class_4th.setEditable(false);
        jTextField_Time_Class_4th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_4th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_4th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_4th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_4th.setText("12:00-12:50");
        jTextField_Time_Class_4th.setPreferredSize(new java.awt.Dimension(82, 22));
        jPanel_Full_Routine.add(jTextField_Time_Class_4th);
        jTextField_Time_Class_4th.setBounds(389, 59, 83, 22);

        jTextField_Time_Class_5th.setEditable(false);
        jTextField_Time_Class_5th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_5th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_5th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_5th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_5th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_5th);
        jTextField_Time_Class_5th.setBounds(478, 59, 83, 22);

        jTextField_Time_Class_6th.setEditable(false);
        jTextField_Time_Class_6th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_6th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_6th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_6th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_6th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_6th);
        jTextField_Time_Class_6th.setBounds(567, 59, 83, 22);

        jTextField_Time_Class_7th.setEditable(false);
        jTextField_Time_Class_7th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_7th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_7th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_7th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_7th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_7th);
        jTextField_Time_Class_7th.setBounds(656, 59, 83, 22);

        jTextField_Time_Class_8th.setEditable(false);
        jTextField_Time_Class_8th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_8th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_8th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_8th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_8th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_8th);
        jTextField_Time_Class_8th.setBounds(745, 59, 83, 22);

        jTextField_Time_Class_9th.setEditable(false);
        jTextField_Time_Class_9th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_9th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_9th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_9th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_9th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_9th);
        jTextField_Time_Class_9th.setBounds(834, 59, 83, 22);

        jTextField_Time_Class_10th.setEditable(false);
        jTextField_Time_Class_10th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_10th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_10th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_10th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_10th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_10th);
        jTextField_Time_Class_10th.setBounds(923, 59, 83, 22);

        jTextField_Time_Class_11th.setEditable(false);
        jTextField_Time_Class_11th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_11th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_11th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_11th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_11th.setText("12:00-12:50");
        jTextField_Time_Class_11th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Time_Class_11thActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Time_Class_11th);
        jTextField_Time_Class_11th.setBounds(1012, 59, 83, 22);

        jTextField_Time_Class_12th.setEditable(false);
        jTextField_Time_Class_12th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_12th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_12th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_12th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_12th.setText("12:00-12:50");
        jTextField_Time_Class_12th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Time_Class_12thActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Time_Class_12th);
        jTextField_Time_Class_12th.setBounds(1101, 59, 83, 22);

        jTextField_Time_Class_13th.setEditable(false);
        jTextField_Time_Class_13th.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Time_Class_13th.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_Time_Class_13th.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Time_Class_13th.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Time_Class_13th.setText("12:00-12:50");
        jPanel_Full_Routine.add(jTextField_Time_Class_13th);
        jTextField_Time_Class_13th.setBounds(1190, 59, 73, 22);

        jTextField_Sunday.setEditable(false);
        jTextField_Sunday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Sunday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Sunday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Sunday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Sunday.setText("Sunday");
        jPanel_Full_Routine.add(jTextField_Sunday);
        jTextField_Sunday.setBounds(12, 175, 104, 78);

        jTextField_Monday.setEditable(false);
        jTextField_Monday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Monday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Monday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Monday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Monday.setText("Monday");
        jTextField_Monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MondayActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Monday);
        jTextField_Monday.setBounds(12, 259, 104, 78);

        jTextField_Tuesday.setEditable(false);
        jTextField_Tuesday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Tuesday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Tuesday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Tuesday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Tuesday.setText("Tuesday");
        jPanel_Full_Routine.add(jTextField_Tuesday);
        jTextField_Tuesday.setBounds(12, 343, 104, 78);

        jTextField_Wednesday.setEditable(false);
        jTextField_Wednesday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Wednesday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Wednesday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Wednesday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Wednesday.setText("Wednesday");
        jTextField_Wednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_WednesdayActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(jTextField_Wednesday);
        jTextField_Wednesday.setBounds(12, 427, 104, 78);

        jTextField_Thursday.setEditable(false);
        jTextField_Thursday.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Thursday.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jTextField_Thursday.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Thursday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Thursday.setText("Thursday");
        jPanel_Full_Routine.add(jTextField_Thursday);
        jTextField_Thursday.setBounds(12, 511, 104, 78);

        list_Sturday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_1st);
        list_Sturday_Class_1st.setBounds(122, 91, 83, 78);

        list_Sunday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_1st);
        list_Sunday_Class_1st.setBounds(122, 175, 83, 78);

        list_Sturday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_2nd);
        list_Sturday_Class_2nd.setBounds(211, 91, 83, 78);

        list_Sturday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        list_Sturday_Class_3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_Sturday_Class_3rdActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(list_Sturday_Class_3rd);
        list_Sturday_Class_3rd.setBounds(300, 91, 83, 78);

        list_Sturday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_4th);
        list_Sturday_Class_4th.setBounds(389, 91, 83, 78);

        list_Sturday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_5th);
        list_Sturday_Class_5th.setBounds(478, 91, 83, 78);

        list_Sturday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_6th);
        list_Sturday_Class_6th.setBounds(567, 91, 83, 78);

        list_Sturday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_7th);
        list_Sturday_Class_7th.setBounds(656, 91, 83, 78);

        list_Sturday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_8th);
        list_Sturday_Class_8th.setBounds(745, 91, 83, 78);

        list_Sturday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_9th);
        list_Sturday_Class_9th.setBounds(834, 91, 83, 78);

        list_Sturday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_10th);
        list_Sturday_Class_10th.setBounds(923, 91, 83, 78);

        list_Sturday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_11th);
        list_Sturday_Class_11th.setBounds(1012, 91, 83, 78);

        list_Sturday_Class_12th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_12th);
        list_Sturday_Class_12th.setBounds(1101, 91, 83, 78);

        list_Sturday_Class_13th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sturday_Class_13th);
        list_Sturday_Class_13th.setBounds(1190, 91, 73, 78);

        list_Monday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        list_Monday_Class_1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_Monday_Class_1stActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(list_Monday_Class_1st);
        list_Monday_Class_1st.setBounds(122, 259, 83, 78);

        list_Tuesday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_1st);
        list_Tuesday_Class_1st.setBounds(122, 343, 83, 78);

        list_Wednesday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_1st);
        list_Wednesday_Class_1st.setBounds(122, 427, 83, 78);

        list_Thursday_Class_1st.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_1st);
        list_Thursday_Class_1st.setBounds(122, 511, 83, 78);

        list_Sunday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_2nd);
        list_Sunday_Class_2nd.setBounds(211, 175, 83, 78);

        list_Sunday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_3rd);
        list_Sunday_Class_3rd.setBounds(300, 175, 83, 78);

        list_Sunday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_4th);
        list_Sunday_Class_4th.setBounds(389, 175, 83, 78);

        list_Sunday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_5th);
        list_Sunday_Class_5th.setBounds(478, 175, 83, 78);

        list_Sunday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_6th);
        list_Sunday_Class_6th.setBounds(567, 175, 83, 78);

        list_Sunday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        list_Sunday_Class_7th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_Sunday_Class_7thActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(list_Sunday_Class_7th);
        list_Sunday_Class_7th.setBounds(656, 175, 83, 78);

        list_Sunday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_8th);
        list_Sunday_Class_8th.setBounds(745, 175, 83, 78);

        list_Sunday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_9th);
        list_Sunday_Class_9th.setBounds(834, 175, 83, 78);

        list_Sunday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_10th);
        list_Sunday_Class_10th.setBounds(923, 175, 83, 78);

        list_Monday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_2nd);
        list_Monday_Class_2nd.setBounds(211, 259, 83, 78);

        list_Sunday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Sunday_Class_11th);
        list_Sunday_Class_11th.setBounds(1012, 175, 83, 78);
        jPanel_Full_Routine.add(list_Sunday_Class_12th);
        list_Sunday_Class_12th.setBounds(1101, 175, 83, 78);
        jPanel_Full_Routine.add(list_Sunday_Class_13th);
        list_Sunday_Class_13th.setBounds(1190, 175, 73, 78);

        list_Monday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_3rd);
        list_Monday_Class_3rd.setBounds(300, 259, 83, 78);

        list_Monday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_5th);
        list_Monday_Class_5th.setBounds(478, 259, 83, 78);

        list_Monday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_6th);
        list_Monday_Class_6th.setBounds(567, 259, 83, 78);

        list_Monday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_4th);
        list_Monday_Class_4th.setBounds(389, 259, 83, 78);

        list_Monday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_7th);
        list_Monday_Class_7th.setBounds(656, 259, 83, 78);

        list_Monday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_8th);
        list_Monday_Class_8th.setBounds(745, 259, 83, 78);

        list_Monday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_9th);
        list_Monday_Class_9th.setBounds(834, 259, 83, 78);

        list_Monday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_10th);
        list_Monday_Class_10th.setBounds(923, 259, 83, 78);

        list_Monday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_11th);
        list_Monday_Class_11th.setBounds(1012, 259, 83, 78);

        list_Monday_Class_12th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_12th);
        list_Monday_Class_12th.setBounds(1101, 259, 83, 78);

        list_Monday_Class_13th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Monday_Class_13th);
        list_Monday_Class_13th.setBounds(1190, 259, 73, 78);

        list_Thursday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_2nd);
        list_Thursday_Class_2nd.setBounds(211, 511, 83, 78);

        list_Wednesday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_2nd);
        list_Wednesday_Class_2nd.setBounds(211, 427, 83, 78);

        list_Tuesday_Class_2nd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_2nd);
        list_Tuesday_Class_2nd.setBounds(211, 343, 83, 78);

        list_Thursday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_3rd);
        list_Thursday_Class_3rd.setBounds(300, 511, 83, 78);

        list_Wednesday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_3rd);
        list_Wednesday_Class_3rd.setBounds(300, 427, 83, 78);

        list_Tuesday_Class_3rd.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_3rd);
        list_Tuesday_Class_3rd.setBounds(300, 343, 83, 78);

        list_Wednesday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_4th);
        list_Wednesday_Class_4th.setBounds(389, 427, 83, 78);

        list_Tuesday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_4th);
        list_Tuesday_Class_4th.setBounds(389, 343, 83, 78);

        list_Thursday_Class_4th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_4th);
        list_Thursday_Class_4th.setBounds(389, 511, 83, 78);

        list_Tuesday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_5th);
        list_Tuesday_Class_5th.setBounds(478, 343, 83, 78);

        list_Wednesday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_5th);
        list_Wednesday_Class_5th.setBounds(478, 427, 83, 78);

        list_Thursday_Class_5th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_5th);
        list_Thursday_Class_5th.setBounds(478, 511, 83, 78);

        list_Tuesday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_6th);
        list_Tuesday_Class_6th.setBounds(567, 343, 83, 78);

        list_Wednesday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_6th);
        list_Wednesday_Class_6th.setBounds(567, 427, 83, 78);

        list_Thursday_Class_6th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_6th);
        list_Thursday_Class_6th.setBounds(567, 511, 83, 78);

        list_Tuesday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_7th);
        list_Tuesday_Class_7th.setBounds(656, 343, 83, 78);

        list_Wednesday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_7th);
        list_Wednesday_Class_7th.setBounds(656, 427, 83, 78);

        list_Thursday_Class_7th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_7th);
        list_Thursday_Class_7th.setBounds(656, 511, 83, 78);

        list_Tuesday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_8th);
        list_Tuesday_Class_8th.setBounds(745, 343, 83, 78);

        list_Wednesday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_8th);
        list_Wednesday_Class_8th.setBounds(745, 427, 83, 78);

        list_Thursday_Class_8th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_8th);
        list_Thursday_Class_8th.setBounds(745, 511, 83, 78);

        list_Wednesday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_9th);
        list_Wednesday_Class_9th.setBounds(834, 427, 83, 78);

        list_Thursday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_9th);
        list_Thursday_Class_9th.setBounds(834, 511, 83, 78);

        list_Tuesday_Class_9th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        list_Tuesday_Class_9th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_Tuesday_Class_9thActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(list_Tuesday_Class_9th);
        list_Tuesday_Class_9th.setBounds(834, 343, 83, 78);

        list_Tuesday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_10th);
        list_Tuesday_Class_10th.setBounds(923, 343, 83, 78);

        list_Wednesday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_10th);
        list_Wednesday_Class_10th.setBounds(923, 427, 83, 78);

        list_Thursday_Class_10th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_10th);
        list_Thursday_Class_10th.setBounds(923, 511, 83, 78);

        list_Tuesday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        list_Tuesday_Class_11th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_Tuesday_Class_11thActionPerformed(evt);
            }
        });
        jPanel_Full_Routine.add(list_Tuesday_Class_11th);
        list_Tuesday_Class_11th.setBounds(1012, 343, 83, 78);

        list_Wednesday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_11th);
        list_Wednesday_Class_11th.setBounds(1012, 427, 83, 78);

        list_Thursday_Class_11th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_11th);
        list_Thursday_Class_11th.setBounds(1012, 511, 83, 78);

        list_Tuesday_Class_12th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_12th);
        list_Tuesday_Class_12th.setBounds(1101, 343, 83, 78);

        list_Wednesday_Class_12th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_12th);
        list_Wednesday_Class_12th.setBounds(1101, 427, 83, 78);

        list_Thursday_Class_12th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_12th);
        list_Thursday_Class_12th.setBounds(1101, 511, 83, 78);

        list_Tuesday_Class_13th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Tuesday_Class_13th);
        list_Tuesday_Class_13th.setBounds(1190, 343, 73, 78);

        list_Wednesday_Class_13th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Wednesday_Class_13th);
        list_Wednesday_Class_13th.setBounds(1190, 427, 73, 78);

        list_Thursday_Class_13th.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jPanel_Full_Routine.add(list_Thursday_Class_13th);
        list_Thursday_Class_13th.setBounds(1190, 511, 73, 78);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setText("Class Routine ( Full Week )");
        jPanel_Full_Routine.add(jLabel1);
        jLabel1.setBounds(455, 2, 378, 46);

        jComboBox1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..by Taecher Name", "..by Subject Name", "..by Room no.", "..by time" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_Teacher_UnderLayout = new javax.swing.GroupLayout(jPanel_Teacher_Under);
        jPanel_Teacher_Under.setLayout(jPanel_Teacher_UnderLayout);
        jPanel_Teacher_UnderLayout.setHorizontalGroup(
            jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Teacher_UnderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_Teacher_UnderLayout.createSequentialGroup()
                        .addComponent(jPanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Full_Routine, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(jPanel_Teacher_UnderLayout.createSequentialGroup()
                        .addComponent(jButton_Back_From_Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_Teacher_UnderLayout.setVerticalGroup(
            jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Teacher_UnderLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Back_From_Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(button_Search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel_Teacher_UnderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Full_Routine, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_Search.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Teacher_Under, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Teacher_Under, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void Search_Teacher()
    {
        try
        {System.out.println("Start UP");
        
           String teacher_nm=jTextField_Search.getText().trim();
           
        
           String sql_Data="Select Day,Class_Time,Room_Number,Subject  from Routine13__2_1__C1_no_2 where Teacher_Name='"+teacher_nm+"'";
          
           Data_Pre_State=Data_Con.prepareStatement(sql_Data);
           
           Data_Resultset=Data_Pre_State.executeQuery();
          
           jTable1.setModel(DbUtils.resultSetToTableModel(Data_Resultset));
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void Search_today()
    {
        try
        {
           String today=Get_Day();
            
           String sql_Data="Select Day,Class_Time,Room_Number,Subject,Teacher_Name  from Routine13__2_1__C1_no_2 where "+field+"='"+name+"' and day='"+today+"'";
          
           Data_Pre_State=Data_Con.prepareStatement(sql_Data);
           
           Data_Resultset=Data_Pre_State.executeQuery();
          
           jTable1.setModel(DbUtils.resultSetToTableModel(Data_Resultset));
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    private void Search_week()
    {
        try
        {
          
           String sql_Data="Select Day,Class_Time,Room_Number,Subject,Teacher_Name  from Routine13__2_1__C1_no_2 where "+field+"='"+name+"'";
          
           Data_Pre_State=Data_Con.prepareStatement(sql_Data);
           
           Data_Resultset=Data_Pre_State.executeQuery();
          
           jTable1.setModel(DbUtils.resultSetToTableModel(Data_Resultset));
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    void Empty_Table()
    {
        
         try
        {
          
           String sql_Data="Select ID from Routine13__2_1__C1_no_2";
          
          //  String sql_Data="Select Day,Class_Time,Room_Number,Subject,Teacher_Name  from Routine13__2_1__C1_no_2 where "+field+"=''";
            
           Data_Pre_State=Data_Con.prepareStatement(sql_Data);
           
           Data_Resultset=Data_Pre_State.executeQuery();
          
           jTable1.setModel(DbUtils.resultSetToTableModel(Data_Resultset));
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    
    
    public void Full_Routine()
    {
     //   jPanel1.setVisible(false);
        try
        {
            int  t1=1;
            while("".equals(time_1st))
            {
                
                Data_State.execute("Select Class_1st from Routine13__2_1__C1 where Title='Time' and  ID="+ t1+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_1st=Data_Resultset.getString("Class_1st");
                          System.out.println(+ t1);
                } 
                 
                 t1= t1+4;
                 if(t1>21)break;

            }
            
            int  t2=1;
            while("".equals(time_2nd))
            {
                
                Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where Title='Time' and  ID="+ t2+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_2nd=Data_Resultset.getString("Class_2nd");
                          System.out.println(+ t2);
                } 
                 
                 t2= t2+4;
                 if(t2>21)break;

            }
            
            int  t3=1;
            while("".equals(time_3rd))
            {
                
                Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where Title='Time' and  ID="+ t3+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_3rd=Data_Resultset.getString("Class_3rd");
                          System.out.println("t3="+ t3);
                } 
                 
                 t3= t3+4;
                 if(t3>21)break;

            }
            
            int t4=1;
            while("".equals(time_4th))
            {
                
                Data_State.execute("Select Class_4th from Routine13__2_1__C1 where Title='Time' and  ID="+t4+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_4th=Data_Resultset.getString("Class_4th");
                          System.out.println(+t4);
                } 
                 
                t4=t4+4;
                if(t4>21)break;

            }
            
            int  t5=1;
            while("".equals(time_5th))
            {
                
                Data_State.execute("Select Class_5th from Routine13__2_1__C1 where Title='Time' and  ID="+ t5+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_5th=Data_Resultset.getString("Class_5th");
                          System.out.println(+ t5);
                } 
                 
                 t5= t5+4;
                 if(t5>21)break;

            }
            
            int  t6=1;
            while("".equals(time_6th))
            {
                
                Data_State.execute("Select Class_6th from Routine13__2_1__C1 where Title='Time' and  ID="+ t6+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_6th=Data_Resultset.getString("Class_6th");
                          System.out.println(+ t6);
                } 
                 
                 t6= t6+4;
                 if(t6>21)break;

            }
            
            int  t7=1;
            while("".equals(time_7th))
            {
                
                Data_State.execute("Select Class_7th from Routine13__2_1__C1 where Title='Time' and  ID="+ t7+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_7th=Data_Resultset.getString("Class_7th");
                          System.out.println(+ t7);
                } 
                 
                 t7= t7+4;
                 if(t7>21)break;

            }
            
            int  t8=1;
            while("".equals(time_8th))
            {
                
                Data_State.execute("Select Class_8th from Routine13__2_1__C1 where Title='Time' and  ID="+ t7+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_8th=Data_Resultset.getString("Class_8th");
                          System.out.println(+ t8);
                } 
                 
                 t8= t8+4;
                 if(t8>21)break;

            }
            
            int  t9=1;
            while("".equals(time_9th))
            {
                
                Data_State.execute("Select Class_9th from Routine13__2_1__C1 where Title='Time' and  ID="+ t9+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_9th=Data_Resultset.getString("Class_9th");
                          System.out.println(+ t9);
                } 
                 
                 t9= t9+4;
                 if(t9>21)break;

            }
            
            int  t10=1;
            while("".equals(time_10th))
            {
                
                Data_State.execute("Select Class_10th from Routine13__2_1__C1 where Title='Time' and  ID="+ t10+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_10th=Data_Resultset.getString("Class_10th");
                          System.out.println(+ t10);
                } 
                 
                 t10= t10+4;
                 if(t10>21)break;

            }
            
            int  t11=1;
            while("".equals(time_11th))
            {
                
                Data_State.execute("Select Class_11th from Routine13__2_1__C1 where Title='Time' and  ID="+ t11+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_11th=Data_Resultset.getString("Class_11th");
                          System.out.println(+ t11);
                } 
                 
                 t11= t11+4;
                 
                 if(t11>21)break;

            }
            
            int  t12=1;
            while("".equals(time_12th))
            {
                
                Data_State.execute("Select Class_12th from Routine13__2_1__C1 where Title='Time' and  ID="+ t12+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_12th=Data_Resultset.getString("Class_12th");
                          System.out.println(+ t12);
                } 
                 
                 t12= t12+4;
                 
                 if(t12>21)break;

            }
            
            int  t13=1;
            while("".equals(time_13th))
            {
                
                Data_State.execute("Select Class_13th from Routine13__2_1__C1 where Title='Time' and  ID="+ t13+"");            
                Data_Resultset= Data_State.getResultSet();            
                while(Data_Resultset.next())
                {
                          time_13th=Data_Resultset.getString("Class_13th");
                          System.out.println(+ t13);
                } 
                 
                 t13= t13+4;
                 
                 if(t13>21)break;

            }
        
            
        }catch(Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
    //    jTextField1.setText(an);
      //  jTextField2.setText(an2);
        
         jTextField_Time_Class_1st.setText(time_1st);
         jTextField_Time_Class_2nd.setText(time_2nd);
         jTextField_Time_Class_3rd.setText(time_3rd);
         jTextField_Time_Class_4th.setText(time_4th);
         jTextField_Time_Class_5th.setText(time_5th);
         jTextField_Time_Class_6th.setText(time_6th);
         jTextField_Time_Class_7th.setText(time_7th);
         jTextField_Time_Class_8th.setText(time_8th);
         jTextField_Time_Class_9th.setText(time_9th);
         jTextField_Time_Class_10th.setText(time_10th);
         jTextField_Time_Class_11th.setText(time_11th);
         jTextField_Time_Class_12th.setText(time_12th);
         jTextField_Time_Class_13th.setText(time_13th);
        
 //       list_Sturday_Class_1st.addItem(an, 1);
 //       list_Sturday_Class_1st.addItem(an2, 2);
 //       list_Sturday_Class_1st.addItem(an3, 3);
         
         
         // routine DATA
         
         
         
         try
         {
             
             // SATURDAY
             
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Sturday_Class_1st.addItem(sat_class_1st_sub, 1);
            list_Sturday_Class_1st.addItem(sat_class_1st_room, 2);
            list_Sturday_Class_1st.addItem(sat_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Sturday_Class_2nd.addItem(sat_class_2nd_sub, 1);
            list_Sturday_Class_2nd.addItem(sat_class_2nd_room, 2);
            list_Sturday_Class_2nd.addItem(sat_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Sturday_Class_3rd.addItem(sat_class_3rd_sub, 1);
            list_Sturday_Class_3rd.addItem(sat_class_3rd_room, 2);
            list_Sturday_Class_3rd.addItem(sat_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Sturday_Class_4th.addItem(sat_class_4th_sub, 1);
            list_Sturday_Class_4th.addItem(sat_class_4th_room, 2);
            list_Sturday_Class_4th.addItem(sat_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Sturday_Class_5th.addItem(sat_class_5th_sub, 1);
            list_Sturday_Class_5th.addItem(sat_class_5th_room, 2);
            list_Sturday_Class_5th.addItem(sat_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Sturday_Class_6th.addItem(sat_class_6th_sub, 1);
            list_Sturday_Class_6th.addItem(sat_class_6th_room, 2);
            list_Sturday_Class_6th.addItem(sat_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Sturday_Class_7th.addItem(sat_class_7th_sub, 1);
            list_Sturday_Class_7th.addItem(sat_class_7th_room, 2);
            list_Sturday_Class_7th.addItem(sat_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Sturday_Class_8th.addItem(sat_class_8th_sub, 1);
            list_Sturday_Class_8th.addItem(sat_class_8th_room, 2);
            list_Sturday_Class_8th.addItem(sat_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Sturday_Class_9th.addItem(sat_class_9th_sub, 1);
            list_Sturday_Class_9th.addItem(sat_class_9th_room, 2);
            list_Sturday_Class_9th.addItem(sat_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Sturday_Class_10th.addItem(sat_class_10th_sub, 1);
            list_Sturday_Class_10th.addItem(sat_class_10th_room, 2);
            list_Sturday_Class_10th.addItem(sat_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Sturday_Class_11th.addItem(sat_class_11th_sub, 1);
            list_Sturday_Class_11th.addItem(sat_class_11th_room, 2);
            list_Sturday_Class_11th.addItem(sat_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Sturday_Class_12th.addItem(sat_class_12th_sub, 1);
            list_Sturday_Class_12th.addItem(sat_class_12th_room, 2);
            list_Sturday_Class_12th.addItem(sat_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=2");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=3");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=4");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sat_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Sturday_Class_13th.addItem(sat_class_13th_sub, 1);
            list_Sturday_Class_13th.addItem(sat_class_13th_room, 2);
            list_Sturday_Class_13th.addItem(sat_class_13th_tn, 3);
            
            
            
            
            // SUNDAY
             
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Sunday_Class_1st.addItem(sun_class_1st_sub, 1);
            list_Sunday_Class_1st.addItem(sun_class_1st_room, 2);
            list_Sunday_Class_1st.addItem(sun_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Sunday_Class_2nd.addItem(sun_class_2nd_sub, 1);
            list_Sunday_Class_2nd.addItem(sun_class_2nd_room, 2);
            list_Sunday_Class_2nd.addItem(sun_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Sunday_Class_3rd.addItem(sun_class_3rd_sub, 1);
            list_Sunday_Class_3rd.addItem(sun_class_3rd_room, 2);
            list_Sunday_Class_3rd.addItem(sun_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Sunday_Class_4th.addItem(sun_class_4th_sub, 1);
            list_Sunday_Class_4th.addItem(sun_class_4th_room, 2);
            list_Sunday_Class_4th.addItem(sun_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Sunday_Class_5th.addItem(sun_class_5th_sub, 1);
            list_Sunday_Class_5th.addItem(sun_class_5th_room, 2);
            list_Sunday_Class_5th.addItem(sun_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Sunday_Class_6th.addItem(sun_class_6th_sub, 1);
            list_Sunday_Class_6th.addItem(sun_class_6th_room, 2);
            list_Sunday_Class_6th.addItem(sun_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Sunday_Class_7th.addItem(sun_class_7th_sub, 1);
            list_Sunday_Class_7th.addItem(sun_class_7th_room, 2);
            list_Sunday_Class_7th.addItem(sun_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Sunday_Class_8th.addItem(sun_class_8th_sub, 1);
            list_Sunday_Class_8th.addItem(sun_class_8th_room, 2);
            list_Sunday_Class_8th.addItem(sun_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Sunday_Class_9th.addItem(sun_class_9th_sub, 1);
            list_Sunday_Class_9th.addItem(sun_class_9th_room, 2);
            list_Sunday_Class_9th.addItem(sun_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Sunday_Class_10th.addItem(sun_class_10th_sub, 1);
            list_Sunday_Class_10th.addItem(sun_class_10th_room, 2);
            list_Sunday_Class_10th.addItem(sun_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Sunday_Class_11th.addItem(sun_class_11th_sub, 1);
            list_Sunday_Class_11th.addItem(sun_class_11th_room, 2);
            list_Sunday_Class_11th.addItem(sun_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Sunday_Class_12th.addItem(sun_class_12th_sub, 1);
            list_Sunday_Class_12th.addItem(sun_class_12th_room, 2);
            list_Sunday_Class_12th.addItem(sun_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=6");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=7");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=8");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      sun_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Sunday_Class_13th.addItem(sun_class_13th_sub, 1);
            list_Sunday_Class_13th.addItem(sun_class_13th_room, 2);
            list_Sunday_Class_13th.addItem(sun_class_13th_tn, 3);
            
            
            
            //MONDAY
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Monday_Class_1st.addItem(mon_class_1st_sub, 1);
            list_Monday_Class_1st.addItem(mon_class_1st_room, 2);
            list_Monday_Class_1st.addItem(mon_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Monday_Class_2nd.addItem(mon_class_2nd_sub, 1);
            list_Monday_Class_2nd.addItem(mon_class_2nd_room, 2);
            list_Monday_Class_2nd.addItem(mon_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Monday_Class_3rd.addItem(mon_class_3rd_sub, 1);
            list_Monday_Class_3rd.addItem(mon_class_3rd_room, 2);
            list_Monday_Class_3rd.addItem(mon_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Monday_Class_4th.addItem(mon_class_4th_sub, 1);
            list_Monday_Class_4th.addItem(mon_class_4th_room, 2);
            list_Monday_Class_4th.addItem(mon_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Monday_Class_5th.addItem(mon_class_5th_sub, 1);
            list_Monday_Class_5th.addItem(mon_class_5th_room, 2);
            list_Monday_Class_5th.addItem(mon_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Monday_Class_6th.addItem(mon_class_6th_sub, 1);
            list_Monday_Class_6th.addItem(mon_class_6th_room, 2);
            list_Monday_Class_6th.addItem(mon_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Monday_Class_7th.addItem(mon_class_7th_sub, 1);
            list_Monday_Class_7th.addItem(mon_class_7th_room, 2);
            list_Monday_Class_7th.addItem(mon_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Monday_Class_8th.addItem(mon_class_8th_sub, 1);
            list_Monday_Class_8th.addItem(mon_class_8th_room, 2);
            list_Monday_Class_8th.addItem(mon_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Monday_Class_9th.addItem(mon_class_9th_sub, 1);
            list_Monday_Class_9th.addItem(mon_class_9th_room, 2);
            list_Monday_Class_9th.addItem(mon_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Monday_Class_10th.addItem(mon_class_10th_sub, 1);
            list_Monday_Class_10th.addItem(mon_class_10th_room, 2);
            list_Monday_Class_10th.addItem(mon_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Monday_Class_11th.addItem(mon_class_11th_sub, 1);
            list_Monday_Class_11th.addItem(mon_class_11th_room, 2);
            list_Monday_Class_11th.addItem(mon_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Monday_Class_12th.addItem(mon_class_12th_sub, 1);
            list_Monday_Class_12th.addItem(mon_class_12th_room, 2);
            list_Monday_Class_12th.addItem(mon_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=10");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=11");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=12");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      mon_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Monday_Class_13th.addItem(mon_class_13th_sub, 1);
            list_Monday_Class_13th.addItem(mon_class_13th_room, 2);
            list_Monday_Class_13th.addItem(mon_class_13th_tn, 3);
            
            
            
            
            //TUESDAY
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Tuesday_Class_1st.addItem(tues_class_1st_sub, 1);
            list_Tuesday_Class_1st.addItem(tues_class_1st_room, 2);
            list_Tuesday_Class_1st.addItem(tues_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Tuesday_Class_2nd.addItem(tues_class_2nd_sub, 1);
            list_Tuesday_Class_2nd.addItem(tues_class_2nd_room, 2);
            list_Tuesday_Class_2nd.addItem(tues_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Tuesday_Class_3rd.addItem(tues_class_3rd_sub, 1);
            list_Tuesday_Class_3rd.addItem(tues_class_3rd_room, 2);
            list_Tuesday_Class_3rd.addItem(tues_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Tuesday_Class_4th.addItem(tues_class_4th_sub, 1);
            list_Tuesday_Class_4th.addItem(tues_class_4th_room, 2);
            list_Tuesday_Class_4th.addItem(tues_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Tuesday_Class_5th.addItem(tues_class_5th_sub, 1);
            list_Tuesday_Class_5th.addItem(tues_class_5th_room, 2);
            list_Tuesday_Class_5th.addItem(tues_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Tuesday_Class_6th.addItem(tues_class_6th_sub, 1);
            list_Tuesday_Class_6th.addItem(tues_class_6th_room, 2);
            list_Tuesday_Class_6th.addItem(tues_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Tuesday_Class_7th.addItem(tues_class_7th_sub, 1);
            list_Tuesday_Class_7th.addItem(tues_class_7th_room, 2);
            list_Tuesday_Class_7th.addItem(tues_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Tuesday_Class_8th.addItem(tues_class_8th_sub, 1);
            list_Tuesday_Class_8th.addItem(tues_class_8th_room, 2);
            list_Tuesday_Class_8th.addItem(tues_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Tuesday_Class_9th.addItem(tues_class_9th_sub, 1);
            list_Tuesday_Class_9th.addItem(tues_class_9th_room, 2);
            list_Tuesday_Class_9th.addItem(tues_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Tuesday_Class_10th.addItem(tues_class_10th_sub, 1);
            list_Tuesday_Class_10th.addItem(tues_class_10th_room, 2);
            list_Tuesday_Class_10th.addItem(tues_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Tuesday_Class_11th.addItem(tues_class_11th_sub, 1);
            list_Tuesday_Class_11th.addItem(tues_class_11th_room, 2);
            list_Tuesday_Class_11th.addItem(tues_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Tuesday_Class_12th.addItem(tues_class_12th_sub, 1);
            list_Tuesday_Class_12th.addItem(tues_class_12th_room, 2);
            list_Tuesday_Class_12th.addItem(tues_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=14");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=15");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=16");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      tues_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Tuesday_Class_13th.addItem(tues_class_13th_sub, 1);
            list_Tuesday_Class_13th.addItem(tues_class_13th_room, 2);
            list_Tuesday_Class_13th.addItem(tues_class_13th_tn, 3);
            
            
            
            
            //WEDNESDAY
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Wednesday_Class_1st.addItem(wed_class_1st_sub, 1);
            list_Wednesday_Class_1st.addItem(wed_class_1st_room, 2);
            list_Wednesday_Class_1st.addItem(wed_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Wednesday_Class_2nd.addItem(wed_class_2nd_sub, 1);
            list_Wednesday_Class_2nd.addItem(wed_class_2nd_room, 2);
            list_Wednesday_Class_2nd.addItem(wed_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Wednesday_Class_3rd.addItem(wed_class_3rd_sub, 1);
            list_Wednesday_Class_3rd.addItem(wed_class_3rd_room, 2);
            list_Wednesday_Class_3rd.addItem(wed_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Wednesday_Class_4th.addItem(wed_class_4th_sub, 1);
            list_Wednesday_Class_4th.addItem(wed_class_4th_room, 2);
            list_Wednesday_Class_4th.addItem(wed_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Wednesday_Class_5th.addItem(wed_class_5th_sub, 1);
            list_Wednesday_Class_5th.addItem(wed_class_5th_room, 2);
            list_Wednesday_Class_5th.addItem(wed_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Wednesday_Class_6th.addItem(wed_class_6th_sub, 1);
            list_Wednesday_Class_6th.addItem(wed_class_6th_room, 2);
            list_Wednesday_Class_6th.addItem(wed_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Wednesday_Class_7th.addItem(wed_class_7th_sub, 1);
            list_Wednesday_Class_7th.addItem(wed_class_7th_room, 2);
            list_Wednesday_Class_7th.addItem(wed_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Wednesday_Class_8th.addItem(wed_class_8th_sub, 1);
            list_Wednesday_Class_8th.addItem(wed_class_8th_room, 2);
            list_Wednesday_Class_8th.addItem(wed_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Wednesday_Class_9th.addItem(wed_class_9th_sub, 1);
            list_Wednesday_Class_9th.addItem(wed_class_9th_room, 2);
            list_Wednesday_Class_9th.addItem(wed_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Wednesday_Class_10th.addItem(wed_class_10th_sub, 1);
            list_Wednesday_Class_10th.addItem(wed_class_10th_room, 2);
            list_Wednesday_Class_10th.addItem(wed_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Wednesday_Class_11th.addItem(wed_class_11th_sub, 1);
            list_Wednesday_Class_11th.addItem(wed_class_11th_room, 2);
            list_Wednesday_Class_11th.addItem(wed_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Wednesday_Class_12th.addItem(wed_class_12th_sub, 1);
            list_Wednesday_Class_12th.addItem(wed_class_12th_room, 2);
            list_Wednesday_Class_12th.addItem(wed_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=18");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=19");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=20");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      wed_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Wednesday_Class_13th.addItem(wed_class_13th_sub, 1);
            list_Wednesday_Class_13th.addItem(wed_class_13th_room, 2);
            list_Wednesday_Class_13th.addItem(wed_class_13th_tn, 3);
            
            
            
            
            //THURSDAY
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_1st_sub=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_1st_room=Data_Resultset.getString("Class_1st");
            }
            
            Data_State.execute("Select Class_1st from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_1st_tn=Data_Resultset.getString("Class_1st");
            }
             
             
            list_Thursday_Class_1st.addItem(thurs_class_1st_sub, 1);
            list_Thursday_Class_1st.addItem(thurs_class_1st_room, 2);
            list_Thursday_Class_1st.addItem(thurs_class_1st_tn, 3);
            
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_2nd_sub=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_2nd_room=Data_Resultset.getString("Class_2nd");
            }
            
            Data_State.execute("Select Class_2nd from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_2nd_tn=Data_Resultset.getString("Class_2nd");
            }
             
             
            list_Thursday_Class_2nd.addItem(thurs_class_2nd_sub, 1);
            list_Thursday_Class_2nd.addItem(thurs_class_2nd_room, 2);
            list_Thursday_Class_2nd.addItem(thurs_class_2nd_tn, 3);
            
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_3rd_sub=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_3rd_room=Data_Resultset.getString("Class_3rd");
            }
            
            Data_State.execute("Select Class_3rd from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_3rd_tn=Data_Resultset.getString("Class_3rd");
            }
             
             
            list_Thursday_Class_3rd.addItem(thurs_class_3rd_sub, 1);
            list_Thursday_Class_3rd.addItem(thurs_class_3rd_room, 2);
            list_Thursday_Class_3rd.addItem(thurs_class_3rd_tn, 3);
            
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_4th_sub=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_4th_room=Data_Resultset.getString("Class_4th");
            }
            
            Data_State.execute("Select Class_4th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_4th_tn=Data_Resultset.getString("Class_4th");
            }
             
             
            list_Thursday_Class_4th.addItem(thurs_class_4th_sub, 1);
            list_Thursday_Class_4th.addItem(thurs_class_4th_room, 2);
            list_Thursday_Class_4th.addItem(thurs_class_4th_tn, 3);
            
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_5th_sub=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_5th_room=Data_Resultset.getString("Class_5th");
            }
            
            Data_State.execute("Select Class_5th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_5th_tn=Data_Resultset.getString("Class_5th");
            }
             
             
            list_Thursday_Class_5th.addItem(thurs_class_5th_sub, 1);
            list_Thursday_Class_5th.addItem(thurs_class_5th_room, 2);
            list_Thursday_Class_5th.addItem(thurs_class_5th_tn, 3);
            
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_6th_sub=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_6th_room=Data_Resultset.getString("Class_6th");
            }
            
            Data_State.execute("Select Class_6th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_6th_tn=Data_Resultset.getString("Class_6th");
            }
             
             
            list_Thursday_Class_6th.addItem(thurs_class_6th_sub, 1);
            list_Thursday_Class_6th.addItem(thurs_class_6th_room, 2);
            list_Thursday_Class_6th.addItem(thurs_class_6th_tn, 3);
            
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_7th_sub=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_7th_room=Data_Resultset.getString("Class_7th");
            }
            
            Data_State.execute("Select Class_7th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_7th_tn=Data_Resultset.getString("Class_7th");
            }
             
             
            list_Thursday_Class_7th.addItem(thurs_class_7th_sub, 1);
            list_Thursday_Class_7th.addItem(thurs_class_7th_room, 2);
            list_Thursday_Class_7th.addItem(thurs_class_7th_tn, 3);
            
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_8th_sub=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_8th_room=Data_Resultset.getString("Class_8th");
            }
            
            Data_State.execute("Select Class_8th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_8th_tn=Data_Resultset.getString("Class_8th");
            }
             
             
            list_Thursday_Class_8th.addItem(thurs_class_8th_sub, 1);
            list_Thursday_Class_8th.addItem(thurs_class_8th_room, 2);
            list_Thursday_Class_8th.addItem(thurs_class_8th_tn, 3);
            
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_9th_sub=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_9th_room=Data_Resultset.getString("Class_9th");
            }
            
            Data_State.execute("Select Class_9th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_9th_tn=Data_Resultset.getString("Class_9th");
            }
             
             
            list_Thursday_Class_9th.addItem(thurs_class_9th_sub, 1);
            list_Thursday_Class_9th.addItem(thurs_class_9th_room, 2);
            list_Thursday_Class_9th.addItem(thurs_class_9th_tn, 3);
            
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_10th_sub=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_10th_room=Data_Resultset.getString("Class_10th");
            }
            
            Data_State.execute("Select Class_10th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_10th_tn=Data_Resultset.getString("Class_10th");
            }
             
             
            list_Thursday_Class_10th.addItem(thurs_class_10th_sub, 1);
            list_Thursday_Class_10th.addItem(thurs_class_10th_room, 2);
            list_Thursday_Class_10th.addItem(thurs_class_10th_tn, 3);
            
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_11th_sub=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_11th_room=Data_Resultset.getString("Class_11th");
            }
            
            Data_State.execute("Select Class_11th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_11th_tn=Data_Resultset.getString("Class_11th");
            }
             
             
            list_Thursday_Class_11th.addItem(thurs_class_11th_sub, 1);
            list_Thursday_Class_11th.addItem(thurs_class_11th_room, 2);
            list_Thursday_Class_11th.addItem(thurs_class_11th_tn, 3);
            
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_12th_sub=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_12th_room=Data_Resultset.getString("Class_12th");
            }
            
            Data_State.execute("Select Class_12th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_12th_tn=Data_Resultset.getString("Class_12th");
            }
             
             
            list_Thursday_Class_12th.addItem(thurs_class_12th_sub, 1);
            list_Thursday_Class_12th.addItem(thurs_class_12th_room, 2);
            list_Thursday_Class_12th.addItem(thurs_class_12th_tn, 3);
            
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=22");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_13th_sub=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=23");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_13th_room=Data_Resultset.getString("Class_13th");
            }
            
            Data_State.execute("Select Class_13th from Routine13__2_1__C1 where ID=24");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      thurs_class_13th_tn=Data_Resultset.getString("Class_13th");
            }
             
             
            list_Thursday_Class_13th.addItem(thurs_class_13th_sub, 1);
            list_Thursday_Class_13th.addItem(thurs_class_13th_room, 2);
            list_Thursday_Class_13th.addItem(thurs_class_13th_tn, 3);
            
              
            
             
         }catch(Exception ex )
         {
             JOptionPane.showMessageDialog(null, ex);
         }
        
         
         

        
    }
    
    
    private void jButton_Back_From_TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Back_From_TeacherActionPerformed
        // TODO add your handling code here:

        f.setVisible(false);
        new Routine7();
    }//GEN-LAST:event_jButton_Back_From_TeacherActionPerformed

    private void jTextField_Time_Class_1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Time_Class_1stActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jTextField_Time_Class_1stActionPerformed

    private void jTextField_Time_Class_3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Time_Class_3rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Time_Class_3rdActionPerformed

    private void jTextField_Time_Class_12thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Time_Class_12thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Time_Class_12thActionPerformed

    private void jTextField_Time_Class_11thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Time_Class_11thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Time_Class_11thActionPerformed

    private void list_Sturday_Class_3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_Sturday_Class_3rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_Sturday_Class_3rdActionPerformed

    private void jTextField_MondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MondayActionPerformed

    private void jTextField_WednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_WednesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_WednesdayActionPerformed

    private void list_Monday_Class_1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_Monday_Class_1stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_Monday_Class_1stActionPerformed

    private void list_Tuesday_Class_9thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_Tuesday_Class_9thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_Tuesday_Class_9thActionPerformed

    private void list_Tuesday_Class_11thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_Tuesday_Class_11thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_Tuesday_Class_11thActionPerformed

    private void button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SearchActionPerformed
        // TODO add your handling code here:
        jPanel_Full_Routine.setVisible(false);
        jPanel_Search.setVisible(true);
        
        name=jTextField_Search.getText().trim();
        search_by=jComboBox1.getSelectedItem().toString().trim();
     //   ..by Taecher Name, ..by Subject Name, ..by Room no., ..by time
        if("..by Taecher Name".equals(search_by))field="Teacher_Name";
        if("..by Subject Name".equals(search_by))field="Subject";
        if("..by Room no.".equals(search_by))field="Room_Number";
        if("..by time".equals(search_by))field="Class_Time";
        
        
        
        if(name.length()==0)
        {
             JOptionPane.showMessageDialog(null, "Search field is empty"+"\n"+"Enter name to search ");
             Empty_Table();
             
        }
        else  Search_week();

    }//GEN-LAST:event_button_SearchActionPerformed

    private void list_Sunday_Class_7thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_Sunday_Class_7thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_Sunday_Class_7thActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:

        Empty_Table();
        jTextField_Search.setText(null);
        
        jPanel_Search.setVisible(false);
        jPanel_Full_Routine.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(name.length()==0)Empty_Table();
        
        else Search_today();
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(name.length()==0)Empty_Table();
        
        else Search_week();
        
    }//GEN-LAST:event_button3ActionPerformed

    
    public  void connect()
    {
        
       try
        {
          //  String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
           // Class.forName(driver);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            String AccessFileName="D:/Razu's Document/SD-II ( LAB )/Routine7/src/routine7/LogInData";
            
            String db1 = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + AccessFileName + ".accdb;";
            Data_Con = DriverManager.getConnection(db1, "", "");
            Data_State =Data_Con.createStatement();
            
            System.out.println("hii");
        }
        catch(Exception ex)
        {
            
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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Button button_Search;
    private javax.swing.JButton jButton_Back_From_Teacher;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_Full_Routine;
    private javax.swing.JPanel jPanel_Search;
    private javax.swing.JPanel jPanel_Teacher_Under;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Monday;
    private javax.swing.JTextField jTextField_Saturday;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_Sunday;
    private javax.swing.JTextField jTextField_Thursday;
    private javax.swing.JTextField jTextField_Time_Class_10th;
    private javax.swing.JTextField jTextField_Time_Class_11th;
    private javax.swing.JTextField jTextField_Time_Class_12th;
    private javax.swing.JTextField jTextField_Time_Class_13th;
    private javax.swing.JTextField jTextField_Time_Class_1st;
    private javax.swing.JTextField jTextField_Time_Class_2nd;
    private javax.swing.JTextField jTextField_Time_Class_3rd;
    private javax.swing.JTextField jTextField_Time_Class_4th;
    private javax.swing.JTextField jTextField_Time_Class_5th;
    private javax.swing.JTextField jTextField_Time_Class_6th;
    private javax.swing.JTextField jTextField_Time_Class_7th;
    private javax.swing.JTextField jTextField_Time_Class_8th;
    private javax.swing.JTextField jTextField_Time_Class_9th;
    private javax.swing.JTextField jTextField_Tuesday;
    private javax.swing.JTextField jTextField_Wednesday;
    private java.awt.Label label1;
    private java.awt.List list_Monday_Class_10th;
    private java.awt.List list_Monday_Class_11th;
    private java.awt.List list_Monday_Class_12th;
    private java.awt.List list_Monday_Class_13th;
    private java.awt.List list_Monday_Class_1st;
    private java.awt.List list_Monday_Class_2nd;
    private java.awt.List list_Monday_Class_3rd;
    private java.awt.List list_Monday_Class_4th;
    private java.awt.List list_Monday_Class_5th;
    private java.awt.List list_Monday_Class_6th;
    private java.awt.List list_Monday_Class_7th;
    private java.awt.List list_Monday_Class_8th;
    private java.awt.List list_Monday_Class_9th;
    private java.awt.List list_Sturday_Class_10th;
    private java.awt.List list_Sturday_Class_11th;
    private java.awt.List list_Sturday_Class_12th;
    private java.awt.List list_Sturday_Class_13th;
    private java.awt.List list_Sturday_Class_1st;
    private java.awt.List list_Sturday_Class_2nd;
    private java.awt.List list_Sturday_Class_3rd;
    private java.awt.List list_Sturday_Class_4th;
    private java.awt.List list_Sturday_Class_5th;
    private java.awt.List list_Sturday_Class_6th;
    private java.awt.List list_Sturday_Class_7th;
    private java.awt.List list_Sturday_Class_8th;
    private java.awt.List list_Sturday_Class_9th;
    private java.awt.List list_Sunday_Class_10th;
    private java.awt.List list_Sunday_Class_11th;
    private java.awt.List list_Sunday_Class_12th;
    private java.awt.List list_Sunday_Class_13th;
    private java.awt.List list_Sunday_Class_1st;
    private java.awt.List list_Sunday_Class_2nd;
    private java.awt.List list_Sunday_Class_3rd;
    private java.awt.List list_Sunday_Class_4th;
    private java.awt.List list_Sunday_Class_5th;
    private java.awt.List list_Sunday_Class_6th;
    private java.awt.List list_Sunday_Class_7th;
    private java.awt.List list_Sunday_Class_8th;
    private java.awt.List list_Sunday_Class_9th;
    private java.awt.List list_Thursday_Class_10th;
    private java.awt.List list_Thursday_Class_11th;
    private java.awt.List list_Thursday_Class_12th;
    private java.awt.List list_Thursday_Class_13th;
    private java.awt.List list_Thursday_Class_1st;
    private java.awt.List list_Thursday_Class_2nd;
    private java.awt.List list_Thursday_Class_3rd;
    private java.awt.List list_Thursday_Class_4th;
    private java.awt.List list_Thursday_Class_5th;
    private java.awt.List list_Thursday_Class_6th;
    private java.awt.List list_Thursday_Class_7th;
    private java.awt.List list_Thursday_Class_8th;
    private java.awt.List list_Thursday_Class_9th;
    private java.awt.List list_Tuesday_Class_10th;
    private java.awt.List list_Tuesday_Class_11th;
    private java.awt.List list_Tuesday_Class_12th;
    private java.awt.List list_Tuesday_Class_13th;
    private java.awt.List list_Tuesday_Class_1st;
    private java.awt.List list_Tuesday_Class_2nd;
    private java.awt.List list_Tuesday_Class_3rd;
    private java.awt.List list_Tuesday_Class_4th;
    private java.awt.List list_Tuesday_Class_5th;
    private java.awt.List list_Tuesday_Class_6th;
    private java.awt.List list_Tuesday_Class_7th;
    private java.awt.List list_Tuesday_Class_8th;
    private java.awt.List list_Tuesday_Class_9th;
    private java.awt.List list_Wednesday_Class_10th;
    private java.awt.List list_Wednesday_Class_11th;
    private java.awt.List list_Wednesday_Class_12th;
    private java.awt.List list_Wednesday_Class_13th;
    private java.awt.List list_Wednesday_Class_1st;
    private java.awt.List list_Wednesday_Class_2nd;
    private java.awt.List list_Wednesday_Class_3rd;
    private java.awt.List list_Wednesday_Class_4th;
    private java.awt.List list_Wednesday_Class_5th;
    private java.awt.List list_Wednesday_Class_6th;
    private java.awt.List list_Wednesday_Class_7th;
    private java.awt.List list_Wednesday_Class_8th;
    private java.awt.List list_Wednesday_Class_9th;
    // End of variables declaration//GEN-END:variables
}
