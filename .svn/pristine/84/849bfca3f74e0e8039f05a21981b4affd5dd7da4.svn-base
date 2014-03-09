Ext.define('AM.view.Viewport', {

    extend: 'Ext.container.Viewport',
   
    uses: [
        'AM.view.app.PortalPanel', 
        'AM.view.app.PortalColumn',
        'AM.view.portal.PortletPanel',
        'AM.view.portal.WestMenu',
        'AM.view.portlet.GridPortlet', 
        'AM.view.portlet.ChartPortlet',
        'AM.util.Constants'
    ],

    initComponent: function(){

        Ext.apply(this, {
            id: 'app-viewport',
            layout: {
                type: 'border',
                padding: '0 5 5 5'
            },
            items: [{
                id: 'app-header',
                xtype: 'box',
                region: 'north',
                height: 40,
                html: 'Ext Portal'
            },{
                xtype: 'container',
                region: 'center',
                layout: 'border',
                items: [{
                    id: 'app-options',
                    xtype: 'westmenu',
                    region: 'west'
                },{
                    id: 'app-portal',
                    xtype: 'portletpanel',
                    region: 'center'
                }]
            }]
        });
        this.callParent(arguments);
    }
});
