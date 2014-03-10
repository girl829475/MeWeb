Ext.define("AM.view.MMnav", {
	extend : 'Ext.tree.Panel',
	alias: 'widget.mmnav',
	store : 'MMnav',
	itemId:'nav_tree',
	hideHeaders : true,
	rootVisible : false,
	displayField:'name',
	animate:true,
	animCollapse :true
});