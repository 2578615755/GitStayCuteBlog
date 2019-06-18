$(function () {
    $(".siztitle").html($("#postTitle").val());
    $(".content").html($("#postContent").val());
    $(".time").html($("#createTime").val());
    $("#user-name,.name").html($("#name").val());
    $("#qqtitle,.mi").click(function () {
        $(".data").show();
    });
    $(".data-hide-btn").click(function () {
        $(".data").hide();
    });
    $(".data-hide-btn,.data-update-btn").hover(function () {
        $(this).css("backgroundColor","#BBAC5C");
    },function () {
        $(this).css("backgroundColor","transparent");
    });
    $("#qqlianxi").click(function () {
        window.open("http://wpa.qq.com/msgrd?v=3&uin=2578615755&site=oicqzone.com&menu=yes");
    })
})