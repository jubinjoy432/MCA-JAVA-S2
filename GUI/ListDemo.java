import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ActionListener
{
    List l1,l2;
    TextField t;
    Button badd,bright,bleft;
    public ListDemo()
    {
        super("List Box");
        l1=new List();
        l2=new List();
        t=new TextField(10);
        badd=new Button("Add");
        bright=new Button(">>");
        bleft=new Button("<<");
        setLayout(new FlowLayout());
        add(l1);
        add(bright);
        add(bleft);
        add(l2);
        add(t);
        add(badd);
        badd.addActionListener(this);
        bright.addActionListener(this);
        bleft.addActionListener(this);
        setSize(700,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==badd)
        {
            String s=t.getText();
            l1.add(s);
            t.setText("");
        }
        else if(ae.getSource()==bright)
        {
            int p=l1.getSelectedIndex();
            if(p>=0)
            {
                String s=l1.getSelectedItem();
                l2.add(s);
                l1.remove(p);
            }
        }
        else if(ae.getSource()==bleft)
        {
            int p=l2.getSelectedIndex();
            if(p>=0)
            {
                String s=l2.getSelectedItem();
                l1.add(s);
                l2.remove(p);
            }
        }
    }
    public static void main(String args[])
    {
        new ListDemo();
    }
}