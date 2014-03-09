Ext.Loader.setConfig({enabled:true});//必须加这句，否则会报错
Ext.application({
		//定义命名控件
		name:'HT',
		//定义文件夹
		appFolder:'00/app',
		//添加控制器
		controllers:['Controller'],
		//页面完全加载后将运行此方法
		launch:function() {
	        Ext.create('Ext.container.Viewport', {
	        	//布局方式
	        	layout:'border',
	            items: [{
	            			xtype:'top'//这里可以写对应view的alias的属性
	            		},{
	                    	xtype:'accordion'
	                    },{
	                    	xtype:'center'
	                    },{
	                    	xtype:'bottom'
	                    }
	            ]
	        });
	    }
	}
);