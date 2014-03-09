Ext.define('AM.model.MMnav', {
	extend : 'Ext.data.Model',
	fields : [{
				name : 'id',
				type : 'string'
			}, {
				name : 'text',
				type : 'string'
			}, {
				name : 'index',
				type : 'int',
				persist : true
			}]
});