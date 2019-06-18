$(function () {
    if($("#msg").val().length!=0){
        layer.msg($("#msg").val(), {icon: 6});
    }
    $.get("/post/findAll","",function (data) {
        var posttext="";
        for (var i = 0; i <data.length ; i++) {
            posttext+="<li>\n" +
                "            <div class=\"blog-left\">\n" +
                "                <p ><a href=\"#\" class=\"title\" name='"+data[i].postId+"' onclick='detail(this)'>"+data[i].postTitle+"</a></p>\n" +
                "                <p style=\"margin-top: 20px\">"+data[i].postContent+"</p>\n" +
                "                <p style=\"margin-top: 90px\"><img src=\"http://img.php.cn/upload/course/000/000/004/58170f99f2430105.png\" >呆萌<img src=\"http://img.php.cn/upload/course/000/000/004/58170fbda3f34844.png\" style=\"margin-left: 20px\">"+data[i].createTime+"</p>\n" +
                "            </div>\n" +
                "            <div class=\"blog-right\"><img src=\""+data[i].postImg+"\"></div>\n" +
                "            <input type='hidden'  value='"+data[i].postId+"' name='postId' > \n"+
                "        </li>";
        }
        $("#tiezi").html(posttext);
    });
    $("#user-name").html($("#name").val());
    $("#qqtitle,.mi").click(function () {
        $(".data").show();
    });
    if($("#userPermission").val()=="1"){
        $("#menu ul").append("<li><a href='/admin/main'>后台管理</a></li>");
    }
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
});
function detail(jq) {
    var postid=$(jq).attr("name");
    var id=$("#id").val();
    location.href="/post/findPostById?postId="+postid+"&id="+id;
}