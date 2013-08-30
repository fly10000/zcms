<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.user-resources"/>
<html>
<head>
<title>List <fmt:message key="user.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="user.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUser"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="user.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="user.id.title"/></th>
					<th class="thead"><fmt:message key="user.qq.title"/></th>
					<th class="thead"><fmt:message key="user.address.title"/></th>
					<th class="thead"><fmt:message key="user.birthday.title"/></th>
					<th class="thead"><fmt:message key="user.checkstate.title"/></th>
					<th class="thead"><fmt:message key="user.createtime.title"/></th>
					<th class="thead"><fmt:message key="user.email.title"/></th>
					<th class="thead"><fmt:message key="user.gender.title"/></th>
					<th class="thead"><fmt:message key="user.info.title"/></th>
					<th class="thead"><fmt:message key="user.lastloginip.title"/></th>
					<th class="thead"><fmt:message key="user.lastlogintime.title"/></th>
					<th class="thead"><fmt:message key="user.loginnumber.title"/></th>
					<th class="thead"><fmt:message key="user.j2cmspassword.title"/></th>
					<th class="thead"><fmt:message key="user.realname.title"/></th>
					<th class="thead"><fmt:message key="user.telephone.title"/></th>
					<th class="thead"><fmt:message key="user.j2cmsusername.title"/></th>
					<th class="thead"><fmt:message key="user.zipcode.title"/></th>
					<th class="thead"><fmt:message key="user.groupid.title"/></th>
					<th class="thead"><fmt:message key="user.sysdate.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUser?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUser?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUser?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.qq}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.birthday.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.checkState}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.createTime.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.email}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.gender}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.info}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastLoginIp}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.lastLoginTime.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.loginNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.j2cmsPassWord}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.realName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.telephone}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.j2cmsUserName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.zipCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.groupId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.sysDate.time}"/>
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>