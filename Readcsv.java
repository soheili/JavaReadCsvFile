/**
 *
 * @author xekid78
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readcsv {

	public static void main(String[] args) {
		try {
			File f = new File("csv/sample.csv");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String line;
			// 1行ずつCSVファイルを読み込む
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				for (String elem : data) {
					System.out.println(elem);
		        }
			}
			br.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
