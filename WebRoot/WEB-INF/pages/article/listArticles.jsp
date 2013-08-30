<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.article-resources"/>
<html>
<head>
<title>List <fmt:message key="article.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="article.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newArticle"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="article.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="article.id.title"/></th>
					<th class="thead"><fmt:message key="article.author.title"/></th>
					<th class="thead"><fmt:message key="article.checkdate.title"/></th>
					<th class="thead"><fmt:message key="article.checkstate.title"/></th>
					<th class="thead"><fmt:message key="article.commentcount.title"/></th>
					<th class="thead"><fmt:message key="article.commentstate.title"/></th>
					<th class="thead"><fmt:message key="article.content.title"/></th>
					<th class="thead"><fmt:message key="article.contentimg.title"/></th>
					<th class="thead"><fmt:message key="article.disabledate.title"/></th>
					<th class="thead"><fmt:message key="article.origin.title"/></th>
					<th class="thead"><fmt:message key="article.recommendlevel.title"/></th>
					<th class="thead"><fmt:message key="article.relatedid.title"/></th>
					<th class="thead"><fmt:message key="article.releasedate.title"/></th>
					<th class="thead"><fmt:message key="article.releasesysdate.title"/></th>
					<th class="thead"><fmt:message key="article.summary.title"/></th>
					<th class="thead"><fmt:message key="article.tags.title"/></th>
					<th class="thead"><fmt:message key="article.title.title"/></th>
					<th class="thead"><fmt:message key="article.titleimg.title"/></th>
					<th class="thead"><fmt:message key="article.visittotal.title"/></th>
					<th class="thead"><fmt:message key="article.channelid.title"/></th>
					<th class="thead"><fmt:message key="article.groupid.title"/></th>
					<th class="thead"><fmt:message key="article.userid.title"/></th>
					<th class="thead"><fmt:message key="article.sysdate.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${articles}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectArticle?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editArticle?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteArticle?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.author}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.checkDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.checkState}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.commentCount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.commentState}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.content}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contentImg}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.disableDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.origin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.recommendLevel}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.relatedId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.releaseDate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.releaseSysDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.summary}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.tags}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.title}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.titleImg}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.visitTotal}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.channelId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.groupId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userId}
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