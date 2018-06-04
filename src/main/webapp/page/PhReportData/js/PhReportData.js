$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+getRootPath_web()+'/phReportData',
        datatype: "json",
        colModel: [	
			{ label: '体检ID', name: 'examId'},
			{ label: '员工ID', name: 'examData'},
			{ label: '创建时间', name: 'createTime'}
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

