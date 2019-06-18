package cn.huawei.staycuteblog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
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
 * @since 2019-06-17
 */
@TableName("user_problem")
public class UserProblem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
	@TableId(value="problem_id", type= IdType.AUTO)
	private Integer problemId;
    /**
     * 提问者ID
     */
	@TableField("user_problem_id")
	private Integer userProblemId;
    /**
     * 提问内容
     */
	@TableField("user_problem_comment")
	private String userProblemComment;
    /**
     * 提问时间
     */
	@TableField("user_problem_datetime")
	private Date userProblemDatetime;
    /**
     * 问答类型ID
     */
	@TableField("sort_problem_id")
	private Integer sortProblemId;
    /**
     * 问答赏金
     */
	@TableField("problem_money")
	private BigDecimal problemMoney;
    /**
     * 是否解决 1:解决 0:未解决
     */
	@TableField("Whether_to_solve")
	private Integer WhetherToSolve;


	public Integer getProblemId() {
		return problemId;
	}

	public void setProblemId(Integer problemId) {
		this.problemId = problemId;
	}

	public Integer getUserProblemId() {
		return userProblemId;
	}

	public void setUserProblemId(Integer userProblemId) {
		this.userProblemId = userProblemId;
	}

	public String getUserProblemComment() {
		return userProblemComment;
	}

	public void setUserProblemComment(String userProblemComment) {
		this.userProblemComment = userProblemComment;
	}

	public Date getUserProblemDatetime() {
		return userProblemDatetime;
	}

	public void setUserProblemDatetime(Date userProblemDatetime) {
		this.userProblemDatetime = userProblemDatetime;
	}

	public Integer getSortProblemId() {
		return sortProblemId;
	}

	public void setSortProblemId(Integer sortProblemId) {
		this.sortProblemId = sortProblemId;
	}

	public BigDecimal getProblemMoney() {
		return problemMoney;
	}

	public void setProblemMoney(BigDecimal problemMoney) {
		this.problemMoney = problemMoney;
	}

	public Integer getWhetherToSolve() {
		return WhetherToSolve;
	}

	public void setWhetherToSolve(Integer WhetherToSolve) {
		this.WhetherToSolve = WhetherToSolve;
	}

	@Override
	public String toString() {
		return "UserProblem{" +
			", problemId=" + problemId +
			", userProblemId=" + userProblemId +
			", userProblemComment=" + userProblemComment +
			", userProblemDatetime=" + userProblemDatetime +
			", sortProblemId=" + sortProblemId +
			", problemMoney=" + problemMoney +
			", WhetherToSolve=" + WhetherToSolve +
			"}";
	}
}
