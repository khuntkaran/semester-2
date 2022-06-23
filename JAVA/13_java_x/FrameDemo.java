import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;
import java.io.Flushable;
class MyFream extends JFrame implements ActionListener{
    JLabel DemoLabel;
    JTextField namee,no_of_subjecte;
    JTextField[] subnamee,subcredite,getgradee;
    int no_of_subjecto;
    String nameo;
    String[] subnameo,getgradeo;
    int[] subcredito;
    Font fo;

    int s=0;
    int tcredit=0,scredit=0;
    double spi;
    JButton btn;
    String st;

    JFrame frame = new JFrame("demo");
    JFrame frame2 = new JFrame("demo2");
    JFrame frame3 = new JFrame("demo3");
    Container c = frame.getContentPane();
    Container c2 = frame2.getContentPane();
    Container c3 = frame3.getContentPane();

    MyFream(){
       
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        c.setLayout(null);
        
        DemoLabel = new JLabel("Student Name");
        c.add(DemoLabel);
        DemoLabel.setBounds(100, 110, 150, 30);
       
        namee = new JTextField();
        c.add(namee);
        namee.setBounds(300, 110, 150, 30);
        

        DemoLabel = new JLabel("Number Of Subject");
        c.add(DemoLabel);
        DemoLabel.setBounds(100, 160, 150, 30);
       
        no_of_subjecte = new JTextField();
        c.add(no_of_subjecte);
        no_of_subjecte.setBounds(300, 160, 150, 30);

        btn = new JButton("submit");
        c.add(btn);
        btn.setBounds(175, 220, 100, 30);
        btn.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent o) {
        nameo = namee.getText();
        no_of_subjecto = Integer.parseInt(no_of_subjecte.getText());

        subnamee = new JTextField[no_of_subjecto];
        subcredite = new JTextField[no_of_subjecto];
        getgradee = new JTextField[no_of_subjecto];
        subnameo = new String[no_of_subjecto];
        subcredito = new int[no_of_subjecto];
        getgradeo = new String[no_of_subjecto];
        
        frame.setVisible(false);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(100,50,800,600);
        c2.setLayout(null);

        DemoLabel = new JLabel("Subject No");
        c2.add(DemoLabel);
        DemoLabel.setBounds(100,100,120,30);
        DemoLabel = new JLabel("Subject Name");
        c2.add(DemoLabel);
        DemoLabel.setBounds(250,100,120,30);
        DemoLabel = new JLabel("Subject Credit");
        c2.add(DemoLabel);
        DemoLabel.setBounds(400,100,120,30);
        DemoLabel = new JLabel("Grade_Obtained");
        c2.add(DemoLabel);
        DemoLabel.setBounds(550,100,120,30);

      
      
        for(int i=0;i<no_of_subjecto;i++,s+=50){
            DemoLabel = new JLabel((i+1)+"Subject");
            c2.add(DemoLabel);
            DemoLabel.setBounds(100, 150+s, 120, 30);
           
            subnamee[i] = new JTextField();
            c2.add(subnamee[i]);
            subnamee[i].setBounds(250, 150+s, 120, 30);

            subcredite[i] = new JTextField();
            c2.add(subcredite[i]);
            subcredite[i].setBounds(400, 150+s, 120, 30);

            getgradee[i] = new JTextField();
            c2.add(getgradee[i]);
            getgradee[i].setBounds(550, 150+s, 120, 30);
        }

        btn = new JButton("submit");
        c2.add(btn);
        btn.setBounds(260, 190+s, 100, 30);
        btn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                for(int i=0;i<no_of_subjecto;i++){
                    subnameo[i]= subnamee[i].getText();
                    subcredito[i]= Integer.parseInt(subcredite[i].getText());
                    tcredit+= subcredito[i];
                    getgradeo[i]= getgradee[i].getText();
                    calulate(subcredito[i],getgradeo[i]);
                }

                frame2.setVisible(false);
                frame3.setVisible(true);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setBounds(100,50,800,600);
                c3.setLayout(null);

                

                calulatefainal();

            }  
            });  
        
       
    }
    
    void calulate(int i,String g)
    {
        int k =1;

        if(g.equalsIgnoreCase("a+")){k=10;}
        else if (g.equalsIgnoreCase("a")){k=9;}
        else if (g.equalsIgnoreCase("b+")){k=8;}
        else if (g.equalsIgnoreCase("b")){k=7;}
        else if (g.equalsIgnoreCase("c+")){k=6;}
        else if (g.equalsIgnoreCase("c")){k=5;}
        
        scredit+= k*i;
    }
    
    void calulatefainal()
    {
        DemoLabel = new JLabel("Result");
        c3.add(DemoLabel);
        DemoLabel.setBounds(300,50,120,80);
        fo = new FontUIResource("Verdana",Font.BOLD, 25);
        DemoLabel.setFont(fo);

        DemoLabel = new JLabel("Name  :  "+nameo);
        c3.add(DemoLabel);
        DemoLabel.setBounds(100,130,120,30);

        DemoLabel = new JLabel("Subject");
        c3.add(DemoLabel);
        DemoLabel.setBounds(100,180,120,30);
        DemoLabel = new JLabel("Credit");
        c3.add(DemoLabel);
        DemoLabel.setBounds(180,180,120,30);
        DemoLabel = new JLabel("Grade_Obtained");
        c3.add(DemoLabel);
        DemoLabel.setBounds(260,180,120,30);

        for(int i=0,s=0;i<no_of_subjecto;i++,s+=30){
            DemoLabel = new JLabel(subnameo[i]);
            c3.add(DemoLabel);
            DemoLabel.setBounds(100,220+s,120,30);
            st=Integer.toString(subcredito[i]);
            DemoLabel = new JLabel(st);
            c3.add(DemoLabel);
            DemoLabel.setBounds(180,220+s,120,30);
            DemoLabel = new JLabel(getgradeo[i]);
            c3.add(DemoLabel);
            DemoLabel.setBounds(260,220+s,120,30);
        }

        spi = (scredit) / (tcredit);
        st=Double.toString(spi);
        DemoLabel = new JLabel("spi  :  "+st);
        c3.add(DemoLabel);
        DemoLabel.setBounds(100, 250+s, 100, 30);
    }
    
}
public class FrameDemo {
    public static void main(String[] args) {
        MyFream mf = new MyFream();
    }
}