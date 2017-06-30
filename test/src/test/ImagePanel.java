package test;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//背景画像描画うんぬんクラス
public class ImagePanel extends JPanel {
  // 描画する画像
	java.net.URL url =this.getClass().getClassLoader().getResource("SonjLogo2.jpg");
	Image image = new ImageIcon(url).getImage();

	public ImagePanel() {
	  super.setOpaque(false);//透過処理
	} 
	public void paint(Graphics g) {
	  g.drawImage(image, 0, 0, this); // 背景イメージを描画
	  super.paint(g); //子コンポーネントの描画等、上位クラスで実現している表示内容の描画
	}
}