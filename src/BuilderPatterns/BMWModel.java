package BuilderPatterns;

public class BMWModel extends CarModel {

	@Override
	public void alarm() {
		println( "宝马喇叭响了" );
	}

	@Override
	public void engineBoom(){
		println( "宝马引擎启动了" );
	}

	@Override
	public void start() {
		println( "宝马启动了" );
	}

	@Override
	public void stop() {
		println( "宝马停止了" );
	}
}
