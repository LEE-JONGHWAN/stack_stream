package sec06.stream_sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor @Getter @ToString
public class ElecUnit implements Comparable<ElecUnit>{
	String partNo;
	Double price;
	
	
	public static void main(String[] args) {
		
		List<ElecUnit> eUstr = Arrays.asList(
				new ElecUnit("P123", 3_000_000.0),
				new ElecUnit("P723", 2_000_000.0),
				new ElecUnit("P523", 5_000_000.0));
		eUstr.stream()
			.sorted()
			.forEach(System.out::println);
	}


	@Override
	public int compareTo(ElecUnit o) {
		return price.compareTo(o.getPrice());
	}

}
