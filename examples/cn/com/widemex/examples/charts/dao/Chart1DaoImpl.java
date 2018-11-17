package cn.com.widemex.examples.charts.dao;

import cn.com.widemex.framework.db.HibernateSupport;
import cn.com.widemex.framework.exception.QueryException;
import cn.com.widemex.framework.util.JsonHelper;
import cn.com.widemex.framework.util.vo.ResultVO;
import cn.com.widemex.examples.domain.Rpttest;

/**
 * 简单统计图
 * DAO实现类
 * @author 何启伟
 * @since 2010-7-12
 * @version ExtFw3.0
 *
 */
public class Chart1DaoImpl extends HibernateSupport<Rpttest> implements Chart1Dao{

	/**
	 * 列表
	 * @param start
	 * @param limit
	 * @param where
	 * @param params
	 * @return {JsonString}
	 * @throws QueryException
	 */
	public String query(int start, int limit, String where, Object... params) throws QueryException{
		//如果没有查询参数，则返回空
		ResultVO page = this.pagedQuery(start, limit, where, params);
		String str = JsonHelper.exclude(page);
		return str;
	}
}
