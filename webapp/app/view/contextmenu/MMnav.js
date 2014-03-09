//定义菜单
Ext.define('AM.view.contextmenu.MMnav', {
    extend: 'Ext.menu.Menu',
    xtype: 'listsContextMenu',
    items: [
        {
            text: 'New List',
            iconCls: 'tasks-new-list',
            id: 'new-list-item'
        },
        {
            text: 'New Folder',
            iconCls: 'tasks-new-folder',
            id: 'new-folder-item'
        },
        {
            text: 'Delete',
            iconCls: 'tasks-delete-folder',
            id: 'delete-folder-item'
        }
    ]

});