Ext.define('HT.view.Accordion',{
	extend:'Ext.panel.Panel',
	title:'系统设置',
	alias:'widget.accordion',
	collapsible: true,
	split:true,
	width:200,
	layout:'accordion',
	region:'west',
	layoutConfig: {          
        titleCollapse: true,    //设置为点击整个标题栏都可以收缩     
        animate: true,  //开启默认动画效果         
        activeOnTop: true   //展开的面板总是在最顶层        
    },
    items:[
    	{  
            title:'首页设置',
            items:[
            	{
            		xtype:'button',
            		width:150,
            		id:'homePageSet',
            		text:'首页管理'
            	},{
            		xtype:'button',
            		width:150,
            		id:'adminSet',
            		text:'管理员管理'
            	}
            ]
        },{  
            title:'导航栏设置',  
            html:'导航栏'  
        },{  
            title:'文章设置',  
            html:'文章设置'  
        },{
        	title:'留言设置',
        	html:'留言'
        }
    ]
});