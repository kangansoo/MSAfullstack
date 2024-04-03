package com.kosa.swingexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorldSwing {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		// 프레임 생성 및 타이틀 설정
		JFrame frame = new JFrame("Hello World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);

		// 버튼 생성 및 액션 리스너 추가
		JButton btn = new JButton("Say 'Hello World'");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World!");
				
			}
		});
		
//		위의 함수를 람다 표현식을 통해 단축할 수 있음.
//		btn.addActionListener(e-> System.out.println("Hello World!"));

		// 버튼을 프레임에 추가
		frame.getContentPane().add(btn);

		// 프레임을 화면에 표시
		frame.setVisible(true);
	}
}
