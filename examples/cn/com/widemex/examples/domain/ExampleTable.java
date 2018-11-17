package cn.com.widemex.examples.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import cn.com.widemex.component.attachment.domain.AttachmentVb;

/**
 * ExampleTable entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ExampleTable implements java.io.Serializable {
	private static final long serialVersionUID = -517333686078328910L;
	private String id;
	private ExampleType exampleType;
	private String col1;
	private String col2;
	private Date modidate;
	private Long status;
	private Set<ExampleTable> exampleTables = new HashSet<ExampleTable>(0);
	private String pid;//
	private Set<ExampleTablechilds> exampleTableChilds = new HashSet<ExampleTablechilds>(0);
	private Double sum;
	private Double avg;
	//附件信息，查询用
	private Set<AttachmentVb> attachments = new HashSet<AttachmentVb>(0);
	/**
	 * 冗余设计
	 * 一次性保存多条数据时需要通过addNew属性来分辨是新增还是更新，否则默认为更新
	 */
	private boolean addNew;
	
	/** default constructor */
	public ExampleTable() {
	}

	/** minimal constructor */
	public ExampleTable(ExampleType exampleType, Date modidate, Long status) {
		this.exampleType = exampleType;
		this.modidate = modidate;
		this.status = status;
	}

	/** full constructor */
	public ExampleTable(ExampleType exampleType,
			String col1, String col2, Date modidate, Long status,
			Set<ExampleTable> exampleTables) {
		this.exampleType = exampleType;
		this.col1 = col1;
		this.col2 = col2;
		this.modidate = modidate;
		this.status = status;
		this.exampleTables = exampleTables;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ExampleType getExampleType() {
		return this.exampleType;
	}

	public void setExampleType(ExampleType exampleType) {
		this.exampleType = exampleType;
	}

	public String getCol1() {
		return this.col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return this.col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public Date getModidate() {
		return this.modidate;
	}

	public void setModidate(Date modidate) {
		this.modidate = modidate;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Set<ExampleTable> getExampleTables() {
		return this.exampleTables;
	}

	public void setExampleTables(Set<ExampleTable> exampleTables) {
		this.exampleTables = exampleTables;
	}
	
	/**
	 * @return the exampleTableChilds
	 */
	public Set<ExampleTablechilds> getExampleTableChilds() {
		return exampleTableChilds;
	}

	/**
	 * @param exampleTableChilds the exampleTableChilds to set
	 */
	public void setExampleTableChilds(Set<ExampleTablechilds> exampleTableChilds) {
		this.exampleTableChilds = exampleTableChilds;
	}

	////////////
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * @return the sum
	 */
	public Double getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(Double sum) {
		this.sum = sum;
	}

	/**
	 * @return the avg
	 */
	public Double getAvg() {
		return avg;
	}

	/**
	 * @param avg the avg to set
	 */
	public void setAvg(Double avg) {
		this.avg = avg;
	}

	/**
	 * @return the attachments
	 */
	public Set<AttachmentVb> getAttachments() {
		return attachments;
	}

	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(Set<AttachmentVb> attachments) {
		this.attachments = attachments;
	}

	/**
	 * @return the addNew
	 */
	public boolean isAddNew() {
		return addNew;
	}

	/**
	 * @param addNew the addNew to set
	 */
	public void setAddNew(boolean addNew) {
		this.addNew = addNew;
	}
	
}