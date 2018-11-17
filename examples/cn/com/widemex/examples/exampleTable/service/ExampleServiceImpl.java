package cn.com.widemex.examples.exampleTable.service;

import java.io.Serializable;
import java.util.Set;

import cn.com.widemex.framework.core.base.service.BaseServiceImpl;
import cn.com.widemex.framework.exception.DeleteException;
import cn.com.widemex.framework.exception.InsertException;
import cn.com.widemex.framework.exception.UpdateException;
import cn.com.widemex.component.attachment.domain.AttachmentVb;
import cn.com.widemex.component.attachment.feature.AttachmentFeature;
import cn.com.widemex.component.attachment.util.AttachmentHelper;
import cn.com.widemex.component.docconverter.util.DocConverterHelper;
import cn.com.widemex.examples.exampleTable.dao.ExampleDao;
import cn.com.widemex.examples.exampleTable.service.ExampleService;
//import cn.com.widemex.examples.otherDB.dao.OtherDBDao;
import cn.com.widemex.examples.domain.ExampleTable;

/**
 * 文件名称：ExampleServiceImpl.java<br>
 * 文件描述：ExampleTable演示<br>服务实现类<br>
 * 完成日期：2012-2-23<br>
 * 适用框架：ExtJs Framework v4.0<br>
 * 作者：何启伟<br>
 */
public class ExampleServiceImpl extends BaseServiceImpl<ExampleTable, ExampleDao> implements ExampleService{
	
	/**
	 * 删除
	 * @param vo
	 * @return
	 * @throws DeleteException
	 */
    public boolean delete(ExampleTable[] vs) throws DeleteException{
    	//删除数据
    	boolean success = this.getBaseDao().deleteAll(vs);
    	//删除附件信息
    	for(ExampleTable vo : vs){
    		AttachmentHelper.delete(vo.getId());
    	}
    	return success;
    }
    
	/**
	 * 插入
	 * @param vo
	 * @return
	 * @throws InsertException
	 */
    public Serializable insert(ExampleTable vo) throws InsertException{
    	//插入数据
    	Serializable id = this.getBaseDao().insert(vo);
    	//更新附件信息
    	AttachmentHelper.update(id, vo.getAttachments(), AttachmentFeature.EXAMPLE_TABLE_XGFJ);
		//打印附件HTML
//		this.printHTML(vo.getAttachments());
    	return id;
    }
    
	/**
	 * 更新
	 * @param vo
	 * @return
	 * @throws UpdateException
	 */
    public Serializable update(ExampleTable vo) throws UpdateException{
    	Serializable id = vo.getId();
    	//更新数据
    	super.update(vo);
    	//更新附件信息
    	AttachmentHelper.update(id, vo.getAttachments(), AttachmentFeature.EXAMPLE_TABLE_XGFJ);
//    	if(vo.getAttachments() != null){
//        	for(AttachmentVb attachment : vo.getAttachments()){
//        		DocConverterHelper.toHTML(attachment);
//        	}
//    	}
		//打印附件HTML
//		this.printHTML(vo.getAttachments());
    	return id;
    }
    
	/**
	 * 打印附件HTML
	 * @param attachments
	 */
	private void printHTML(Set<AttachmentVb> attachments){
		//得到附件信息
		String html = null;
		for(AttachmentVb attachment : attachments){
			if(attachment.isDelete()){
				continue;
			}
			//得到HTML
			html = attachment.getFileName() + "\n" + DocConverterHelper.getHTML(attachment, true);
			break;
		}
		System.err.println("HTML:\n" + html);
	}
}
