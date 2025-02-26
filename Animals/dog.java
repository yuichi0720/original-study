package Animals;

//犬のクラス（animalクラスを継承）
class Dog extends Animal{
public Dog(String name, int age) {
	super(name,age);
}
	
@Override
public void speak() {
	System.out.println(getName() + "はワンワンと鳴いています");
}

}
