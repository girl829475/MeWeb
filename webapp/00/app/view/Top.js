Ext.define('HT.view.Top',{
	extend:'Ext.Component',
	alias:'widget.top',//注意不要忘了写“widget”否则会找不到并且报错<a href="http://blog.csdn.net/lc448986375/article/details/8014401" style="color: rgb(0, 0, 0); text-decoration: none; font-family: 'Microsoft YaHei'; line-height: 30px; "><span style="font-size:10px;">Uncaught TypeError: Cannot call method 'substring' of undefined</span></a>
	padding: 10,
	html:'欢迎使用',
	region:'north'
});