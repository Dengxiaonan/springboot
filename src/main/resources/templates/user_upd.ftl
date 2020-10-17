<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<center>
    <form action="updStu" method="post">
        <input type="hidden" name="id" value="${userBean.id}">
        会员名字:<input type="text" name="mname" value="${userBean.mname}"/><br>
        会员积分:<input type="text" name="spoints" value="${userBean.spoints}"/><br>
        账户余额 :<input type="text" name="abalance" value="${userBean.abalance}"/><br>
        家庭住址:<input type="text" name="address" value="${userBean.address}"/><br>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>