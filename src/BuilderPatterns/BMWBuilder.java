package BuilderPatterns;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	private BMWModel m_bmw = new BMWModel();
	
	/**
	 * 设置顺序
	 */
	@Override
	public void setSequnce(ArrayList<String> seq) {
		m_bmw.setSequnce(seq) ;

	}

	/**
	 * 获得宝马车
	 */
	@Override
	public CarModel getCarModel() {
		return m_bmw;
	}

}
