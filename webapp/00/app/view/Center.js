Ext.define('HT.view.Center', {
	extend : 'Ext.tab.Panel',
	// layout:'fit',
	// 注意 加上widget.
	alias : 'widget.center',
	region : 'center',
	activeTab : 0,
	items : [{
				title : '主页',
				html : '欢迎使用后台管理系统 版本1.0'
			}],
	initComponent : function() {
		this.callParent(arguments);
	}
});