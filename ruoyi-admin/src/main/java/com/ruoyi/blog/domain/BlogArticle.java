package com.ruoyi.blog.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章对象 blog_article
 * 
 * @author yaoyo
 * @date 2026-01-16
 */
public class BlogArticle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章ID */
    private Integer id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** Markdown源码 */
    @Excel(name = "Markdown源码")
    private String content;

    /** 摘要 */
    @Excel(name = "摘要")
    private String summary;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Integer categoryId;

    /** 标签(逗号分隔) */
    @Excel(name = "标签(逗号分隔)")
    private String tags;

    /** 状态(0发布 1草稿) */
    @Excel(name = "状态(0发布 1草稿)")
    private String status;

    /** 浏览量(快照) */
    @Excel(name = "浏览量(快照)")
    private Integer viewCount;

    /** 点赞量(快照) */
    @Excel(name = "点赞量(快照)")
    private Integer likeCount;

    /** 评论量(快照) */
    @Excel(name = "评论量(快照)")
    private Long commentCount;

    /** 关联sys_user用户ID */
    @Excel(name = "关联sys_user用户ID")
    private Long createUserId;

    @Excel(name = "关联sys_user用户ID")
    private Long updateUserId;



    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }

    public void setCategoryId(Integer categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() 
    {
        return categoryId;
    }

    public void setTags(String tags) 
    {
        this.tags = tags;
    }

    public String getTags() 
    {
        return tags;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setViewCount(Integer viewCount) 
    {
        this.viewCount = viewCount;
    }

    public Integer getViewCount() 
    {
        return viewCount;
    }

    public void setLikeCount(Integer likeCount) 
    {
        this.likeCount = likeCount;
    }

    public Integer getLikeCount() 
    {
        return likeCount;
    }

    public void setCommentCount(Long commentCount) 
    {
        this.commentCount = commentCount;
    }

    public Long getCommentCount() 
    {
        return commentCount;
    }

    public void setCreateUserId(Long createUserId) 
    {
        this.createUserId = createUserId;
    }

    public Long getCreateUserId() 
    {
        return createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("summary", getSummary())
            .append("categoryId", getCategoryId())
            .append("tags", getTags())
            .append("status", getStatus())
            .append("viewCount", getViewCount())
            .append("likeCount", getLikeCount())
            .append("commentCount", getCommentCount())
            .append("createUserId", getCreateUserId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
