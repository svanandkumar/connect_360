/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.auth.model;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ibm.gbs.util.Constant;

/**
 * Securityrole generated by hbm2java
 */
@Entity
@Table(name = "securityrole", schema = Constant.SCHEMANAME )
public class Securityrole implements java.io.Serializable {

	private String rolename;
	private Date lastwritten;
	private Set<Cosdauthorizationgroup> cosdauthorizationgroups = new HashSet<Cosdauthorizationgroup>(0);

	public Securityrole() {
	}

	public Securityrole(String rolename) {
		this.rolename = rolename;
	}

	public Securityrole(String rolename, Date lastwritten, Set<Cosdauthorizationgroup> cosdauthorizationgroups) {
		this.rolename = rolename;
		this.lastwritten = lastwritten;
		this.cosdauthorizationgroups = cosdauthorizationgroups;
	}

	@Id
	@Column(name = "rolename", unique = true, nullable = false, length = 50)
	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "lastwritten", length = 13)
	public Date getLastwritten() {
		return this.lastwritten;
	}

	public void setLastwritten(Date lastwritten) {
		this.lastwritten = lastwritten;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "securityrole")
	public Set<Cosdauthorizationgroup> getCosdauthorizationgroups() {
		return this.cosdauthorizationgroups;
	}

	public void setCosdauthorizationgroups(Set<Cosdauthorizationgroup> cosdauthorizationgroups) {
		this.cosdauthorizationgroups = cosdauthorizationgroups;
	}

}
