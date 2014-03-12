Ext.Loader.setConfig({enabled:true});//必须加这句，否则会报错
Ext.application({
		//定义命名控件
		name:'AM',
		//定义文件夹
		appFolder:'A0/app',
		//添加控制器
		controllers:['LoginController'],
		requires:['AM.view.Login'],
		//页面完全加载后将运行此方法
		launch:function() {
	        Ext.create('AM.view.Login').show();
	    }
	}
);