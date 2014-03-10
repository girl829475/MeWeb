Ext.Loader.setConfig({
    enabled: true
});
Ext.Loader.setPath('Ext.ux', '/extjs/4.2.1/ux');
Ext.require([
	'Ext.ux.IFrame'
]);
Ext.define("AM.view.MMindex",{
	extend:'Ext.panel.Panel',
	alias: 'widget.MMindex',
	uses: [
        'AM.view.app.PortalPanel', 
        'AM.view.app.PortalColumn',
        'AM.view.portal.PortletPanel',
        'AM.view.portal.WestMenu',
        'AM.view.portlet.GridPortlet', 
        'AM.view.portlet.ChartPortlet',
        'AM.util.Constants',
        'AM.view.MMnav'
    ],
    //plugins:[Ext.create('Ext.ux.IFrame', {})],
	//title: '容器面板',
    layout: 'border',
	border:false,
    defaults: {
        split: false,                 //是否有分割线
        collapsible: true//,           //是否可以折叠
        //bodyStyle: 'padding:15px'
    },
    items: [{
        region: 'north',            //子元素的方位：north、west、east、center、south
        title: 'SPRO SRM快速部署云平台',
        xtype: "panel",
 		border:false,
        html: "",
        height: 70
    }/*, {
        region: 'west',
        title: '西',
        xtype: "panel",
        html: "子元素2",
        width: 100
 
    }, {
        region: 'east',
        title: '东',
        xtype: "panel",
        html: "子元素2",
        width: 100
 
    }*/, {
        region: 'center',
        title: '主体',
		header:false,
        xtype: 'tabpanel', // TabPanel本身没有title属性
		id:'mm_tabpanel',
        activeTab: 0,      // 配置默认显示的激活面板
        listeners:{
	        remove:function(tab,ownerCt,eOpts){
	        	//tab.destroy();
	        	//alert("关闭");
	        }/*, 
        	activate:function(me,eOpts){
        		alert("333");
        		
        	}*/
           /* ,
            destroy : function() {
			    alert("关闭");
			   } */
            
        },
        closable:true,
        items:[ {
            title: '我的门户',
            xtype: "panel",
            layout: 'border',
            defaults: {
		        split: true,                 //是否有分割线
		        collapsible: false//,           //是否可以折叠
		        //bodyStyle: 'padding:15px'
		    },
            items:[{
		        region: 'west',
		        title: '导航菜单',
				xtype:	'panel',
		        layout: "accordion",
				margins:'5 0 5 5',
		        width: 200,
		 		items: [{
			        tools: [{ type: 'gear', handler: function () {
			            Ext.Msg.alert('提示', '配置按钮被点击。');
			        }
			        }, { type: 'refresh',itemId:'refreshNav'}],
			         xtype:'mmnav'
				    }, {
				        title: '云平台设置1'
				    },{
				        title: '云平台设置2'
				    }, {
				        id: 'panel3',
				        title: '个人信息',
				        xtype: "panel",
				        html: "个人信息"
				    }]
		    },{
		        region: 'center',
				margins:'5 5 5 0',
		        title: '主体',
                xtype: 'container',
                region: 'center',
                layout: 'border',
                items: [{
                    id: 'app-portal',
                    xtype: 'portletpanel',
                    region: 'center'
                }]
            }]
        }]
    }, {
        region: 'south',
        //title: '南',
		header:false,
		border:false,
        xtype: "panel",
        html: "深圳爱思普信息咨询有限公司广州分公司版权所有",
        height: 21
    }]
});