package com.greedy.paygame.view;



import static com.greedy.common.constant.changePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.pages.memberRank;


public class GameMenu extends JPanel {

	/* 전역변수에 컬러파레트 지정 */

	private MainFrame mf;
	private JPanel gameMenu;

	public GameMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.gameMenu = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/게임메인배경.png"));
		background.setBounds(0, 0, 740, 620);

		
		/* 도시락게임 들어가기 버튼 생성 */
		JButton foodBtn = new JButton(new ImageIcon("images/select/도시락게임들어가기버튼.png"));
		foodBtn.setBounds(10, 350, 190, 45);


		
		/* 도시락게임 들어가기 버튼 클릭 시 시스템 종료*/
		foodBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new foodStartMenu(mf));
				System.out.println("도시락게임 화면으로 이동합니다.");
			}
		});
		
		/* 홀짝게임 들어가기 버튼 생성 */
		JButton payBtn = new JButton(new ImageIcon("images/select/홀짝게임들어가기버튼.png"));
		payBtn.setBounds(560, 350, 160, 45);


		
		/* 홀짝게임 들어가기 버튼 클릭 시 시스템 종료*/
		payBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new payStartMenu(mf));
				System.out.println("홀짝게임 화면으로 이동합니다.");
			}
		});
		
		/* 전체랭킹 버튼 생성 */
		JButton rankBtn = new JButton(new ImageIcon("images/select/전체랭킹버튼.png"));
		rankBtn.setBounds(600, 30, 100, 45);


		
		/* 전체랭킹 들어가기 버튼 클릭 시 시스템 종료*/
		rankBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new memberRank(mf));
				System.out.println("전체랭킹 화면으로 이동합니다.");
			}
		});
		
		
		
		
		/* 뒤로가기 버튼 생성 */
		JButton quitBtn = new JButton(new ImageIcon("images/select/뒤로가기버튼.png"));
		quitBtn.setBounds(40, 520, 115, 45);
		
		/* 뒤로가기 버튼 클릭 시 시스템 종료*/
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new payStartMenu(mf));
				System.out.println("로그인화면으로 이동합니다.");
			}
			
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(payBtn);
		this.add(quitBtn);
		this.add(foodBtn);
		this.add(rankBtn);
		this.add(background);
		
		
		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}


}
