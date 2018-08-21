package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClientProfileFnclSrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_FNCL_SRC")
public class ClientProfileFnclSrc  {   // implements  java.io.Serializable {

	private BigDecimal clientProfileFnclSeqNum;
	private String clientId;
	private String sourceSystemId;
	private String financialInstName;
	private String monthlyIncome;
	private String incomeSource;
	private String assetSource;
	private String totalAssets;
	private Date processTs;
	private BigDecimal assets;
	private BigDecimal annualIncome;
	private BigDecimal hsholdIncome;
	private String monthlyIncome2;
	private String incomeSource2;

	public ClientProfileFnclSrc() {
	}

	public ClientProfileFnclSrc(BigDecimal clientProfileFnclSeqNum, String clientId, String sourceSystemId) {
		this.clientProfileFnclSeqNum = clientProfileFnclSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
	}

	public ClientProfileFnclSrc(BigDecimal clientProfileFnclSeqNum, String clientId, String sourceSystemId,
			String financialInstName, String monthlyIncome, String incomeSource, String assetSource, String totalAssets,
			Date processTs, BigDecimal assets, BigDecimal annualIncome, BigDecimal hsholdIncome, String monthlyIncome2,
			String incomeSource2) {
		this.clientProfileFnclSeqNum = clientProfileFnclSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.financialInstName = financialInstName;
		this.monthlyIncome = monthlyIncome;
		this.incomeSource = incomeSource;
		this.assetSource = assetSource;
		this.totalAssets = totalAssets;
		this.processTs = processTs;
		this.assets = assets;
		this.annualIncome = annualIncome;
		this.hsholdIncome = hsholdIncome;
		this.monthlyIncome2 = monthlyIncome2;
		this.incomeSource2 = incomeSource2;
	}

	//  @Id

	//  @Column(name = "CLIENT_PROFILE_FNCL_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfileFnclSeqNum() {
		return this.clientProfileFnclSeqNum;
	}

	public void setClientProfileFnclSeqNum(BigDecimal clientProfileFnclSeqNum) {
		this.clientProfileFnclSeqNum = clientProfileFnclSeqNum;
	}

	//  @Column(name = "CLIENT_ID", nullable = false, length = 60)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	//  @Column(name = "SOURCE_SYSTEM_ID", nullable = false, length = 40)
	public String getSourceSystemId() {
		return this.sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	//  @Column(name = "FINANCIAL_INST_NAME", length = 80)
	public String getFinancialInstName() {
		return this.financialInstName;
	}

	public void setFinancialInstName(String financialInstName) {
		this.financialInstName = financialInstName;
	}

	//  @Column(name = "MONTHLY_INCOME", length = 100)
	public String getMonthlyIncome() {
		return this.monthlyIncome;
	}

	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	//  @Column(name = "INCOME_SOURCE", length = 100)
	public String getIncomeSource() {
		return this.incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	//  @Column(name = "ASSET_SOURCE", length = 100)
	public String getAssetSource() {
		return this.assetSource;
	}

	public void setAssetSource(String assetSource) {
		this.assetSource = assetSource;
	}

	//  @Column(name = "TOTAL_ASSETS", length = 100)
	public String getTotalAssets() {
		return this.totalAssets;
	}

	public void setTotalAssets(String totalAssets) {
		this.totalAssets = totalAssets;
	}

	//  @Temporal(TemporalType.TIMESTAMP)
	//  @Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

	//  @Column(name = "ASSETS", scale = 4)
	public BigDecimal getAssets() {
		return this.assets;
	}

	public void setAssets(BigDecimal assets) {
		this.assets = assets;
	}

	//  @Column(name = "ANNUAL_INCOME", scale = 4)
	public BigDecimal getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(BigDecimal annualIncome) {
		this.annualIncome = annualIncome;
	}

	//  @Column(name = "HSHOLD_INCOME", scale = 4)
	public BigDecimal getHsholdIncome() {
		return this.hsholdIncome;
	}

	public void setHsholdIncome(BigDecimal hsholdIncome) {
		this.hsholdIncome = hsholdIncome;
	}

	//  @Column(name = "MONTHLY_INCOME2", length = 75)
	public String getMonthlyIncome2() {
		return this.monthlyIncome2;
	}

	public void setMonthlyIncome2(String monthlyIncome2) {
		this.monthlyIncome2 = monthlyIncome2;
	}

	//  @Column(name = "INCOME_SOURCE2", length = 200)
	public String getIncomeSource2() {
		return this.incomeSource2;
	}

	public void setIncomeSource2(String incomeSource2) {
		this.incomeSource2 = incomeSource2;
	}

}
