package sec06.stream_sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NoCommaEnd {
	static boolean first = true;
	
	
	public static void main(String[] args) {
	var values = new int[] {5, 3, 2, 1, 4};
	
	Arrays.stream(values).sorted().forEach(n -> {
		if (first) { // static field , 초기값: false
			first = false;
			System.out.print(n); // 1 (first output)
		} else 
			System.out.print("," + n); // (rest output)
	});
	System.out.println();
	
	
	Arrays.sort(values);
	System.out.print(values[0]);
	IntStream.range(1, values.length).map(i->values[i])
		// values[1] ~ values[4] 출력.
		.forEach(v->System.out.print("," + v));
	System.out.println();
	}
}
