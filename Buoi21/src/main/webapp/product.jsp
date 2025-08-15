<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Quản lý sản phẩm</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container py-4">
    <h1 class="mb-4">QUẢN LÝ SẢN PHẨM</h1>

    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>

    <form class="mb-4" method="post" action="${pageContext.request.contextPath}/product">
        <div class="mb-3">
            <label class="form-label">Tên sản phẩm</label>
            <input class="form-control" name="name" value="${name}">
        </div>
        <div class="mb-3">
            <label class="form-label">Số lượng</label>
            <input class="form-control" name="quantity" value="${quantity}">
        </div>
        <div class="mb-3">
            <label class="form-label">Giá bán</label>
            <input class="form-control" name="price" value="${price}">
        </div>
        <button class="btn btn-primary">Lưu lại</button>
    </form>

    <div class="table-responsive">
        <table class="table table-bordered bg-white">
            <thead class="table-light">
            <tr>
                <th style="width:80px">STT</th>
                <th>Tên Sản Phẩm</th>
                <th style="width:150px">Số Lượng</th>
                <th style="width:200px">Giá Bán</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="p" items="${products}" varStatus="st">
                <tr>
                    <td>${st.index + 1}</td>
                    <td>${p.name}</td>
                    <td>${p.quantity}</td>
                    <td>${p.price}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>