package cn.zhanggn.zcms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllComments", query = "select myComment from Comment myComment"),
		@NamedQuery(name = "findCommentByArticleId", query = "select myComment from Comment myComment where myComment.articleId = ?1"),
		@NamedQuery(name = "findCommentByCheckState", query = "select myComment from Comment myComment where myComment.checkState = ?1"),
		@NamedQuery(name = "findCommentByContent", query = "select myComment from Comment myComment where myComment.content = ?1"),
		@NamedQuery(name = "findCommentById", query = "select myComment from Comment myComment where myComment.id = ?1"),
		@NamedQuery(name = "findCommentByPrimaryKey", query = "select myComment from Comment myComment where myComment.id = ?1"),
		@NamedQuery(name = "findCommentByReleaseDate", query = "select myComment from Comment myComment where myComment.releaseDate = ?1"),
		@NamedQuery(name = "findCommentByState", query = "select myComment from Comment myComment where myComment.state = ?1"),
		@NamedQuery(name = "findCommentByStateContaining", query = "select myComment from Comment myComment where myComment.state like ?1"),
		@NamedQuery(name = "findCommentBySysDate", query = "select myComment from Comment myComment where myComment.sysDate = ?1"),
		@NamedQuery(name = "findCommentByUserId", query = "select myComment from Comment myComment where myComment.userId = ?1") })
@Table(catalog = "zcms", name = "comment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Comment")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "content")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String content;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "release_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar releaseDate;
	/**
	 */

	@Column(name = "article_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer articleId;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer userId;
	/**
	 */

	@Column(name = "state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String state;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar sysDate;
	/**
	 */

	@Column(name = "check_state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer checkState;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 */
	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 */
	public Calendar getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	/**
	 */
	public Integer getArticleId() {
		return this.articleId;
	}

	/**
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 */
	public Integer getUserId() {
		return this.userId;
	}

	/**
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 */
	public String getState() {
		return this.state;
	}

	/**
	 */
	public void setSysDate(Calendar sysDate) {
		this.sysDate = sysDate;
	}

	/**
	 */
	public Calendar getSysDate() {
		return this.sysDate;
	}

	/**
	 */
	public void setCheckState(Integer checkState) {
		this.checkState = checkState;
	}

	/**
	 */
	public Integer getCheckState() {
		return this.checkState;
	}

	/**
	 */
	public Comment() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Comment that) {
		setId(that.getId());
		setContent(that.getContent());
		setReleaseDate(that.getReleaseDate());
		setArticleId(that.getArticleId());
		setUserId(that.getUserId());
		setState(that.getState());
		setSysDate(that.getSysDate());
		setCheckState(that.getCheckState());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("releaseDate=[").append(releaseDate).append("] ");
		buffer.append("articleId=[").append(articleId).append("] ");
		buffer.append("userId=[").append(userId).append("] ");
		buffer.append("state=[").append(state).append("] ");
		buffer.append("sysDate=[").append(sysDate).append("] ");
		buffer.append("checkState=[").append(checkState).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Comment))
			return false;
		Comment equalCheck = (Comment) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
