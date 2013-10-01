package AbstractFactory;

import Factory.Sender;

/**
 * 抽象工厂类
 * 
 * http://blog.csdn.net/zhangerqing/article/details/8194653
 * 备注: 
 *    如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，
 *    同时做一个工厂类，实现抽象类Factory，就OK了，无需去改动现成的代码。
 *    这样做，拓展性较好！
 * @author Mr-Simple
 *
 */
public abstract class Factory {
	public abstract Sender createSender();
}
