package Animals;

// 実行するクラス
public class Main {
 public static void main(final String[] args) {
	 //動物を作成するメソッド化
     Animal[] animals = createAnimals();

     //動物の情報を表示するメソッド化
     showAnimal(animals);
 }

 // 動物を作成するメソッド（空文字や負の年齢もテスト）
 private static Animal[] createAnimals() {
     return new Animal[]{
         new Dog("ハチ", 5),
         new Cat("タマ", 3),
         new Dog("", 4),     // 空文字（エラー）
         new Cat("ミケ", -1)  // 負の年齢（エラー）
     };
 }

 // 動物の情報を表示するメソッド
 private static void showAnimal(Animal[] animals) {
     for (Animal animal : animals) {
         animal.introduce(); // 名前と年齢を表示
         animal.eat();       // 食事メソッドを表示
         animal.run();		 // 走るメソッドを表示
         animal.speak();	 // 鳴き声メソッドを表示
         
         System.out.println(); // 改行
     }
 }
}