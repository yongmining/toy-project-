package com.greedy.common;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.greedy.paygame.view.payStartMenu;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		this.setTitle("짱구게임");		//타이틀
		this.setSize(750,650);				//레이아웃을 내맘대로 설정
		this.setResizable(false);			//창 크기 변경 금지
		this.setLocationRelativeTo(null);	//창 가운데에 나오도록
		
		new payStartMenu(this);
//		new GameMenu(this);
		
		/*프레임창 아이콘*/
		try {
			this.setIconImage(ImageIO.read(new File("images/ui/짱구icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setVisible(true);									//창이 보이도록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//JFrame이 정상적으로 종료되게
		
	}

}
