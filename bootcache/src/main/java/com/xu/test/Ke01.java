package com.xu.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "KE01")

public class Ke01 {
	 @SuppressWarnings("unused")
		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    @SequenceGenerator(name = "menuSeq", initialValue = 1, allocationSize = 1, sequenceName = "HIBERNATE_SEQUENCE")
	    private Long baz751;

	    /**
	     * 操作序号
	     */
	    private Long baz002;

	    /**
	     * 计划名称
	     */
	    private String bze760;

	    /**
	     * 年
	     */
	    private Integer bze750;

	    /**
	     * 月
	     */
	    private Integer bze752;

	    /**
	     * 日
	     */
	    private Integer bze756;

	    /**
	     * 时
	     */
	    private Integer bze758;

	    /**
	     * 执行表达式
	     */
	    private String bze761;

	    /**
	     * 表达式说明
	     */
	    private String aae013;

	    /**
	     * 参数列表
	     */
	    private String bze762;

	    /**
	     * 开始时间
	     */
	    private Long bze763;

	    /**
	     * 时间间隔
	     */
	    private String bze765;

	    /**
	     * 指定数据延缓天数
	     */
	    private Integer bze787;

	    /**
	     * 下一次执行时间
	     */
	    private Long bze766;

	    /**
	     * 有效标志
	     */
	    private String aae100;

	    /**
	     * 创建人
	     */
	    private String bze011;

	    /**
	     * 创建时间
	     */
	    private Long bze036;

	    /**
	     * 经办人
	     */
	    private String aae011;

	    /**
	     * 经办时间
	     */
	    private Long aae036;

	    /**
	     * 经办机构编码
	     */
	    private String aab034;

	    /**
	     * 统筹区编码
	     */
	    private String aaa027;

	    /**
	     * 分钟
	     */
	    private Integer bze759;

	    /**
	     * 执行时间戳
	     */
	    private Long baz971;

	    /**
	     * 加入标志
	     */
	    private String bze785;

	    /**
	     * 配置标志
	     */
	    private String bze786;
	    
	    private String bkd221;

	    public String getBkd221() {
			return bkd221;
		}

		public void setBkd221(String bkd221) {
			this.bkd221 = bkd221;
		}

		public void setBaz751(Long baz751) {
	        this.baz751 = baz751;
	    }

	    public Long getBaz751() {
	        return baz751;
	    }

	    public void setBaz002(Long baz002) {
	        this.baz002 = baz002;
	    }

	    public Long getBaz002() {
	        return baz002;
	    }

	    public void setBze760(String bze760) {
	        this.bze760 = bze760;
	    }

	    public String getBze760() {
	        return bze760;
	    }

	    public void setBze750(Integer bze750) {
	        this.bze750 = bze750;
	    }

	    public Integer getBze750() {
	        return bze750;
	    }

	    public void setBze752(Integer bze752) {
	        this.bze752 = bze752;
	    }

	    public Integer getBze752() {
	        return bze752;
	    }

	    public void setBze756(Integer bze756) {
	        this.bze756 = bze756;
	    }

	    public Integer getBze756() {
	        return bze756;
	    }

	    public void setBze758(Integer bze758) {
	        this.bze758 = bze758;
	    }

	    public Integer getBze758() {
	        return bze758;
	    }

	    public void setBze761(String bze761) {
	        this.bze761 = bze761;
	    }

	    public String getBze761() {
	        return bze761;
	    }

	    public void setAae013(String aae013) {
	        this.aae013 = aae013;
	    }

	    public String getAae013() {
	        return aae013;
	    }

	    public void setBze762(String bze762) {
	        this.bze762 = bze762;
	    }

	    public String getBze762() {
	        return bze762;
	    }

	    public void setBze763(Long bze763) {
	        this.bze763 = bze763;
	    }

	    public Long getBze763() {
	        return bze763;
	    }

	    public void setBze765(String bze765) {
	        this.bze765 = bze765;
	    }

	    public String getBze765() {
	        return bze765;
	    }

	    public void setBze787(Integer bze787) {
	        this.bze787 = bze787;
	    }

	    public Integer getBze787() {
	        return bze787;
	    }

	    public void setBze766(Long bze766) {
	        this.bze766 = bze766;
	    }

	    public Long getBze766() {
	        return bze766;
	    }

	    public void setAae100(String aae100) {
	        this.aae100 = aae100;
	    }

	    public String getAae100() {
	        return aae100;
	    }

	    public void setBze011(String bze011) {
	        this.bze011 = bze011;
	    }

	    public String getBze011() {
	        return bze011;
	    }

	    public void setBze036(Long bze036) {
	        this.bze036 = bze036;
	    }

	    public Long getBze036() {
	        return bze036;
	    }

	    public void setAae011(String aae011) {
	        this.aae011 = aae011;
	    }

	    public String getAae011() {
	        return aae011;
	    }

	    public void setAae036(Long aae036) {
	        this.aae036 = aae036;
	    }

	    public Long getAae036() {
	        return aae036;
	    }

	    public void setAab034(String aab034) {
	        this.aab034 = aab034;
	    }

	    public String getAab034() {
	        return aab034;
	    }

	    public void setAaa027(String aaa027) {
	        this.aaa027 = aaa027;
	    }

	    public String getAaa027() {
	        return aaa027;
	    }

	    public void setBze759(Integer bze759) {
	        this.bze759 = bze759;
	    }

	    public Integer getBze759() {
	        return bze759;
	    }

	    public void setBaz971(Long baz971) {
	        this.baz971 = baz971;
	    }

	    public Long getBaz971() {
	        return baz971;
	    }

	    public void setBze785(String bze785) {
	        this.bze785 = bze785;
	    }

	    public String getBze785() {
	        return bze785;
	    }

	    public void setBze786(String bze786) {
	        this.bze786 = bze786;
	    }

	    public String getBze786() {
	        return bze786;
	    }
}
