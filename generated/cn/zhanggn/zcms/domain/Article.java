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
		@NamedQuery(name = "findAllArticles", query = "select myArticle from Article myArticle"),
		@NamedQuery(name = "findArticleByAuthor", query = "select myArticle from Article myArticle where myArticle.author = ?1"),
		@NamedQuery(name = "findArticleByAuthorContaining", query = "select myArticle from Article myArticle where myArticle.author like ?1"),
		@NamedQuery(name = "findArticleByChannelId", query = "select myArticle from Article myArticle where myArticle.channelId = ?1"),
		@NamedQuery(name = "findArticleByCheckDate", query = "select myArticle from Article myArticle where myArticle.checkDate = ?1"),
		@NamedQuery(name = "findArticleByCheckState", query = "select myArticle from Article myArticle where myArticle.checkState = ?1"),
		@NamedQuery(name = "findArticleByCommentCount", query = "select myArticle from Article myArticle where myArticle.commentCount = ?1"),
		@NamedQuery(name = "findArticleByCommentState", query = "select myArticle from Article myArticle where myArticle.commentState = ?1"),
		@NamedQuery(name = "findArticleByCommentStateContaining", query = "select myArticle from Article myArticle where myArticle.commentState like ?1"),
		@NamedQuery(name = "findArticleByContent", query = "select myArticle from Article myArticle where myArticle.content = ?1"),
		@NamedQuery(name = "findArticleByContentImg", query = "select myArticle from Article myArticle where myArticle.contentImg = ?1"),
		@NamedQuery(name = "findArticleByContentImgContaining", query = "select myArticle from Article myArticle where myArticle.contentImg like ?1"),
		@NamedQuery(name = "findArticleByDisableDate", query = "select myArticle from Article myArticle where myArticle.disableDate = ?1"),
		@NamedQuery(name = "findArticleByGroupId", query = "select myArticle from Article myArticle where myArticle.groupId = ?1"),
		@NamedQuery(name = "findArticleById", query = "select myArticle from Article myArticle where myArticle.id = ?1"),
		@NamedQuery(name = "findArticleByOrigin", query = "select myArticle from Article myArticle where myArticle.origin = ?1"),
		@NamedQuery(name = "findArticleByOriginContaining", query = "select myArticle from Article myArticle where myArticle.origin like ?1"),
		@NamedQuery(name = "findArticleByPrimaryKey", query = "select myArticle from Article myArticle where myArticle.id = ?1"),
		@NamedQuery(name = "findArticleByRecommendLevel", query = "select myArticle from Article myArticle where myArticle.recommendLevel = ?1"),
		@NamedQuery(name = "findArticleByRelatedId", query = "select myArticle from Article myArticle where myArticle.relatedId = ?1"),
		@NamedQuery(name = "findArticleByRelatedIdContaining", query = "select myArticle from Article myArticle where myArticle.relatedId like ?1"),
		@NamedQuery(name = "findArticleByReleaseDate", query = "select myArticle from Article myArticle where myArticle.releaseDate = ?1"),
		@NamedQuery(name = "findArticleByReleaseDateContaining", query = "select myArticle from Article myArticle where myArticle.releaseDate like ?1"),
		@NamedQuery(name = "findArticleByReleaseSysDate", query = "select myArticle from Article myArticle where myArticle.releaseSysDate = ?1"),
		@NamedQuery(name = "findArticleBySummary", query = "select myArticle from Article myArticle where myArticle.summary = ?1"),
		@NamedQuery(name = "findArticleBySummaryContaining", query = "select myArticle from Article myArticle where myArticle.summary like ?1"),
		@NamedQuery(name = "findArticleBySysDate", query = "select myArticle from Article myArticle where myArticle.sysDate = ?1"),
		@NamedQuery(name = "findArticleByTags", query = "select myArticle from Article myArticle where myArticle.tags = ?1"),
		@NamedQuery(name = "findArticleByTagsContaining", query = "select myArticle from Article myArticle where myArticle.tags like ?1"),
		@NamedQuery(name = "findArticleByTitle", query = "select myArticle from Article myArticle where myArticle.title = ?1"),
		@NamedQuery(name = "findArticleByTitleContaining", query = "select myArticle from Article myArticle where myArticle.title like ?1"),
		@NamedQuery(name = "findArticleByTitleImg", query = "select myArticle from Article myArticle where myArticle.titleImg = ?1"),
		@NamedQuery(name = "findArticleByTitleImgContaining", query = "select myArticle from Article myArticle where myArticle.titleImg like ?1"),
		@NamedQuery(name = "findArticleByUserId", query = "select myArticle from Article myArticle where myArticle.userId = ?1"),
		@NamedQuery(name = "findArticleByVisitTotal", query = "select myArticle from Article myArticle where myArticle.visitTotal = ?1") })
@Table(catalog = "zcms", name = "article")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "zcms3/cn/zhanggn/zcms/domain", name = "Article")
public class Article implements Serializable {
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

	@Column(name = "author", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String author;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "check_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar checkDate;
	/**
	 */

	@Column(name = "check_state")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer checkState;
	/**
	 */

	@Column(name = "comment_count")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer commentCount;
	/**
	 */

	@Column(name = "comment_state", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String commentState;
	/**
	 */

	@Column(name = "content")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	String content;
	/**
	 */

	@Column(name = "content_img", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contentImg;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "disable_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar disableDate;
	/**
	 */

	@Column(name = "origin", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String origin;
	/**
	 */

	@Column(name = "recommend_level")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer recommendLevel;
	/**
	 */

	@Column(name = "related_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String relatedId;
	/**
	 */

	@Column(name = "release_date", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String releaseDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "release_sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar releaseSysDate;
	/**
	 */

	@Column(name = "summary", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String summary;
	/**
	 */

	@Column(name = "tags", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String tags;
	/**
	 */

	@Column(name = "title", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String title;
	/**
	 */

	@Column(name = "title_img", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String titleImg;
	/**
	 */

	@Column(name = "visit_total")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer visitTotal;
	/**
	 */

	@Column(name = "channel_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer channelId;
	/**
	 */

	@Column(name = "group_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer groupId;
	/**
	 */

	@Column(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer userId;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sys_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar sysDate;

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
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 */
	public String getAuthor() {
		return this.author;
	}

	/**
	 */
	public void setCheckDate(Calendar checkDate) {
		this.checkDate = checkDate;
	}

	/**
	 */
	public Calendar getCheckDate() {
		return this.checkDate;
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
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	/**
	 */
	public Integer getCommentCount() {
		return this.commentCount;
	}

	/**
	 */
	public void setCommentState(String commentState) {
		this.commentState = commentState;
	}

	/**
	 */
	public String getCommentState() {
		return this.commentState;
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
	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	/**
	 */
	public String getContentImg() {
		return this.contentImg;
	}

	/**
	 */
	public void setDisableDate(Calendar disableDate) {
		this.disableDate = disableDate;
	}

	/**
	 */
	public Calendar getDisableDate() {
		return this.disableDate;
	}

	/**
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 */
	public String getOrigin() {
		return this.origin;
	}

	/**
	 */
	public void setRecommendLevel(Integer recommendLevel) {
		this.recommendLevel = recommendLevel;
	}

	/**
	 */
	public Integer getRecommendLevel() {
		return this.recommendLevel;
	}

	/**
	 */
	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}

	/**
	 */
	public String getRelatedId() {
		return this.relatedId;
	}

	/**
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 */
	public String getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 */
	public void setReleaseSysDate(Calendar releaseSysDate) {
		this.releaseSysDate = releaseSysDate;
	}

	/**
	 */
	public Calendar getReleaseSysDate() {
		return this.releaseSysDate;
	}

	/**
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 */
	public String getSummary() {
		return this.summary;
	}

	/**
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 */
	public String getTags() {
		return this.tags;
	}

	/**
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 */
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	/**
	 */
	public String getTitleImg() {
		return this.titleImg;
	}

	/**
	 */
	public void setVisitTotal(Integer visitTotal) {
		this.visitTotal = visitTotal;
	}

	/**
	 */
	public Integer getVisitTotal() {
		return this.visitTotal;
	}

	/**
	 */
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	/**
	 */
	public Integer getChannelId() {
		return this.channelId;
	}

	/**
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	/**
	 */
	public Integer getGroupId() {
		return this.groupId;
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
	public Article() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Article that) {
		setId(that.getId());
		setAuthor(that.getAuthor());
		setCheckDate(that.getCheckDate());
		setCheckState(that.getCheckState());
		setCommentCount(that.getCommentCount());
		setCommentState(that.getCommentState());
		setContent(that.getContent());
		setContentImg(that.getContentImg());
		setDisableDate(that.getDisableDate());
		setOrigin(that.getOrigin());
		setRecommendLevel(that.getRecommendLevel());
		setRelatedId(that.getRelatedId());
		setReleaseDate(that.getReleaseDate());
		setReleaseSysDate(that.getReleaseSysDate());
		setSummary(that.getSummary());
		setTags(that.getTags());
		setTitle(that.getTitle());
		setTitleImg(that.getTitleImg());
		setVisitTotal(that.getVisitTotal());
		setChannelId(that.getChannelId());
		setGroupId(that.getGroupId());
		setUserId(that.getUserId());
		setSysDate(that.getSysDate());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("author=[").append(author).append("] ");
		buffer.append("checkDate=[").append(checkDate).append("] ");
		buffer.append("checkState=[").append(checkState).append("] ");
		buffer.append("commentCount=[").append(commentCount).append("] ");
		buffer.append("commentState=[").append(commentState).append("] ");
		buffer.append("content=[").append(content).append("] ");
		buffer.append("contentImg=[").append(contentImg).append("] ");
		buffer.append("disableDate=[").append(disableDate).append("] ");
		buffer.append("origin=[").append(origin).append("] ");
		buffer.append("recommendLevel=[").append(recommendLevel).append("] ");
		buffer.append("relatedId=[").append(relatedId).append("] ");
		buffer.append("releaseDate=[").append(releaseDate).append("] ");
		buffer.append("releaseSysDate=[").append(releaseSysDate).append("] ");
		buffer.append("summary=[").append(summary).append("] ");
		buffer.append("tags=[").append(tags).append("] ");
		buffer.append("title=[").append(title).append("] ");
		buffer.append("titleImg=[").append(titleImg).append("] ");
		buffer.append("visitTotal=[").append(visitTotal).append("] ");
		buffer.append("channelId=[").append(channelId).append("] ");
		buffer.append("groupId=[").append(groupId).append("] ");
		buffer.append("userId=[").append(userId).append("] ");
		buffer.append("sysDate=[").append(sysDate).append("] ");

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
		if (!(obj instanceof Article))
			return false;
		Article equalCheck = (Article) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
