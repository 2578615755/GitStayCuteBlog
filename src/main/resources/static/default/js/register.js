$(function () {
    layer.msg('见到你真的很高兴,欢迎注册呆檬博客哟!', {icon: 6});
    $("#phone-register").click(function () {
        $("#pr").show();
        $("#box").hide();
    });
    $(".hide-register-btn1").click(function () {
        $("#pr").hide();
        $("#box").show();
    });
    $("#email-register").click(function () {
        $("#er").show();
        $("#box").hide();
    });
    $(".hide-register-btn2").click(function () {
        $("#er").hide();
        $("#box").show();
    });
    $("#qqlianxi").click(function () {
        window.open("http://wpa.qq.com/msgrd?v=3&uin=2578615755&site=oicqzone.com&menu=yes");
    })
    //普通用户注册
    var ptusername=$("#ptusername");
    var ptpassword=$("#ptpassword");
    var ptpassword1=$("#ptpassword1");
    var ptqq=$("#ptqq");
    var is=false;
    function fptusername() {
        if(ptusername.val()==""&&ptusername.val().length==0){
            layer.msg('请填写账号哟!', {icon: 2});
            return false;
        }else{
            $.get("/user/only","username="+ptusername.val(),function (data) {
                if (data == "true") {
                    is=true;
                    layer.msg('用户名可以使用!', {icon: 1});
                } else {
                    is=false;
                    layer.msg('用户名已被占用!', {icon: 2});
                }
            },"text");
        }
        return is;
    }
    function fptpassword() {
        if(ptpassword.val()==""&&ptpassword.val().length==0){
            layer.msg('请填写密码哟!', {icon: 2});
            return false;
        }else if(ptpassword1.val()!=ptpassword.val()){
            layer.msg('您输入的两次密码不一致哦!', {icon: 2});
            return false;
        }
        return true;
    }
    function fptqq() {
        if(ptqq.val()==""&&ptqq.val().length==0) {
            layer.msg('请填写QQ账号哟!', {icon: 2});
            return false;
        }
        return true;
    }
    ptusername.blur(fptusername);
    ptpassword.blur(fptpassword);
    ptqq.blur(fptqq);
    $("#myform").submit(function () {
        if(!fptusername()) return false;
        if(!fptpassword()) return false;
        if(!fptqq()) return false;
        return true;
    });
    if($("#msg").val()=="注册失败!"){
        layer.msg($("#msg").val(), {icon: 6});
    }

    //手机号注册
    $("#phoneSend").click(function () {
        var phone = $("#phone").val();
        if(phone==""&&phone.length==0) {
            layer.msg('请填写手机号码哟,不然怎么发送验证码呀!', {icon: 2});
            return false;
        }else if(phone.length!=11){
            layer.msg('请填写正确的手机号码哟!', {icon: 2});
            return false;
        }else {
            time(this);
            $.get("/user/sendPhone", "phone=" + phone, function (data) {
                layer.msg("发送验证码成功!", {icon: 1});
                $("#phoneCode").val(data);
            }, "text");
            return true;
        }
    });
    var phoneYzm=$("#phoneYzm");
    var phonePassword=$("#phonePassword");
    var phoneQq=$("#phoneQq");
    function fphoneYzm(){
        var phoneCode = $("#phoneCode");
        if(phoneYzm.val()==""&&phoneYzm.val().length==0) {
            layer.msg('请填写验证码哦!', {icon: 2});
            return false;
        }else if(phoneYzm.val()!=phoneCode.val()) {
            layer.msg('验证码不正确哦!', {icon: 2});
            return false;
        }
        return true;
    }
    function fphonePassword(){
        if(phonePassword.val()==""&&phonePassword.val().length==0){
            layer.msg('请填写密码哟!', {icon: 2});
            return false;
        }else if($("#phonePassword1").val()!=phonePassword.val()){
            layer.msg('您输入的两次密码不一致哦!', {icon: 2});
            return false;
        }
        return true;
    }
    function fphoneQq(){
        if(phoneQq.val()==""&&phoneQq.val().length==0) {
            layer.msg('请填写您的QQ账号哟!', {icon: 2});
            return false;
        }
        return true;
    }
    phoneYzm.blur(fphoneYzm);
    phonePassword.blur(fphonePassword);
    phoneQq.blur(fphoneQq);
    $("#phoneform").submit(function () {
        if(!fphoneYzm()) return false;
        if(!fphonePassword()) return false;
        if(!fphoneQq()) return false;
        return true;
    });

    //邮箱注册
    $("#emailSend").click(function () {
        var email = $("#email").val();
        if(email==""&&email.length==0) {
            layer.msg('请填写邮箱哟,不然怎么发送验证码呀!', {icon: 2});
            return false;
        }else {
            time(this);
            $.get("/user/sendEmail", "email=" + email, function (data) {
                layer.msg("发送验证码成功!", {icon: 1});
                $("#emailCode").val(data);
            }, "text");
        }
    });
    var emailYzm=$("#emailYzm");
    var emailPassword=$("#emailPassword");
    var emailQq=$("#emailQq");
    function femailYzm(){
        var emailCode = $("#emailCode");
        if(emailYzm.val()==""&&emailYzm.val().length==0) {
            layer.msg('请填写验证码哦!', {icon: 2});
            return false;
        }else if(emailYzm.val()!=emailCode.val()) {
            layer.msg('验证码不正确哦!', {icon: 2});
            return false;
        }
        return true;
    }
    function femailPassword(){
        if(emailPassword.val()==""&&emailPassword.val().length==0){
            layer.msg('请填写密码哟!', {icon: 2});
            return false;
        }else if($("#emailPassword1").val()!=emailPassword.val()){
            layer.msg('您输入的两次密码不一致哦!', {icon: 2});
            return false;
        }
        return true;
    }
    function femailQq(){
        if(emailQq.val()==""&&emailQq.val().length==0) {
            layer.msg('请填写您的QQ账号哟!', {icon: 2});
            return false;
        }
        return true;
    }
    emailYzm.blur(femailYzm);
    emailPassword.blur(femailPassword);
    emailQq.blur(femailQq);
    $("#emailform").submit(function () {
        if(!femailYzm()) return false;
        if(!femailPassword()) return false;
        if(!femailQq()) return false;
        return true;
    });

});
//点击之后变成重新发送倒计时
var wait=60;
function time(o) {
    if (wait == 0) {
        o.removeAttribute("disabled");
        o.value="获取验证码";
        wait = 60;
    } else {
        o.setAttribute("disabled", true);
        o.value="重新发送"+ wait;
        wait--;
        setTimeout(function() {
            time(o)
        }, 1000)
    }
}