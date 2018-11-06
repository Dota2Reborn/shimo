package elementFile;

import org.openqa.selenium.WebElement;

public class elementFile {
	/**
	 * Login
	 * homePage
	 * 登录页面
	 *
	 */
	@SearchWith(pageName = "homePage", elementName = "userEmail", noteName = "用户名")
	public WebElement userEmail;
	@SearchWith(pageName = "homePage", elementName = "userPwd", noteName = "密码")
	public WebElement userPwd;
	@SearchWith(pageName = "homePage", elementName = "login_submit", noteName = "登录按钮")
	public WebElement login_submit;

	/**
	 * 
	 * desktop
	 * 我的桌面
	 *
	 */
	@SearchWith(pageName = "desktop", elementName = "desktop_new", noteName = "新建文件按钮")
	public WebElement desktop_new;
	@SearchWith(pageName = "desktop", elementName = "desktop_show_type", noteName = "列表平铺模式切换")
	public WebElement desktop_show_type;
	@SearchWith(pageName = "desktop", elementName = "desktop", noteName = "切换到我的桌面")
	public WebElement desktop;
	@SearchWith(pageName = "desktop", elementName = "desktop1_1", noteName = "平铺模式第一行第一个文件")
	public WebElement desktop1_1;
	@SearchWith(pageName = "desktop", elementName = "desktop1_2", noteName = "平铺模式第一行第二个文件")
	public WebElement desktop1_2;
	@SearchWith(pageName = "desktop", elementName = "desktop_newDoc", noteName = "新建文档")
	public WebElement desktop_newDoc;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder_name_ok", noteName = "文件夹命名确定,退出共享确认")
	public WebElement desktop_newFolder_name_ok;
	@SearchWith(pageName = "desktop", elementName = "desktop1_1_folder", noteName = "平铺模式第一行第一个文件夹")
	public WebElement desktop1_1_folder;
	@SearchWith(pageName = "desktop", elementName = "desktop1_2_folder", noteName = "平铺模式第一行第二个文件夹")
	public WebElement desktop1_2_folder;
	@SearchWith(pageName = "desktop", elementName = "desktop1_3_folder", noteName = "平铺模式第一行第三个文件夹")
	public WebElement desktop1_3_folder;
	@SearchWith(pageName = "desktop", elementName = "desktop_list_1_file", noteName = "列表模式第一个文件")
	public WebElement desktop_list_1_file;
	@SearchWith(pageName = "desktop", elementName = "desktop_list_2_file", noteName = "列表模式第二个文件")
	public WebElement desktop_list_2_file;
	@SearchWith(pageName = "desktop", elementName = "desktop_list_3_file", noteName = "列表模式第三个文件")
	public WebElement desktop_list_3_file;
	@SearchWith(pageName = "desktop", elementName = "desktop_order", noteName = "桌面排序")
	public WebElement desktop_order;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByUpdate", noteName = "桌面排序-按更新时间")
	public WebElement desktop_orderByUpdate;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByCreate", noteName = "桌面排序-按创建时间")
	public WebElement desktop_orderByCreate;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByFile", noteName = "桌面排序-文件名")
	public WebElement desktop_orderByFile;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByOwner", noteName = "桌面排序-所有者")
	public WebElement desktop_orderByOwner;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByFolderUP", noteName = "桌面排序-文件夹置顶")
	public WebElement desktop_orderByFolderUP;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByDefault", noteName = "桌面排序-默认")
	public WebElement desktop_orderByDefault;
	@SearchWith(pageName = "desktop", elementName = "desktop_newSheet", noteName = "新建表格")
	public WebElement desktop_newSheet;
	@SearchWith(pageName = "desktop", elementName = "desktop_newslides", noteName = "新建幻灯片")
	public WebElement desktop_newslides;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder", noteName = "新建文件夹")
	public WebElement desktop_newFolder;
	@SearchWith(pageName = "desktop", elementName = "desktop_position", noteName = "当前桌面所处页面")
	public WebElement desktop_position;
	@SearchWith(pageName = "desktop", elementName = "desktop_import", noteName = "导入")
	public WebElement desktop_import;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder_name", noteName = "文件夹命名")
	public WebElement desktop_newFolder_name;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder_name_cancel", noteName = "文件夹命名取消")
	public WebElement desktop_newFolder_name_cancel;
	@SearchWith(pageName = "desktop", elementName = "desktop_set", noteName = "hover文件的齿轮")
	public WebElement desktop_setting;
	@SearchWith(pageName = "desktop", elementName = "desktop_shortcut_1", noteName = "桌面快捷方式第一个")
	public WebElement desktop_shortcut_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_shortcut_Increase", noteName = "新增桌面快捷方式区域")
	public WebElement desktop_shortcut_Increase;
	@SearchWith(pageName = "desktop", elementName = "desktop_shortcut_Tips", noteName = "新增快捷方式区域提示")
	public WebElement desktop_shortcut_Tips;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_button", noteName = "移动到测试文件夹")
	public WebElement desktop_moveFolder_button;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_back_button", noteName = "移动文件到文件夹，列表中后退按钮")
	public WebElement desktop_moveFolder_back_button;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_list_1", noteName = "移动文件到文件夹，选择列表中第一个文件夹")
	public WebElement desktop_moveFolder_list_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_list_2", noteName = "移动文件到文件夹，选择列表中第二个文件夹")
	public WebElement desktop_moveFolder_list_2;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_1", noteName = "表头文件名排序")
	public WebElement desktop_orderHeader_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_2", noteName = "表头所有者排序")
	public WebElement desktop_orderHeader_2;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_3", noteName = "表头时间排序")
	public WebElement desktop_orderHeader_3;
	@SearchWith(pageName = "desktop", elementName = "desktop1_1_name", noteName = "获取第一个文件名称")
	public WebElement desktop1_1_name;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderByFolderUP_Hook", noteName = "桌面排序-文件夹置顶-对钩")
	public WebElement desktop_orderByFolderUP_Hook;
	@SearchWith(pageName = "desktop", elementName = "folder_backToDesktop", noteName = "文件夹中，点击文件路径返回我的桌面")
	public WebElement folder_backToDesktop;

	/**
	 * doc
	 * 文档表格相关
	 *
	 */
	@SearchWith(pageName = "doc", elementName = "b_back", noteName = "后退")
	public WebElement b_back;
	@SearchWith(pageName = "doc", elementName = "doc_title_input", noteName = "文档标题编辑")
	public WebElement doc_title_input;
	@SearchWith(pageName = "doc", elementName = "doc_saveStatus", noteName = "文档/表格提示同步完成状态")
	public WebElement doc_saveStatus;
	@SearchWith(pageName = "doc", elementName = "quick_access_point", noteName = "收索&快速打开")
	public WebElement quick_access_point;
	@SearchWith(pageName = "doc", elementName = "Back_to_Desktop", noteName = "一级文件夹下的文档或者表格中，下箭头直接返回桌面")
	public WebElement Back_to_Desktop;
	@SearchWith(pageName = "doc", elementName = "Back_to_Table", noteName = "一级文件夹下的文档或者表格中，下箭头直接返回工作台")
	public WebElement Back_to_Table;
	@SearchWith(pageName = "doc", elementName = "doc_edit", noteName = "文档编辑入口")
	public WebElement doc_edit;
	@SearchWith(pageName = "doc", elementName = "doc_notice_user", noteName = "@用户，被选列表中内容第一个用户")
	public WebElement doc_notice_user;
	@SearchWith(pageName = "doc", elementName = "doc_menu", noteName = "文档编辑页面中右上角 点点点")
	public WebElement doc_menu;
	@SearchWith(pageName = "doc", elementName = "doc_menu_msg", noteName = "文档编辑页面中右上角 点点点-文档信息")
	public WebElement doc_menu_msg;
	@SearchWith(pageName = "doc", elementName = "doc_menu_delete", noteName = "文档编辑页面中右上角 点点点-删除文档")
	public WebElement doc_menu_delete;
	@SearchWith(pageName = "doc", elementName = "doc_menu_delete_OK", noteName = "文档编辑页面中右上角 点点点-删除文档-确定按钮")
	public WebElement doc_menu_delete_OK;
	@SearchWith(pageName = "doc", elementName = "doc_discuss", noteName = "文档编辑页面中评论按钮")
	public WebElement doc_discuss;
	@SearchWith(pageName = "doc", elementName = "doc_discuss_input", noteName = "文档编辑页面中评论输入框")
	public WebElement doc_discuss_input;
	@SearchWith(pageName = "doc", elementName = "doc_discuss_input_ok", noteName = "文档编辑页面中评论输入框-确定按钮")
	public WebElement doc_discuss_input_ok;
	@SearchWith(pageName = "doc", elementName = "ql_comment_Comments", noteName = "工具栏中发起评论按钮")
	public WebElement ql_comment_Comments;
	@SearchWith(pageName = "doc", elementName = "Folder_settings", noteName = "文件夹中上方设置按钮")
	public WebElement Folder_settings;
	@SearchWith(pageName = "doc", elementName = "Exit_share_OK", noteName = "管理员删除文档-选择退出共享")
	public WebElement Exit_share_OK;
	@SearchWith(pageName = "doc", elementName = "Collection_OK", noteName = "标题栏收藏按钮")
	public WebElement Collection_OK;
	@SearchWith(pageName = "doc", elementName = "End_Discussion", noteName = "结束讨论")
	public WebElement End_Discussion;
	@SearchWith(pageName = "doc", elementName = "End_Discussion_OK", noteName = "确定结束讨论")
	public WebElement End_Discussion_OK;

	/**
	 * dashboard
	 * 工作台
	 *
	 */
	@SearchWith(pageName = "dashboard", elementName = "dashboard_update_time", noteName = "工作台-最近更新-更新时间")
	public WebElement dashboard_update_time;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_update_file", noteName = "工作台-共享给我的-文件")
	public WebElement dashboard_update_file;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_update_name", noteName = "工作台-最近更新-文件名")
	public WebElement dashboard_update_name;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_shareTime_1", noteName = "新的共享-大标签-更新时间")
	public WebElement dashboard_shareTime_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_shareTime_unread", noteName = "新的共享-大标签-标记已读")
	public WebElement dashboard_shareTime_unread;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_share_file_1", noteName = "工作台第一行第一个文件")
	public WebElement dashboard_share_file_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_share_file_favorites", noteName = "工作台第一行第一个文件收藏按钮")
	public WebElement dashboard_share_file_favorites;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_share_file_2", noteName = "工作台第一行第二个文件")
	public WebElement dashboard_share_file_2;
	@SearchWith(pageName = "dashboard", elementName = "New_Share_1", noteName = "新的共享第一个")
	public WebElement New_Share_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_1", noteName = "工作台-最近更新")
	public WebElement dashboard_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_2", noteName = "工作台-最近使用")
	public WebElement dashboard_2;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_3", noteName = "工作台-我创建的")
	public WebElement dashboard_3;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_4", noteName = "工作台-共享给我的")
	public WebElement dashboard_4;
	@SearchWith(pageName = "dashboard", elementName = "dashboard", noteName = "切换到工作台")
	public WebElement dashboard;
	@SearchWith(pageName = "dashboard", elementName = "favorites", noteName = "切换到我的收藏")
	public WebElement favorites;
	@SearchWith(pageName = "dashboard", elementName = "trash", noteName = "切换到回收站")
	public WebElement trash;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_search_button", noteName = "桌面搜索按钮")
	public WebElement dashboard_search_button;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_search_input", noteName = "桌面搜索输入框")
	public WebElement dashboard_search_input;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_search_result_1", noteName = "桌面搜索结果第一行")
	public WebElement dashboard_search_result_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice", noteName = "桌面通知铃铛")
	public WebElement dashboard_notice;
	@SearchWith(pageName = "dashboard", elementName = "confirmJoinCompany", noteName = "确认加入企业")
	public WebElement confirmJoinCompany;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_1", noteName = "桌面通知铃铛-通知列表中第一个")
	public WebElement dashboard_notice_list_1;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_1_button", noteName = "桌面通知铃铛-通知列表中第一个-按钮")
	public WebElement dashboard_notice_list_1_button;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_1_time", noteName = "桌面通知铃铛-通知列表中第一个时间")
	public WebElement dashboard_notice_list_1_time;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_unread", noteName = "桌面通知铃铛-未读")
	public WebElement dashboard_notice_list_unread;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_allRead", noteName = "桌面通知铃铛-标记全部已读")
	public WebElement dashboard_notice_list_allRead;
	
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon", noteName = "桌面-右上角头像")
	public WebElement desktop_user_icon;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_companyManagement", noteName = "桌面-右上角头像-我的企业")
	public WebElement desktop_user_icon_companyManagement;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_personSetting", noteName = "桌面-右上角头像-账号设置")
	public WebElement desktop_user_icon_personSetting;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_status_L", noteName = "桌面-右上角头像-当前账号状态-左边，如高级版，购买企业版")
	public WebElement desktop_user_icon_status_L;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_status_R", noteName = "桌面-右上角头像-当前账号状态-右边，如企业版过期，企业试用中，企业名称等")
	public WebElement desktop_user_icon_status_R;
	
	/**
	 * addCollaborator
	 * 协作者相关
	 *
	 */
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_close", noteName = "关闭添加协作者弹框")
	public WebElement button_addCollaborator_close;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_1_list", noteName = "协作者列表第一个协作者权限下拉框")
	public WebElement b_addCollaborator_1_list;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_2_list", noteName = "协作者列表第二个协作者权限下拉框")
	public WebElement b_addCollaborator_2_list;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_3_list", noteName = "协作者列表第三个协作者权限下拉框")
	public WebElement b_addCollaborator_3_list;
	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_1", noteName = "协作者权限列表--转让所有权")
	public WebElement list_addCollaborator_1;
	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_4", noteName = "协作者权限列表--移除")
	public WebElement list_addCollaborator_4;
	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_4_ok", noteName = "协作者权限列表--移除--确认移除")
	public WebElement list_addCollaborator_4_ok;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_total", noteName = "协作者人数")
	public WebElement addCollaborator_total;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_1_add", noteName = "最近协作者列表第一个添加按钮")
	public WebElement addCollaborator_1_add;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_2_add", noteName = "最近协作者列表第二个添加按钮")
	 public WebElement addCollaborator_2_add;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_companyList_1_add", noteName = "企业协作者列表第一个添加按钮")
	public WebElement addCollaborator_companyList_1_add;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_companyList_2_add", noteName = "企业协作者列表第二个添加按钮")
	public WebElement addCollaborator_companyList_2_add;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_company_list", noteName = "协作者页面切换到企业成员列表")
	public WebElement addCollaborator_company_list;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_back", noteName = "从协作者列表返回按钮")
	public WebElement b_addCollaborator_back;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_confirm", noteName = "协作者移除或者降低自己权限时提示弹窗的确定按钮")
	public WebElement b_addCollaborator_confirm;
	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_changeOwner_1", noteName = "协作者权限列表--转让所有权列表--选择第一个用户为转让对象按钮")
	public WebElement list_addCollaborator_changeOwner_1;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_1_list_userName", noteName = "协作者列表第一个协作者用户名")
	public WebElement addCollaborator_1_list_userName;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_2_list_userName", noteName = "协作者列表第二个协作者用户名")
	public WebElement addCollaborator_2_list_userName;
	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_1_list_emailOrMobile", noteName = "协作者列表第一个协作者邮箱")
	public WebElement collaborator_1_list_emailOrMobile;
	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_2_list_emailOrMobile", noteName = "协作者列表第二个协作者邮箱")
	public WebElement collaborator_2_list_emailOrMobile;
	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_3_list_emailOrMobile", noteName = "协作者列表第三个协作者邮箱")
	public WebElement collaborator_3_list_emailOrMobile;
	@SearchWith(pageName = "addCollaborator", elementName = "addCollaborator_folder_add", noteName = "文件夹内右侧(加号)添加协作人按钮")
	public WebElement addCollaborator_folder_add;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator", noteName = "添加协作者按钮")
	public WebElement button_addCollaborator;
	@SearchWith(pageName = "addCollaborator", elementName = "input_addCollaborator", noteName = "添加协作者邮箱输入框")
	public WebElement input_addCollaborator;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_1_add", noteName = "搜索显示被添加协作者列表第一个添加按钮")
	public WebElement b_addCollaborator_1_add;
	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_ok", noteName = "确认添加协作者按钮")
	// 王继程3/12
	public WebElement b_addCollaborator_ok;
	@SearchWith(pageName = "addCollaborator", elementName = "Can_edit_1", noteName = "可以编辑")
	public WebElement Can_edit_1;
	@SearchWith(pageName = "addCollaborator", elementName = "can_only_comment_2", noteName = "只能评论")
	public WebElement can_only_comment_2;
	@SearchWith(pageName = "addCollaborator", elementName = "can_only_read_3", noteName = "只能阅读")
	public WebElement can_only_read_3;
	@SearchWith(pageName = "addCollaborator", elementName = "Shut_down_sm_modal_close_x", noteName = "关闭添加协作窗口")
	public WebElement Shut_down_sm_modal_close_x;

	/**
	 * companyManagement
	 * 企业管理相关
	 *
	 */
	@SearchWith(pageName = "companyManagement", elementName = "company_Management", noteName = "桌面-企业管理入口")
	public WebElement company_Management;
	@SearchWith(pageName = "companyManagement", elementName = "company_setting", noteName = "企业管理-企业设置")
	public WebElement company_setting;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member", noteName = "企业设置-谁能邀请新成员进企业")
	public WebElement invite_member;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member_OK", noteName = "企业设置-谁能邀请新成员进企业-保存按钮")
	public WebElement invite_member_OK;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member_1", noteName = "企业设置-谁能邀请新成员进企业-所有企业成员")
	public WebElement invite_member_1;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member_2", noteName = "企业设置-谁能邀请新成员进企业-仅企业创建者和管理员")
	public WebElement invite_member_2;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member_3", noteName = "企业设置-谁能邀请新成员进企业-仅企业创建者")
	public WebElement invite_member_3;
	@SearchWith(pageName = "companyManagement", elementName = "addMember", noteName = "成员管理-添加成员按钮")
	public WebElement addMember;
	@SearchWith(pageName = "companyManagement", elementName = "address_cppy", noteName = "企业设置-添加成员-复制链接按钮")
	public WebElement address_cppy;
	@SearchWith(pageName = "companyManagement", elementName = "message_ok", noteName = "消息确认按钮")
	public WebElement message_ok;
	@SearchWith(pageName = "companyManagement", elementName = "message_warning", noteName = "提示消息")
	public WebElement message_warning;
	@SearchWith(pageName = "companyManagement", elementName = "button_companyName", noteName = "企业设置-企业名称（更改按钮）")
	public WebElement button_companyName;
	@SearchWith(pageName = "companyManagement", elementName = "input_companyName", noteName = "企业设置-企业名称")
	public WebElement input_companyName;
	@SearchWith(pageName = "companyManagement", elementName = "text_companyName", noteName = "企业设置-企业名称（输入框）")
	public WebElement text_companyName;
	@SearchWith(pageName = "companyManagement", elementName = "setAdmin", noteName = "企业设置-设置管理员")
	public WebElement setAdmin;
	@SearchWith(pageName = "companyManagement", elementName = "setAdmin_ManagerAndCreater", noteName = "企业设置-设置管理员-管理员和创建者")
	public WebElement setAdmin_ManagerAndCreater;
	@SearchWith(pageName = "companyManagement", elementName = "setAdmin_Creater", noteName = "企业设置-设置管理员-仅创建者")
	public WebElement setAdmin_Creater;
	@SearchWith(pageName = "companyManagement", elementName = "button_addCollaborators", noteName = "企业设置-谁能添加外部协作者（更改按钮）")
	public WebElement button_addCollaborators;
	@SearchWith(pageName = "companyManagement", elementName = "addCollaborators_1", noteName = "企业设置-谁能添加外部协作者-所有企业成员")
	public WebElement addCollaborators_1;
	@SearchWith(pageName = "companyManagement", elementName = "addCollaborators_2", noteName = "企业设置-谁能添加外部协作者-仅企业创建者和管理员")
	public WebElement addCollaborators_2;
	@SearchWith(pageName = "companyManagement", elementName = "addCollaborators_3", noteName = "企业设置-谁能添加外部协作者-仅企业创建者和管理员，以及文件所有者")
	public WebElement addCollaborators_3;
	@SearchWith(pageName = "companyManagement", elementName = "transferCompany", noteName = "企业设置-移交企业")
	public WebElement transferCompany;
	@SearchWith(pageName = "companyManagement", elementName = "transferCompany_button", noteName = "企业设置-移交企业-移交企业确认按钮")
	public WebElement transferCompany_button;
	@SearchWith(pageName = "companyManagement", elementName = "memberSearch", noteName = "企业设置-成员列表-搜索")
	public WebElement memberSearch;
	@SearchWith(pageName = "companyManagement", elementName = "xpath_banUser_2", noteName = "企业设置-成员列表-移除成员-禁用")
	public WebElement xpath_banUser_2;
	@SearchWith(pageName = "companyManagement", elementName = "xpath_banUser_ok", noteName = "企业设置-成员列表-移除成员-禁用-确认")
	public WebElement xpath_banUser_ok;
	@SearchWith(pageName = "companyManagement", elementName = "xpath_userTab_1", noteName = "企业设置-成员列表")
	public WebElement xpath_userTab_1;
	@SearchWith(pageName = "companyManagement", elementName = "xpath_userTab_3", noteName = "企业设置-禁用成员列表")
	public WebElement xpath_userTab_3;
	@SearchWith(pageName = "companyManagement", elementName = "button_exitCompany", noteName = "企业设置-成员退出企业")
	public WebElement button_exitCompany;
	@SearchWith(pageName = "companyManagement", elementName = "addmember_copyLink_open", noteName = "企业设置-打开或者关闭邀请链接")
	public WebElement addmember_copyLink_open;

	

	/**
	 * Registered
	 * 注册页面相关
	 *
	 */
	@SearchWith(pageName = "Registered", elementName = "userName", noteName = "昵称")
	public WebElement userName;
	@SearchWith(pageName = "Registered", elementName = "userEmail", noteName = "登录邮箱")
	public WebElement Email;
	@SearchWith(pageName = "Registered", elementName = "userMobile", noteName = "登录手机号")
	public WebElement userMobile;
	@SearchWith(pageName = "Registered", elementName = "userPwd", noteName = "密码")
	public WebElement Pwd;
	@SearchWith(pageName = "Registered", elementName = "reUserPwd", noteName = "确认密码")
	public WebElement rePwd;
	@SearchWith(pageName = "Registered", elementName = "verifyCode", noteName = "验证码")
	public WebElement verifyCode;
	@SearchWith(pageName = "Registered", elementName = "Next", noteName = "免费注册")
	public WebElement Next;
	@SearchWith(pageName = "Registered", elementName = "personalRegister", noteName = "免费注册个人账号")
	public WebElement personalRegister;
	@SearchWith(pageName = "Registered", elementName = "emailRegister", noteName = "邮箱注册")
	public WebElement emailRegister;
	@SearchWith(pageName = "Registered", elementName = "mobileRegister", noteName = "手机注册")
	public WebElement mobileRegister;
	@SearchWith(pageName = "Registered", elementName = "wechatRegister", noteName = "微信注册")
	public WebElement wechatRegister;

	/**
	 * profile
	 * 个人账号设置页面
	 *
	 */
	@SearchWith(pageName = "profile", elementName = "mobile_setting", noteName = "绑定手机号按钮")
	public WebElement mobile_setting;
	@SearchWith(pageName = "profile", elementName = "mobile_setting_input", noteName = "绑定手机号输入框")
	public WebElement mobile_setting_input;
	@SearchWith(pageName = "profile", elementName = "mobile_setting_getVerifyCode", noteName = "绑定手机号，获取验证码按钮")
	public WebElement mobile_setting_getVerifyCode;
	@SearchWith(pageName = "profile", elementName = "mobile_setting_verifyCodeInput", noteName = "绑定手机号，验证码输入框")
	public WebElement mobile_setting_verifyCodeInput;
	@SearchWith(pageName = "profile", elementName = "mobile_setting_confirm", noteName = "绑定手机号，确认绑定按钮")
	public WebElement mobile_setting_confirm;
	@SearchWith(pageName = "profile", elementName = "profile_toast", noteName = "账号设置页面toast")
	public WebElement profile_toast;


	/**
	 * menu
	 * 桌面工作台菜单
	 *
	 */
	@SearchWith(pageName = "menu", elementName = "menu_newPage", noteName = "新标签页中打开")
	public WebElement menu_newPage;
	@SearchWith(pageName = "menu", elementName = "menu_shortcut", noteName = "添加到快捷方式")
	public WebElement menu_shortcut;
	@SearchWith(pageName = "menu", elementName = "menu_collection", noteName = "收藏")
	public WebElement menu_collection;
	@SearchWith(pageName = "menu", elementName = "menu_cooperation", noteName = "添加协作者")
	public WebElement menu_cooperation;
	@SearchWith(pageName = "menu", elementName = "menu_move", noteName = "移动")
	public WebElement menu_move;
	@SearchWith(pageName = "menu", elementName = "menu_share", noteName = "分享")
	public WebElement menu_share;
	@SearchWith(pageName = "menu", elementName = "menu_share_1", noteName = "分享-公开分享")
	public WebElement menu_share_1;
	@SearchWith(pageName = "menu", elementName = "menu_rename", noteName = "重命名")
	public WebElement menu_rename;
	@SearchWith(pageName = "menu", elementName = "menu_creatCopy", noteName = "创建副本")
	public WebElement menu_creatCopy;
	@SearchWith(pageName = "menu", elementName = "menu_delete", noteName = "删除")
	public WebElement menu_delete;
	@SearchWith(pageName = "menu", elementName = "menu_mute", noteName = "消息免打扰")
	public WebElement menu_mute;
	@SearchWith(pageName = "menu", elementName = "menu_moveToFolder", noteName = "定位到所在文件夹")
	public WebElement menu_moveToFolder;
	@SearchWith(pageName = "menu", elementName = "menu_Recovery", noteName = "恢复文件")
	public WebElement menu_Recovery;
	@SearchWith(pageName = "menu", elementName = "menu_Completely_removed", noteName = "彻底删除")
	public WebElement menu_Completely_removed;
	@SearchWith(pageName = "menu", elementName = "menu_Point_Menu", noteName = "工作台-最近使用-第一个文件点点(仅有一个文件时使用)")
	public WebElement menu_Point_Menu;
	@SearchWith(pageName = "menu", elementName = "menu_cooperation_1", noteName = "添加协作者-二级菜单（添加协作者）")
	public WebElement menu_cooperation_1;
	@SearchWith(pageName = "menu", elementName = "menu_cooperation_2", noteName = "添加协作者-二级菜单（查看协作者）")
	public WebElement menu_cooperation_2;

	/**
	 * file_menu
	 * 文档表格编辑页点点等-菜单
	 *
	 */
	@SearchWith(pageName = "file_menu", elementName = "file_menu_version", noteName = "保存版本")
	public WebElement file_menu_version;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_shortcut", noteName = "添加快捷方式")
	public WebElement file_menu_shortcut;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_collection", noteName = "添加收藏")
	public WebElement file_menu_collection;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_list", noteName = "查看目录")
	public WebElement file_menu_list;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_move", noteName = "移动")
	public WebElement file_menu_move;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_history", noteName = "查看历史")
	public WebElement file_menu_history;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_creatCopy", noteName = "创建副本")
	public WebElement file_menu_creatCopy;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_delete", noteName = "删除")
	public WebElement file_menu_delete;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_mute", noteName = "消息免打扰")
	public WebElement file_menu_mute;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_msg", noteName = "文档信息")
	public WebElement file_menu_msg;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_help", noteName = "帮助")
	public WebElement file_menu_help;
	
	
	/**
	 * 顶部工具栏
	 * ppt_top
	 *
	 */
	@SearchWith(pageName = "ppt_top", elementName = "add_page", noteName = "添加页面")
	public WebElement add_page;
	@SearchWith(pageName = "ppt_top", elementName = "down_arrow", noteName = "下箭头")
	public WebElement down_arrow;
	@SearchWith(pageName = "ppt_top", elementName = "ppt_revoke", noteName = "撤销")
	public WebElement ppt_revoke;
	@SearchWith(pageName = "ppt_top", elementName = "ppt_redo", noteName = "重做")
	public WebElement ppt_redo;
	@SearchWith(pageName = "ppt_top", elementName = "add_text", noteName = "添加文本")
	public WebElement add_text;
	@SearchWith(pageName = "ppt_top", elementName = "add_diagram", noteName = "添加图片")
	public WebElement add_diagram;
	@SearchWith(pageName = "ppt_top", elementName = "add_arrows", noteName = "添加箭头")
	public WebElement add_arrows;
	@SearchWith(pageName = "ppt_top", elementName = "add_Rectangle", noteName = "添加矩形")
	public WebElement add_Rectangle;
	@SearchWith(pageName = "ppt_top", elementName = "add_circular", noteName = "添加圆形")
	public WebElement add_circular;
	@SearchWith(pageName = "ppt_top", elementName = "narrow_trying", noteName = "减小视图")
	public WebElement narrow_trying;
	@SearchWith(pageName = "ppt_top", elementName = "enlarge_trying", noteName = "放大视图")
	public WebElement enlarge_trying;
	@SearchWith(pageName = "ppt_top", elementName = "ppt_zoom", noteName = "缩放视图")
	public WebElement ppt_zoom;
	/**
	 * 左边栏
	 * ppt_left
	 *
	 */
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_1", noteName = "左边栏第一个页面")
	public WebElement ppt_page_1;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_2", noteName = "左边栏第二个页面")
	public WebElement ppt_page_2;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_3", noteName = "左边栏第三个页面")
	public WebElement ppt_page_3;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_4", noteName = "左边栏第四个页面")
	public WebElement ppt_page_4;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_5", noteName = "左边栏第五个页面")
	public WebElement ppt_page_5;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_6", noteName = "左边栏第六个页面")
	public WebElement ppt_page_6;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_7", noteName = "左边栏第七个页面")
	public WebElement ppt_page_7;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_8", noteName = "左边栏第八个页面")
	public WebElement ppt_page_8;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_9", noteName = "左边栏第九个页面")
	public WebElement ppt_page_9;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_10", noteName = "左边栏第十个页面")
	public WebElement ppt_page_10;
	@SearchWith(pageName = "ppt_left", elementName = "ppt_page_11", noteName = "左边栏第十一个页面")
	public WebElement ppt_page_11;
	/**
	 * 页面
	 * ppt_page
	 *
	 */
	@SearchWith(pageName = "ppt_page", elementName = "ppt_text", noteName = "幻灯片页面")
	public WebElement ppt_text;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_1", noteName = "幻灯片页面第一个元素")
	public WebElement page_elements_1;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_2", noteName = "幻灯片页面第二个元素")
	public WebElement page_elements_2;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_3", noteName = "幻灯片页面第三个元素")
	public WebElement page_elements_3;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_4", noteName = "幻灯片页面第四个元素")
	public WebElement page_elements_4;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_5", noteName = "幻灯片页面第五个元素")
	public WebElement page_elements_5;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_1", noteName = "选中文件后像素点-形状文本右中-图片右上")
	public WebElement smslide_frame_anchor_1;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_2", noteName = "选中文件后像素点-形状文本左中-图片右下")
	public WebElement smslide_frame_anchor_2;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_3", noteName = "选中文件后像素点-形状文本上中-图片左下")
	public WebElement smslide_frame_anchor_3;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_4", noteName = "选中文件后像素点-形状文本下中-图片左上")
	public WebElement smslide_frame_anchor_4;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_5", noteName = "选中文件后像素点-形状右上")
	public WebElement smslide_frame_anchor_5;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_6", noteName = "选中文件后像素点-形状右下")
	public WebElement smslide_frame_anchor_6;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_7", noteName = "选中文件后像素点-形状左下")
	public WebElement smslide_frame_anchor_7;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_frame_anchor_8", noteName = "选中文件后像素点-形状左上")
	public WebElement smslide_frame_anchor_8;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_ordered_1", noteName = "有序列表第1行是否存在")
	public WebElement smslide_ordered_1;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_ordered_2", noteName = "有序列表第2行是否存在")
	public WebElement smslide_ordered_2;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_ordered_3", noteName = "有序列表第3行是否存在")
	public WebElement smslide_ordered_3;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_unordered_1", noteName = "无序列表第1行是否存在")
	public WebElement smslide_unordered_1;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_unordered_2", noteName = "无序列表第2行是否存在")
	public WebElement smslide_unordered_2;
	@SearchWith(pageName = "ppt_page", elementName = "smslide_unordered_3", noteName = "无序列表第3行是否存在")
	public WebElement smslide_unordered_3;
	
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_1_1", noteName = "图片占位符1上传图片按钮")
	public WebElement page_elements_1_1;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_2_1", noteName = "图片占位符2上传图片按钮")
	public WebElement page_elements_2_1;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_3_1", noteName = "图片占位符3上传图片按钮")
	public WebElement page_elements_3_1;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_4_1", noteName = "图片占位符4上传图片按钮")
	public WebElement page_elements_4_1;
	@SearchWith(pageName = "ppt_page", elementName = "page_elements_5_1", noteName = "图片占位符5上传图片按钮")
	public WebElement page_elements_5_1;
	/**
	 * ppt
	 * PPT_header
	 *
	 */
	@SearchWith(pageName = "PPT_header", elementName = "ppt_return", noteName = "幻灯片内返回")
	public WebElement ppt_return;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_down", noteName = "幻灯片内下箭头")
	public WebElement ppt_down;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_plus_sign", noteName = "幻灯片中加号")
	public WebElement ppt_plus_sign;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_filename", noteName = "幻灯片标题")
	public WebElement ppt_filename;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_collect", noteName = "收藏标签")
	public WebElement ppt_collect;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_comment", noteName = "幻灯片讨论")
	public WebElement ppt_comment;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_broadcast", noteName = "播放幻灯片")
	public WebElement ppt_broadcast;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_online_broadcast", noteName = "在线演示")
	public WebElement ppt_online_broadcast;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_cooperation", noteName = "添加协作者")
	public WebElement ppt_cooperation;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_share", noteName = "分享")
	public WebElement ppt_share;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_dotdotdot", noteName = "左上角点点点")
	public WebElement ppt_dotdotdot;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_shortcut", noteName = "快捷方式设置")
	public WebElement ppt_shortcut;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_news", noteName = "消息设置")
	public WebElement ppt_news;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_collection", noteName = "收藏&取消收藏")
	public WebElement ppt_collection;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_move", noteName = "移动")
	public WebElement ppt_move;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_now_copy", noteName = "创建副本")
	public WebElement ppt_now_copy;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_export", noteName = "导出")
	public WebElement ppt_export;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_template", noteName = "保存模板")
	public WebElement ppt_template;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_view_history", noteName = "查看历史")
	public WebElement ppt_view_history;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_Information", noteName = "幻灯片信息")
	public WebElement ppt_Information;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_delete", noteName = "删除幻灯片")
	public WebElement ppt_delete;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_delete_sure", noteName = "确认删除")
	public WebElement ppt_delete_sure;
	@SearchWith(pageName = "PPT_header", elementName = "ppt_delete_cancel", noteName = "取消删除")
	public WebElement ppt_delete_cancel;
	
	
	/**
	 * ppt
	 * PPT_rightBar
	 *
	 */
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_type", noteName = "样式")
	public WebElement ppt_type;
	@SearchWith(pageName = "PPT_rightBar", elementName = "page_style", noteName = "背景填充")
	public WebElement page_style;
	@SearchWith(pageName = "PPT_rightBar", elementName = "page_colour", noteName = "颜色选择")
	public WebElement page_colour;
	@SearchWith(pageName = "PPT_rightBar", elementName = "image_size", noteName = "图片尺寸")
	public WebElement image_size;
	@SearchWith(pageName = "PPT_rightBar", elementName = "image_chosen", noteName = "图片选择")
	public WebElement image_chosen;
	@SearchWith(pageName = "PPT_rightBar", elementName = "style_all_applications", noteName = "应用至全部")
	public WebElement style_all_applications;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style", noteName = "边框样式")
	public WebElement border_style;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style_lines", noteName = "边框线样式")
	public WebElement border_style_lines;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style_color", noteName = "边框线颜色")
	public WebElement border_style_color;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style_width", noteName = "边框线粗细输入")
	public WebElement border_style_width;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style_widths", noteName = "边框线粗细上箭头")
	public WebElement border_style_widths;
	@SearchWith(pageName = "PPT_rightBar", elementName = "border_style_widthx", noteName = "边框线粗细下箭头")
	public WebElement border_style_widthx;
	@SearchWith(pageName = "PPT_rightBar", elementName = "transparency", noteName = "透明度输入")
	public WebElement transparency;
	@SearchWith(pageName = "PPT_rightBar", elementName = "transparencys", noteName = "透明度上箭头")
	public WebElement transparencys;
	@SearchWith(pageName = "PPT_rightBar", elementName = "transparencyx", noteName = "透明度下箭头")
	public WebElement transparencyx;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_text_template1", noteName = "文本样式模板1")
	public WebElement type_text_template1;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_shapes_template1", noteName = "形状样式模板1")
	public WebElement type_shapes_template1;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_shapes_fill", noteName = "形状填充")
	public WebElement type_shapes_fill;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_shapes_fillcolor", noteName = "形状填充颜色")
	public WebElement type_shapes_fillcolor;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_pictures_cut", noteName = "剪裁图片")
	public WebElement type_pictures_cut;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_pictures_replace", noteName = "替换图片")
	public WebElement type_pictures_replace;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_pictures_proportion", noteName = "图片剪裁比例")
	public WebElement type_pictures_proportion;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_pictures_proportionk", noteName = "输入图片宽")
	public WebElement type_pictures_proportionk;
	@SearchWith(pageName = "PPT_rightBar", elementName = "type_pictures_proportiong", noteName = "输入图片高")
	public WebElement type_pictures_proportiong;
	
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_animation", noteName = "文本排列")
	public WebElement ppt_animation;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_ttf", noteName = "字体")
	public WebElement ppt_right_ttf;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_ttfa", noteName = "字体下箭头")
	public WebElement ppt_right_ttfa;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_size", noteName = "字号")
	public WebElement ppt_right_size;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_sizea", noteName = "字号下箭头")
	public WebElement ppt_right_sizea;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_color", noteName = "字体颜色")
	public WebElement ppt_right_color;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_colora", noteName = "字体颜色下箭头")
	public WebElement ppt_right_colora;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_laid", noteName = "高亮")
	public WebElement ppt_right_laid;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_laida", noteName = "高亮下箭头")
	public WebElement ppt_right_laida;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_end", noteName = "背景色")
	public WebElement ppt_right_end;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_enda", noteName = "背景色下箭头")
	public WebElement ppt_right_enda;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_thickness", noteName = "加粗")
	public WebElement ppt_right_thickness;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_italic", noteName = "斜体")
	public WebElement ppt_right_italic;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_underline", noteName = "下划线")
	public WebElement ppt_right_underline;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_of", noteName = "中划线")
	public WebElement ppt_right_of;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_top", noteName = "顶部对齐")
	public WebElement ppt_right_top;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_middle", noteName = "垂直中部对齐")
	public WebElement ppt_right_middle;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_bottom", noteName = "底部对齐")
	public WebElement ppt_right_bottom;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_L", noteName = "左对齐")
	public WebElement ppt_right_L;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_center", noteName = "水平中对齐")
	public WebElement ppt_right_center;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_R", noteName = "右对齐")
	public WebElement ppt_right_R;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_ends", noteName = "两端对齐")
	public WebElement ppt_right_ends;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_order", noteName = "有序列表")
	public WebElement ppt_right_order;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_disorder", noteName = "无序列表")
	public WebElement ppt_right_disorder;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_row1", noteName = "行间距输入")
	public WebElement ppt_right_row1;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_row2", noteName = "行间距下三角")
	public WebElement ppt_right_row2;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_front1", noteName = "段前间距输入")
	public WebElement ppt_right_front1;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_front2", noteName = "段前间距上箭头")
	public WebElement ppt_right_front2;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_front3", noteName = "段前间距下箭头")
	public WebElement ppt_right_front3;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_rear1", noteName = "段后间距输入")
	public WebElement ppt_right_rear1;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_rear2", noteName = "段后间距上箭头")
	public WebElement ppt_right_rear2;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_rear3", noteName = "段后间距下箭头")
	public WebElement ppt_right_rear3;
	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_right_adaptive", noteName = "文本框自适应")
	public WebElement ppt_right_adaptive;

	@SearchWith(pageName = "PPT_rightBar", elementName = "ppt_theme", noteName = "排列")
	public WebElement ppt_theme;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_setTop", noteName = "元素置顶")
	public WebElement element_setTop;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_setThe", noteName = "元素置底")
	public WebElement element_setThe;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_moveUp", noteName = "元素上移一层")
	public WebElement element_moveUp;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_moveDown", noteName = "元素下移一层")
	public WebElement element_moveDown;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_horizontal", noteName = "水平对齐")
	public WebElement element_horizontal;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_vertically", noteName = "垂直对齐")
	public WebElement element_vertically;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_horizontal_xvalue", noteName = "X位置输入")
	public WebElement element_horizontal_xvalue;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_horizontal_xvalues", noteName = "X位置上箭头")
	public WebElement element_horizontal_xvalues;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_horizontal_xvaluex", noteName = "X位置下箭头")
	public WebElement element_horizontal_xvaluex;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_vertically_xvalue", noteName = "Y位置输入")
	public WebElement element_vertically_xvalue;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_vertically_xvalues", noteName = "Y位置上箭头")
	public WebElement element_vertically_xvalues;
	@SearchWith(pageName = "PPT_rightBar", elementName = "element_vertically_xvaluex", noteName = "Y位置下箭头")
	public WebElement element_vertically_xvaluex;
	
	/**
	 * 幻灯片中右键菜单与列表
	 * ppt_tabulation
	 *
	 */
	@SearchWith(pageName = "ppt_tabulation", elementName = "cutting", noteName = "剪切")
	public WebElement cutting;
	@SearchWith(pageName = "ppt_tabulation", elementName = "replication", noteName = "复制")
	public WebElement replication;
	@SearchWith(pageName = "ppt_tabulation", elementName = "pasting", noteName = "粘贴")
	public WebElement pasting;
	@SearchWith(pageName = "ppt_tabulation", elementName = "replication_pasting", noteName = "复制并粘贴")
	public WebElement replication_pasting;
	@SearchWith(pageName = "ppt_tabulation", elementName = "right_key_new", noteName = "新建幻灯片")
	public WebElement right_key_new;
	@SearchWith(pageName = "ppt_tabulation", elementName = "delete_page", noteName = "删除幻灯片")
	public WebElement delete_page;
}
