<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toDataDic.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<link rel="stylesheet" type="text/css" href="/extjs/4.2.1/resources/css/ext-all.css"/>
	<script type="text/javascript" src="/extjs/4.2.1/bootstrap.js"></script>
	<script type="text/javascript" src="/extjs/4.2.1/locale/ext-lang-zh_CN.js"></script>
	<script type="text/javascript" src="/app.js?20"></script>
	
<style type="text/css">
 #loading-mask {
	Z-INDEX: 20000;
	LEFT: 0px;
	WIDTH: 100%;
	POSITION: absolute;
	TOP: 0px;
	HEIGHT: 100%;
	BACKGROUND-COLOR: white
}
#loading {
	PADDING-RIGHT: 2px;
	PADDING-LEFT: 2px;
	Z-INDEX: 20001;
	LEFT: 40%;
	PADDING-BOTTOM: 2px;
	PADDING-TOP: 2px;
	POSITION: absolute;
	TOP: 40%;
	HEIGHT: auto
}
#loading IMG {
	MARGIN-BOTTOM: 5px
}
#loading .loading-indicator {
	PADDING-RIGHT: 10px;
	PADDING-LEFT: 10px;
	BACKGROUND: white;
	PADDING-BOTTOM: 10px;
	MARGIN: 0px;
	FONT: 12px 宋体, arial, helvetica;
	COLOR: #555;
	PADDING-TOP: 10px;
	HEIGHT: auto;
	TEXT-ALIGN: center
}
</style>
<script type="text/javascript">
Ext.EventManager.on(window, 'load', function(){
	 setTimeout(
		 function() {
			Ext.get('loading').remove();
			Ext.get('loading-mask').fadeOut({remove:true});
			}, 100); 
});
</script>
<DIV id=loading-mask></DIV>
<DIV id=loading>
<DIV class=loading-indicator><IMG style="MARGIN-RIGHT: 5px" 
	height=16
	src="/resources/images/ajax.gif"
	width=16 align=absMiddle>正在初始化,请稍等...</DIV>
</DIV>
  </head>
  
  <body>
     <!-- use class="x-hide-display" to prevent a brief flicker of the content -->
    <div id="west" class="x-hide-display">
        <p>Hi. I'm the west panel.</p>
    </div>
    <div id="center2" class="x-hide-display">
        <a id="hideit" href="#">Toggle the west region</a>
        <p>My closable attribute is set to false so you can't close me. The other center panels can be closed.</p>
        <p>The center panel automatically grows to fit the remaining space in the container that isn't taken up by the border regions.</p>
        <hr>
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed metus nibh, sodales a, porta at, vulputate eget, dui. Pellentesque ut nisl. Maecenas tortor turpis, interdum non, sodales non, iaculis ac, lacus. Vestibulum auctor, tortor quis iaculis malesuada, libero lectus bibendum purus, sit amet tincidunt quam turpis vel lacus. In pellentesque nisl non sem. Suspendisse nunc sem, pretium eget, cursus a, fringilla vel, urna. Aliquam commodo ullamcorper erat. Nullam vel justo in neque porttitor laoreet. Aenean lacus dui, consequat eu, adipiscing eget, nonummy non, nisi. Morbi nunc est, dignissim non, ornare sed, luctus eu, massa. Vivamus eget quam. Vivamus tincidunt diam nec urna. Curabitur velit. Quisque dolor magna, ornare sed, elementum porta, luctus in, leo.</p>
        <p>Donec quis dui. Sed imperdiet. Nunc consequat, est eu sollicitudin gravida, mauris ligula lacinia mauris, eu porta dui nisl in velit. Nam congue, odio id auctor nonummy, augue lectus euismod nunc, in tristique turpis dolor sed urna. Donec sit amet quam eget diam fermentum pharetra. Integer tincidunt arcu ut purus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla blandit malesuada odio. Nam augue. Aenean molestie sapien in mi. Suspendisse tincidunt. Pellentesque tempus dui vitae sapien. Donec aliquam ipsum sit amet pede. Sed scelerisque mi a erat. Curabitur rutrum ullamcorper risus. Maecenas et lorem ut felis dictum viverra. Fusce sem. Donec pharetra nibh sit amet sapien.</p>
        <p>Aenean ut orci sed ligula consectetuer pretium. Aliquam odio. Nam pellentesque enim. Nam tincidunt condimentum nisi. Maecenas convallis luctus ligula. Donec accumsan ornare risus. Vestibulum id magna a nunc posuere laoreet. Integer iaculis leo vitae nibh. Nam vulputate, mauris vitae luctus pharetra, pede neque bibendum tellus, facilisis commodo diam nisi eget lacus. Duis consectetuer pulvinar nisi. Cras interdum ultricies sem. Nullam tristique. Suspendisse elementum purus eu nisl. Nulla facilisi. Phasellus ultricies ullamcorper lorem. Sed euismod ante vitae lacus. Nam nunc leo, congue vehicula, luctus ac, tempus non, ante. Morbi suscipit purus a nulla. Sed eu diam.</p>
        <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras imperdiet felis id velit. Ut non quam at sem dictum ullamcorper. Vestibulum pharetra purus sed pede. Aliquam ultrices, nunc in varius mattis, felis justo pretium magna, eget laoreet justo eros id eros. Aliquam elementum diam fringilla nulla. Praesent laoreet sapien vel metus. Cras tempus, sapien condimentum dictum dapibus, lorem augue fringilla orci, ut tincidunt eros nisi eget turpis. Nullam nunc nunc, eleifend et, dictum et, pharetra a, neque. Ut feugiat. Aliquam erat volutpat. Donec pretium odio nec felis. Phasellus sagittis lacus eget sapien. Donec est. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;</p>
        <p>Vestibulum semper. Nullam non odio. Aliquam quam. Mauris eu lectus non nunc auctor ullamcorper. Sed tincidunt molestie enim. Phasellus lobortis justo sit amet quam. Duis nulla erat, varius a, cursus in, tempor sollicitudin, mauris. Aliquam mi velit, consectetuer mattis, consequat tristique, pulvinar ac, nisl. Aliquam mattis vehicula elit. Proin quis leo sed tellus scelerisque molestie. Quisque luctus. Integer mattis. Donec id augue sed leo aliquam egestas. Quisque in sem. Donec dictum enim in dolor. Praesent non erat. Nulla ultrices vestibulum quam.</p>
        <p>Duis hendrerit, est vel lobortis sagittis, tortor erat scelerisque tortor, sed pellentesque sem enim id metus. Maecenas at pede. Nulla velit libero, dictum at, mattis quis, sagittis vel, ante. Phasellus faucibus rutrum dui. Cras mauris elit, bibendum at, feugiat non, porta id, neque. Nulla et felis nec odio mollis vehicula. Donec elementum tincidunt mauris. Duis vel dui. Fusce iaculis enim ac nulla. In risus.</p>
        <p>Donec gravida. Donec et enim. Morbi sollicitudin, lacus a facilisis pulvinar, odio turpis dapibus elit, in tincidunt turpis felis nec libero. Nam vestibulum tempus ipsum. In hac habitasse platea dictumst. Nulla facilisi. Donec semper ligula. Donec commodo tortor in quam. Etiam massa. Ut tempus ligula eget tellus. Curabitur id velit ut velit varius commodo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla facilisi. Fusce ornare pellentesque libero. Nunc rhoncus. Suspendisse potenti. Ut consequat, leo eu accumsan vehicula, justo sem lobortis elit, ac sollicitudin ipsum neque nec ante.</p>
        <p>Aliquam elementum mauris id sem. Vivamus varius, est ut nonummy consectetuer, nulla quam bibendum velit, ac gravida nisi felis sit amet urna. Aliquam nec risus. Maecenas lacinia purus ut velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse sit amet dui vitae lacus fermentum sodales. Donec varius dapibus nisl. Praesent at velit id risus convallis bibendum. Aliquam felis nibh, rutrum nec, blandit non, mattis sit amet, magna. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam varius dignissim nibh. Quisque id orci ac ante hendrerit molestie. Aliquam malesuada enim non neque.</p>
    </div>
    <div id="center1" class="x-hide-display">
        <p><b>Done reading me? Close me by clicking the X in the top right corner.</b></p>
        <p>Vestibulum semper. Nullam non odio. Aliquam quam. Mauris eu lectus non nunc auctor ullamcorper. Sed tincidunt molestie enim. Phasellus lobortis justo sit amet quam. Duis nulla erat, varius a, cursus in, tempor sollicitudin, mauris. Aliquam mi velit, consectetuer mattis, consequat tristique, pulvinar ac, nisl. Aliquam mattis vehicula elit. Proin quis leo sed tellus scelerisque molestie. Quisque luctus. Integer mattis. Donec id augue sed leo aliquam egestas. Quisque in sem. Donec dictum enim in dolor. Praesent non erat. Nulla ultrices vestibulum quam.</p>
        <p>Duis hendrerit, est vel lobortis sagittis, tortor erat scelerisque tortor, sed pellentesque sem enim id metus. Maecenas at pede. Nulla velit libero, dictum at, mattis quis, sagittis vel, ante. Phasellus faucibus rutrum dui. Cras mauris elit, bibendum at, feugiat non, porta id, neque. Nulla et felis nec odio mollis vehicula. Donec elementum tincidunt mauris. Duis vel dui. Fusce iaculis enim ac nulla. In risus.</p>
        <p>Donec gravida. Donec et enim. Morbi sollicitudin, lacus a facilisis pulvinar, odio turpis dapibus elit, in tincidunt turpis felis nec libero. Nam vestibulum tempus ipsum. In hac habitasse platea dictumst. Nulla facilisi. Donec semper ligula. Donec commodo tortor in quam. Etiam massa. Ut tempus ligula eget tellus. Curabitur id velit ut velit varius commodo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla facilisi. Fusce ornare pellentesque libero. Nunc rhoncus. Suspendisse potenti. Ut consequat, leo eu accumsan vehicula, justo sem lobortis elit, ac sollicitudin ipsum neque nec ante.</p>
        <p>Aliquam elementum mauris id sem. Vivamus varius, est ut nonummy consectetuer, nulla quam bibendum velit, ac gravida nisi felis sit amet urna. Aliquam nec risus. Maecenas lacinia purus ut velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse sit amet dui vitae lacus fermentum sodales. Donec varius dapibus nisl. Praesent at velit id risus convallis bibendum. Aliquam felis nibh, rutrum nec, blandit non, mattis sit amet, magna. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam varius dignissim nibh. Quisque id orci ac ante hendrerit molestie. Aliquam malesuada enim non neque.</p>
    </div>
    <div id="props-panel" class="x-hide-display" style="width:200px;height:200px;overflow:hidden;">
    </div>
  </body>
</html>
