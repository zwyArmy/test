package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseModule<M extends BaseModule<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setDetail(java.lang.String detail) {
		set("detail", detail);
	}

	public java.lang.String getDetail() {
		return get("detail");
	}

	public void setTurn(java.lang.Integer turn) {
		set("turn", turn);
	}

	public java.lang.Integer getTurn() {
		return get("turn");
	}

}