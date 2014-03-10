Ext.define('AM.store.MMnav', {
	extend : 'Ext.data.TreeStore',
	//defaultRootId : 'root',
	root: {
		//name:'name',
	    //expanded: true
	},
	model : 'AM.model.MMnav',
	proxy : {
		type : 'ajax',
		url:'/core/og/list?num=2',
		reader:'json'
	},
	autoLoad: true
});