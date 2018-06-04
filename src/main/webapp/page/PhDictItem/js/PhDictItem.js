$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+getRootPath_web()+'/phDictItem',
        datatype: "json",
        colModel: [	
			{ label: '字典项Id', name: 'dictId'},
			{ label: '字典类型', name: 'dictType'},
			{ label: '字典项编码', name: 'dictItemCode'},
			{ label: '字典项名称', name: 'dictItemName'},
			{ label: '字典项顺序', name: 'showOrder'},
			{ label: '字典项状态：1、开启 2、关闭', name: 'itemStatus'},
			{ label: '备注', name: 'remark'}
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

