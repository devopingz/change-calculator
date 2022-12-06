package calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class machine extends JFrame{
	
	machine(){
	
		setTitle("자판기");   //제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		Container c = getContentPane();  //컨텐트팬 만들기
		JPanel p = new JPanel();   //패널 p생성
		JPanel p1 = new JPanel();  //버튼을 추가할 패널p1생성
		JPanel p2 = new JPanel();  //넣은금액과 텍스트필드를 추가할 패널p2생성
		JPanel p3 = new JPanel();  //오만원~1원까지 텍스트필드를 추가할 패널p3생성
		
		JLabel la1 = new JLabel("넣은 금액");  //레이블 9개 생성
		JLabel la2 = new JLabel("오만원"); 
		JLabel la3 = new JLabel("만원"); 
		JLabel la4 = new JLabel("천원");  
		JLabel la5 = new JLabel("500원");  
		JLabel la6 = new JLabel("100원");  
		JLabel la7 = new JLabel("50원");  
		JLabel la8 = new JLabel("10원");
		JLabel la9 = new JLabel("1원");  // 레이블 9개생성
		
		JTextField field1 = new JTextField(12);  //텍스트필드 9개 생성
		JTextField field2 = new JTextField(6);
		JTextField field3 = new JTextField(6);
		JTextField field4 = new JTextField(6);
		JTextField field5 = new JTextField(6);
		JTextField field6 = new JTextField(6);
		JTextField field7 = new JTextField(6);
		JTextField field8 = new JTextField(6);
		JTextField field9 = new JTextField(6);  //텍스트필드 9개생성
		
		JButton b1 = new JButton("Coke-1000");  //Coke-1000 버튼 생성
		b1.addActionListener(new ActionListener() {  //익명클래스 action 이벤트
			public void actionPerformed(ActionEvent e) {
				
				JButton b = (JButton)e.getSource();   
				if(b.getText().equals("Coke-1000")) {  //누른버튼이 Coke-1000 일경우
					
					String name = field1.getText();  //name에 금액 대입
					int money = Integer.parseInt(name)-1000;  //name을 정수형으로 바꾼후 1000을빼고 money에 대입
					
					field2.setText("          "+money/50000);  //오만원 텍스트필드에 거스름 출력
					money = money - 50000 * (money/50000);
						
					field3.setText("          "+money/10000);  //만원 텍스트필드에 거스름 출력
					money = money - 10000 * (money/10000);
						
					field4.setText("          "+money/1000);  //천원 텍스트필드에 거스름 출력
					money = money - 1000 * (money/1000);
						
					field5.setText("          "+money/500);  //500원 텍스트필드에 거스름 출력
					money = money - 500 * (money/500);
						
					field6.setText("          "+money/100);  //100원 텍스트필드에 거스름 출력
					money = money - 100 * (money/100);
						
					field7.setText("          "+money/50);  //50원 텍스트필드에 거스름 출력
					money = money - 50 * (money/50);
						
					field8.setText("          "+money/10);  //10원 텍스트필드에 거스름 출력
					money = money - 10 * (money/10); 
						
					field9.setText("          "+money/1);	//1원 텍스트필드에 거스름 출력			
				}			
			}			
		});
		
		JButton b2 = new JButton("Pepsi-800");  //Pepsi-800버튼 생성
		b2.addActionListener(new ActionListener() {  //익명클래스 action 이벤트
			public void actionPerformed(ActionEvent e) {
				
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Pepsi-800")) {  //누른버튼이 Pepsi-800 일경우
					
					String name = field1.getText();   //name에 금액 대입
					int money = Integer.parseInt(name)-800;  //name을 정수형으로 바꾼후 800을빼고 money에 대입
					
					field2.setText("          "+money/50000);  //오만원 텍스트필드에 거스름 출력
					money = money - 50000 * (money/50000);
						
					field3.setText("          "+money/10000);  //만원 텍스트필드에 거스름 출력
					money = money - 10000 * (money/10000);
						
					field4.setText("          "+money/1000);  //천원 텍스트필드에 거스름 출력
					money = money - 1000 * (money/1000);
						
					field5.setText("          "+money/500);  //500원 텍스트필드에 거스름 출력
					money = money - 500 * (money/500);
						
					field6.setText("          "+money/100);  //100원 텍스트필드에 거스름 출력
					money = money - 100 * (money/100);
						
					field7.setText("          "+money/50);  //50원 텍스트필드에 거스름 출력
					money = money - 50 * (money/50);
						
					field8.setText("          "+money/10);  //10원 텍스트필드에 거스름 출력
					money = money - 10 * (money/10); 
						
					field9.setText("          "+money/1);	//1원 텍스트필드에 거스름 출력						
				}			
			}			
		});
		
		JButton b3 = new JButton("Juice-1200");  //Juice-1200버튼 생성
		b3.addActionListener(new ActionListener() {   //익명클래스 action 이벤트
			public void actionPerformed(ActionEvent e) {
				
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Juice-1200")) {  //누른버튼이 Juice-1200 일경우
					
					String name = field1.getText();
					int money = Integer.parseInt(name)-1200;  //name을 정수형으로 바꾼후 1200을빼고 money에 대입
					
					field2.setText("          "+money/50000);  //오만원 텍스트필드에 거스름 출력
					money = money - 50000 * (money/50000);
						
					field3.setText("          "+money/10000);  //만원 텍스트필드에 거스름 출력
					money = money - 10000 * (money/10000);
						
					field4.setText("          "+money/1000);  //천원 텍스트필드에 거스름 출력
					money = money - 1000 * (money/1000);
						
					field5.setText("          "+money/500);  //500원 텍스트필드에 거스름 출력
					money = money - 500 * (money/500);
						
					field6.setText("          "+money/100);  //100원 텍스트필드에 거스름 출력
					money = money - 100 * (money/100);
						
					field7.setText("          "+money/50);  //50원 텍스트필드에 거스름 출력
					money = money - 50 * (money/50);
						
					field8.setText("          "+money/10);  //10원 텍스트필드에 거스름 출력
					money = money - 10 * (money/10); 
						
					field9.setText("          "+money/1);	//1원 텍스트필드에 거스름 출력							
				}			
			}			
		});
				
		add(p); p.add(p1); p.add(p2); p.add(p3);  //패널p추가, 패널p에 패널p1,p2,p3 추가
		p.setLayout(new FlowLayout());  //패널p을 FlowLayout으로설정
		p1.add(b1); p1.add(b2); p1.add(b3);  //패널p1에 버튼b1,버튼b2,버튼b3 추가
		p1.setLayout(new FlowLayout());  //패널p1을 FlowLayout으로설정
		p2.add(la1); p2.add(field1);    //패널p2에 레이블 "넣은 금액"과 텍스트필드 추가
		p2.setLayout(new FlowLayout());  //패널p2을 FlowLayout으로 설정
		p3.add(la2); p3.add(field2);    //패널p3에 레이블 "오만원"과 텍스트필드 추가
		p3.add(la3); p3.add(field3);	//패널p3에 레이블 "만원"과 텍스트필드 추가
		p3.add(la4); p3.add(field4);	//패널p3에 레이블 "천원"과 텍스트필드 추가
		p3.add(la5); p3.add(field5);	//패널p3에 레이블 "500원"과 텍스트필드 추가
		p3.add(la6); p3.add(field6);	//패널p3에 레이블 "100원"과 텍스트필드 추가
		p3.add(la7); p3.add(field7);	//패널p3에 레이블 "50원"과 텍스트필드 추가
		p3.add(la8); p3.add(field8);	//패널p3에 레이블 "10원"과 텍스트필드 추가
		p3.add(la9); p3.add(field9);	//패널p3에 레이블 "1원"과 텍스트필드 추가
		p3.setLayout(new GridLayout(8,2)); //패널p3을 GridLayout(행8,열2)으로 설정
		setSize(370,310);  //크기설정
		setVisible(true);  //보이기
	}
}

public class cal {

	public static void main(String[] args) {
		
		new machine(); //생성
	}

}
