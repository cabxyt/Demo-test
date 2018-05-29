//jqGrid的配置信息
$.jgrid.defaults.width = 1000;
$.jgrid.defaults.responsive = true;
$.jgrid.defaults.styleUI = 'Bootstrap';

//工具集合Tools
window.T = {};
//根目录

window.rootPath="phexaweb";
// 获取请求参数
// 使用示例
// location.href = http://localhost:8080/index.html?id=123
// T.p('id') --> 123;
var url = function(name) {
	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r!=null)return  unescape(r[2]); return null;
};
T.p = url;

//layer扩展皮肤
if(parent && parent.layer){
	parent.layer.config({
	    skin:'layui-layer-lan'
	});
}

//全局配置
$.ajaxSetup({
	dataType: "json",
	contentType: "application/json",
	cache: false
});

//重写alert
window.alert = function(msg, callback){
	parent.layer.alert(msg, function(index){
		parent.layer.close(index);
		if(typeof(callback) === "function"){
			callback("ok");
		}
	});
}

//重写confirm式样框
window.confirm = function(msg, callback){
	parent.layer.confirm(msg, {btn: ['确定','取消']},
	function(){//确定事件
		if(typeof(callback) === "function"){
			callback("ok");
		}
	});
}

//选择一条记录
function getSelectedRow() {
    var grid = $("#jqGrid");
    var rowKey = grid.getGridParam("selrow");
    if(!rowKey){
    	alert("请选择一条记录");
    	return ;
    }
    
    var selectedIDs = grid.getGridParam("selarrrow");
    if(selectedIDs.length > 1){
    	alert("只能选择一条记录");
    	return ;
    }
    
    return selectedIDs[0];
}

//选择多条记录
function getSelectedRows() {
    var grid = $("#jqGrid");
    var rowKey = grid.getGridParam("selrow");
    if(!rowKey){
    	alert("请选择一条记录");
    	return ;
    }
    
    return grid.getGridParam("selarrrow");
}
//获取根路径
function getRootPath_web() {
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht = curWwwPath.substring(1, pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName = pathName.substring(1, pathName.substr(1).indexOf('/') + 1);
    return ( projectName);
}
function getThreeTenDate(){
	var date1 = new Date();
	var date2 = new Date(date1);
	date2.setDate(date1.getDate() - 30);
	return date2.getFullYear() + "-" + buquan((date2.getMonth() + 1),2) + "-" + buquan(date2.getDate(),2)+" 00:00";
}
function buquan(num,length){
    var numstr = num.toString();
    var l=numstr.length;
    if (numstr.length>=length) {return numstr;}
      
    for(var  i = 0 ;i<length - l;i++){
      numstr = "0" + numstr;  
     }
    return numstr; 
}
