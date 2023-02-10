package 복습;


public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 이미 값을 알고 있는 경우
		String[] hobby = { "게임", "운동", "영화", "독서", "등산" };
		// hobby : 참조형변수, 주소가 들어있음
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[4]);
		System.out.println(hobby[hobby.length - 1]);
		// c타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + ": " + hobby[i]);
		}

		// for-each문: 알아서 처음부터 인덱스를 하나씩 증가하면서
		// 하나씩 꺼내온다
		// 출력용!
		for (String x : hobby) {
			System.out.println(x);
		}

		// 2. 값을 모르고 있는 경우, 공간부터 만들어 주자.
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페 사장";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[jobs.length - 1]);
		for (String y : jobs) {
			System.out.println(y);
		}

	}

}
