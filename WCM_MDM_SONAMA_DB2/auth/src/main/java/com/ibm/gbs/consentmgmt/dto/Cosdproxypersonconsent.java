/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

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

import com.ibm.gbs.util.Constant;
/**
 * Cosdproxypersonconsent generated by hbm2java
 */
@Entity
@Table(name = "cosdproxypersonconsent", schema = Constant.SCHEMANAME )
public class Cosdproxypersonconsent implements java.io.Serializable {

	private BigDecimal proxyconsentid;
	private Cosdpersonconsent cosdpersonconsent;
	private BigDecimal concernroleid;
	private Date startdate;
	private Date enddate;
	private String proxyconsentreason;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;

	public Cosdproxypersonconsent() {
	}

	public Cosdproxypersonconsent(BigDecimal proxyconsentid) {
		this.proxyconsentid = proxyconsentid;
	}

	public Cosdproxypersonconsent(BigDecimal proxyconsentid, Cosdpersonconsent cosdpersonconsent,
			BigDecimal concernroleid, Date startdate, Date enddate, String proxyconsentreason, String createdby,
			Date createdon, String lastupdatedby, Date lastupdatedon) {
		this.proxyconsentid = proxyconsentid;
		this.cosdpersonconsent = cosdpersonconsent;
		this.concernroleid = concernroleid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.proxyconsentreason = proxyconsentreason;
		this.createdby = createdby;
		this.createdon = createdon;
		this.lastupdatedby = lastupdatedby;
		this.lastupdatedon = lastupdatedon;
	}

	@Id

	@Column(name = "proxyconsentid", unique = true, nullable = false, scale = 0)
	public BigDecimal getProxyconsentid() {
		return this.proxyconsentid;
	}

	public void setProxyconsentid(BigDecimal proxyconsentid) {
		this.proxyconsentid = proxyconsentid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personconsentid")
	public Cosdpersonconsent getCosdpersonconsent() {
		return this.cosdpersonconsent;
	}

	public void setCosdpersonconsent(Cosdpersonconsent cosdpersonconsent) {
		this.cosdpersonconsent = cosdpersonconsent;
	}

	@Column(name = "concernroleid", scale = 0)
	public BigDecimal getConcernroleid() {
		return this.concernroleid;
	}

	public void setConcernroleid(BigDecimal concernroleid) {
		this.concernroleid = concernroleid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "startdate", length = 13)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "enddate", length = 13)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(name = "proxyconsentreason", length = 500)
	public String getProxyconsentreason() {
		return this.proxyconsentreason;
	}

	public void setProxyconsentreason(String proxyconsentreason) {
		this.proxyconsentreason = proxyconsentreason;
	}

	@Column(name = "createdby", length = 64)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createdon", length = 13)
	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	@Column(name = "lastupdatedby", length = 64)
	public String getLastupdatedby() {
		return this.lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "lastupdatedon", length = 13)
	public Date getLastupdatedon() {
		return this.lastupdatedon;
	}

	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

}
