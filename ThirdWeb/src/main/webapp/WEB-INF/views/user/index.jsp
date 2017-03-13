<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Hello</h2>
<h3>Here you can choose the characteristic of the item of clothing: </h3>
   <h5><a href="/user/itemName">Item Name</a></h5>
   <h5><a href="/user/brand">Brand</a></h5>
   <h5><a href="/user/targeta">Target Audience</a></h5>
   <h5><a href="/user/type">Type of clothing</a></h5>
   <h5><a href="/user/color">Color</a></h5>
   <h5><a href="/user/size">Size</a></h5>
   <br>
<!--  <ul>
	<c:forEach items="${colors}" var="color">
		<li><a href="/color/${color.id}">${color.color}</a></li>
	</c:forEach>
</ul> -->
<a href="/admin">admin</a>