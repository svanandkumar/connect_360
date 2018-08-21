package com.ibm.wcm.ods.dto;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InitloadClientDisabilitySrc generated by hbm2java
 */
import com.ibm.gbs.util.Constant; 
@Entity
@Table(schema = Constant.SCHEMANAME_ODS , name = "INITLOAD_CLIENT_DISABILITY_SRC")
public class InitloadClientDisabilitySrc implements java.io.Serializable {

	private BigDecimal clientDisabilitySeqNum;
	private InitloadClientSrc initloadClientSrc;
	private String disabilityName;
	private String caseId;
	private Date disabilityStartDate;
	private Date disabilityEndDate;

	public InitloadClientDisabilitySrc() {
	}

	public InitloadClientDisabilitySrc(BigDecimal clientDisabilitySeqNum, InitloadClientSrc initloadClientSrc,
			String disabilityName) {
		this.clientDisabilitySeqNum = clientDisabilitySeqNum;
		this.initloadClientSrc = initloadClientSrc;
		this.disabilityName = disabilityName;
	}

	public InitloadClientDisabilitySrc(BigDecimal clientDisabilitySeqNum, InitloadClientSrc initloadClientSrc,
			String disabilityName, String caseId, Date disabilityStartDate, Date disabilityEndDate) {
		this.clientDisabilitySeqNum = clientDisabilitySeqNum;
		this.initloadClientSrc = initloadClientSrc;
		this.disabilityName = disabilityName;
		this.caseId = caseId;
		this.disabilityStartDate = disabilityStartDate;
		this.disabilityEndDate = disabilityEndDate;
	}

	@Id

	@Column(name = "CLIENT_DISABILITY_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientDisabilitySeqNum() {
		return this.clientDisabilitySeqNum;
	}

	public void setClientDisabilitySeqNum(BigDecimal clientDisabilitySeqNum) {
		this.clientDisabilitySeqNum = clientDisabilitySeqNum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_TRANSACTION_SEQ_NUM", nullable = false)
	public InitloadClientSrc getInitloadClientSrc() {
		return this.initloadClientSrc;
	}

	public void setInitloadClientSrc(InitloadClientSrc initloadClientSrc) {
		this.initloadClientSrc = initloadClientSrc;
	}

	@Column(name = "DISABILITY_NAME", nullable = false, length = 60)
	public String getDisabilityName() {
		return this.disabilityName;
	}

	public void setDisabilityName(String disabilityName) {
		this.disabilityName = disabilityName;
	}

	@Column(name = "CASE_ID", length = 60)
	public String getCaseId() {
		return this.caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DISABILITY_START_DATE", length = 10)
	public Date getDisabilityStartDate() {
		return this.disabilityStartDate;
	}

	public void setDisabilityStartDate(Date disabilityStartDate) {
		this.disabilityStartDate = disabilityStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DISABILITY_END_DATE", length = 10)
	public Date getDisabilityEndDate() {
		return this.disabilityEndDate;
	}

	public void setDisabilityEndDate(Date disabilityEndDate) {
		this.disabilityEndDate = disabilityEndDate;
	}

}
