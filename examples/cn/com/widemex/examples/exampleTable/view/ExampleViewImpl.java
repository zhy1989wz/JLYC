package cn.com.widemex.examples.exampleTable.view;

import java.io.Serializable;

import cn.com.widemex.examples.domain.ExampleTable;
import cn.com.widemex.examples.exampleTable.service.ExampleService;
import cn.com.widemex.framework.core.base.view.BaseViewImpl;
import cn.com.widemex.framework.exception.DeleteException;
import cn.com.widemex.framework.exception.InsertException;
import cn.com.widemex.framework.exception.QueryException;
import cn.com.widemex.framework.exception.UpdateException;
import cn.com.widemex.framework.util.BeanHelper;
import cn.com.widemex.framework.util.JsonHelper;
import cn.com.widemex.framework.util.query.QueryParameters;

/**
 * 文件名称：ExampleViewImpl.java<br>
 * 文件描述：演示<br>
 * 视图实现类<br>
 * 完成日期：2012-2-24<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
public class ExampleViewImpl extends BaseViewImpl<ExampleTable, ExampleService>
		implements ExampleView {
	/**
	 * 查询<br>
	 * 按页返回JSON字符串
	 * 
	 * @param query
	 * @return
	 * @throws QueryException
	 */
	@Override
	public String query(QueryParameters query) throws QueryException {
		// 强制延时加载
		query.setLazyLoading(true);
		// 排除结果集中不需要的属性
		// query.setResultExcludeProperties("exampleTables", "exampleTableChilds");
		// 导入结果集中需要的属性
		query.setResultIncludeProperties(
				// 以类名.属性的方式指定主表（ExampleTable）需要导入的属性
				"ExampleTable.id", "ExampleTable.col1", "ExampleTable.col2",
				"ExampleTable.modidate", "ExampleTable.status",
				"ExampleTable.pid", "ExampleTable.sum", "ExampleTable.avg",
				// 导入子表（ExampleType）属性
				"ExampleTable.exampleType",
				// 以类名.属性的方式指定子表（ExampleType）需要导入的属性
				"ExampleType.id", "ExampleType.name",
				
				// 导入子表（AttachmentVb）属性
				"ExampleTable.attachments",
				// 以类名.属性的方式指定子表（ExampleType）需要导入的属性
				"AttachmentVb.tmId", "AttachmentVb.fileId",
				"AttachmentVb.fileName", "AttachmentVb.fileType",
				"AttachmentVb.fileSize", "AttachmentVb.fileDir"
		);
		// 调用父类查询方法
		return super.query(query);

		// 调用自定义服务类查询接口
		// ResultVO result = this.getBaseService().query(query.getStart(),
		// query.getLimit(), query.getParameters(), query.getSorts());
		// //序列化结果集
		// String jsonStr = JsonHelper.include(result, ...);
		// return jsonStr;
	}

	/**
	 * 删除
	 * 
	 * @param vs
	 * @return
	 * @throws DeleteException
	 */
	@Override
	public boolean delete(ExampleTable[] vs) throws DeleteException {
		// 调用父类删除方法
		// return super.delete(vs);
		// 调用自定义服务类删除接口
		return this.getBaseService().delete(vs);
	}

	/**
	 * 修改
	 * 
	 * @param vo
	 * @return
	 * @throws UpdateException
	 */
	@Override
	public String update(ExampleTable vo) throws UpdateException {
		// 打印前台传过来的值,测试用
		BeanHelper.printValues(vo);
		// 调用父类修改方法
		// return super.update(vo);
		// 调用自定义服务类修改接口
		// 更新成功后返回ID
		Serializable id = this.getBaseService().update(vo);
		// 以JSON形式返回保存结果，前台需将JsonString解析成对象
		return JsonHelper.formatResult(id, true);
	}

	/**
	 * 新增
	 * 
	 * @param vo
	 * @return
	 * @throws InsertException
	 */
	@Override
	public String insert(ExampleTable vo) throws InsertException {
		// 打印前台传过来的值,测试用
		BeanHelper.printValues(vo);
		// 调用父类新增方法
		// return super.insert(vo);
		// 调用自定义服务类新增接口
		// 更新成功后返回ID
		Serializable id = this.getBaseService().insert(vo);
		// 以JSON形式返回保存结果，前台需将JsonString解析成对象
		return JsonHelper.formatResult(id, true);
	}

	/**
	 * 测试
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ExampleViewImpl view = (ExampleViewImpl) BeanHelper.get("exampleView");
		// ExampleServiceImpl srv = (ExampleServiceImpl) view.getBaseService();
		// System.err.println(srv.getBaseDao().get("402881682a4b1cc5012a4b8f55c70002"));
		// ExampleType type = new ExampleType();
		// type.setId("2222222222");
		// ExampleTable vo = new ExampleTable();
		// vo.setCol1("AAA");
		// vo.setCol2("BBB");
		// vo.setExampleType(type);
		// vo.setModidate(new Date());
		// vo.setPid("0");
		// vo.setStatus(TypeHelper.toLong("1"));
		System.err.println(view.query());
		// System.err.println(view.delete("123"));
		// System.err.println(view.insert(vo));
		// System.err.println(view.insert(new ExampleTable()));
		// System.err.println(view.update(vo));

		// System.err.println(BeanHelper.invokeMethod(view, "insert", new
		// Object[]{vo}, new Class<?>[]{Object.class}));

	}
}
