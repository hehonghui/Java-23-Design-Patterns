package BuilderPatterns;

import java.util.ArrayList;

public abstract class CarBuilder {
	// 设置模型的执行顺序,设置不同的零件等
	public abstract void setSequnce(ArrayList<String> seq);
	// 返回建造的模型
	public abstract CarModel getCarModel();
}
