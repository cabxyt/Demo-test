var vm = new Vue({
	el:'#rrapp',
	data:{
		user:{},
		menuList:{},
		main:"page/sys/main.html",
		password:'',
		newPassword:'',
		newAgainPassword:'',
        navTitle:"控制台"
	},
	methods: {
		getMenuList: function (event) {
			$.getJSON("sys/menu?_"+$.now(), function(r){
				vm.menuList = r;
			});
			/*$.getJSON("js/menu.json", function(data){
				vm.menuList = data;			
			});*/
		},
		getUser: function(){
			$.getJSON("sys/user/info?_"+$.now(), function(r){
				vm.user = r.data;
			});
		},
		updatePassword: function(){
			layer.open({
				type: 1,
				skin: 'layui-layer-lan',
				title: "修改密码",
				area: ['550px', '270px'],
				shadeClose: false,
				content: jQuery("#passwordLayer"),
				btn: ['修改','取消'],
				btn1: function (index) {
					var data = JSON.stringify({             //必须将数据格式转换为json字符串格式(关键)
						"password": vm.password,
						"newPassword": vm.newPassword,
						"newAgainPassword":vm.newAgainPassword
		             });
					$.ajax({
						type: "POST",
					    url: "sys/user/password",
					    data: data,
					    dataType: "json",
					    contentType: "application/json",
					    success: function(result){
							if(result.success){
								layer.close(index);
								layer.alert('修改成功', function(index){
									location.reload();
								});
							}else{
								layer.alert(result.message);
							}
						}
					});
	            }
			});
		}
	},
	created: function(){
		this.getMenuList();
		this.getUser();
	},
	updated: function(){
		//路由
		var router = new Router();
		routerList(router, vm.menuList);
		router.start();
	}
});



function routerList(router, menuList){

	for(var key in menuList){

		var menu = menuList[key];

//		if(menu.type == 0||menu.type == 2){
//			routerList(router, menu.list);
//		}else if(menu.type == 1||menu.type == 3){
			router.add('#'+menu.url, function() {
				var url = window.location.hash;
				//替换iframe的url
			    vm.main = url.replace('#', '');
			    //导航菜单展开
			    $(".treeview-menu li").removeClass("active");
			    $("a[href='"+url+"']").parents("li").addClass("active");
			    
			    vm.navTitle = $("a[href='"+url+"']").text();
			});
//		}
	}
}
