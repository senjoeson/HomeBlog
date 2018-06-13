package com.rick.blogcore.persistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_template")
public class SysTemplate {
    @Id
    private Long id;

    /**
     * 键
     */
    @Column(name = "ref_key")
    private String refKey;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 模板内容
     */
    @Column(name = "ref_value")
    private String refValue;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取键
     *
     * @return ref_key - 键
     */
    public String getRefKey() {
        return refKey;
    }

    /**
     * 设置键
     *
     * @param refKey 键
     */
    public void setRefKey(String refKey) {
        this.refKey = refKey == null ? null : refKey.trim();
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取模板内容
     *
     * @return ref_value - 模板内容
     */
    public String getRefValue() {
        return refValue;
    }

    /**
     * 设置模板内容
     *
     * @param refValue 模板内容
     */
    public void setRefValue(String refValue) {
        this.refValue = refValue == null ? null : refValue.trim();
    }
}