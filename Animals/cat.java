package Animals;

//猫のクラス（animalクラスを継承）
class Cat extends Animal{
public Cat(String name, int age) {
	super(name,age);
}
	
@Override
public void speak() {
	System.out.println(getName() + "はニャーニャーと鳴いています");
}

}