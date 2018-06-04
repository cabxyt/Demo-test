$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+getRootPath_web()+'/phEmpIdentity',
        datatype: "json",
        colModel: [	
			{ label: '描述', name: 'empId'},
			{ label: '唯一号', name: 'uniquNo'},
			{ label: '姓名', name: 'empName'},
			{ label: '证件类型', name: 'idType'},
			{ label: '性别', name: 'gender'},
			{ label: '证件号码', name: 'idCode'},
			{ label: '手机号', name: 'mobile'},
			{ label: '邮箱', name: 'email'},
			{ label: '出生日期', name: 'birthDate'},
			{ label: '民族', name: 'nation'},
			{ label: '国籍', name: 'country'},
			{ label: '授权标识:1、已授权  2、未授权', name: 'authFlag'},
			{ label: '访问TOKEN', name: 'accessToken'},
			{ label: 'TOKEN获取时间', name: 'tokenTime'},
			{ label: '操作人Id', name: 'creator'},
			{ label: '操作人名称', name: 'creatorName'},
			{ label: '操作时间', name: 'createTime'},
			{ label: '', name: 'userid'}
        ],
		viewrecords: true,
        height: 400,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "list",
            page: "currPage",
            total: "totalPage",
            records: "totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order",
            sidx: "sidx"
        },
        gridComplete:function(){
        	//闅愯棌grid搴曢儴婊氬姩鏉�
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});
var vm = new Vue({
	el:'#rrapp',
	data:{
	},
	created : function() {
	},
	methods: {
		update: function (event) {
		}
	}
});

