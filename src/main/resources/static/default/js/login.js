$(function () {
    if($("#msg").val()=="ע��ɹ�!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    if($("#msg").val()=="�����û���������!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    if($("#msg").val()=="����������д����!"){
        layer.msg($("#msg").val(), {icon: 6});
    }
    $("#qqlianxi").click(function () {
        window.open("http://wpa.qq.com/msgrd?v=3&uin=2578615755&site=oicqzone.com&menu=yes");
    })
})