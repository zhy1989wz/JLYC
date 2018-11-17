package cn.com.widemex.examples.domain;

/**
 * ExampleType entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ExampleType implements java.io.Serializable {
	private static final long serialVersionUID = -2018928274777991353L;
	private String id;
	private String name;
	private String code;

	// Constructors

	/** default constructor */
	public ExampleType() {
	}

	/** full constructor */
	public ExampleType(String name, String code) {
		this.name = name;
		this.code = code;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}