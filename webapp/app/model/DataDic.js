//User��
Ext.define('AM.model.DataDic', {
    extend: 'Ext.data.Model',
	fields: [
		{name: 'keyVal',  type: 'string',sortable : true},
	    {name: 'type',   type: 'string',sortable : true},
	    {name: 'pid',   type: 'int',sortable : true},
	    {name: 'type',   type: 'string',sortable : true},
	    {name: 'descEnUs',   type: 'string',sortable : true},
	    {name: 'descZhTw',   type: 'string',sortable : true},
	    {name: 'descZhCn',   type: 'string',sortable : true}
	]
});