<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../../base.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<%@ include file="../../system/admin/top.jsp"%>
<meta charset="utf-8" />
<title>管理岗位基础信息</title>
<!-- 引入 -->
<script type="text/javascript">window.jQuery || document.write("<script src='static/js/jquery-1.9.1.min.js'>\x3C/script>");</script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/ace-elements.min.js"></script>
<script src="static/js/ace.min.js"></script>
<script type="text/javascript" src="static/js/chosen.jquery.min.js"></script>
<!-- 下拉框 -->
<script type="text/javascript" src="static/js/bootstrap-datepicker.min.js"></script>
<!-- 日期框 -->
<script type="text/javascript" src="static/js/bootbox.min.js"></script>
<!-- 确认窗口 -->
<!-- 引入 -->
<script type="text/javascript" src="static/js/jquery.tips.js"></script>
<!--提示框-->
<script type="text/javascript">
	$(top.hangge());
	
	//条件查询
	function searchManageBase() {
		$("#manageBaseForm").submit();
		$("#zhongxin").hide();
		$("#zhongxin2").show();
	}
	
	//导入管理岗位数据
	function importManageBase() {
		bootbox.confirm("当前上传的Excel表格会自动将数据录入至上个月的数据中，请确认您上传的Excel表格是上个月的数据！", function(result) {
			if(result) {
				$("#manageBaseForm").attr("action", "<%=basePath%>coefficient/importCoefficient.do");
				$("#manageBaseForm").submit();
			}
		});
	}
</script>
<script type="text/javascript">
	$(function() {

		//下拉框
		$(".chzn-select").chosen();
		$(".chzn-select-deselect").chosen({
			allow_single_deselect : true
		});

		//日期框
		$('.date-picker').datepicker();

		//复选框
		$('table th input:checkbox').on(
				'click',
				function() {
					var that = this;
					$(this).closest('table').find(
							'tr > td:first-child input:checkbox').each(
							function() {
								this.checked = that.checked;
								$(this).closest('tr').toggleClass('selected');
							});

				});

	});
</script>
</head>

<body>
	<div class="container-fluid" id="main-container">
		<div id="page-content" class="clearfix">
			<div class="row-fluid">
				<div class="row-fluid">
					<!-- 检索  -->
					<form action="<%=basePath%>coefficient/queryList.do"
						name="manageBaseForm" id="manageBaseForm" method="post" enctype="multipart/form-data">
						<input type="hidden" name="type" value="11"/>
						<table>
							<tr>
								<td style="vertical-align:top;"><span class="input-icon"> <input readonly="readonly"
										autocomplete="off" id="nav-search-input" type="text" class="span10 date-picker" id="yearMonth"
										name="yearMonth" value="${st.yearMonth}" data-date-format="yyyy-mm"  style="vertical-align:top;width: 150px;"
										placeholder="请选择年份月份" /> <i id="nav-search-icon"
										class="icon-search"></i>
								</span></td>
								<td style="vertical-align:top;">
								<input
										autocomplete="off" id="nav-search-input" type="text"
										name="staffName" value="${st.staffName}" placeholder="这里输入员工姓名" />
								</td>
								<td style="vertical-align:top;"><a
									class="btn btn-mini btn-info" onclick="searchManageBase();" >查询</a></td>
								<td style="vertical-align:top;">
									<input type="file" name="uploadFile" />
								</td>
								<td style="vertical-align:top;">
									<a class="btn btn-mini btn-info" onclick="importManageBase();" >导入Excel数据</a>
								</td>
								<td style="vertical-align:top;">
									<a class="btn btn-mini btn-info" href="<%=basePath%>common/downloadTemplate.do?fileType=9" >模板下载</a>
								</td>
							</tr>
						</table>
						<!-- 检索  -->
						<table id="table_report"
							class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
<!-- 									<th class="center"><label><input type="checkbox" -->
<!-- 											id="zcheckbox" /><span class="lbl"></span></label></th> -->
									<th class="center">序号</th>
									<th class='center'>所属油站</th>
									<th class='center'>员工编号</th>
									<th class='center'>员工姓名</th>
									<th class='center'>员工职务</th>
									<th class='center'>绩效系数</th>
									<th class='center'>年份月份</th>
									<!-- 
									<th class='center'>操作</th>
									 -->
								</tr>
							</thead>
							<tbody>
								<c:choose>
									<c:when test="${not empty pageList.records}">
										<c:forEach items="${pageList.records}" var="manageBase"
											varStatus="vs">
											<tr>
												<td class='center' style="width: 30px;">${vs.count}</td>
												<td class="center">
													<biztab:biz type="station" code="${manageBase.stationCode}">${obj.stationName }</biztab:biz>
												</td>
												<td class="center">${manageBase.staffCode}</td>
												<td class="center">${manageBase.staffName}</td>
												<td class="center">${manageBase.dutyName}</td>
												<td class="center"><fmt:formatNumber value="${manageBase.performanceCoefficient}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
												<td class="center">${manageBase.yearMonth}</td>
												<!--  
												<td class='center'><a
													class='btn btn-mini btn-info'
													onclick="toEdit('${manageBase.id}');">修改</a> <a
													class='btn btn-mini btn-danger'
													onclick="todelete('${manageBase.id}','此管理岗位员工信息');">删除</a></td>
												-->
											</tr>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<c:if test="${!empty Flag.flag}">
											<c:if test="${Flag.flag == '1'}">
												<tr>
													<td colspan="100" style="text-align: center;"><font color="red">请选择一个Excel表格进行上传！</font></td>
												</tr>
											</c:if>
											<c:if test="${Flag.flag == '2'}">
												<tr>
													<td colspan="100" style="text-align: center;"><font color="red">请上传一个正确的Excel表格！</font></td>
												</tr>
											</c:if>
											<c:if test="${Flag.flag == '3'}">
												<tr>
													<td colspan="100" style="text-align: center;"><font color="red">对不起，您上传的不是管理岗位数据的Excel！请确认后重新上传！</font></td>
												</tr>
											</c:if>
											<c:if test="${Flag.flag == '4'}">
												<tr>
													<td colspan="100" style="text-align: center;"><font color="red">别拿空模板逗我玩好么^_^</font></td>
												</tr>
											</c:if>
										</c:if>
										<c:if test="${Flag.flag != '1' && Flag.flag != '2' && Flag.flag != '3' && Flag.flag != '4'}">
											<tr>
												<td colspan="100" style="text-align: center;">此页没有相关数据，请查看<font
													color="red">上一页</font>或<font color="red">添加相关数据</font></td>
											</tr>
										</c:if>
									</c:otherwise>
								</c:choose>
							</tbody>
						</table>
						<!-- 分页展示页面 -->
						<div align="right">
							<%@include file="../../common/page.jsp"%>
						</div>
					</form>

				</div>
				<!-- PAGE CONTENT ENDS HERE -->
			</div>
			<!--/row-->
		</div>
		<!--/#page-content-->
	</div>
	<!--/.fluid-container#main-container-->

	<!-- 返回顶部  -->
	<a href="#" id="btn-scroll-up" class="btn btn-small btn-inverse"> <i
	   class="icon-double-angle-up icon-only"></i>
	</a>
</body>
</html>