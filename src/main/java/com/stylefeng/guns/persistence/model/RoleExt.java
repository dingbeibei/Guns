package com.stylefeng.guns.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author stylefeng
 * @since 2017-04-08
 */
@TableName("_role_ext")
public class RoleExt extends Model<RoleExt> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String userid;
	private String rolein;
	private String roleout;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRolein() {
		return rolein;
	}

	public void setRolein(String rolein) {
		this.rolein = rolein;
	}

	public String getRoleout() {
		return roleout;
	}

	public void setRoleout(String roleout) {
		this.roleout = roleout;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}