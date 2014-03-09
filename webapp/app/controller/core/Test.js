Ext.define("AM.controller.core.Test",{
	extend:'Ext.app.Controller',
	refs: [
	   {ref:'displayPanel',selector:'panel[itemId=EmbedHere]'}
	],
	init:function(){
		//var panel=this.getDisplayPanel();
    	//panel.removeAll();
	},
	views:[
		'core.TestView'
	]
});