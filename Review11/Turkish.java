package Review11;

public abstract class Turkish extends Human {

	String turkishId;
	public Turkish(String name, int age, int weight, String turkishId) {
		super(name, age, weight);
		this.turkishId=turkishId;
	}
}
