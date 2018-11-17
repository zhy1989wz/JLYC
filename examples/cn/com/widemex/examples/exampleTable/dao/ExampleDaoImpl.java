package cn.com.widemex.examples.exampleTable.dao;

import cn.com.widemex.framework.core.cache.annotation.Cacheable;
import cn.com.widemex.framework.db.HibernateSupport;
import cn.com.widemex.examples.domain.ExampleTable;
import cn.com.widemex.examples.exampleTable.dao.ExampleDao;

/**
 * 文件名称：ExampleDaoImpl.java<br>
 * 文件描述：ExampleTable演示 DAO实现类<br>
 * 完成日期：2012-7-18<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
@Cacheable(disableCaching = true)
public class ExampleDaoImpl extends HibernateSupport<ExampleTable> implements
		ExampleDao {
}
