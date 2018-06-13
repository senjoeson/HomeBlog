package com.rick.blogcore.persistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_config")
public class SysConfig {
    @Id
    private Integer id;

    /**
     * 首页描述
     */
    @Column(name = "home_desc")
    private String homeDesc;

    /**
     * 首页关键字
     */
    @Column(name = "home_keywords")
    private String homeKeywords;

    /**
     * 根域名
     */
    private String domain;

    /**
     * 网站地址
     */
    @Column(name = "site_url")
    private String siteUrl;

    /**
     * 站点名称
     */
    @Column(name = "site_name")
    private String siteName;

    /**
     * 站点描述
     */
    @Column(name = "site_desc")
    private String siteDesc;

    /**
     * 站点LOGO
     */
    @Column(name = "site_favicon")
    private String siteFavicon;

    /**
     * 资源文件（js、css等的路径）
     */
    @Column(name = "static_web_site")
    private String staticWebSite;

    /**
     * 站长名称
     */
    @Column(name = "author_name")
    private String authorName;

    /**
     * 站长邮箱
     */
    @Column(name = "author_email")
    private String authorEmail;

    /**
     * 微信二维码地址
     */
    @Column(name = "wx_code")
    private String wxCode;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微博
     */
    private String weibo;

    /**
     * github
     */
    private String github;

    /**
     * 是否开启维护通知
     */
    private Boolean maintenance;

    /**
     * 系统维护时间
     */
    @Column(name = "maintenance_data")
    private Date maintenanceData;

    /**
     * 是否开启评论
     */
    private Boolean comment;

    /**
     * 七牛路径
     */
    @Column(name = "qiuniu_base_path")
    private String qiuniuBasePath;

    /**
     * 七牛ACCESS_KEY
     */
    @Column(name = "qiniu_access_key")
    private String qiniuAccessKey;

    /**
     * 七牛SECRET_KEY
     */
    @Column(name = "qiniu_secret_key")
    private String qiniuSecretKey;

    /**
     * 七牛BUCKET_NAME
     */
    @Column(name = "qiniu_bucket_name")
    private String qiniuBucketName;

    /**
     * 百度推送的token
     */
    @Column(name = "baidu_push_token")
    private String baiduPushToken;

    /**
     * 微信赞赏码
     */
    @Column(name = "wx_praise_code")
    private String wxPraiseCode;

    /**
     * 支付宝赞赏码
     */
    @Column(name = "zfb_praise_code")
    private String zfbPraiseCode;

    /**
     * 百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     */
    @Column(name = "baidu_api_ak")
    private String baiduApiAk;

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
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取首页描述
     *
     * @return home_desc - 首页描述
     */
    public String getHomeDesc() {
        return homeDesc;
    }

    /**
     * 设置首页描述
     *
     * @param homeDesc 首页描述
     */
    public void setHomeDesc(String homeDesc) {
        this.homeDesc = homeDesc == null ? null : homeDesc.trim();
    }

    /**
     * 获取首页关键字
     *
     * @return home_keywords - 首页关键字
     */
    public String getHomeKeywords() {
        return homeKeywords;
    }

    /**
     * 设置首页关键字
     *
     * @param homeKeywords 首页关键字
     */
    public void setHomeKeywords(String homeKeywords) {
        this.homeKeywords = homeKeywords == null ? null : homeKeywords.trim();
    }

    /**
     * 获取根域名
     *
     * @return domain - 根域名
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置根域名
     *
     * @param domain 根域名
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * 获取网站地址
     *
     * @return site_url - 网站地址
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * 设置网站地址
     *
     * @param siteUrl 网站地址
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    /**
     * 获取站点名称
     *
     * @return site_name - 站点名称
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 设置站点名称
     *
     * @param siteName 站点名称
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * 获取站点描述
     *
     * @return site_desc - 站点描述
     */
    public String getSiteDesc() {
        return siteDesc;
    }

    /**
     * 设置站点描述
     *
     * @param siteDesc 站点描述
     */
    public void setSiteDesc(String siteDesc) {
        this.siteDesc = siteDesc == null ? null : siteDesc.trim();
    }

    /**
     * 获取站点LOGO
     *
     * @return site_favicon - 站点LOGO
     */
    public String getSiteFavicon() {
        return siteFavicon;
    }

    /**
     * 设置站点LOGO
     *
     * @param siteFavicon 站点LOGO
     */
    public void setSiteFavicon(String siteFavicon) {
        this.siteFavicon = siteFavicon == null ? null : siteFavicon.trim();
    }

    /**
     * 获取资源文件（js、css等的路径）
     *
     * @return static_web_site - 资源文件（js、css等的路径）
     */
    public String getStaticWebSite() {
        return staticWebSite;
    }

    /**
     * 设置资源文件（js、css等的路径）
     *
     * @param staticWebSite 资源文件（js、css等的路径）
     */
    public void setStaticWebSite(String staticWebSite) {
        this.staticWebSite = staticWebSite == null ? null : staticWebSite.trim();
    }

    /**
     * 获取站长名称
     *
     * @return author_name - 站长名称
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置站长名称
     *
     * @param authorName 站长名称
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    /**
     * 获取站长邮箱
     *
     * @return author_email - 站长邮箱
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     * 设置站长邮箱
     *
     * @param authorEmail 站长邮箱
     */
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail == null ? null : authorEmail.trim();
    }

    /**
     * 获取微信二维码地址
     *
     * @return wx_code - 微信二维码地址
     */
    public String getWxCode() {
        return wxCode;
    }

    /**
     * 设置微信二维码地址
     *
     * @param wxCode 微信二维码地址
     */
    public void setWxCode(String wxCode) {
        this.wxCode = wxCode == null ? null : wxCode.trim();
    }

    /**
     * 获取QQ
     *
     * @return qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 获取微博
     *
     * @return weibo - 微博
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * 设置微博
     *
     * @param weibo 微博
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    /**
     * 获取github
     *
     * @return github - github
     */
    public String getGithub() {
        return github;
    }

    /**
     * 设置github
     *
     * @param github github
     */
    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    /**
     * 获取是否开启维护通知
     *
     * @return maintenance - 是否开启维护通知
     */
    public Boolean getMaintenance() {
        return maintenance;
    }

    /**
     * 设置是否开启维护通知
     *
     * @param maintenance 是否开启维护通知
     */
    public void setMaintenance(Boolean maintenance) {
        this.maintenance = maintenance;
    }

    /**
     * 获取系统维护时间
     *
     * @return maintenance_data - 系统维护时间
     */
    public Date getMaintenanceData() {
        return maintenanceData;
    }

    /**
     * 设置系统维护时间
     *
     * @param maintenanceData 系统维护时间
     */
    public void setMaintenanceData(Date maintenanceData) {
        this.maintenanceData = maintenanceData;
    }

    /**
     * 获取是否开启评论
     *
     * @return comment - 是否开启评论
     */
    public Boolean getComment() {
        return comment;
    }

    /**
     * 设置是否开启评论
     *
     * @param comment 是否开启评论
     */
    public void setComment(Boolean comment) {
        this.comment = comment;
    }

    /**
     * 获取七牛路径
     *
     * @return qiuniu_base_path - 七牛路径
     */
    public String getQiuniuBasePath() {
        return qiuniuBasePath;
    }

    /**
     * 设置七牛路径
     *
     * @param qiuniuBasePath 七牛路径
     */
    public void setQiuniuBasePath(String qiuniuBasePath) {
        this.qiuniuBasePath = qiuniuBasePath == null ? null : qiuniuBasePath.trim();
    }

    /**
     * 获取七牛ACCESS_KEY
     *
     * @return qiniu_access_key - 七牛ACCESS_KEY
     */
    public String getQiniuAccessKey() {
        return qiniuAccessKey;
    }

    /**
     * 设置七牛ACCESS_KEY
     *
     * @param qiniuAccessKey 七牛ACCESS_KEY
     */
    public void setQiniuAccessKey(String qiniuAccessKey) {
        this.qiniuAccessKey = qiniuAccessKey == null ? null : qiniuAccessKey.trim();
    }

    /**
     * 获取七牛SECRET_KEY
     *
     * @return qiniu_secret_key - 七牛SECRET_KEY
     */
    public String getQiniuSecretKey() {
        return qiniuSecretKey;
    }

    /**
     * 设置七牛SECRET_KEY
     *
     * @param qiniuSecretKey 七牛SECRET_KEY
     */
    public void setQiniuSecretKey(String qiniuSecretKey) {
        this.qiniuSecretKey = qiniuSecretKey == null ? null : qiniuSecretKey.trim();
    }

    /**
     * 获取七牛BUCKET_NAME
     *
     * @return qiniu_bucket_name - 七牛BUCKET_NAME
     */
    public String getQiniuBucketName() {
        return qiniuBucketName;
    }

    /**
     * 设置七牛BUCKET_NAME
     *
     * @param qiniuBucketName 七牛BUCKET_NAME
     */
    public void setQiniuBucketName(String qiniuBucketName) {
        this.qiniuBucketName = qiniuBucketName == null ? null : qiniuBucketName.trim();
    }

    /**
     * 获取百度推送的token
     *
     * @return baidu_push_token - 百度推送的token
     */
    public String getBaiduPushToken() {
        return baiduPushToken;
    }

    /**
     * 设置百度推送的token
     *
     * @param baiduPushToken 百度推送的token
     */
    public void setBaiduPushToken(String baiduPushToken) {
        this.baiduPushToken = baiduPushToken == null ? null : baiduPushToken.trim();
    }

    /**
     * 获取微信赞赏码
     *
     * @return wx_praise_code - 微信赞赏码
     */
    public String getWxPraiseCode() {
        return wxPraiseCode;
    }

    /**
     * 设置微信赞赏码
     *
     * @param wxPraiseCode 微信赞赏码
     */
    public void setWxPraiseCode(String wxPraiseCode) {
        this.wxPraiseCode = wxPraiseCode == null ? null : wxPraiseCode.trim();
    }

    /**
     * 获取支付宝赞赏码
     *
     * @return zfb_praise_code - 支付宝赞赏码
     */
    public String getZfbPraiseCode() {
        return zfbPraiseCode;
    }

    /**
     * 设置支付宝赞赏码
     *
     * @param zfbPraiseCode 支付宝赞赏码
     */
    public void setZfbPraiseCode(String zfbPraiseCode) {
        this.zfbPraiseCode = zfbPraiseCode == null ? null : zfbPraiseCode.trim();
    }

    /**
     * 获取百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     *
     * @return baidu_api_ak - 百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     */
    public String getBaiduApiAk() {
        return baiduApiAk;
    }

    /**
     * 设置百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     *
     * @param baiduApiAk 百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     */
    public void setBaiduApiAk(String baiduApiAk) {
        this.baiduApiAk = baiduApiAk == null ? null : baiduApiAk.trim();
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
}