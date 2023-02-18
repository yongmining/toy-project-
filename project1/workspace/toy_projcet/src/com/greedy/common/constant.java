package com.greedy.common;

import java.awt.*;

import javax.swing.*;

public class constant {
	
	// color configs
	public static final Color MAINCOLOR = new Color(61, 92, 72);
	public static final Color NAVYCOLOR = new Color(80, 80, 126);
	public static final Color GRAYCOLOR = new Color(118, 118, 118);

	/**
	 * @param 세팅할 JButton
	 * @param 버튼배경색
	 * @param 텍스트색
	 */
	public static void setButtonColor(JButton btn, Color c1, Color c2) {
		btn.setBackground(c1);
		btn.setForeground(c2);
		Font font = new Font("Inter", Font.BOLD, 20);
		btn.setFont(font);
	}
	
	public static void changePanel(MainFrame mf, JPanel oldPanel, JPanel newPanel) {
		mf.remove(oldPanel);
		mf.add(newPanel);
		mf.repaint(); 		//패널 내의 컴포넌트를 새롭게 바꿔준다.
		mf.revalidate();	//(안되면 둘 중 하나 써야함)
	}
	
}
