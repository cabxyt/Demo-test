//用户ID
var dictId = T.p("dictId");
var vm = new Vue({
	el:'#rrapp',
	data:{
		title:"新增字典信息",
		dict:{
		}
	},
	created: function() {
		if(dictId != null){
			this.title = "查看字典信息";
			this.getdict(dictId)
		}
    },
	methods: {
		getdict: function(dictId){
			var url="/"+rootPath+'/phDictItem.do';
			$.ajax({
				type: "POST",
			    url: encodeURI(url),
				contentType :  "application/x-www-form-urlencoded",
				data: {'dictId':dictId},
			    dataType: "json", 
			    success: function(r){
						vm.dict = r[0];
				}
			});
		},
		saveOrUpdate: function (event) {
			var url = vm.dict.dictId == null ? "/"+rootPath+"/savePhDictItem.do" : "/"+rootPath+"/updatePhDictItem.do";
			console.log(JSON.stringify(vm.dict));
			$.ajax({
				type: "POST",
			    url: url,
				contentType :  "application/json;charset=utf-8",
			    data: JSON.stringify(vm.dict),
			    success: function(r){
					alert('操作成功', function(index){
						vm.back();
					});
				}
			});
		},
		back: function (event) {
			history.go(-1);
		}
	}
});