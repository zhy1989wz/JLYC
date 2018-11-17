package cn.com.widemex.examples.charts.view;

import java.util.ArrayList;
import java.util.List;

import cn.com.widemex.examples.charts.service.Chart1Service;
import cn.com.widemex.examples.charts.vo.Chart2Vo;
import cn.com.widemex.examples.domain.Rpttest;
import cn.com.widemex.framework.core.base.view.BaseView;
import cn.com.widemex.framework.core.base.view.BaseViewImpl;
import cn.com.widemex.framework.exception.QueryException;
import cn.com.widemex.framework.util.BeanHelper;
import cn.com.widemex.framework.util.JsonHelper;
import cn.com.widemex.framework.util.query.QueryParameters;
import cn.com.widemex.framework.util.vo.ResultVO;

/**
 * 文件名称：Chart2ViewImpl.java<br>
 * 文件描述：分组统计图演示<br>视图实现类<br>
 * 完成日期：2012-2-27<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
public class Chart2ViewImpl extends BaseViewImpl<Rpttest, Chart1Service> implements Chart2View{
	
	/**
	 * 查询<br>
	 * 按页返回JSON字符串
	 * @param query
	 * @return
	 * @throws QueryException
	 */
	@Override
	public String query(QueryParameters query) throws QueryException{
		//模拟数据
		List<Chart2Vo> list = new ArrayList<Chart2Vo>();
		for(int i=1; i<9; i++){
			list.add(new Chart2Vo(i+"", "日期", Math.random() * 1000, "用电电量", Math.random() * 1000, "产量产量", Math.random() * 1000, "单箱耗电"));
		}
		ResultVO page = new ResultVO();
		page.setTotal(31);
		page.setResults(list);
		return JsonHelper.exclude(page);
	}

	/**
	 * 测试
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		BaseView<?> view = (BaseView<?>) BeanHelper.get("chart2View");
		System.err.println(view.query());
	}
	
}
