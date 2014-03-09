Ext.define('AM.view.portal.NavigationMenu', {
    extend: 'Ext.panel.Panel',    
    
    alias: 'widget.navigation',
    
    initComponent: function() {
        
        Ext.apply(this, {

            html: AM.util.Constants.shortBogusMarkup,
            title:'Navigation',
            autoScroll: true,
            border: false,
            iconCls: 'nav'
            
        });
                
        this.callParent(arguments);
    }
});
