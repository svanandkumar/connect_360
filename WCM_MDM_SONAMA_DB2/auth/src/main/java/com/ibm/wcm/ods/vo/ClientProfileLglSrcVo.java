package com.ibm.wcm.ods.vo;
// Generated May 31, 2018 4:53:55 PM by Hibernate Tools 5.2.6.Final

import java.math.BigDecimal;
import java.util.Date; 
//  @Entity
//  @Table(schema = Constant.SCHEMANAME_ODS , name = "CLIENT_PROFILE_LGL_SRC")
public class ClientProfileLglSrcVo  {   // implements  java.io.Serializable {

	private BigDecimal clientProfileLglSeqNum;
	private String clientId;
	private String sourceSystemId;
	private String hasPwrOfAttrny;
	private String lglGrdianFirstName;
	private String lglGrdianLastName;
	private String lglGrdianRel;
	private String pwrOfAttrnyName;
	private Date processTs;
	private String guardian;
	private String conservator;
	private String conservatorRel;
	private String decisionMaker;
	private String decisionMakerRel;
	private String conservatorStatus;
	private String primaryCareGiver;
	private String authRep;

	public ClientProfileLglSrcVo() {
	}

	public ClientProfileLglSrcVo(BigDecimal clientProfileLglSeqNum, String clientId, String sourceSystemId) {
		this.clientProfileLglSeqNum = clientProfileLglSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
	}

	public ClientProfileLglSrcVo(BigDecimal clientProfileLglSeqNum, String clientId, String sourceSystemId,
			String hasPwrOfAttrny, String lglGrdianFirstName, String lglGrdianLastName, String lglGrdianRel,
			String pwrOfAttrnyName, Date processTs, String guardian, String conservator, String conservatorRel,
			String decisionMaker, String decisionMakerRel, String conservatorStatus, String primaryCareGiver,
			String authRep) {
		this.clientProfileLglSeqNum = clientProfileLglSeqNum;
		this.clientId = clientId;
		this.sourceSystemId = sourceSystemId;
		this.hasPwrOfAttrny = hasPwrOfAttrny;
		this.lglGrdianFirstName = lglGrdianFirstName;
		this.lglGrdianLastName = lglGrdianLastName;
		this.lglGrdianRel = lglGrdianRel;
		this.pwrOfAttrnyName = pwrOfAttrnyName;
		this.processTs = processTs;
		this.guardian = guardian;
		this.conservator = conservator;
		this.conservatorRel = conservatorRel;
		this.decisionMaker = decisionMaker;
		this.decisionMakerRel = decisionMakerRel;
		this.conservatorStatus = conservatorStatus;
		this.primaryCareGiver = primaryCareGiver;
		this.authRep = authRep;
	}

	//  @Id

	//  @Column(name = "CLIENT_PROFILE_LGL_SEQ_NUM", unique = true, nullable = false, precision = 31, scale = 0)
	public BigDecimal getClientProfileLglSeqNum() {
		return this.clientProfileLglSeqNum;
	}

	public void setClientProfileLglSeqNum(BigDecimal clientProfileLglSeqNum) {
		this.clientProfileLglSeqNum = clientProfileLglSeqNum;
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

	//  @Column(name = "HAS_PWR_OF_ATTRNY", length = 10)
	public String getHasPwrOfAttrny() {
		return this.hasPwrOfAttrny;
	}

	public void setHasPwrOfAttrny(String hasPwrOfAttrny) {
		this.hasPwrOfAttrny = hasPwrOfAttrny;
	}

	//  @Column(name = "LGL_GRDIAN_FIRST_NAME", length = 64)
	public String getLglGrdianFirstName() {
		return this.lglGrdianFirstName;
	}

	public void setLglGrdianFirstName(String lglGrdianFirstName) {
		this.lglGrdianFirstName = lglGrdianFirstName;
	}

	//  @Column(name = "LGL_GRDIAN_LAST_NAME", length = 64)
	public String getLglGrdianLastName() {
		return this.lglGrdianLastName;
	}

	public void setLglGrdianLastName(String lglGrdianLastName) {
		this.lglGrdianLastName = lglGrdianLastName;
	}

	//  @Column(name = "LGL_GRDIAN_REL", length = 256)
	public String getLglGrdianRel() {
		return this.lglGrdianRel;
	}

	public void setLglGrdianRel(String lglGrdianRel) {
		this.lglGrdianRel = lglGrdianRel;
	}

	//  @Column(name = "PWR_OF_ATTRNY_NAME", length = 100)
	public String getPwrOfAttrnyName() {
		return this.pwrOfAttrnyName;
	}

	public void setPwrOfAttrnyName(String pwrOfAttrnyName) {
		this.pwrOfAttrnyName = pwrOfAttrnyName;
	}

	//  @Temporal(TemporalType.TIMESTAMP)
	//  @Column(name = "PROCESS_TS", length = 26)
	public Date getProcessTs() {
		return this.processTs;
	}

	public void setProcessTs(Date processTs) {
		this.processTs = processTs;
	}

	//  @Column(name = "GUARDIAN", length = 200)
	public String getGuardian() {
		return this.guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}

	//  @Column(name = "CONSERVATOR", length = 60)
	public String getConservator() {
		return this.conservator;
	}

	public void setConservator(String conservator) {
		this.conservator = conservator;
	}

	//  @Column(name = "CONSERVATOR_REL", length = 60)
	public String getConservatorRel() {
		return this.conservatorRel;
	}

	public void setConservatorRel(String conservatorRel) {
		this.conservatorRel = conservatorRel;
	}

	//  @Column(name = "DECISION_MAKER", length = 60)
	public String getDecisionMaker() {
		return this.decisionMaker;
	}

	public void setDecisionMaker(String decisionMaker) {
		this.decisionMaker = decisionMaker;
	}

	//  @Column(name = "DECISION_MAKER_REL", length = 60)
	public String getDecisionMakerRel() {
		return this.decisionMakerRel;
	}

	public void setDecisionMakerRel(String decisionMakerRel) {
		this.decisionMakerRel = decisionMakerRel;
	}

	//  @Column(name = "CONSERVATOR_STATUS", length = 60)
	public String getConservatorStatus() {
		return this.conservatorStatus;
	}

	public void setConservatorStatus(String conservatorStatus) {
		this.conservatorStatus = conservatorStatus;
	}

	//  @Column(name = "PRIMARY_CARE_GIVER", length = 60)
	public String getPrimaryCareGiver() {
		return this.primaryCareGiver;
	}

	public void setPrimaryCareGiver(String primaryCareGiver) {
		this.primaryCareGiver = primaryCareGiver;
	}

	//  @Column(name = "AUTH_REP", length = 50)
	public String getAuthRep() {
		return this.authRep;
	}

	public void setAuthRep(String authRep) {
		this.authRep = authRep;
	}

}
