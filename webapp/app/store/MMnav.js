Ext.define("AM.store.MMnav", {
	extend : "Ext.data.TreeStore",
	model : 'AM.model.MMnav',
	storeId: 's_nav',
	proxy : {
		type : 'ajax',
		api : {
			create : 'TreeApiController.do?method=createTreeNode',
			read : 'TreeApiController.do?method=queryTreeList',
			update : 'TreeApiController.do?method=updateTreeNode',
			destroy : 'TreeApiController.do?method=destroyTreeNode'
		},
		writer : {
			type : 'json',
			allowSingle : false,
			encode : true,
			root : 'records'
		}
	},
	root : {
		id : -1,
		expanded : true,
		text : "My Root"
		},
		autoLoad : true
});