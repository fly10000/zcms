<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.config-resources"/>
<html>
<head>
<title>List <fmt:message key="config.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="config.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newConfig"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="config.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="config.id.title"/></th>
					<th class="thead"><fmt:message key="config.version.title"/></th>
					<th class="thead"><fmt:message key="config.company.title"/></th>
					<th class="thead"><fmt:message key="config.copyright.title"/></th>
					<th class="thead"><fmt:message key="config.domain.title"/></th>
					<th class="thead"><fmt:message key="config.email.title"/></th>
					<th class="thead"><fmt:message key="config.name.title"/></th>
					<th class="thead"><fmt:message key="config.recordcode.title"/></th>
					<th class="thead"><fmt:message key="config.template.title"/></th>
					<th class="thead"><fmt:message key="config.fullname.title"/></th>
					<th class="thead"><fmt:message key="config.qq.title"/></th>
					<th class="thead"><fmt:message key="config.ceo.title"/></th>
					<th class="thead"><fmt:message key="config.description.title"/></th>
					<th class="thead"><fmt:message key="config.introduce.title"/></th>
					<th class="thead"><fmt:message key="config.keywords.title"/></th>
					<th class="thead"><fmt:message key="config.mobile.title"/></th>
					<th class="thead"><fmt:message key="config.statistics.title"/></th>
					<th class="thead"><fmt:message key="config.tel.title"/></th>
					<th class="thead"><fmt:message key="config.ip.title"/></th>
					<th class="thead"><fmt:message key="config.sysdate.title"/></th>
					<th class="thead"><fmt:message key="config.uuid.title"/></th>
					<th class="thead"><fmt:message key="config.ctp.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${configs}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectConfig?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editConfig?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteConfig?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.version}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.company}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.copyright}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.domain}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.email}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.name}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recordCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.template}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fullName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.qq}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ceo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.description}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.introduce}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.keywords}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.mobile}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.statistics}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.tel}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ip}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.sysDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.uuid}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ctp}
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