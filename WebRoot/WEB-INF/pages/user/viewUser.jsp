<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.user-resources"/>
<html>
<head>
<title>View <fmt:message key="user.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="user.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexUser"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.id.title"/>:
						</td>
						<td>
							${user.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.qq.title"/>:
						</td>
						<td>
							${user.qq}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.address.title"/>:
						</td>
						<td>
							${user.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.birthday.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${user.birthday.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.checkstate.title"/>:
						</td>
						<td>
							${user.checkState}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.createtime.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${user.createTime.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.email.title"/>:
						</td>
						<td>
							${user.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.gender.title"/>:
						</td>
						<td>
							${user.gender}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.info.title"/>:
						</td>
						<td>
							${user.info}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.lastloginip.title"/>:
						</td>
						<td>
							${user.lastLoginIp}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.lastlogintime.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${user.lastLoginTime.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.loginnumber.title"/>:
						</td>
						<td>
							${user.loginNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.j2cmspassword.title"/>:
						</td>
						<td>
							${user.j2cmsPassWord}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.realname.title"/>:
						</td>
						<td>
							${user.realName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.telephone.title"/>:
						</td>
						<td>
							${user.telephone}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.j2cmsusername.title"/>:
						</td>
						<td>
							${user.j2cmsUserName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.zipcode.title"/>:
						</td>
						<td>
							${user.zipCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.groupid.title"/>:
						</td>
						<td>
							${user.groupId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="user.sysdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${user.sysDate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>