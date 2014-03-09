
Ext.define("AM.view.MainView",{
	extend:'Ext.panel.Panel',
	alias: 'widget.MainView',
	layout:'border',
	items:[{
            region: 'north',
            margin: '5 5 0 5',
            header: false,
            split: true,
            collapsible: true,
            collapseMode: 'mini',
            hideCollapseTool: true,
            //contentEl: 'top_box',
            html:'dfsdf',
            height: 45
        },{
            region: 'west',
            title: '功能菜单',
            width:150,
            html:'sdfsd'
        },{
        	region: 'center'
        }]
});