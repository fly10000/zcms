<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.channel-resources"/>
<html>
<head>
<title>View <fmt:message key="channel.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="channel.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexChannel"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.id.title"/>:
						</td>
						<td>
							${channel.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.display.title"/>:
						</td>
						<td>
							${channel.display}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.displayinindex.title"/>:
						</td>
						<td>
							${channel.displayInIndex}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.info.title"/>:
						</td>
						<td>
							${channel.info}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.name.title"/>:
						</td>
						<td>
							${channel.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.rankid.title"/>:
						</td>
						<td>
							${channel.rankId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.single.title"/>:
						</td>
						<td>
							${channel.single}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.visittotal.title"/>:
						</td>
						<td>
							${channel.visitTotal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.fatherid.title"/>:
						</td>
						<td>
							${channel.fatherId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.checkstate.title"/>:
						</td>
						<td>
							${channel.checkState}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="channel.sysdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${channel.sysDate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="order.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newChannelOrders?channel_id=${channel.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="order.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
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
					<c:forEach items="${channel.orders}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectChannelOrders?channel_id=${channel.id}&orders_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editChannelOrders?channel_id=${channel.id}&orders_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteChannelOrders?channel_id=${channel.id}&related_orders_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.address}
						&nbsp;
						</td>
						<td>
							${current.danwei}
						&nbsp;
						</td>
						<td>
							${current.name}
						&nbsp;
						</td>
						<td>
							${current.num}
						&nbsp;
						</td>
						<td>
							${current.other}
						&nbsp;
						</td>
						<td>
							${current.releaseDate}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.sysDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.tel}
						&nbsp;
						</td>
						<td>
							${current.time}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>