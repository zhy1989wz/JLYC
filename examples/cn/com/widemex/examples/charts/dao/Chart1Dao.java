package cn.com.widemex.examples.charts.dao;

import cn.com.widemex.framework.core.base.dao.BaseDao;
import cn.com.widemex.framework.exception.QueryException;
import cn.com.widemex.examples.domain.Rpttest;

/**
 * 简单统计图
 * DAO接口
 * @author 何启伟
 * @since 2010-7-12
 * @version ExtFw3.0
 *
 */
public interface Chart1Dao extends BaseDao<Rpttest>{
	
	/**
	 * 列表
	 * @param start
	 * @param limit
	 * @param where
	 * @param params
	 * @return {JsonString}
	 * @throws QueryException
	 */
	public String query(int start, int limit, String where, Object... params) throws QueryException;
}
