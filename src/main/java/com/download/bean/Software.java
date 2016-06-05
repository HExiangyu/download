package com.download.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Laily on 16/6/2.
 */
public class Software implements Serializable{
    private Long id;//

    private String name;//软件名

    private String common_name;//软件别名

    private String url;//软件官网

    private String company_name;//软件所属公司名

    private String description;//软件描述

    private String remark;//备注

    private Timestamp create_time;//

    private Timestamp update_time;//

    private Long default_version_id;//默认版本id

    private Long user_id;//提交软件的用户

    private Long deleted_status;//

    private String ident;//软件唯一ident

    private String keywords;//seo用关键词

    private String meta_desc;//seo用描述信息


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public Long getDefault_version_id() {
        return default_version_id;
    }

    public void setDefault_version_id(Long default_version_id) {
        this.default_version_id = default_version_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getDeleted_status() {
        return deleted_status;
    }

    public void setDeleted_status(Long deleted_status) {
        this.deleted_status = deleted_status;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMeta_desc() {
        return meta_desc;
    }

    public void setMeta_desc(String meta_desc) {
        this.meta_desc = meta_desc;
    }
}
