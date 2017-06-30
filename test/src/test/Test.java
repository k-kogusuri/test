package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//JFrame実装
public class Test extends JFrame implements ActionListener{
	JLabel label;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
  public static void main(String[] args){
    Test frame = new Test("謎ツール");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Test(String title){
    setBounds(1310, 0, 300, 140);
    setTitle(title);
    label = new JLabel("");
    
    //ボタンつくる
    button1 = new JButton("Z!Stream");
    button2 = new JButton("nas2");
    button3 = new JButton("TeraPad");
    button4 = new JButton("WinSCP");
    button5 = new JButton("TeraTerm");
    button6 = new JButton("PackSV");
    button7 = new JButton("ZUtility");
    button8 = new JButton("ZBuilder");
    button9 = new JButton("RDP");
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    
    //パネルの実装
    JPanel panel = new ImagePanel();
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    
    Container contentPane = getContentPane();
    contentPane.add(panel, BorderLayout.CENTER);
  }    

  //ぼたん押されたとき
  public void actionPerformed(ActionEvent e){
	Runtime r = Runtime.getRuntime();
	//とりあえずの定数
	final String IE = "C:\\Program Files\\Internet Explorer\\IEXPLORE.EXE";
	final String URL = "http://172.24.82.27/html/login_end.php?id=zadmin&pwd=sonj";
	final String NAS = "EXPLORER.EXE /e,/root, \\\\nas2";
	final String SCP = "C:\\Program Files (x86)\\WinSCP\\WinSCP.exe";
	final String TERM = "D:\\tool\\teraterm-4.90\\ttermpro.exe";
	final String PACKSV = "EXPLORER.EXE /e,/root, \\\\packsv";
	final String ZUTILITY ="C:\\Users\\k-kogusuri\\Desktop\\ZUtility.exe";
	final String ZBUILDER ="C:\\Users\\k-kogusuri\\Desktop\\Tool\\ZBuilder3.7.0.0x64\\ZBuilder.exe";
	final String RDP = "mstsc";
	
    try{ //とりあえずの例外
	  if(e.getSource()==button1){		
		r.exec(new String[ ] {IE, URL}); //WebDesktop
      }else if(e.getSource() == button2){
    	r.exec(NAS); //nas2
      }else if(e.getSource() == button3){
    	r.exec("terapad"); //terapad
      }else if(e.getSource() == button4){
    	r.exec(SCP); //WinSCP
      }else if(e.getSource() == button5){
    	r.exec(TERM); //TeraTerm
      }else if(e.getSource() == button6){
    	r.exec(PACKSV); //PackSV
      }else if(e.getSource() == button7){
    	r.exec(ZUTILITY); //ZUtirity
      }else if(e.getSource() == button8){
    	r.exec("cmd "+"/c "+ZBUILDER); //ZBuilder
      }else if(e.getSource() == button9){
    	r.exec(RDP); //リモートデスクトップ
      }
    }catch(IOException error){
      System.out.println(error);
    }
  }
}
