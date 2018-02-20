# JavaReadCsvFile
csvファイルの読み込み

## 処理
csv形式の入力ファイルをカンマ区切りで取り込み、出力します。

## コード
```
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class sample15 {

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
```

## 入力
```sample.csv
"東京都","埼玉県","千葉県"  
"群馬県","茨木県","栃木県"  
```

## 出力結果
```
"東京都"  
"埼玉県"  
"千葉県"  
"群馬県"  
"茨木県"  
"栃木県" 
``````
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
