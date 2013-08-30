<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.group-resources"/>
<html>
<head>
<title>List <fmt:message key="group.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="group.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGroup"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="group.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="group.id.title"/></th>
					<th class="thead"><fmt:message key="group.info.title"/></th>
					<th class="thead"><fmt:message key="group.managerarticle.title"/></th>
					<th class="thead"><fmt:message key="group.managechannel.title"/></th>
					<th class="thead"><fmt:message key="group.managecomment.title"/></th>
					<th class="thead"><fmt:message key="group.manageconfig.title"/></th>
					<th class="thead"><fmt:message key="group.managegroup.title"/></th>
					<th class="thead"><fmt:message key="group.managerlog.title"/></th>
					<th class="thead"><fmt:message key="group.manageruser.title"/></th>
					<th class="thead"><fmt:message key="group.name.title"/></th>
					<th class="thead"><fmt:message key="group.checkstate.title"/></th>
					<th class="thead"><fmt:message key="group.sysdate.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${groups}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGroup?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGroup?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGroup?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.info}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.managerArticle}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.manageChannel}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.manageComment}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.manageConfig}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.manageGroup}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.managerLog}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.managerUser}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.name}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.checkState}
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