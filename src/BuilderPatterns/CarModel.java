package BuilderPatterns;

import java.util.ArrayList;

public abstract class CarModel {
	
	// 执行序列
	private ArrayList<String> sequnce = new ArrayList<String>();
	
	private final String CAR_START = "start"; 
	private final String CAR_STOP = "stop"; 
	private final String CAR_BOOM = "engineBoom"; 
	private final String CAR_ALARM = "alarm"; 
	
	// 车子启动
	public abstract void start();
	// 停止
	public abstract void stop();
	// 喇叭响
	public abstract void alarm();
	// 引擎轰鸣
	public abstract void engineBoom();
	
	/**
	 * 任意设置启动顺序
	 * @param seq
	 */
	public void setSequnce(ArrayList<String> seq){
		this.sequnce = seq;
	}
	
	
	/*
	 * 车子开跑,该函数为一个算法结构或者逻辑结构,与子类构成了模板方法模式
	 */ 
	public final void run(){
		
		for(int i=0; i<sequnce.size(); i++){
			String action = this.sequnce.get( i ) ;
			if( CAR_START.equals( action )){
				// 发动汽车
				this.start();
			}else if( CAR_BOOM.equals( action ) ){
				// 发动机轰鸣
				this.engineBoom();
			}else if( CAR_ALARM.equals( action ) ){
				// 响喇叭
				this.alarm();
			}else{
				// 停止运行
				this.stop();
			}
		}
	}
	
	/**
	 * 
	 * @param msg
	 */
	protected void println(String msg )
	{
		System.out.println( msg ) ;
	}
}
