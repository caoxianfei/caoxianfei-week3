<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/index3.css" rel="stylesheet">
<script type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>

	<form action="addhouse">
	

		<table>
				
				<tr>
						<td colspan="2">酒店订单</td>
				</tr>
				<tr>
						<td>预定日期</td>
						<td> <input type="text" name="htime" onclick="WdatePicker()"></td>
				</tr>
				<tr>
						<td>姓名</td>
						<td><input type="text" name="hname"></td>
				</tr>
				<tr>
						<td>手机</td>
						<td><input type="text" name="phone"></td>
				</tr>
				<tr>
						<td>房型</td>
						<td>
								<select name="id">
										<option value="1">标准间</option>
										<option value="2">大床房</option>
										<option value="3">豪华单间</option>
								</select>
						</td>
				</tr>
				<tr>
						<td>备注</td>
						<td><textarea rows="5" cols="30" name="scope"></textarea></td>
				</tr>
				<tr>
						<td colspan="2" >
							<input type="submit"  value="提交"  >  
						</td>
						
				</tr>
		</table>
		
			</form>
		
</body>

</html>