package BuilderPatterns;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	private BenzModel m_benz = new BenzModel();
	
	/**
	 * 设置顺序,设置不同的零件等
	 */
	@Override
	public void setSequnce(ArrayList<String> seq) {
		m_benz.setSequnce(seq) ;
	}

	/**
	 * 获得奔驰车型
	 */
	@Override
	public CarModel getCarModel() {
		return m_benz;
	}

}
