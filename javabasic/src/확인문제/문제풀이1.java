package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 1. 입력
		// 오늘은 무슨 요일인가요? 월요일
		// 수업 끝나고 무엇을 하실 예정인가요? 놀기
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String plan = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");

		// 2. 처리
		// 오늘 월요일에 수업 후 나는 놀기 할 예정
		String result = "오늘 " + day + "에 수업 후 나는 " + plan + " 할 예정";

		// 3. 출력
		System.out.println(result);

	}

}
