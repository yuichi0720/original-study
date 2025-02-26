package Animals;

//親クラス
public class Animal {
	private String name;//名前
	private int age;//年齢
	
	//コンストラクタ　(名前と年齢を設定する)
	public Animal(String name, int age) {
		setName(name);	//バリデーション
		setAge(age);	//バリデーション
	}
	
	//名前をセットする
	public void setName(String name) {
		//.trim(前後の空白を削除).isEmpty(空白かどうかをチェック)
		//名前が空かスペースだけならエラーが出す
		if (name == null || name.trim().isEmpty()) {
			System.out.println("error: 名前を入力してください");
		}
		else {
			this.name = name;
		}
	}
	
	//年齢をセットsる
	public void setAge(int age) {
		//数値が0以下ならエラーを出す
		if (age < 0) {
			System.out.println("error: 不適切な数値です。年齢を０以上にして下さい");
		}
		else {
			this.age = age;
		}
		
	}
	
	// 名前を取得する
    public String getName() {
        return name;
    }

    // 年齢を取得する
    public int getAge() {
        return age;
    }
	
	//動物紹介メソッド
	public void introduce() {
		System.out.println("この子の名前は:" + name + "です。" + "/年齢は:" + age + "歳です");
	}
	
	//食事メソッド
	public void eat() {
		System.out.println(name + "はご飯を食べています");
	}
	
	//走るメソッド
	public void run() {
        System.out.println(name + " は走っています！");
    }
	
	//鳴き声のメソッド
	public void speak() {
		System.out.println(getName() + "が鳴いています");
	}
	
	
}
