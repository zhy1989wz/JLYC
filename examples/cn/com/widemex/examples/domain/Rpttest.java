package cn.com.widemex.examples.domain;

import java.util.Date;

/**
 * Rpttest entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Rpttest implements java.io.Serializable {
	private static final long serialVersionUID = -3312985009475926825L;
	private String id;
	private Date createtime;
	private String a0;
	private String a1;
	private String a2;
	private Float a3;
	private Float a4;
	private Float a5;
	private Float a6;
	private Float a7;
	private String a8;
	private String a9;
	private Float a10;
	private Float a11;

	// Constructors

	/** default constructor */
	public Rpttest() {
	}

	/** full constructor */
	public Rpttest(Date createtime, String a0, String a1, String a2, Float a3,
			Float a4, Float a5, Float a6, Float a7, String a8, String a9,
			Float a10, Float a11) {
		this.createtime = createtime;
		this.a0 = a0;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.a5 = a5;
		this.a6 = a6;
		this.a7 = a7;
		this.a8 = a8;
		this.a9 = a9;
		this.a10 = a10;
		this.a11 = a11;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getA0() {
		return this.a0;
	}

	public void setA0(String a0) {
		this.a0 = a0;
	}

	public String getA1() {
		return this.a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return this.a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public Float getA3() {
		return this.a3;
	}

	public void setA3(Float a3) {
		this.a3 = a3;
	}

	public Float getA4() {
		return this.a4;
	}

	public void setA4(Float a4) {
		this.a4 = a4;
	}

	public Float getA5() {
		return this.a5;
	}

	public void setA5(Float a5) {
		this.a5 = a5;
	}

	public Float getA6() {
		return this.a6;
	}

	public void setA6(Float a6) {
		this.a6 = a6;
	}

	public Float getA7() {
		return this.a7;
	}

	public void setA7(Float a7) {
		this.a7 = a7;
	}

	public String getA8() {
		return this.a8;
	}

	public void setA8(String a8) {
		this.a8 = a8;
	}

	public String getA9() {
		return this.a9;
	}

	public void setA9(String a9) {
		this.a9 = a9;
	}

	public Float getA10() {
		return this.a10;
	}

	public void setA10(Float a10) {
		this.a10 = a10;
	}

	public Float getA11() {
		return this.a11;
	}

	public void setA11(Float a11) {
		this.a11 = a11;
	}

}