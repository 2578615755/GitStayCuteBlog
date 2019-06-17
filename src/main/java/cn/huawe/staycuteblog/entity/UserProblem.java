package cn.huawe.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Data
@ToString
@Entity
public class UserProblem {
    /**
    * 自增ID
    */
    @Id
    @GeneratedValue
    private Integer problemId;

    /**
    * 提问者ID
    */
    private Integer userProblemId;

    /**
    * 提问内容
    */
    private String userProblemComment;

    /**
    * 提问时间
    */
    private String userProblemDatetime;

    /**
    * 问答类型ID
    */
    private Integer sortProblemId;

    /**
    * 问答赏金
    */
    private BigDecimal problemMoney;

    /**
    * 是否解决 1:解决 0:未解决
    */
    private Integer whetherToSolve;
}