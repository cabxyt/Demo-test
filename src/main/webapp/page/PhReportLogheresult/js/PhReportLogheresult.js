$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+getRootPath_web()+'/phReportLogheresult',
        datatype: "json",
        colModel: [	
			{ label: '', name: 'id'},
			{ label: '', name: 'doctor'},
			{ label: '', name: 'logreportid'},
			{ label: '', name: 'resultvalue'},
			{ label: '', name: 'unit'},
			{ label: '', name: 'resultid'},
			{ label: '', name: 'createtime'},
			{ label: '', name: 'reportcode'},
			{ label: '', name: 'dictname'},
			{ label: '', name: 'examtime'},
			{ label: '', name: 'dictdepart'},
			{ label: '', name: 'refvalue'},
			{ label: '', name: 'status'}
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

