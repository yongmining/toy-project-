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


public class GameMenu extends JPanel {

	/* 전역변수에 컬러파레트 지정 */

	private MainFrame mf;
	private JPanel gameMenu;

	public GameMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.gameMenu = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon(""));
		background.setBounds(0, -15, 800, 580);

		/* 라벨에 타이틀로고 삽입 */
		JLabel logo = new JLabel(new ImageIcon(""));
		logo.setBounds(180, 90, 440, 160);


		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton("Quit");
		quitBtn.setBounds(305, 430, 190, 55);


		/* 나가기 버튼 클릭 시 시스템 종료*/
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(logo);
		this.add(quitBtn);

		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}


}
