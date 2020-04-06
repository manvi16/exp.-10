import java.awt.*;

import java.awt.event.*;

class Calculator extends Frame implements ActionListener ,ItemListener
{
  TextField txt,txt1,txt2;
  Button b,br,bt;
  Choice c;
       
        Calculator()
        {
       
            setTitle("Background Color");
                setVisible(true);
            setLayout(null);
            setSize(350,300);
        
            Label l=new Label("Square is:");
            l.setSize(100,20);
            l.setLocation(120,180);
            add(l);
             Label l1=new Label("Factorial is:");
            l1.setSize(100,20);
            l1.setLocation(110,230);
            add(l1);

            txt =new TextField();
            txt.setText("Enter Number");
            txt.setSize(100,20);
            txt.setLocation(100,50);
            add(txt);


            txt1 =new TextField();
            txt1.setSize(100,20);
            txt1.setLocation(100,200);
            add(txt1);

           

            txt2 =new TextField();
            txt2.setSize(100,20);
            txt2.setLocation(100,260);
            add(txt2);


            


              b=new Button("Square");
            b.setSize(70,20);
            b.setLocation(110,80);
            add(b);
             br=new Button("Factorial");
            br.setSize(70,20);
            br.setLocation(110,110);
            add(br);
             bt=new Button("clear");
            bt.setSize(70,20);
            bt.setLocation(110,140);
            add(bt);





          Color clr=Color.white;

        setBackground(clr);

        c=new Choice();
        c.setBounds(230,250,80,60);
        c.addItem("White");
        c.addItem("Yellow");
        c.addItem("Cyan");

        c.addItem("Blue");
        c.addItem("Red");
        add(c);
        c.addItemListener(this);      


            b.addActionListener(this);
            br.addActionListener(this);
            bt.addActionListener(this);
            setVisible(true);
        }
        


        public void actionPerformed(ActionEvent e)
        { 
            if(e.getSource().equals(b))
            {
                int a = Integer.parseInt(txt.getText());
                    
                txt1.setText( String.valueOf(a*a)); 
            }
            else if(e.getSource().equals(br))
            {
            int a = Integer.parseInt(txt.getText());
            int s=1;
            for(int i=1;i<=a;i++)
            {
                s=s*i;
            }
                txt2.setText( String.valueOf(s)); 
            
            }
            else{
            txt1.setText( String.valueOf(0)); 
            txt2.setText( String.valueOf(0)); 

            
            txt.setText("Enter Number");
            


            }
                                          
        }
        public void itemStateChanged(ItemEvent e)
    {
        if(e.getItem()=="Red")
        {
            Color clr=Color.red;
            setBackground(clr);


        }
        else if(e.getItem()=="Blue")
        {
            Color clr=Color.blue;
            setBackground(clr);


        }else if(e.getItem()=="White")
        {
            Color clr=Color.white;
            setBackground(clr);


        }else if(e.getItem()=="Yellow")
        {
            Color clr=Color.yellow;
            setBackground(clr);


        }else if(e.getItem()=="Cyan")
        {
            Color clr=Color.cyan;
            setBackground(clr);


        }

    }
}
    
class Tester 
{
    public static void main(String args[])
    {
        Calculator c=new Calculator();
    }
}


    
  
