package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReply<M extends BaseReply<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setTopicID(java.lang.Integer topicID) {
		set("topicID", topicID);
	}

	public java.lang.Integer getTopicID() {
		return get("topicID");
	}

	public void setPostID(java.lang.Integer postID) {
		set("postID", postID);
	}

	public java.lang.Integer getPostID() {
		return get("postID");
	}

	public void setUserID(java.lang.Integer userID) {
		set("userID", userID);
	}

	public java.lang.Integer getUserID() {
		return get("userID");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

}
