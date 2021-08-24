package sec08.stream_match;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 학생이 모두 9시에 출석했는지 검사하는 데 있어서 다음 조건을 충족하게 코딩하시오.
 * - Student 클래스를 내부클래스로 선언하라.
 * 		(attedTime 필드: LocalTime 형)
 * - Student 배열 학생 3명을 출석시간과 함께 저장하라.
 * - stream 으로 만들고 allMatch를 사용하여 검사하라.
 * - 모두 출석한 경우, 전원 출석, 아닌 경우 일부 지각 이라고 출력하라.
 * @author jhLee
 *
 */


public class Attendance {
	int a;
	@AllArgsConstructor 
	@Getter
	 class Student {
		LocalTime attendTime;
	}
	
	public static void main(String[] args) {
		var attend = new Attendance();
		Student[] students = {
				attend.new Student(LocalTime.of(8, 55)),
				attend.new Student(LocalTime.of(8, 40)),
				attend.new Student(LocalTime.of(9, 0)) };
		
		boolean allAttended = Arrays.stream(students)
				.allMatch(s ->
					s.getAttendTime()
					.isBefore(LocalTime.of(9, 11)));
		String msg = allAttended ? "모두 출석" : "일부 지각";
		int vol = allAttended ? 500 : -500;
		System.out.println(msg);
		System.out.println(vol);
	}


}
