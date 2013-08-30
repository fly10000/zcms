<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.order-resources"/>
<html>
<head>
<title>List <fmt:message key="order.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="order.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrder"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="order.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="order.id.title"/></th>
					<th class="thead"><fmt:message key="order.address.title"/></th>
					<th class="thead"><fmt:message key="order.danwei.title"/></th>
					<th class="thead"><fmt:message key="order.name.title"/></th>
					<th class="thead"><fmt:message key="order.num.title"/></th>
					<th class="thead"><fmt:message key="order.other.title"/></th>
					<th class="thead"><fmt:message key="order.releasedate.title"/></th>
					<th class="thead"><fmt:message key="order.sysdate.title"/></th>
					<th class="thead"><fmt:message key="order.tel.title"/></th>
					<th class="thead"><fmt:message key="order.time.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${orders}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrder?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrder?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrder?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.address}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.danwei}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.name}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.num}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.other}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.releaseDate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.sysDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.tel}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.time}
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