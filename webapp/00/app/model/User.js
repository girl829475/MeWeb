Ext.define('HT.model.User',
	{
		extend:'Ext.data.Model',
		fields:[
		        {name:'id',mapping:'id'},
		        {name:'name',mapping:'name'},
		        {name:'sex',mapping:'sex'},
		        {name:'age',mapping:'age'},
		        {name:'birthdate',mapping:'birthdate',type:'date',dataFormat:'Y-m-d'}
		]
	}
)