package com.greedy.paygame.view;




import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.common.constant;

import static com.greedy.common.constant.changePanel;
import static com.greedy.common.constant.setButtonColor;



public class StartMenu extends JPanel {

	/* 전역변수에 컬러파레트 지정 */
	private Color MAINCOLOR = constant.MAINCOLOR;
	private Color NAVYCOLOR = constant.NAVYCOLOR;
	private Color GRAYCOLOR = constant.GRAYCOLOR;

	private MainFrame mf;
	private JPanel startMenu;

	public StartMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.startMenu = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon(""));
		background.setBounds(0, -15, 800, 580);

		/* 라벨에 타이틀로고 삽입 */
		JLabel logo = new JLabel(new ImageIcon(""));
		logo.setBounds(140, 120, 523, 190);

		/* 게임시작 버튼 생성 */
		JButton startBtn = new JButton("Start");									
		startBtn.setBounds(305, 358, 190, 55);
		setButtonColor(startBtn, MAINCOLOR, Color.WHITE);

		/* 게임시작 버튼 클릭 시 맵화면 패널로 변경*/
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, startMenu, new MainMap(mf));
				System.out.println("게임시작 가능, 맵 화면 이동");
			}
		});

		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton("Quit");
		quitBtn.setBounds(305, 423, 190, 55);
		setButtonColor(quitBtn, GRAYCOLOR, Color.WHITE);

		/* 나가기 버튼 클릭 시 시스템 종료*/
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, startMenu, new GameMenu(mf));
				System.out.println("GameMenu로 이동합니다.");

			}
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(logo);
		
		this.add(startBtn);
		this.add(quitBtn);
		
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
		


}
