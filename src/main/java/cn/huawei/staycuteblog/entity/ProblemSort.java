package cn.huawei.staycuteblog.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class ProblemSort {
    /**
    * 问答类型ID
    */
    @Id
    @GeneratedValue
    private Integer sortProblemId;

    /**
    * 问答类型
    */
    private String sortProblemType;
}