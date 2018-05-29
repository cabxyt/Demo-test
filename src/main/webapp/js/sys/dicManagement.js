$(function () {
    $("#jqGrid").jqGrid({
        url: '/'+rootPath+'/phDictItemPagination.do',
        datatype: "json",
        colModel: [			
			{ label: 'ID', name: 'dictId', width: 45, key: true,hidden : true },
			{ label: '字典类型', name: 'dictType',index:'dict_Type', width: 75 },
			
			{ label: '字典项编码', name: 'dictItemCode',index:'dict_Item_Code', width: 80}, 
			{ label: '字典项名称', name: 'dictItemName',index:'dict_Item_Name', width: 80}, 
			{ label: '字典项顺序', name: 'showOrder',index:'show_Order', width: 90 },
			{ label: '字典项状态', name: 'itemStatus',index:'item_Status', width: 100, formatter: function(value, options, row){
				if(value=='1'){
					return '<span class="glyphicon glyphicon-ok" style="color:green;">开启</span>';
				}
				if(value=='2'){
					return '<span class="glyphicon glyphicon-remove" style="color:red;">关闭</span>';
				}
				return '<span class="glyphicon glyphicon-remove" style="color:red;"></span>';
			} },
			{ label: '备注', name: 'remark',index:'remark', width: 80},   
			{ label: '操作', name: 'dictId', width: 80, formatter: function(value, options, row){
				return '<a href="dicManagement_update.html?dictId='+value+'" class="btn btn-primary btn-xs col-md-6" role="button">修改</a>';
			}}
        ],
		viewrecords: true,
        height: 400,
        rowNum: 10,
		rowList : [10,30,50],
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
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});
//jQuery("#jqGrid").setGridParam().hideCol("userId").trigger("reloadGrid");
var vm = new Vue({
	el:'#rrapp',
	data:{
		phdictitems:{}
	},
	created : function() {
		// this.getDict();
		this.getPhdictitems();
	},
	methods: {
		queryByName: function (event) {
			reloadGrid();
		},
		getPhdictitems:function(event){
            $.get('/'+rootPath+"/phDictItem.do?dictType=authflag", function(r){
            	vm.phdictitems = r;
    		});
		},
		update: function (event) {
			var empId = getSelectedRow();
			if(empId == null){
				return ;
			}
			
			location.href = "emp_add.html?empId="+empId;
		},
		
		exp: function (event) {
			var arr = new Array;
			arr[0] = "empName=" + $("#empName").val();
			arr[1] = "&";
			arr[2] = "email=" + $("#email").val();
			arr[3] = "&";
			arr[4] = "mobile=" + $("#mobile").val();
			arr[5] = "&";
			arr[6] = "idCode=" + $("#idCode").val();
			arr[7] = "&";
			arr[8] = "authFlag=" + $("#authFlag").val();
			arr[9] = "&";
			arr[10] = "createTimeBegin=" + $("#createTimeBegin").val();
			arr[11] = "&";
			arr[12] = "createTimeEnd=" + $("#createTimeEnd").val();
			arr[13] = "&";
			arr[14] = "ids="+jQuery("#jqGrid").getGridParam("selarrrow");
			var str = arr.join("");
			
			location.href = "/"+window.rootPath+"/emp/export.do?" + str;
		},
		del: function (event) {
			var userIds = getSelectedRows();
			if(userIds == null){
				return ;
			}
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
					contentType :  "application/x-www-form-urlencoded",
				    url: "/"+rootPath+"/emp/delete.do",
				    data : {'jsonList':JSON.stringify(userIds)},  
				    dataType: "json",   
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		}
	}
});
function reloadGrid(){
		$("#jqGrid").jqGrid('setGridParam', {
			page : 1,
			postData : {
				empName : $("#empName").val(),
				email : $("#email").val(),
				mobile : $("#mobile").val(),
				idCode : $("#idCode").val(),
				authFlag : $("#authFlag").val(),
				createTimeBegin : $("#createTimeBegin").val(),
				createTimeEnd : $("#createTimeEnd").val()
			}
		}).trigger("reloadGrid");
}

var beginTimeTake='';
$(document).ready(function() {
	$('#createTimeBegin').daterangepicker({
		 singleDatePicker: true,
	        showDropdowns: true,
	        autoUpdateInput: false,
	        timePicker24Hour : true,
	        timePicker : true,
	        locale : {  
	        	format: 'YYYY-MM-DD HH:mm',
	        	applyLabel : '确定',  
	            cancelLabel : '取消',  
	            fromLabel : '',  
	            toLabel : '至',  
	            customRangeLabel : '自定义',  
	            daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],  
	            monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',  
	                    '七月', '八月', '九月', '十月', '十一月', '十二月' ],  
	            firstDay : 1  
	        }
	    }, 
	    function(start, end, label) {
	        beginTimeTake = start;
	        if(!this.startDate){
	            this.element.val('');
	        }else{
	            this.element.val(this.startDate.format(this.locale.format));
	        }
	});
	$('#createTimeEnd').daterangepicker({
		 singleDatePicker: true,
	        showDropdowns: true,
	        autoUpdateInput: false,
	        timePicker24Hour : true,
	        timePicker : true,
	        locale : {  
	        	format: 'YYYY-MM-DD HH:mm',
	        	applyLabel : '确定',  
	            cancelLabel : '取消',  
	            fromLabel : '',  
	            toLabel : '至',  
	            customRangeLabel : '自定义',  
	            daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],  
	            monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',  
	                    '七月', '八月', '九月', '十月', '十一月', '十二月' ],  
	            firstDay : 1  
	        }
	    }, 
	    function(start, end, label) {
	        beginTimeTake = start;
	        if(!this.startDate){
	            this.element.val('');
	        }else{
	            this.element.val(this.startDate.format(this.locale.format));
	        }
	});
});