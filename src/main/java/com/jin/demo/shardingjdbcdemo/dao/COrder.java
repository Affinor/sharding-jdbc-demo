package com.jin.demo.shardingjdbcdemo.dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wangjin
 */
@Data
@Entity
@Table(name = "c_order")
public class COrder implements Serializable {

    private static final long serialVersionUID = -7956824324619791604L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 是否被删除
     */
    @Column(name = "is_del")
    private Boolean isDel;
    /**
     * ⽤户id
     */
    @Column(name = "user_id")
    private Integer userId;
    /**
     * 公司id
     */
    @Column(name = "company_id")
    private Integer companyId;
    /**
     * B端⽤户id
     */
    @Column(name = "publish_user_id")
    private Integer publishUserId;
    /**
     * 职位ID
     */
    @Column(name = "position_id")
    private Integer positionId;
    /**
     * 简历类型：
     * 0附件 1在线
     */
    @Column(name = "resume_type")
    private Integer resumeType;
    /**
     * 投递状态 投递状态
     * WAIT-待处理 AUTO_FILTER-⾃动过滤 PREPARE_CONTACT-待沟通 REFUSE-拒绝
     * ARRANGE_INTERVIEW-通知⾯试
     */
    @Column(name = "status")
    private String status;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 处理时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}
