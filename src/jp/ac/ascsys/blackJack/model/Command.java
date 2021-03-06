package jp.ac.ascsys.blackJack.model;
/**
 * プレイヤーやディーラがBet後のゲーム中に行える操作
 * (ディーラー一部不可、選択不可)
 * HIT			手札にカード1枚追加
 * STAND		カード追加を終了し現在の手札で勝負
 * DOUBLE		掛け金を倍にして３枚目を引くこと、それ以上カードは引けない
 * ■■■■■■■■■　　　　　今後の追加要素　　　　　■■■■■■■■■
 * SPLIT		最初に同じカードの場合、手札を分割しかけられる。ただし、
 * 				分けた手札にはそれぞれをカードを追加。
 *				かけた金額と同じ掛け金が必要。
 * INSURANCE	ディーラーに配られた1枚目のカードがAだった場合、
 * 				ディーラーがブラックジャックであることに対して保険を
 * 				賭けることができる。
 * 				保険金の額は最初の賭け金の半額である。
 * 				ディーラーがブラックジャックであった場合、
 * 				最初の賭け金は失うが保険金の2倍の金額を受け取ることができる。
 */
public enum Command {HIT,STAND,DOUBLE,SPLIT,INSURANCE
}
