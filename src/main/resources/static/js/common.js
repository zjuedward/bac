// 获取url的get传值函数
function getvl(name) {
    var reg = new RegExp("(^|\\?|&)"+ name +"=([^&]*)(\\s|&|$)", "i");
    if (reg.test(decodeURI(location.href))) return unescape(RegExp.$2.replace(/\+/g, " "));
    return "";
}