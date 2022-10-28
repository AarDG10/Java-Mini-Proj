import java.applet.Applet;
import java.lang.*;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletNew extends Applet implements ActionListener {
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
    TextField t4=new TextField();
    TextField t5=new TextField();
    TextField t6=new TextField();
	TextField t7=new TextField();
    TextField t8=new TextField();

	public AppletNew() {
		Label l1=new Label("First Number: ");
		Label l2=new Label("Second Number: ");
		Label l3=new Label("Result(Add): ");
        Label l4=new Label("Result(Sub): ");
        Label l5=new Label("Result(Product): ");
        Label l6=new Label("Result(Division): ");
        Label l7=new Label("Binary Conv.(Num 1): ");
        Label l8=new Label("Binary Conv.(Num 2): ");
        Font myFont = new Font("Serif",Font.BOLD,26);
        Font ress= new Font("SANS_SERIF",Font.BOLD,22);
        l1.setFont(myFont);
        l2.setFont(myFont);
        l3.setFont(myFont);
        l4.setFont(myFont);
        l5.setFont(myFont);
        l6.setFont(myFont);
        l7.setFont(myFont);
        l8.setFont(myFont);
        t3.setFont(ress);
        t4.setFont(ress);
        t5.setFont(ress);
        t6.setFont(ress);
        t7.setFont(ress);
        t8.setFont(ress);
        l3.setForeground(Color.red);
        l4.setForeground(Color.red);
        l5.setForeground(Color.red);
        l6.setForeground(Color.red);
        l7.setForeground(Color.red);
        l8.setForeground(Color.red);
        t3.setForeground(Color.red);
        t4.setForeground(Color.red);
        t5.setForeground(Color.red);
        t6.setForeground(Color.red);
        t7.setForeground(Color.red);
        t8.setForeground(Color.red);
		setLayout(new GridLayout(2,4));
		setBackground(Color.cyan);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
		t2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=t1.getText();	
		Double num1=Double.parseDouble(s1);
		Double num2=Double.parseDouble(t2.getText());
		Double Res=num1+num2;
		t3.setText("Sum is: " + Res);
        Res=num1-num2;
        if(Res<0) Res=Res*-1;
        t4.setText("Difference is: " + Res);
        Res=num1*num2;
        t5.setText("Product is: " + Res);
        if(num2==0) 
        t6.setText("Non-Divisible with zero!");
        else
        {
            Res=num1/num2;
            DecimalFormat dec = new DecimalFormat("#0.00");
            t6.setText("Result is: "+ dec.format(Res));
        }
        int n1=Integer.parseInt(s1);
        String strBinaryNumber = Integer.toBinaryString(n1);
        t7.setText("Binary: "+ strBinaryNumber);
        int n2=Integer.parseInt(t2.getText());
        String strbinum = Integer.toBinaryString(n2);
        t8.setText("Binary: "+strbinum);
	}
}