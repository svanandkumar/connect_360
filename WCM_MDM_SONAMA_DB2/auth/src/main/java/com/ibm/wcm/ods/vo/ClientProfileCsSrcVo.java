package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_CS_SRC")
public class ClientProfileCsSrcVo  {   // implements  java.io.Serializable {

	private BigDecimal clientProfileCsSeqNum;
	private String clientId;
	private String sourceSystemId;
	private String chldSupCasePayee;
	private String chldSupCasePayor;
	private String absntParentName;
	private String absntParentRel;
	private Date processTs;

	public ClientProfileCsSrcVo() {
	}

	public ClientProfileCsSrcVo(BigDecimal clientProfileCsSeqNum) {
		this.clientProfileCsSeqNum = clientProfileCsSeqNum;
	}

	public ClientProfileCsSrcVo(BigDecimal clientProfileCsSeqNum, String clientId, String sourceSystemId,
			String chldSupCasePayee, String chldSupCasePayor, String absntParentName, String absntParentRel,
			Date processTs) {
		this.clientProfileCsSeqNum = clientProfileCsSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.chldSupCasePayee = chldSupCasePayee;
		this.chldSupCasePayor = chldSupCasePayor;
		this.absntParentName = absntParentName;
		this.absntParentRel = absntParentRel;
		this.processTs = processTs;
	}

	//  @Id

	//  @Column(name = "CLIENT_PROFILE_CS_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfileCsSeqNum() {
		return this.clientProfileCsSeqNum;
	}

	public void setClientProfileCsSeqNum(BigDecimal clientProfileCsSeqNum) {
		this.clientProfileCsSeqNum = clientProfileCsSeqNum;
	}

	//  @Column(name = "CLIENT_ID", length = 60)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	//  @Column(name = "SOURCE_SYSTEM_ID", length = 40)
	public String getSourceSystemId() {
		return this.sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	//  @Column(name = "CHLD_SUP_CASE_PAYEE", length = 50)
	public String getChldSupCasePayee() {
		return this.chldSupCasePayee;
	}

	public void setChldSupCasePayee(String chldSupCasePayee) {
		this.chldSupCasePayee = chldSupCasePayee;
	}

	//  @Column(name = "CHLD_SUP_CASE_PAYOR", length = 100)
	public String getChldSupCasePayor() {
		return this.chldSupCasePayor;
	}

	public void setChldSupCasePayor(String chldSupCasePayor) {
		this.chldSupCasePayor = chldSupCasePayor;
	}

	//  @Column(name = "ABSNT_PARENT_NAME", length = 50)
	public String getAbsntParentName() {
		return this.absntParentName;
	}

	public void setAbsntParentName(String absntParentName) {
		this.absntParentName = absntParentName;
	}

	//  @Column(name = "ABSNT_PARENT_REL", length = 25)
	public String getAbsntParentRel() {
		return this.absntParentRel;
	}

	public void setAbsntParentRel(String absntParentRel) {
		this.absntParentRel = absntParentRel;
	}

	//  @Temporal(TemporalType.TIMESTAMP)
	//  @Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

}
