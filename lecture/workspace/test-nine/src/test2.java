import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*한개의 정수N를 입력받아 메소드에 매개변수로 입력하고,
		N >= 90 이면 A학점,
		N >= 80 이면 B 학점,
		N >= 70 이면 C 학점,
		N >= 60 이면 D 학점,
		N < 60 이면 E 학점 을 출력하시오.
		입력
		정수 한 개를 scanner로 입력받는다.
		출력
		A학점이면 A학점을 출력한다.
		입력 예시 
		90
		출력 예시
		A학점
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("로테이션 할 횟수를 입력해주세요>");
		int lotation = scan.nextInt();
		
		int[] arr = new int [5];
		
		for(int i = 0; i<5; i++) {  // 배열에 입력한 숫자를 저장한다.
			System.out.print("숫자를 입력해주세요>");
			int num = scan.nextInt();
			arr[i] = num;
		}
		
		for(int a = 0; a<lotation; a++) {
			
			int tmp = 0;
			for(int i = 0; i<5; i++) {
				if((i+1)==5) {
					/*tmp = arr[i];
				arr[i] = arr[0];    // 인덱스가 5인 경우 조치가 필요 없으므로 비워놨음.
				arr[0] = tmp;*/
				}else {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
				System.out.print(arr[i]);
			}
			System.out.println();
			
		}
		
		
	}


}
