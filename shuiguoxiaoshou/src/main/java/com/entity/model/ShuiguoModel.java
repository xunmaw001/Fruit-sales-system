package com.entity.model;

import com.entity.ShuiguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 水果
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShuiguoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 水果名称
     */
    private String shuiguoName;


    /**
     * 水果照片
     */
    private String shuiguoPhoto;


    /**
     * 水果类型
     */
    private Integer shuiguoTypes;


    /**
     * 水果库存
     */
    private Integer shuiguoKucunNumber;


    /**
     * 水果原价
     */
    private Double shuiguoOldMoney;


    /**
     * 现价
     */
    private Double shuiguoNewMoney;


    /**
     * 点击次数
     */
    private Integer shuiguoClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer shuiguoDelete;


    /**
     * 水果简介
     */
    private String shuiguoContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：水果名称
	 */
    public String getShuiguoName() {
        return shuiguoName;
    }


    /**
	 * 设置：水果名称
	 */
    public void setShuiguoName(String shuiguoName) {
        this.shuiguoName = shuiguoName;
    }
    /**
	 * 获取：水果照片
	 */
    public String getShuiguoPhoto() {
        return shuiguoPhoto;
    }


    /**
	 * 设置：水果照片
	 */
    public void setShuiguoPhoto(String shuiguoPhoto) {
        this.shuiguoPhoto = shuiguoPhoto;
    }
    /**
	 * 获取：水果类型
	 */
    public Integer getShuiguoTypes() {
        return shuiguoTypes;
    }


    /**
	 * 设置：水果类型
	 */
    public void setShuiguoTypes(Integer shuiguoTypes) {
        this.shuiguoTypes = shuiguoTypes;
    }
    /**
	 * 获取：水果库存
	 */
    public Integer getShuiguoKucunNumber() {
        return shuiguoKucunNumber;
    }


    /**
	 * 设置：水果库存
	 */
    public void setShuiguoKucunNumber(Integer shuiguoKucunNumber) {
        this.shuiguoKucunNumber = shuiguoKucunNumber;
    }
    /**
	 * 获取：水果原价
	 */
    public Double getShuiguoOldMoney() {
        return shuiguoOldMoney;
    }


    /**
	 * 设置：水果原价
	 */
    public void setShuiguoOldMoney(Double shuiguoOldMoney) {
        this.shuiguoOldMoney = shuiguoOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getShuiguoNewMoney() {
        return shuiguoNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setShuiguoNewMoney(Double shuiguoNewMoney) {
        this.shuiguoNewMoney = shuiguoNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getShuiguoClicknum() {
        return shuiguoClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setShuiguoClicknum(Integer shuiguoClicknum) {
        this.shuiguoClicknum = shuiguoClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShuiguoDelete() {
        return shuiguoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShuiguoDelete(Integer shuiguoDelete) {
        this.shuiguoDelete = shuiguoDelete;
    }
    /**
	 * 获取：水果简介
	 */
    public String getShuiguoContent() {
        return shuiguoContent;
    }


    /**
	 * 设置：水果简介
	 */
    public void setShuiguoContent(String shuiguoContent) {
        this.shuiguoContent = shuiguoContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
