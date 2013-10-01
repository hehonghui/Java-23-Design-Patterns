package BuilderPatterns;

import java.util.ArrayList;

/**
 * 导演类,为各种顺序指定一个车型,这样根据具体的型号就可以生产出特定顺序的车模了
 * @author Mr-Simple
 *
 */
public class Director {
	private ArrayList<String> m_sequence = new ArrayList<String>();
	private BenzBuilder m_benzBuilder = new BenzBuilder();
	private BMWBuilder m_bmwBuilder = new BMWBuilder();
	
	/**
	 * 指定奔驰A模型只有启动和停止,没有其他的操作
	 * @return
	 */
	public BenzModel getBenzAModel(){
		this.m_sequence.clear() ;
		this.m_sequence.add("start");
		this.m_sequence.add("stop");
		// 设置顺序
		m_benzBuilder.setSequnce(m_sequence) ;
		return (BenzModel)m_benzBuilder.getCarModel() ;
	}
	
	/**
	 * 指定奔驰B模型
	 * @return
	 */
	public BenzModel getBenzBModel(){
		this.m_sequence.clear() ;
		this.m_sequence.add("engineBoom");
		this.m_sequence.add("start");
		this.m_sequence.add("stop");
		// 设置顺序
		m_benzBuilder.setSequnce(m_sequence) ;
		return (BenzModel)m_benzBuilder.getCarModel() ;
	}
	
	/**
	 * 获得宝马A车型的车模
	 * @return
	 */
	public BMWModel getBmwAModel(){
		this.m_sequence.add("start");
		this.m_sequence.add("engineBoom");
		this.m_sequence.add("stop");
		// 设置顺序
		m_bmwBuilder.setSequnce(m_sequence) ;
		return (BMWModel)m_bmwBuilder.getCarModel() ;
	}
}
