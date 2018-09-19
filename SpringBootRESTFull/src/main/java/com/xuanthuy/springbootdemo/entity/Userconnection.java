package com.xuanthuy.springbootdemo.entity;
// Generated Sep 3, 2018 3:46:46 AM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userconnection generated by hbm2java
 */
@Entity
@Table(name = "userconnection", catalog = "bank")
public class Userconnection implements java.io.Serializable {

	private String userid;
	private String providerid;
	private String provideruserid;
	private int rank;
	private String displayname;
	private String profileurl;
	private String imageurl;
	private String accesstoken;
	private String secret;
	private String refreshtoken;
	private String expiretime;

	public Userconnection() {
	}

	public Userconnection(String userid, String providerid, String provideruserid, int rank) {
		this.userid = userid;
		this.providerid = providerid;
		this.provideruserid = provideruserid;
		this.rank = rank;
	}

	public Userconnection(String userid, String providerid, String provideruserid, int rank, String displayname,
			String profileurl, String imageurl, String accesstoken, String secret, String refreshtoken,
			String expiretime) {
		this.userid = userid;
		this.providerid = providerid;
		this.provideruserid = provideruserid;
		this.rank = rank;
		this.displayname = displayname;
		this.profileurl = profileurl;
		this.imageurl = imageurl;
		this.accesstoken = accesstoken;
		this.secret = secret;
		this.refreshtoken = refreshtoken;
		this.expiretime = expiretime;
	}

	@Id

	@Column(name = "Userid", unique = true, nullable = false)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "Providerid", nullable = false)
	public String getProviderid() {
		return this.providerid;
	}

	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}

	@Column(name = "Provideruserid", nullable = false)
	public String getProvideruserid() {
		return this.provideruserid;
	}

	public void setProvideruserid(String provideruserid) {
		this.provideruserid = provideruserid;
	}

	@Column(name = "Rank", nullable = false)
	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Column(name = "Displayname")
	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	@Column(name = "Profileurl", length = 512)
	public String getProfileurl() {
		return this.profileurl;
	}

	public void setProfileurl(String profileurl) {
		this.profileurl = profileurl;
	}

	@Column(name = "Imageurl", length = 512)
	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Column(name = "Accesstoken", length = 512)
	public String getAccesstoken() {
		return this.accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	@Column(name = "Secret", length = 512)
	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Column(name = "Refreshtoken", length = 512)
	public String getRefreshtoken() {
		return this.refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

	@Column(name = "Expiretime", length = 16777215)
	public String getExpiretime() {
		return this.expiretime;
	}

	public void setExpiretime(String expiretime) {
		this.expiretime = expiretime;
	}

}
