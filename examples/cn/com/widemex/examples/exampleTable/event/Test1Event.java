package cn.com.widemex.examples.exampleTable.event;

import cn.com.widemex.framework.core.base.event.BaseEventDelete;
import cn.com.widemex.framework.core.base.event.BaseEventExecute;
import cn.com.widemex.framework.core.base.event.BaseEventInsert;
import cn.com.widemex.framework.core.base.event.BaseEventUpdate;
import cn.com.widemex.framework.logging.WideLogger;

/**
 * 文件名称：Test1Event.java<br>
 * 文件描述：演示事件<br>
 * 完成日期：2012-2-28<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
public class Test1Event implements BaseEventInsert, BaseEventUpdate, BaseEventDelete, BaseEventExecute {
	/**
	 * 日志
	 */
	protected final WideLogger logger = WideLogger.getLogger(this.getClass());
	
	/**
	 * 删除前<br>
	 * 特指delete*方法
	 * @param methodName
	 * @param args
	 */
	public void beforeDelete(String methodName, Object[] args){
		logger.info("beforeDelete...");
	}

	/**
	 * 删除后<br>
	 * 特指delete*方法
	 * @param methodName
	 * @param returnValue
	 * @param args
	 */
	public void afterDelete(String methodName, Object returnValue, Object[] args){
		logger.info("afterDelete..." + "，returnValue：" + returnValue);
	}

	/**
	 * 插入前<br>
	 * 特指insert*方法
	 * @param methodName
	 * @param args
	 */
	public void beforeInsert(String methodName, Object[] args){
		logger.info("beforeInsert...");
	}

	/**
	 * 插入后<br>
	 * 特指insert*方法
	 * @param methodName
	 * @param returnValue
	 * @param args
	 */
	public void afterInsert(String methodName, Object returnValue, Object[] args){
		logger.info("afterInsert..." + "，returnValue：" + returnValue);
	}

	/**
	 * 更新前<br>
	 * 特指update*方法
	 * @param methodName
	 * @param args
	 */
	public void beforeUpdate(String methodName, Object[] args){
		logger.info("beforeUpdate...");
	}

	/**
	 * 更新后<br>
	 * 特指update*方法
	 * @param methodName
	 * @param returnValue
	 * @param args
	 */
	public void afterUpdate(String methodName, Object returnValue, Object[] args){
		logger.info("afterUpdate..." + "，returnValue：" + returnValue);
	}

	/**
	 * 其他执行前<br>
	 * 特指execute*方法
	 * @param methodName
	 * @param args
	 */
	public void beforeExecute(String methodName, Object[] args) {
	}
	
	/**
	 * 其他执行后<br>
	 * 特指execute*方法
	 * @param methodName
	 * @param returnValue
	 * @param args
	 */
	public void afterExecute(String methodName, Object returnValue, Object[] args) {
	}
}
