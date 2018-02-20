# JavaReadCsvFile
csvファイルの読み込み

## 処理
csv形式の入力ファイルをカンマ区切りで取り込み、出力します。

## コード
```
public class sample3 {
  public static void main(String[] args) {
    for(int seireki = 1926; seireki <= 1935; seireki++) {
      System.out.print("西暦" + seireki + "年は");
      int syowa = seireki - 1925;
      System.out.println("昭和" + syowa + "年です");
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
