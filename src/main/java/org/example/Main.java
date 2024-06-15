package org.example;

//生徒名みたいな文字列のリストを作ってください。
//リストの数は10個以上。
//リストに入っている文字数が3文字以上のものを表示する。
//このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけを表示する。
//
//Mapを作ってください。生徒名と番号の組み合わせ。（1:江並）みたいな。
//Mapの要素は10個以上。
//Mapの中の番号が偶数のものをMapから削除する。
//上記の処理を行う繰り返し処理を実装してください。
//削除した状態のものを出力して表示してください。

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    List<String> memberList = List.of("大野雄", "柳", "高橋宏", "小笠原", "松葉", "涌井", "梅津", "メヒア", "岡林", "高橋周", "村松", "田中", "中田", "細川");
    System.out.println("検索結果1");
    for(String member : memberList){
      if(member.length() >= 3){
        System.out.println(member);
      }
    }

    Map<Integer, String> memberMap = Map.of(1, "大島", 2, "田島", 3, "岩嵜", 4, "岡田", 5, "福永", 6, "ブライト", 7, "鵜飼", 8, "上林", 9, "斎藤", 10, "清水");
    System.out.println("\n検索結果2");
    for(Integer key : memberMap.keySet()){
      if(key % 2 == 0){
        System.out.println(memberMap.get(key));
      }
    }
  }
}
