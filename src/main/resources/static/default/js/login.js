$(function () {
    if($("#msg").val()=="注册成功!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    if($("#msg").val()=="您的用户名不存在!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    if($("#msg").val()=="您的密码填写有误!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    $("#qqlianxi").click(function () {
        window.open("http://wpa.qq.com/msgrd?v=3&uin=2578615755&site=oicqzone.com&menu=yes");
    })
})