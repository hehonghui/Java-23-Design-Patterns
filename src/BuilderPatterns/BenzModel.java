package BuilderPatterns;

public class BenzModel extends CarModel {

	@Override
	public void alarm() {
		println( "奔驰喇叭响了" );
	}

	@Override
	public void engineBoom(){
		println( "奔驰引擎启动了" );
	}

	@Override
	public void start() {
		println( "奔驰启动了" );
	}

	@Override
	public void stop() {
		println( "奔驰停止了" );
	}

}
