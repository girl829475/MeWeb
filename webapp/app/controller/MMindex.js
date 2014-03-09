Ext.define('AM.controller.MMindex', {
    extend: 'Ext.app.Controller',
	init:function(){
		this.control({
			'viewport > panel':{
				render : this.onPanelRendered
			},
			'treepanel':{
				itemclick:function(tree,record,item,index,e,options){
					//alert(record.get('id'));
					//单击创建组件
					//click:this.populateCenterPanel
					//var me = this;
					//var tab = this.ownerCt.centerPart.getComponent('tab_sys_' + record.get('id'));
					//alert(tab);
					
					//判断是否Tab是否存在
					var tab = Ext.getCmp('adminSetTab');
					if(!tab){
						
						
						/*this.getController('DataDic');
						var newitem = Ext.create("AM.view.DataDic", {});
						tab = Ext.create('Ext.panel.Panel', {
                            title: record.get('text'),
                            itemId: 'tab_sys_' + record.get('id'),
                            layout: 'fit',
                            closable: true,
                            iconCls: record.get('iconCls') || 'icon_preview',
                            items: newitem
                        });
                        
						Ext.getCmp('mm_tabpanel').add(tab);
						Ext.getCmp('mm_tabpanel').setActiveTab(tab);
						
						return;*/
						
						//DeptController
						//DataDic
						//this.getController('DataDic');
						//Ext.getCmp('mm_tabpanel').add([{title:'Tab 1',id:"adminSetTab",xtype:'container',layout:'fit',items:[{xtype:'ddView'}],closable:true,closeAction:'destory',autoDestory:true}]);
						/*Ext.getCmp('mm_tabpanel').add({
							title:'Tab1',
							xtype:'panel',
							id:'adminSetTab',
							loader:{
								url:'/core/dd/init',
								autoLoad:true,
								loadMask:true,
								scripts:true,
								text:'loading....'
							},
							listeners:{
								activate:function(me,eOpts){
									me.loader.load();
									
									
								}
							}
						});*/
						
            
						tab = Ext.getCmp('mm_tabpanel').add(new Ext.ux.IFrame({
		                    xtype: 'iframepanel',
		                    id: "tab_" + record.id,
		                    title: 'test',
		                    iconCls: '',
		                    closable: true,
		                    layout: 'fit',
		                    loadMask: '正在加载业务组件...',
		                    border: false//,
		                   //src:'/core/dd/init'
							/*layout: "fit",
                			items: iframe,
                			title: "Panel里面是一个Iframe"*/
		                }));
						
						Ext.getCmp('mm_tabpanel').setActiveTab("tab_" + record.id);  
						tab.load('/core/dd/init');
					}else{
						tab.show(); 
					}
					
					//new Ext.createWidget('ddView')
					
				}/*,
				onItemClick:function (view, rec, item, idx, e) {
					alert(3);
				}*/	
				 
			}/*,
			"depTree":{
				itemclick:function(tree,record,item,index,e,options){
					//alert(record.get('id'));
					//单击创建组件
					//click:this.populateCenterPanel
					this.getController('DeptController');
					Ext.getCmp('mm_tabpanel').add([{title:'Tab 1',items:[new Ext.createWidget('deptlist')]}]);
					
				}
			}*/
		});
	},
	//stores:["AM.store.DeptStore4Tree"],
	onPanelRendered: function() {
		//this.add([{title:'Tab 1'}, {title:'Tab 2'}]);
		//for(var i=0;i<20;i++)
		
		//Ext.getCmp('mm_tabpanel').add([{title:'Tab 1'}]);
		//Ext.getCmp('mm_tabpanel').add([{title:'Tab 2'}]);
		//var mainLayout = Ext.createWidget('mainlayout');
		//Ext.getCmp('mm_tabpanel').add(Ext.createWidget('mainlayout'));
        console.log('The tabpanel was rendered:'+this.id);  
    },
	views:[
		'MMindex'
	],
	stores :[
		//"DataDic"
	],
	models :[
		//"DataDic"
	]
});