<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查询商品列表</title>
    </head>

    <body>
        <form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">

        商品列表：
            <table width="100%" border=0>
                <tr>
                    <td> 商品名称  </td>
                    <td> 商品价格  </td>
                    <td> 商品描述  </td>
                </tr>
                <c:forEach var="item" items="${itemList}">
                    <tr>
                            <td> ${item.name} </td>
                            <td> ${item.price} </td>
                            <td> ${item.detail} 1111</td>
                        </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>