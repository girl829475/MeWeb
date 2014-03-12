Ext.define('AM.view.Login', {
	extend : 'Ext.window.Window',
	alias : 'widget.loginForm',
	requires : ['Ext.form.*', 'AM.view.CheckCodeText'],
	initComponent : function() {
		var checkcode = Ext.create('AM.view.CheckCodeText', {
					fieldLabel : '验证码',
					name : 'CheckCode',
					id : 'CheckCode',
					allowBlank : false,
					isLoader : true,
					blankText : '验证码不能为空',
					codeUrl : '/ImageServlet',
					maxLength : 4,
					minLength : 4,
					width : 240
				})
		var form = Ext.widget('form', {
			border : false,
			frame : true,
			bodyPadding : 10,
			fieldDefaults : {
				labelAlign : 'left',
				labelWidth : 55,
				labelStyle : 'font-weight:bold'
			},
			defaults : {
				margins : '0 0 10 0'
			},
			items : [{
						xtype : 'textfield',
						fieldLabel : '用户名',
						blankText : '用户名不能为空',
						allowBlank : false,
						width : 240
					}, {
						xtype : 'textfield',
						fieldLabel : '密&nbsp;&nbsp;&nbsp;码',
						allowBlank : false,
						blankText : '密码不能为空',
						width : 240,
						inputType : 'password'
					}, checkcode],
			buttons : [{
				text : '登录',
				itemId : 'loginSubmit',
				handler : function() {
					var form = this.up('form').getForm();
					if (form.isValid()) {
						form.submit({
									clientValidation : true,
									waitMsg : '请稍候',
									waitTitle : '正在验证登录',
									url : 'user_login',
									success : function(form, action) {
										// 登录成功后的操作，这里只是提示一下
										Ext.MessageBox.show({
													width : 150,
													title : "登录成功",
													buttons : Ext.MessageBox.OK,
													msg : action.result.msg
												})
									},
									failure : function(form, action) {
										Ext.MessageBox.show({
													width : 150,
													title : "登录失败",
													buttons : Ext.MessageBox.OK,
													msg : action.result.msg
												})
									}
								});
					}
				}
			}, {
				text : '测试登录',
				handler : function() {

				}
			}]
		})
		Ext.apply(this, {
					height : 180,
					width : 280,
					title : '用户登录',
					closeAction : 'hide',
					closable : false,
					// iconCls: 'login',
					layout : 'fit',
					modal : true,
					autoScroll : true,
					plain : true,
					resizable : false,
					border : false,
					icon : '/resources/images/information.png',
					items : form
				});
		this.callParent(arguments);
	}
});