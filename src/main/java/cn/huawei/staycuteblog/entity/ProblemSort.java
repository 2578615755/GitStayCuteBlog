package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huangmindong
 * @since 2019-06-18
 */
@TableName("problem_sort")
public class ProblemSort implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 问答类型ID
     */
	@TableId(value="sort_problem_id", type= IdType.AUTO)
	private Integer sortProblemId;
    /**
     * 问答类型
     */
	@TableField("sort_problem_type")
	private String sortProblemType;


	public Integer getSortProblemId() {
		return sortProblemId;
	}

	public void setSortProblemId(Integer sortProblemId) {
		this.sortProblemId = sortProblemId;
	}

	public String getSortProblemType() {
		return sortProblemType;
	}

	public void setSortProblemType(String sortProblemType) {
		this.sortProblemType = sortProblemType;
	}

	@Override
	public String toString() {
		return "ProblemSort{" +
			", sortProblemId=" + sortProblemId +
			", sortProblemType=" + sortProblemType +
			"}";
	}
}
