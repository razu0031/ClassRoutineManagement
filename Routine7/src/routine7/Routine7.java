/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package routine7;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import sun.management.counter.Units;

/**
 *
 * @author rAZU
 */
public class Routine7 {

    Connection Data_Con;
    Statement Data_State;
    ResultSet Data_Resultset;
    
    JFrame f ;
    
    JPanel panelStart;    
    JLabel labelStart1 ;
    JLabel labelStart12 ;
    JLabel labelStart2 ;
    JButton buttonTeacher ;
    JButton buttonStudent ;
    JButton buttonAdmin ;
    JButton buttonExit ;
      
    JPanel panelAdmin;
    JLabel labelUserName;
    JTextField textUserName;
    JLabel labelPassword ;
    JPasswordField textPassword; 
    JButton buttonLogIn ;
    JButton buttonLogInSetting;
    JButton buttonBack_from_Admin ;
    Button button_Add_Admin;
    
    JPanel panelTeacher;
    JLabel labelTeacher ;  
    JButton buttonBack_from_Teacher;
    
    JPanel panelStudent;
    JLabel labelStudent ;
    JButton buttonBack_from_Student;
    
    JPanel panelLogIn;
    JLabel labelLogIN ;
    Button buttonLogOut;
    JButton buttonLogIn2;
    Button button_Remove_Admin;
    Button button_Manage_Routine;
    
    
    JMenuItem labelTime;
    JLabel labelDate;
    JLabel labelDate2;
  //  int t=0;
    
    double x=0,y=1300,j=310;
    
    public Routine7()
    {
    
        connect();
        frame();
        
    }
    
    public  void connect()
    {
        
       try
        {
          //  String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
           // Class.forName(driver);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            String AccessFileNameLogIn="D:/Razu's Document/SD-II ( LAB )/Routine7/src/routine7/LogInData";
            
            String db = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + AccessFileNameLogIn + ".accdb;";
            Data_Con = DriverManager.getConnection(db, "", "");
            Data_State = Data_Con.createStatement();
            
            System.out.println("hi");
        }
        catch(Exception ex)
        {
            
        }
                         
    }
    
 /*   public void connect()
    {
        
       try
        {
            
            
            String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName(driver);
            
            String db = "jdbc:odbc:accdb:D:/Razu's Document/SD-II ( LAB )/Routine7/src/routine7/LogInData.accdb";
            Data_Con = DriverManager.getConnection(db);
            Data_State = Data_Con.createStatement();
            
            System.out.println("hi");
        }
        catch(Exception ex)
        {
            
        }
                         
    }*/
    
    
/*    public void Teacher()
    {
       
        
        panelTeacher=new JPanel();            
        panelTeacher.setLayout(null);
        panelTeacher.setBounds(0,0,1300, 700);
        panelTeacher.setBackground(Color.WHITE);
                   
        labelTeacher=new JLabel();
        labelTeacher.setFont(new java.awt.Font("Tahoma", 1, 40));
        labelTeacher.setText("This is Teacher's page");
        labelTeacher.setBounds(300, 0, 1000, 300); 
        
        ImageIcon Back_From_Teacher_Icon=new ImageIcon(getClass().getResource("9.png"));       
        buttonBack_from_Teacher=new JButton(Back_From_Teacher_Icon);
      // buttonBack_from_Teacher.setFont(new java.awt.Font("Tahoma",0,30));
      //  buttonBack_from_Teacher.setForeground(Color.BLUE);
      //  buttonBack_from_Teacher.setText("BacK");
        buttonBack_from_Teacher.setBounds(8,622,59, 42);
        buttonBack_from_Teacher.setBackground(Color.BLUE);
                   
        panelTeacher.add(labelTeacher); 
        panelTeacher.add(buttonBack_from_Teacher);
        
         JLabel TeacherLabelpic=new JLabel();
        ImageIcon Teachericon=new ImageIcon();
        Image(Teachericon, "49.png", TeacherLabelpic, panelTeacher, f, 0, 0, 1295, 671);
               
        panelTeacher.setVisible(true);
        f.add(panelTeacher);
                   
        buttonBack_from_Teacher.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               try
               {
                    panelTeacher.setVisible(false);
                    panelStart.setVisible(true);
               }
               catch(Exception ex)
               {
                              
               }
            } 
        });  
    }                     
*/    
    
/*    public void Student()
    {
        panelStudent=new JPanel();
        panelStudent.setLayout(null);
        panelStudent.setBounds(0,0,1300, 700);
        panelStudent.setBackground(Color.LIGHT_GRAY);  
                   
        labelStudent=new JLabel();
        labelStudent.setFont(new java.awt.Font("Tahoma", 1, 40));
        labelStudent.setText("This is Students's page");
        labelStudent.setBounds(300, 0, 1000, 300); 
         
        ImageIcon Back_From_Student_Icon=new ImageIcon(getClass().getResource("9.png"));
        buttonBack_from_Student=new JButton(Back_From_Student_Icon);
        buttonBack_from_Student.setFont(new java.awt.Font("Tahoma",0,30));
       // buttonBack_from_Student.setForeground(Color.BLUE);
       // buttonBack_from_Student.setText("BacK");
        buttonBack_from_Student.setBounds(8,622,59, 42);
        buttonBack_from_Student.setBackground(Color.BLUE);
        
        
 /*       JTable tab;
        tab = new javax.swing.JTable();
        tab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 102, 102), null));
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab.setPreferredSize(new java.awt.Dimension(160, 3200));
       // jScrollPane1.setViewportView(jTable_Admin_Number_List);
        
        
        panelStudent.add(tab);
       */ 
 /*       panelStudent.add(labelStudent); 
        panelStudent.add(buttonBack_from_Student);
        
        JLabel StudentLabelpic=new JLabel();
        ImageIcon Studenticon=new ImageIcon();
        Image(Studenticon, "2.png", StudentLabelpic, panelStudent, f, 0, 0, 1295, 671);
                   
        panelStudent.setVisible(true);
        f.add(panelStudent);  
                   
        buttonBack_from_Student.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               try
               {
                  panelStudent.setVisible(false);
                  panelStart.setVisible(true);
               }
               catch(Exception ex)
               {
                              
               }
            }
        });
        
    }
*/    
    
    public void Admin()
    {
        panelAdmin=new JPanel();
        panelAdmin.setLayout(null);
        panelAdmin.setBounds(0,0,1300, 700);
        panelAdmin.setBackground(Color.GREEN);
                     
        labelUserName=new JLabel();
        labelUserName.setFont(new java.awt.Font("Tahoma", 1, 40));
        labelUserName.setForeground(Color.BLUE);
        labelUserName.setText("UserName : ");
        labelUserName.setBounds(300, 0, 1000, 300);
                     
        textUserName=new JTextField();
        textUserName.setFont(new java.awt.Font("Tahoma", 0, 25));
        textUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textUserName.setBounds(550, 130, 450, 40);
        textUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
                     
        labelPassword=new JLabel();
        labelPassword.setFont(new java.awt.Font("Tahoma",1,40));
        labelPassword.setForeground(Color.BLUE);
        labelPassword.setText("Password  : ");
        labelPassword.setBounds(300,80, 1000, 300);
        
         
        textPassword=new JPasswordField();
        textPassword.setFont(new java.awt.Font("Tahoma", 0, 25));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.setBounds(550, 210, 450, 40);
        textPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        
        final JLabel  jLabel_empty_field_checker=new JLabel();
        jLabel_empty_field_checker.setFont(new java.awt.Font("Tahoma", 0, 20));
        jLabel_empty_field_checker.setForeground(Color.RED);
        jLabel_empty_field_checker.setBounds(580, 370, 400, 60);
      //  jLabel_empty_field_checker.setText("Both UserName and Password are empty");
        jLabel_empty_field_checker.setVisible(false);
         
        buttonLogIn=new JButton();
        buttonLogIn.setFont(new java.awt.Font("Tahoma",1,32));
        buttonLogIn.setForeground(Color.BLUE);
        buttonLogIn.setText("LogIn");
        buttonLogIn.setBounds(872,275,127, 45);
        buttonLogIn.setBackground(Color.GRAY);
        buttonLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
               
        buttonLogInSetting=new JButton();
        buttonLogInSetting.setFont(new java.awt.Font("Tahoma",1,32));
        buttonLogInSetting.setText("");
        buttonLogInSetting.setBounds(828,275,45, 45);
        buttonLogInSetting.setBackground(Color.blue);
        
        button_Add_Admin=new Button("add Admin");
        button_Add_Admin.setFont(new java.awt.Font("Tahoma", 1, 25));
        button_Add_Admin.setForeground(Color.BLUE);
        button_Add_Admin.setBounds(680, 470, 171, 40);
        button_Add_Admin.setBackground(Color.GRAY);
        button_Add_Admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                
              
        ImageIcon Back_From_LogIn_Icon=new ImageIcon(getClass().getResource("10.png"));
        buttonBack_from_Admin=new JButton(Back_From_LogIn_Icon);
        
        buttonBack_from_Admin.setFont(new java.awt.Font("Tahoma",0,30));
       // buttonBack_from_Admin.setForeground(Color.BLUE);
       // buttonBack_from_Admin.setText("BacK");
        buttonBack_from_Admin.setBounds(8,622,59, 42);
        buttonBack_from_Admin.setBackground(Color.RED);
                      
        panelAdmin.add(buttonBack_from_Admin);
        panelAdmin.add(labelUserName); 
        panelAdmin.add(textUserName);
        panelAdmin.add(labelPassword);
        panelAdmin.add(textPassword);
        panelAdmin.add(buttonLogIn);
        panelAdmin.add(buttonLogInSetting);
        panelAdmin.add(button_Add_Admin);
        panelAdmin.add(jLabel_empty_field_checker);
        
        JLabel AdminLabelpic2=new JLabel();
        ImageIcon Adminicon2=new ImageIcon();
        Image(Adminicon2, "1.png", AdminLabelpic2, panelAdmin, f, 40, 120, 220, 400);
        
        JLabel AdminLabelpic=new JLabel();
        ImageIcon Adminicon=new ImageIcon();
        Image(Adminicon, "3.png", AdminLabelpic, panelAdmin, f, 0, 0, 1295, 671);
        
        
        panelAdmin.setVisible(true);
        f.add(panelAdmin);
        
        button_Add_Admin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               try
               {
                 
                   Add_admin a=new Add_admin();
                
               }
               catch(Exception ex)
               {
                      
               }
            }
        });
        
        buttonLogIn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try
               {
                   
                  int test=0;
                          
                  String user = textUserName.getText().trim();
                  String pass = textPassword.getText().trim();
                  
                  int length_user=user.length();
                  int length_pass=pass.length();
                  
                  if(length_user==0)
                  {
                      jLabel_empty_field_checker.setVisible(true);
                      jLabel_empty_field_checker.setText("** UserName is empty ");
                      test++;
                      System.out.println(+test);
                  }
                  
                  if(length_pass==0)
                  {
                      jLabel_empty_field_checker.setVisible(true);
                      jLabel_empty_field_checker.setText("** Password is empty ");
                      test++;
                      System.out.println(+test);
                  }
                   
                  if(length_user==0 && length_pass==0)
                  {
                      jLabel_empty_field_checker.setVisible(true);
                      jLabel_empty_field_checker.setText("** Both UserName and Password are empty ");
                      test++;
                      System.out.println(+test);
                  }
                  
                  else if(test==0)
                  {
                      jLabel_empty_field_checker.setVisible(false);
                  
                  String sql = "select UserName,Password from TableLogIN where UserName='"+user+"'and Password ='"+pass+"'";
                     // String sql = "select UserName,Password from TableLogIn where UserName='"+user+"'and Password ='"+pass+"'";
                      Data_Resultset = Data_State.executeQuery(sql);
                   
                // JOptionPane.showMessageDialog(null,"User Found, Access Granted");
                   
                      int count = 0;
                      while(Data_Resultset.next())
                      {
                          count++;
                      }
                   
                      if(count>=1)
                      {
                      //    JOptionPane.showMessageDialog(null,"User Found, Access Granted");
                          
                                
                          panelAdmin.setVisible(false);
                          LogIn();  
                   //   Routine_Manage b =new Routine_Manage();
                                
                      }
                      
                      else if(count>1)
                      {
                          JOptionPane.showMessageDialog(null,"Duplicate User, Access Denied");                       
                      }
                        
                      else
                      {
                          JOptionPane.showMessageDialog(null,"User not Found !"
                                  + "  Please Enter Currect UserName or Password");
                          textPassword.setText(null);
                      }
                  }                                      
               }
               catch(Exception ex)
               {
                   
               }
                
                            
            }
        });
                     
        buttonBack_from_Admin.addActionListener(new ActionListener() {          
                       
            @Override
            public void actionPerformed(ActionEvent ae) {
               try
               {
                    panelAdmin.setVisible(false);
                    panelStart.setVisible(true);
               }
               catch(Exception ex)
               {
                              
               }
            }
        });
    }
    
    public void LogIn()
    {
        panelLogIn=new JPanel();
        panelLogIn.setLayout(null);
        panelLogIn.setBounds(0,0,1300,700);
        panelLogIn.setBackground(Color.GRAY);
        
        labelLogIN=new JLabel();
        labelLogIN.setFont(new java.awt.Font("Tahoma",1,40));
        labelLogIN.setText("This is new Page  : ");
        labelLogIN.setBounds(500,80, 1000, 300);  
        
        button_Remove_Admin=new Button("Author");
        button_Remove_Admin.setFont(new java.awt.Font("Tahoma", 1, 25));
        button_Remove_Admin.setForeground(Color.BLUE);
        button_Remove_Admin.setBounds(300, 470, 100, 40);
        button_Remove_Admin.setBackground(Color.BLACK);
        
        button_Manage_Routine=new Button("Manage Routine");
        button_Manage_Routine.setFont(new java.awt.Font("Tahoma", 1, 25));
        button_Manage_Routine.setForeground(Color.BLUE);
        button_Manage_Routine.setBounds(785, 470, 210, 40);
        button_Manage_Routine.setBackground(Color.BLACK);
                                    
        buttonLogOut=new Button("LogOut");
        buttonLogOut.setFont(new java.awt.Font("Tahoma",0,30));
        buttonLogOut.setForeground(Color.WHITE);
       // buttonLogOut.setText("LogOut");
        buttonLogOut.setBounds(1165,622,122, 45);
        buttonLogOut.setBackground(Color.RED);
                       
        panelLogIn.add(buttonLogOut);
      //  panelLogIn.add(labelLogIN); 
        panelLogIn.add(button_Remove_Admin);
        panelLogIn.add(button_Manage_Routine);
        
        JLabel LogInLabelpic=new JLabel();
        ImageIcon LogInicon=new ImageIcon();
        Image(LogInicon, "49.png", LogInLabelpic, panelLogIn, f, 0, 0, 1295, 671);
                                    
        panelLogIn.setVisible(true);
        
        f.add(panelLogIn);
        
        button_Remove_Admin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                new Author_LogIN();
              
            }
        });
        
        button_Manage_Routine.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Routine_Manage b =new Routine_Manage();
                
            }
        });
        
        buttonLogOut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try
                {
                    panelLogIn.setVisible(false);
                    panelAdmin.setVisible(true);
                    textUserName.setText(null);
                    textPassword.setText(null);
                }
                catch(Exception ex)
                {
                              
                }
            }
        });
        
    }
    
    public void labelTime_and_Date()
    {   
        labelTime=new JMenuItem();
        labelTime.setForeground(Color.RED);
        labelTime.setFont(new java.awt.Font("Tahoma", 0, 25)); 
    //    labelTime.setBackground(Color.GRAY);
        
        Calendar CurrentTime=new GregorianCalendar();
        
        labelDate=new JLabel();
        labelDate2=new JLabel();
        labelDate.setForeground(Color.RED);
        labelDate.setFont(new java.awt.Font("Tahoma", 0, 25));
        labelDate2.setForeground(Color.RED);
        labelDate2.setFont(new java.awt.Font("Tahoma", 0, 25));
             
        int day= CurrentTime.get(Calendar.DAY_OF_WEEK);
        int day2=CurrentTime.get(Calendar.DAY_OF_MONTH);
        int month= CurrentTime.get(Calendar.MONTH);
        int year= CurrentTime.get(Calendar.YEAR); 
        
        String day3=new String();
        if(day==1)day3="Sunday";
        else if(day==2)day3="Monday";
        else if(day==3)day3="Tuesday";
        else if(day==4)day3="Wednesday";
        else if(day==5)day3="Thursday";
        else if(day==6)day3="Friday";
        else if(day==7)day3="Saturday";
        
        
        String month2=new String();
        if((month+1)==1)month2="Jan";
        else if((month+1)==2)month2="Feb";
        else if((month+1)==3)month2="Mar";
        else if((month+1)==4)month2="Apr";
        else if((month+1)==5)month2="May";
        else if((month+1)==6)month2="Jun";
        else if((month+1)==7)month2="Jul";
        else if((month+1)==8)month2="Aug";
        else if((month+1)==9)month2="Sep";
        else if((month+1)==10)month2="Oct";
        else if((month+1)==11)month2="Nov";
        else if((month+1)==12)month2="Dec";
       
      //  day3="Wednusday";
        int l=day3.length();
        labelDate2.setText(day3);
        labelDate2.setBounds((1300-(l*17)), 555, 200, 100);
        
      //  month2="September";
        int l2=month2.length();
        labelDate.setText(day2+" "+month2+" , "+year);
        labelDate.setBounds(1140, 595, 300, 100);
        
        Thread clock=new Thread(){
            public void run(){
                for(;;)
                {
                   // labelTime=new JLabel();
                   // labelTime.setFont(new java.awt.Font("Tahoma", 1, 25));
                    
                    Calendar CurrentTime=new GregorianCalendar();
                    
                    int second= CurrentTime.get(Calendar.SECOND);
                    int minute= CurrentTime.get(Calendar.MINUTE);
                    int hour= CurrentTime.get(Calendar.HOUR);   
                    int AM_PM=CurrentTime.get(Calendar.AM_PM);
                    
                    String day_night;
                    if(AM_PM==1) day_night="PM";
                    else day_night="AM";
                    
                    if(hour==0) hour=12;
                    
                    if(minute<=9)labelTime.setText(hour+":"+"0"+minute+":"+second+" "+day_night);
                    if(second<=9)labelTime.setText(hour+":"+minute+":"+"0"+second+" "+day_night);
                    if(minute<=9 && second<=9)labelTime.setText(hour+":"+"0"+minute+":"+"0"+second+" "+day_night);
                    if(minute>9 && second>9)labelTime.setText(hour+":"+minute+":"+second+" "+day_night);
                    
                    labelTime.setBounds(1130, 10, 155, 40);
                    try 
                    {
                         sleep(1000);
                    }
                    catch (InterruptedException ex)
                    {
                         Logger.getLogger(Routine7.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
                
        };clock.start();
        
        panelStart.add(labelTime);
        panelStart.add(labelDate);
        panelStart.add(labelDate2);
        
    }
    
    public void Image(ImageIcon icon, String pic_name_with_format, JLabel label, JPanel panel, JFrame frame, int x, int y, int width, int depth  )
    {
        icon=new ImageIcon(getClass().getResource(pic_name_with_format));
        label=new JLabel(icon);
        label.setBounds(x, y, width, depth);
        
        panel.add(label);
        frame.show();
    
    }
    
    public void frame()
    {
        f = new JFrame("Class Routine");
        f.setBounds(30,10,1300,700);        
        f.setResizable(false);
        
        
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setDefaultCloseOperation(0);
        
        
        panelStart = new JPanel();
        panelStart.setLayout(null);
        //panelStart.setBounds(0, 0, 1200, 900);
        panelStart.setBackground(Color.cyan);
        
        
        
        labelStart1=new JLabel();
        labelStart1.setFont(new java.awt.Font("ALGERIAN", 1, 85));
       // labelStart1.setForeground(Color.RED);
        labelStart1.setText("Routine");
                            
    //    labelStart1.setText("Class Routine");
     //   labelStart1.setBounds(300, 20, 1000, 100);
        
        labelStart12=new JLabel();
        labelStart12.setFont(new java.awt.Font("ALGERIAN", 1, 85));
       // labelStart1.setForeground(Color.RED);
        labelStart12.setText("Class");
         
        labelStart2=new JLabel();
        labelStart2.setFont(new java.awt.Font("French Script MT", 1, 90));
      //  labelStart2.setForeground(Color.RED);
        labelStart2.setText("Enter  As");
        labelStart2.setBounds(225, 200, 1000, 300);
        
        buttonTeacher=new JButton();
        buttonTeacher.setFont(new java.awt.Font("Consolas", 3, 33));
        buttonTeacher.setForeground(Color.blue);
        buttonTeacher.setText("TeacheR");
        buttonTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTeacher.setBounds(675,200,160, 70);
        buttonTeacher.setBackground(Color.BLACK);
        
        
        buttonStudent=new javax.swing.JButton();
        buttonStudent.setFont(new java.awt.Font("Consolas", 3, 33));
        buttonStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonStudent.setForeground(Color.BLUE);
        buttonStudent.setText("StudenT");
        buttonStudent.setBounds(675,320,160, 70);
        buttonStudent.setBackground(Color.BLACK);
        
        buttonAdmin=new JButton();
        buttonAdmin.setFont(new java.awt.Font("Consolas", 3, 35));
        buttonAdmin.setForeground(Color.WHITE);
        buttonAdmin.setText("AdmiN");
        buttonAdmin.setBounds(675,440,160, 70);
        buttonAdmin.setBackground(Color.RED);
        
        ImageIcon ExitIcon=new ImageIcon(getClass().getResource("4.png"));
        buttonExit=new JButton(ExitIcon);
        buttonExit.setFont(new java.awt.Font("Tahoma",0,25));
        buttonExit.setForeground(Color.WHITE);
      //  buttonExit.setText("exiT");
        buttonExit.setBounds(8,620,53, 43);
    //     buttonExit.setBounds(8,595,128, 128);
        buttonExit.setBackground(Color.GREEN);
        
        
        labelTime_and_Date();
        
        try
        {
            
            String an = null;
            Data_State.execute("Select * from Table_Anim");            
            Data_Resultset= Data_State.getResultSet();            
            while(Data_Resultset.next())
            {
                      an=Data_Resultset.getString("anim");
            }
            
            if("yes".equals(an))
            {
                
                Thread anim=new Thread(){
                    public void run()
                    {
                        while(j<=310)
                        {

                            j--;

                            if (x>=0 && x<650 && y<=1300 && y>299)
                            {
                                x++;
                                labelStart1.setBounds((int)x, 20, 1000, 100);
                                if((j%2)==0)labelStart1.setForeground(Color.RED);
                                else labelStart1.setForeground(Color.BLACK);

                                y=y-1.5;
                                labelStart12.setBounds((int)y, 20, 1000, 100);
                                if((j%2)==0)labelStart12.setForeground(Color.RED);
                                else labelStart12.setForeground(Color.BLACK);

                                if((j%2)==0)labelStart2.setForeground(Color.RED);
                                else labelStart2.setForeground(Color.BLUE);

                               // System.out.println(x+" "+y);
                            }

                            try 
                            {
                                 sleep(1);

                            }
                            catch (InterruptedException ex)
                            {
                                 Logger.getLogger(Routine7.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                };anim.start();
                
            }
            
            else
            {
                labelStart1.setBounds(650, 20, 1000, 100);
                labelStart1.setForeground(Color.RED);
                
                labelStart12.setBounds(325, 20, 1000, 100);
                labelStart12.setForeground(Color.RED);
                
                labelStart2.setForeground(Color.RED);
                
            }
            
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
       /* Thread anim=new Thread(){
            public void run(){
                while(j<=310)
                {
                  
                    j--;
                    
                        if (x>=0 && x<650 && y<=1300 && y>299){
                            x++;
                            labelStart1.setBounds((int)x, 20, 1000, 100);
                            if((j%2)==0)labelStart1.setForeground(Color.RED);
                            else labelStart1.setForeground(Color.BLACK);
                            
                            y=y-1.5;
                            labelStart12.setBounds((int)y, 20, 1000, 100);
                            if((j%2)==0)labelStart12.setForeground(Color.RED);
                            else labelStart12.setForeground(Color.BLACK);
                            
                            if((j%2)==0)labelStart2.setForeground(Color.RED);
                            else labelStart2.setForeground(Color.BLUE);
                        }
                                         
                    try 
                    {
                         sleep(1);
                         
                    }
                    catch (InterruptedException ex)
                    {
                         Logger.getLogger(Routine7.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
                
        };anim.start();
        */
         
        panelStart.add(labelStart1);
        panelStart.add(labelStart12);
        panelStart.add(labelStart2);
        panelStart.add(buttonTeacher);
        panelStart.add(buttonStudent);
        panelStart.add(buttonAdmin); 
        panelStart.add(buttonExit);
         
        JLabel StartLabelpic=new JLabel();
        ImageIcon Starticon=new ImageIcon();
        Image(Starticon,"70.png", StartLabelpic, panelStart, f, 0, 0, 1295, 671);
        
        f.add(panelStart);                
     
        buttonTeacher.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try
                {
                   // panelStart.setVisible(false);
                   // Teacher();
                    
                    Data_State.execute("update Table_Anim set anim='no' where ID=1");
                    
                    f.setVisible(false);
                    new Teacher();
                }
                catch(Exception ex)
                {
                    
                }
                
            }
        });
        
        buttonStudent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try
                {
                    Data_State.execute("update Table_Anim set anim='no' where ID=1");
                    
                    f.setVisible(false);
                    new Student();
                  
                }
                catch(Exception ex)
                {
                    
                }
                
            }
        });
       
        buttonAdmin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               try
               {
                   // JOptionPane.showMessageDialog(null,"User Found, Access Granted");                   
                    panelStart.setVisible(false);
                    Admin();
                                 
               }
               catch(Exception ex)
               {
                   JOptionPane.showMessageDialog(null,ex);
               }               
                
            }
        });
        
        buttonExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               try
               {
                   // JOptionPane.showMessageDialog(null,"User Found, Access Granted");                   
                  //  System.exit(0);
                   Data_State.execute("update Table_Anim set anim='yes' where ID=1");
                   new Exit_Confirmation();
                                 
               }
               catch(Exception ex)
               {
                 JOptionPane.showMessageDialog(null,ex);  
               }               
                
            }
        });
                      
        f.show();

    }
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Routine7 r=new Routine7();
   //     Add_admin a=new Add_admin();
    //    Add_Admin2 a=new Add_Admin2();
     //   Routine_Manage b =new Routine_Manage();
      // new Author();
       // new Author_LogIN();
        
        //new Remove_Admin();
     //   new Exit_Confirmation();
      //  new Teacher();
     //  new Student();
        
    //    new Class_Time();
        
    }

   
    
}
