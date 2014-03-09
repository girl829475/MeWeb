
Ext.onReady(function(){
	Ext.QuickTips.init();
	Ext.Loader.setConfig({
		enabled:true
	});
	//Ext.override(Ext.view.Table, { enableTextSelection: true }); // Treepanels
	//Ext.override(Ext.grid.View,  { enableTextSelection: true }); // Grids
	Ext.application({
		name : 'AM',//应用的名字
		appFolder : "app",//应用的目录
		launch:function(){//当前页面加载完成执行的函数
	        Ext.create('Ext.container.Viewport', { //简单创建一个试图
	        	layout:'fit',//自动填充布局
	            border:'0 0 0 0',
	            items: {
	            	xtype: 'MMindex'//,
	                //title: 'ddd',
	                //html : 'ddd'
	            }
	        });
	        
	        this.controllers.addListener('add',this.newControllerAdded,this);
		},
		newControllerAdded:function(idx, ctrlr, token){
		    ctrlr.init();
		},
		controllers:[
			'MMindex'
		]
	});
	 
});