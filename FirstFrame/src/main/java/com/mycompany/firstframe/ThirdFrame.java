package com.mycompany.firstframe;

import static com.mycompany.firstframe.SecondFrame.semester;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.*;


public class ThirdFrame extends SecondFrame {
    SemestersGPA sg= new SemestersGPA();
    
    public double gpa=0;
    public double credit=0;
    public double finalCGPA=0;
    
    //public double tGrade= sg.TotalGrade;
    //public double cre= sg.c;
    
    ThirdFrame(){
            show();  
    }
    
    
    public void show(){
        JFrame obj= new JFrame();
        obj.setSize(400,600);
        JLabel data= new JLabel("Enter Data");
        data.setBounds(150,0,100,40);
        data.setPreferredSize(new Dimension(200, 200));
        obj.add(data);

        JLabel obtM,totM, cH,per;
        obtM= new JLabel("Obtain Marks");
        totM= new JLabel("Total Marks");
        cH= new JLabel("Credit Hours");
        per= new JLabel("Percentage");
        JLabel em= new JLabel();
               
        Container c= obj.getContentPane();
        c.setLayout(null);
    
        obtM.setBounds(15, 50, 90, 30);
        totM.setBounds(105, 50, 90, 30);
        cH.setBounds(195, 50, 90, 30);
        per.setBounds(285, 50, 90, 30);
        em.setBounds(300,50,90,30);
        
        obj.add(obtM);
        obj.add(totM);
        obj.add(cH);
        obj.add(per);
        obj.add(em);
       
        int s= subject;
        int sizeT=80;
        JTextField[] oM= new JTextField[s];
        JTextField[] tM= new JTextField[s];
        JTextField[] cHour= new JTextField[s];
        JTextField[] pR= new JTextField[s];
               
        for(int i=0; i<s; i++){
            oM[i]= new JTextField();
            tM[i]= new JTextField();
            cHour[i]= new JTextField();
            pR[i]= new JTextField();
            
            oM[i].setBounds(15,sizeT,60,20);
            tM[i].setBounds(105,sizeT,60,20);
            cHour[i].setBounds(195,sizeT,60,20);
            pR[i].setBounds(285,sizeT,60,20);
            
            c.add(oM[i]);
            c.add(tM[i]);
            c.add(cHour[i]);
            c.add(pR[i]);
            
            sizeT+=30;
        }
        JButton cGPA= new JButton("Calculate CGPA");
        cGPA.setBounds(180,sizeT+30,150,35);
        obj.add(cGPA);
        
        JButton back= new JButton("Back");
        back.setBounds(60,sizeT+30,100,35);
        obj.add(back);
        
        JTextField fgpa= new JTextField();
        fgpa.setBounds(150,sizeT+85,100,30);
        obj.add(fgpa);
        
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                obj.dispose();
                FirstFrame ff= new FirstFrame();
                ff.setVisible(true);
            }
        });
        
        cGPA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            try{    
                for(int i=0;i<s;i++){
                    
                    if(Double.parseDouble(cHour[i].getText())<0){
                        throw new NumberFormatException();
                    }
                    
                    if((Integer.parseInt(tM[i].getText())<Double.parseDouble(oM[i].getText()))){
                        throw new ArithmeticException("Your Enter Large Number of Subject");
                    }
                    else{
                        
                    if(Integer.parseInt(tM[i].getText())==100){
                        if(Double.parseDouble(oM[i].getText())>92.5 && Double.parseDouble(oM[i].getText())<=100 ){
                            gpa+=(4.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=86.5 && Double.parseDouble(oM[i].getText())<92.5 ){
                            gpa+=(3.67*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=81.5 && Double.parseDouble(oM[i].getText())<86.5 ){
                            gpa+=(3.33*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=76.5 && Double.parseDouble(oM[i].getText())<81.5 ){
                            gpa+=(3.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=71.5 && Double.parseDouble(oM[i].getText())<76.5 ){
                            gpa+=(2.76*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=67.5 && Double.parseDouble(oM[i].getText())<71.5 ){
                            gpa+=(2.3*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=63.5 && Double.parseDouble(oM[i].getText())<67.5 ){
                            gpa+=(2.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=59.5 && Double.parseDouble(oM[i].getText())<63.5 ){
                            gpa+=(1.67*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=0.0 && Double.parseDouble(oM[i].getText())<59.5 ){
                            gpa+=(0*Double.parseDouble(cHour[i].getText()));
                        }                       
                    }
                    else if(Integer.parseInt(tM[i].getText())==50){
                        
                        if(Double.parseDouble(oM[i].getText())>=45.5 && Double.parseDouble(oM[i].getText())<=50 ){
                            gpa+=(4.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=43.5 && Double.parseDouble(oM[i].getText())<45.5 ){
                            gpa+=(3.67*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=41.5 && Double.parseDouble(oM[i].getText())<43.5 ){
                            gpa+=(3.33*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=38.5 && Double.parseDouble(oM[i].getText())<41.5 ){
                            gpa+=(3.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=36.5 && Double.parseDouble(oM[i].getText())<38.5 ){
                            gpa+=(2.76*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=34.5 && Double.parseDouble(oM[i].getText())<36.5 ){
                            gpa+=(2.3*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=31.5 && Double.parseDouble(oM[i].getText())<34.5 ){
                            gpa+=(2.0*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=29.5 && Double.parseDouble(oM[i].getText())<31.5 ){
                            gpa+=(1.67*Double.parseDouble(cHour[i].getText()));
                        }
                        else if(Double.parseDouble(oM[i].getText())>=0 && Double.parseDouble(oM[i].getText())<29.5 ){
                            gpa+=(0*Double.parseDouble(cHour[i].getText()));
                        }          
                    }
                    
                    pR[i].setText(""+ ((Double.parseDouble(oM[i].getText()) / Double.parseDouble(tM[i].getText()))*100.0 )+(" %"));
                    
                    credit+=Double.parseDouble(cHour[i].getText());
                                                            
                }  
                }
                if(semester==1){
                        finalCGPA= gpa/credit;
                        //JOptionPane.showMessageDialog(rootPane,"Your CGPA is "+Math.round(finalCGPA*1000.0)/1000.0);     
                        fgpa.setText("GPA is: "+Math.round(finalCGPA*1000.0)/1000.0 );
                }
                else{
                      finalCGPA= (gpa+(sg.g*sg.c))/(sg.c+credit);
                      //JOptionPane.showMessageDialog(rootPane,"Your CGPA is "+Math.round(finalCGPA*1000.0)/1000.0); 
                      fgpa.setText("CGPA is: "+Math.round(finalCGPA*1000.0)/1000.0 );
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(rootPane,"You entered -ve Credit Hours");
            }       
            catch(ArithmeticException ee){
                JOptionPane.showMessageDialog(rootPane,"You entered Obtained Marks Greater than Total Data");
            }
            catch(Exception a){  
                JOptionPane.showMessageDialog(rootPane,"You enter invalid Data");
            }  
            }
        });
        
        
        obj.setVisible(true);  
        
    }
}    
