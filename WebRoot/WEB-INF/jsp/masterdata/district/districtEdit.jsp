<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../../base.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<base href="<%=basePath%>">
		
		<meta charset="utf-8" />
		<title>区域</title>
		<meta name="description" content="overview & stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="static/css/bootstrap.min.css" rel="stylesheet" />
		<link href="static/css/bootstrap-responsive.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="static/css/font-awesome.min.css" />
		<!-- 下拉框 -->
		<link rel="stylesheet" href="static/css/chosen.css" />
		
		<link rel="stylesheet" href="static/css/ace.min.css" />
		<link rel="stylesheet" href="static/css/ace-responsive.min.css" />
		<link rel="stylesheet" href="static/css/ace-skins.min.css" />
		
		<link rel="stylesheet" href="static/css/datepicker.css" /><!-- 日期框 -->
		<script type="text/javascript" src="static/js/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="static/js/jquery.tips.js"></script>
		<script type="text/javascript" src="static/js/myjs/city.js"></script>
</head>

<script type="text/javascript">
	$(top.hangge());

	//保存
	function save(){
		if($("#districtName").val()==""){
			
			$("#districtName").tips({
				side:3,
	            msg:'请输入区域名称',
	            bg:'#AE81FF',
	            time:2
	        });
			
			$("#districtName").focus();
			return false;
		}  
		if($("#districtCode").val()==""){
			
			$("#districtCode").tips({
				side:3,
	            msg:'这里输入区域编号',
	            bg:'#AE81FF',
	            time:2
	        });
			
			$("#districtCode").focus();
			return false;
		} 
		$("#districtForm").submit();
		$("#zhongxin").hide();
		$("#zhongxin2").show();
	}
	
</script>


<body>
	<form  action="<%=basePath%>district/districtSaveOrUpdate.do" name="districtForm" id="districtForm" method="post" >
		<input type="hidden" name="id" id="id" value="${district.id }"/>
		<div id="zhongxin">
		<table id="table_report" class="table table-striped table-bordered table-hover">
			<tr>
				<td style="width:120px;text-align: right;padding-top: 13px;">区域编号：</td>
				<td><input type="text" name="districtCode" id="districtCode" placeholder="这里输入区域编号" value="${district.districtCode }" title="区域编号" maxlength="32" readonly /></td>
			</tr>
			<tr>
				<td style="width:120px;text-align: right;padding-top: 13px;">区域名称：</td>
				<td><input type="text" name="districtName" id="districtName" placeholder="这里输入区域名称" value="${district.districtName }" title="区域名称" maxlength="32" /></td>
			</tr>
			<!-- 
			<tr>
				<td style="width:120px;text-align: right;padding-top: 13px;">区域级别：</td>
				<td><input type="text" name="districtLevel" id="districtLevel" placeholder="这里输入区域级别" value="${district.districtLevel }" title="区域级别" maxlength="32" /></td>
			</tr>
			<tr>
				<td style="width:120px;text-align: right;padding-top: 13px;">上级区域：</td>
				<td><select name="fatherDistrictCode" id="fatherDistrictCode" class="chzn-select" data-placeholder="请选择上级区域" style="vertical-align:top;width: 220px;"  title="上级区域">
								<option value=""></option>
								<biztab:biz type="district" code="all">
									<option value="${obj.districtCode}" ${district.fatherDistrictCode==obj.districtCode ? 'selected="selected"' : ''} >${obj.districtName}</option>
								</biztab:biz>
					</select></td>
			</tr>
			<tr>
				<td style="width:120px;text-align: right;padding-top: 13px;">备注：</td>
				<td><textarea rows="4" cols="68" name="remark" id="remark" placeholder="备注" title="备注">${district.remark}</textarea></td>
			</tr>
			 -->
			<tr>
				<td style="text-align: center;" colspan="10">
					<a class="btn btn-mini btn-primary" onclick="save();" style="padding:-2px 5px;font-size:15px;border-width:3px;">保存</a>
					<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();"style="padding:-2px 5px;font-size:15px;border-width:3px;">取消</a>
				</td>
			</tr>
		</table>
		</div>
		<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green"></h4></div>
	</form>
	<!-- 引入 -->
		<script type="text/javascript">window.jQuery || document.write("<script src='static/js/jquery-1.9.1.min.js'>\x3C/script>");</script>
		<script src="static/js/bootstrap.min.js"></script>
		<script src="static/js/ace-elements.min.js"></script>
		<script src="static/js/ace.min.js"></script>
		<script type="text/javascript" src="static/js/chosen.jquery.min.js"></script><!-- 下拉框 -->
		<script type="text/javascript" src="static/js/bootstrap-datepicker.min.js"></script><!-- 日期框 -->
		<script type="text/javascript">
			$(function() {
				//单选框
				$(".chzn-select").chosen(); 
				$(".chzn-select-deselect").chosen({allow_single_deselect:true}); 
				
				//日期框
				$('.date-picker').datepicker();
			});
		</script>
</body>
</html>