package kr.co.seoulit.erp.acc.base.to;
import lombok.EqualsAndHashCode;
import kr.co.seoulit.common.to.BaseTO;
import lombok.Data;
@EqualsAndHashCode(callSuper=false)
@Data
public class IreportBean extends BaseTO{
	protected String slipNo;
	protected String reportingDate;
	protected String deptName;
	protected String empName;
	protected String accountName;
	protected String expenseReport;
	protected String leftDebtorPrice;
	protected String rightCreditsPrice;

}
