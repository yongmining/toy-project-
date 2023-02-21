package com.greedy.paygame.view;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.common.constant;
import com.greedy.paygame.view.pages.foodexPage;
import com.greedy.paygame.view.pages.foodrank;

public class foodStartMenu extends JPanel {

	/* 전역변수에 컬러파레트 지정 */
	private Color MAINCOLOR = constant.MAINCOLOR;
	private Color NAVYCOLOR = constant.NAVYCOLOR;
	private Color GRAYCOLOR = constant.GRAYCOLOR;

	private MainFrame mf;
	private JPanel foodstartMenu;

	public foodStartMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.foodstartMenu = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/도시락게임배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 라벨에 타이틀로고 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/select/도시락만들기라벨.png"));
		logo.setBounds(0, 20, 740, 100);

		
		/* 게임시작 버튼 생성 */
		JButton startBtn = new JButton(new ImageIcon("images/select/홀짝게임시작버튼.png"));									
		startBtn.setBounds(277, 380, 190, 55);
		
		

		
		/* 게임시작 버튼 클릭 시 맵화면 패널로 변경*/
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodstartMenu, new MainMap(mf));
				System.out.println("게임시작 가능, 맵 화면 이동");
			}
		});

		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton(new ImageIcon("images/select/홀짝나가기버튼.png"));
		quitBtn.setBounds(277, 450, 190, 55);
		
		
		/* 나가기 버튼 클릭 시 시스템 종료*/	
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodstartMenu, new GameMenu(mf));
				System.out.println("GameMenu로 이동합니다.");

			}
		});
		
		
		/* 홀짝게임 랭킹 버튼 생성 */
		JButton payrankBtn = new JButton(new ImageIcon("images/select/홀짝게임랭킹.png"));
		payrankBtn.setBounds(550, 380, 150, 55);
		
		/* 홀짝게임 랭킹 버튼 클릭 시 게임랭킹 화면 패널로 변경 */
		payrankBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodstartMenu, new foodrank(mf));
				System.out.println("GameMenu로 이동합니다.");

			}
		});
		
		/* 홀짝게임 설명 버튼 생성 */
		JButton payexBtn = new JButton(new ImageIcon("images/select/홀짝게임설명.png"));
		payexBtn.setBounds(550, 450, 150, 55);
	
		/* 홀짝게임 설명 버튼 클릭 시 게임설명서 패널로 변경 */
		payexBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodstartMenu, new foodexPage(mf));
				System.out.println("홀짝게임 설명 페이지로 이동합니다.");

			}
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(logo);
		
		this.add(startBtn);
		this.add(quitBtn);
		this.add(payrankBtn);
		this.add(payexBtn);
		
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
		


}
