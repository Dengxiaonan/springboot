<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<center>
    <form action="findByPage" method="post">
        <input type="hidden" name="page"/>
        按照用户名：<input type="text" name="mname" value="${mname!}"/><br>
        按照积分<input type="number" name="aspoints" value="${aspoints!}"/>--至--
        <input type="number" name="bspoints" value="${bspoints!}"/><input type="submit" value="检索"/>
    </form>
    <table border="1" rules="all">
        <tr bgcolor="#5f9ea0" align="center">
            <th>会员编码</th>
            <th>会员名字</th>
            <th>会员积分</th>
            <th>账户余额</th>
            <th>家庭住址</th>
            <th colspan="100">操作<a href="toSaveStu">新增</a></th>
        </tr>
        <#list pageInfo.list as user>
            <tr align="center">
                <td>${user.id}</td>
                <td>${user.mname}</td>
                <td>${user.spoints}</td>
                <td>${user.abalance}</td>
                <td>${user.address}</td>
                <td><a href="deleteUserById?id=${user.id}">删除</a></td>
                <td><a href="toUpdate?id=${user.id}">修改</a></td>
            </tr>
        </#list>
        <tr bgcolor="#00ffff" align="center">
            <td colspan="100">
                当前${pageInfo.pageNum}/${pageInfo.pages}页，共条记录
                <button  onclick="paging(1)">首页</button>
                <button  onclick="paging(${pageInfo.prePage})">上一页</button>
                <button  onclick="paging(${pageInfo.nextPage})">下一页</button>
                <button  onclick="paging(${pageInfo.pages})">尾页</button>
            </td>
        </tr>
</table>
</center>
</body>
<script>
    function paging(obj) {
        document.getElementsByName("page")[0].value = obj;
        document.forms[0].submit();
    }
</script>
</html>