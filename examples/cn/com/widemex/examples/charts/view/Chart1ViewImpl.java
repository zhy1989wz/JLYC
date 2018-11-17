package cn.com.widemex.examples.charts.view;

import cn.com.widemex.examples.charts.service.Chart1Service;
import cn.com.widemex.examples.domain.Rpttest;
import cn.com.widemex.framework.core.base.view.BaseView;
import cn.com.widemex.framework.core.base.view.BaseViewImpl;
import cn.com.widemex.framework.core.context.ajax.AjaxRequest;
import cn.com.widemex.framework.exception.QueryException;
import cn.com.widemex.framework.util.BeanHelper;
import cn.com.widemex.framework.util.query.QueryParameters;

/**
 * 文件名称：Chart1ViewImpl.java<br>
 * 文件描述：简单统计图演示<br>视图实现类<br>
 * 完成日期：2012-2-27<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
public class Chart1ViewImpl extends BaseViewImpl<Rpttest, Chart1Service> implements Chart1View{
	
	/**
	 * 查询<br>
	 * 按页返回JSON字符串
	 * @param request
	 * @param query
	 * @return
	 * @throws QueryException
	 */
	@Override
	public String query(AjaxRequest request, QueryParameters query) throws QueryException{
		if(request != null){
			System.err.println("指标周期: " + request.getParameter("指标周期") + "");
		}
		return super.query(query);
	}

	/**
	 * 测试
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		BaseView<?> view = (BaseView<?>) BeanHelper.get("chart1View");
		System.err.println(view.query());
	}
	
}
