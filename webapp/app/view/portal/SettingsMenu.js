Ext.define('AM.view.portal.SettingsMenu', {
    extend: 'Ext.panel.Panel',    
    
    alias: 'widget.settings',
    
    initComponent: function() {
        
        Ext.apply(this, {

            title:'Settings',
            html: AM.util.Constants.shortBogusMarkup,
            border: false,
            autoScroll: true,
            iconCls: 'settings'
            
        });
                
        this.callParent(arguments);
    }
});
