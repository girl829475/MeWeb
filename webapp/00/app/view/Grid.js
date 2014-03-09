Ext.define('HT.view.Grid',{
	extend:'Ext.grid.Panel',
	title : '人员列表',
	
	initComponent:function(){
		Ext.apply(this,{
		    store:'Users',
			columns: [//配置表格列
				new Ext.grid.RowNumberer(),//表格行号组件
				{header: "编号", width: 80, dataIndex: 'id', sortable: true},
				{header: "姓名", width: 80, dataIndex: 'name', sortable: true},
				{header: "年龄", width: 80, dataIndex: 'age', sortable: true},
				{header: "性别", width: 80, dataIndex: 'sex', sortable: true},
				{header: "生日", width: 80, dataIndex: 'birthdate', sortable: true}
			]
		}),
		this.callParent(arguments);
	}
});