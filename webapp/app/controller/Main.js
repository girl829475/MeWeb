Ext.define('AM.controller.Main', {
    extend: 'Ext.app.Controller',
	init:function(){
		 
	},
	onPanelRendered: function() {
        console.log('The tabpanel was rendered:'+this.id);  
    },
	views:[
		'MainView'
	],
	stores :[
	],
	models :[
	]
});