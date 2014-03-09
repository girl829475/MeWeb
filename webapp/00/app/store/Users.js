Ext.define('HT.store.Users',{
	extend:'Ext.data.Store',
	model:'HT.model.User',
	autoLoad:true,
	proxy: {
        type: 'ajax',
        url:'/core/dd/list/0',
        reader: {
            type: 'json',
            root: /*'topics'*/'content',
	        totalProperty: 'totalElements'
        },writer:{
			type:'json'
		}
    }
});