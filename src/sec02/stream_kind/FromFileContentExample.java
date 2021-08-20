package sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/sec02/stream_kind/linedata.txt");
		
		//Files.lines() 메소드 이용
		try(Stream<String> stream = Files.lines(path, Charset.defaultCharset())) {
		stream.forEach( System.out :: println );
		System.out.println();
		}
		//BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		try (FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
			Stream<String>	stream2 = br.lines()) {
		stream2.forEach( System.out :: println );
			}

	}
}
