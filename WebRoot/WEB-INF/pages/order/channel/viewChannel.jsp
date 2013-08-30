<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.order-resources"/>
<html>
<head>
<title>View <fmt:message key="order.title"/> <fmt:message key="channel.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="channel.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrder?idKey=${order_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
