package BuilderPatterns;

import java.util.ArrayList;

public class Test {
	
	public static void main(String args[]){
		
		// 使用导演类生产特定型号车模
		Director director = new Director();
		
		for(int i=0; i<5; i++){
			// 奔驰车模A
			director.getBenzAModel().run();
		}
		
		for(int i=0; i<5; i++){
			// 宝马车模B
			director.getBmwAModel().run();
		}
		
		// 奔驰车模创建者,自定义顺序
		BenzBuilder benzBuilder = new BenzBuilder();
		ArrayList<String> seq = new ArrayList<String>();
		seq.add("alarm") ;
		seq.add("start") ;
		seq.add("stop") ;
		// 设置零件等
		benzBuilder.setSequnce(seq) ;
		// 执行
		benzBuilder.getCarModel().run();
	}

}
