$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+getRootPath_web()+'/phExam',
        datatype: "json",
        colModel: [	
			{ label: '体检ID', name: 'examId'},
			{ label: '员工ID', name: 'empId'},
			{ label: '预约标识(来自HELO)', name: 'appointId'},
			{ label: '体检机构ID', name: 'exapOrgId'},
			{ label: '体检机构名称', name: 'exapOrgName'},
			{ label: '预约状态：1、已预约  2、取消预约  3、体检报告已回传   4、体检报告已上传至KJD   5、体检分析数据已取回', name: 'examStatus'},
			{ label: '所属公司', name: 'companyName'},
			{ label: '', name: 'examYear'},
			{ label: '所属公司', name: 'examNo'},
			{ label: '授权标识:1、已授权  2、未授权', name: 'authFlag'},
			{ label: '体检报告ID', name: 'reportId'},
			{ label: '体检报告分析ID(从康健德获取)', name: 'reportAnaId'},
			{ label: '体检套餐', name: 'examCombo'},
			{ label: '体检时间', name: 'examTime'},
			{ label: '预约时间', name: 'appointmentTime'},
			{ label: '取消时间', name: 'cancelTime'},
			{ label: '报告回传时间', name: 'reportBackTime'},
			{ label: '上传员工标识:MD5(身份证号+姓名)', name: 'uploadEmpId'},
			{ label: '', name: 'uploadReportTime'},
			{ label: '从体检机构取回分析结果的时间', name: 'getDataTime'},
			{ label: '创建时间', name: 'createTime'},
			{ label: '', name: 'exapOrgParentName'},
			{ label: '', name: 'exapOrgParentId'},
			{ label: '', name: 'examError'}
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

