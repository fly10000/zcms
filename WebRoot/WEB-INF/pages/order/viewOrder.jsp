<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.order-resources"/>
<html>
<head>
<title>View <fmt:message key="order.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="order.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrder"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.id.title"/>:
						</td>
						<td>
							${order.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.address.title"/>:
						</td>
						<td>
							${order.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.danwei.title"/>:
						</td>
						<td>
							${order.danwei}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.name.title"/>:
						</td>
						<td>
							${order.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.num.title"/>:
						</td>
						<td>
							${order.num}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.other.title"/>:
						</td>
						<td>
							${order.other}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.releasedate.title"/>:
						</td>
						<td>
							${order.releaseDate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.sysdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${order.sysDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.tel.title"/>:
						</td>
						<td>
							${order.tel}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.time.title"/>:
						</td>
						<td>
							${order.time}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="channel.title"/></h1>
					
						<c:if test='${order.channel != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="channel.id.title"/>:
						</td>
						<td>
							${order.channel.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.display.title"/>:
						</td>
						<td>
							${order.channel.display}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.displayinindex.title"/>:
						</td>
						<td>
							${order.channel.displayInIndex}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.info.title"/>:
						</td>
						<td>
							${order.channel.info}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.name.title"/>:
						</td>
						<td>
							${order.channel.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.rankid.title"/>:
						</td>
						<td>
							${order.channel.rankId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.single.title"/>:
						</td>
						<td>
							${order.channel.single}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.visittotal.title"/>:
						</td>
						<td>
							${order.channel.visitTotal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.fatherid.title"/>:
						</td>
						<td>
							${order.channel.fatherId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.checkstate.title"/>:
						</td>
						<td>
							${order.channel.checkState}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="channel.sysdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${order.channel.sysDate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderChannel?order_id=${order.id}&channel_id=${order.channel.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderChannel?order_id=${order.id}&related_channel_id=${order.channel.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${order.channel == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderChannel?order_id=${order.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="channel.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>