package cn.com.widemex.examples.domain;

/**
 * ExampleTablechilds entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ExampleTablechilds implements java.io.Serializable {
	private static final long serialVersionUID = -7063500138289299953L;
	private String childid;
	private String name;

	// Constructors

	/** default constructor */
	public ExampleTablechilds() {
	}

	// Property accessors

	public String getChildid() {
		return this.childid;
	}

	public void setChildid(String childid) {
		this.childid = childid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}