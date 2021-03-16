package elementFile;

import org.openqa.selenium.WebElement;

public class elementFile {
	/**
	 * Login
	 * homePage
	 * 登录页面
	 */
	@SearchWith(pageName = "homePage", elementName = "userEmail", noteName = "用户名")
	public WebElement userEmail;
	@SearchWith(pageName = "homePage", elementName = "userPwd", noteName = "密码")
	public WebElement userPwd;
	@SearchWith(pageName = "homePage", elementName = "login_submit", noteName = "登录按钮")
	public WebElement login_submit;

	/**
	 * desktop
	 * 我的桌面
	 */
	@SearchWith(pageName = "desktop", elementName = "desktop_new", noteName = "新建文件按钮")
	public WebElement desktop_new;
	@SearchWith(pageName = "desktop", elementName = "desktop_show_type_grid", noteName = "桌面平铺模式")
	public WebElement desktop_show_type_grid;
	@SearchWith(pageName = "desktop", elementName = "desktop_show_type_list", noteName = "桌面列表模式")
	public WebElement desktop_show_type_list;
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
	@SearchWith(pageName = "desktop", elementName = "desktop_newSlides", noteName = "新建幻灯片")
	public WebElement desktop_newSlides;
	@SearchWith(pageName = "desktop", elementName = "desktop_newMindMap", noteName = "新建思维脑图")
	public WebElement desktop_newMindMap;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFileBoard", noteName = "新建白板")
	public WebElement desktop_newFileBoard;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFileForm", noteName = "新建表单")
	public WebElement desktop_newFileForm;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder", noteName = "新建文件夹")
	public WebElement desktop_newFolder;
	@SearchWith(pageName = "desktop", elementName = "desktop_import", noteName = "上传/导入")
	public WebElement desktop_import;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder_name", noteName = "文件夹命名")
	public WebElement desktop_newFolder_name;
	@SearchWith(pageName = "desktop", elementName = "desktop_newFolder_name_cancel", noteName = "文件夹命名取消")
	public WebElement desktop_newFolder_name_cancel;


	/** 模板库 */
	@SearchWith(pageName = "desktop", elementName = "desktop_newTemplate")
	public WebElement desktop_newTemplate;

	@SearchWith(pageName = "desktop", elementName = "desktop1_1_set", noteName = "hover第一个文件的点点点菜单")
	public WebElement desktop1_1_set;
	@SearchWith(pageName = "desktop", elementName = "desktop_shortcut_1", noteName = "桌面快捷方式第一个")
	public WebElement desktop_shortcut_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_button", noteName = "移动到测试文件夹")
	public WebElement desktop_moveFolder_button;
	@SearchWith(pageName = "desktop", elementName = "button_moveBoard_desktop", noteName = "移动文件面板，切到我的桌面按钮")
	public WebElement button_moveBoard_desktop;
	@SearchWith(pageName = "desktop", elementName = "button_moveBoard_space", noteName = "移动文件面板，切到团队空间按钮")
	public WebElement button_moveBoard_space;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_list_1", noteName = "移动文件到文件夹，选择列表中第一个文件夹")
	public WebElement desktop_moveFolder_list_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_moveFolder_list_2", noteName = "移动文件到文件夹，选择列表中第二个文件夹")
	public WebElement desktop_moveFolder_list_2;

	/** 我的收藏平铺模式第一个文件 */
	@SearchWith(pageName = "desktop", elementName = "favorites1_1")
	public WebElement favorites1_1;
	/** 我的收藏平铺模式第一个文件夹 */
	@SearchWith(pageName = "desktop", elementName = "favorites1_1_folder")
	public WebElement favorites1_1_folder;

	/** 移动文件到协作空间，列表中第一个协作空间 */
	@SearchWith(pageName = "desktop", elementName = "desktop_moveToSpace_space_1")
	public WebElement desktop_moveToSpace_space_1;
	/** 桌面文件移动到协作空间的二次确认 */
	@SearchWith(pageName = "desktop", elementName = "desktop_moveToSpace_confirm")
	public WebElement desktop_moveToSpace_confirm;

	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_1", noteName = "表头文件名排序")
	public WebElement desktop_orderHeader_1;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_2", noteName = "表头所有者排序")
	public WebElement desktop_orderHeader_2;
	@SearchWith(pageName = "desktop", elementName = "desktop_orderHeader_3", noteName = "表头时间排序")
	public WebElement desktop_orderHeader_3;
	@SearchWith(pageName = "desktop", elementName = "desktop1_1_name", noteName = "获取第一个文件名称")
	public WebElement desktop1_1_name;
	@SearchWith(pageName = "desktop", elementName = "toast_msg", noteName = "桌面toast提示信息")
	public WebElement toast_msg;
	@SearchWith(pageName = "desktop", elementName = "b_next", noteName = "新注册用户桌面欢迎页面，下一步按钮")
	public WebElement b_next;
	@SearchWith(pageName = "desktop", elementName = "b_finish", noteName = "新注册用户桌面欢迎页面，开始使用按钮")
	public WebElement b_finish;
	@SearchWith(pageName = "desktop", elementName = "Sticker_Face_x", noteName = "贴脸提示 X 按钮")
	public WebElement Sticker_Face_x;
	@SearchWith(pageName = "desktop", elementName = "desktop_none_file", noteName = "桌面/我的收藏/回收站为空标识")
	public WebElement desktop_none_file;

	/**
	 * doc
	 * 文档表格相关
	 */
	@SearchWith(pageName = "doc", elementName = "b_back", noteName = "后退")
	public WebElement b_back;
	@SearchWith(pageName = "doc", elementName = "doc_title_input", noteName = "文档标题编辑")
	public WebElement doc_title_input;
	/** 文档header上标题 */
	@SearchWith(pageName = "doc", elementName = "doc_header_title")
	public WebElement doc_header_title;
	@SearchWith(pageName = "doc", elementName = "quick_access_point", noteName = "收索&快速打开")
	public WebElement quick_access_point;
	@SearchWith(pageName = "doc", elementName = "Back_to_Desktop", noteName = "一级文件夹下的文档或者表格中，下箭头直接返回桌面")
	public WebElement Back_to_Desktop;
	@SearchWith(pageName = "doc", elementName = "Back_to_Dashboard", noteName = "一级文件夹下的文档或者表格中，下箭头直接返回工作台")
	public WebElement Back_to_Dashboard;
	@SearchWith(pageName = "doc", elementName = "doc_edit", noteName = "文档编辑入口")
	public WebElement doc_edit;
	@SearchWith(pageName = "doc", elementName = "doc_notice_user", noteName = "@用户，被选列表中内容第一个用户")
	public WebElement doc_notice_user;
	@SearchWith(pageName = "doc", elementName = "doc_menu", noteName = "文档编辑页面中右上角 点点点")
	public WebElement doc_menu;
	@SearchWith(pageName = "doc", elementName = "doc_menu_delete", noteName = "文档编辑页面中右上角 点点点-删除文档")
	public WebElement doc_menu_delete;
	@SearchWith(pageName = "doc", elementName = "doc_menu_delete_OK", noteName = "文档编辑页面中右上角 点点点-删除文档-确定按钮")
	public WebElement doc_menu_delete_OK;
	@SearchWith(pageName = "doc", elementName = "doc_discuss_input", noteName = "文档编辑页面中评论输入框")
	public WebElement doc_discuss_input;
	@SearchWith(pageName = "doc", elementName = "doc_discuss_input_ok", noteName = "文档编辑页面中评论输入框-确定按钮")
	public WebElement doc_discuss_input_ok;
	@SearchWith(pageName = "doc", elementName = "ql_comment_Comments", noteName = "工具栏中发起评论按钮")
	public WebElement ql_comment_Comments;
	@SearchWith(pageName = "doc", elementName = "Folder_settings", noteName = "文件夹中上方设置按钮")
	public WebElement Folder_settings;

	/** 文件夹中,直接右侧添加协作者按钮 */
	@SearchWith(pageName = "doc", elementName = "b_folder_addCollaborator")
	public WebElement b_folder_addCollaborator;
	@SearchWith(pageName = "doc", elementName = "Exit_share_OK", noteName = "管理员删除文档-选择退出共享")
	public WebElement Exit_share_OK;
	@SearchWith(pageName = "doc", elementName = "Collection_OK", noteName = "标题栏收藏按钮")
	public WebElement Collection_OK;
	@SearchWith(pageName = "doc", elementName = "End_Discussion", noteName = "结束讨论")
	public WebElement End_Discussion;
	@SearchWith(pageName = "doc", elementName = "End_Discussion_OK", noteName = "确定结束讨论")
	public WebElement End_Discussion_OK;
	/** header上的搜索输入框 */
	@SearchWith(pageName = "doc", elementName = "input_headerSearch", noteName = "header上的搜索输入框")
	public WebElement input_headerSearch;
    /** header搜索结果，第一个 */
	@SearchWith(pageName = "doc", elementName = "searchList_1")
	public WebElement searchList_1;
    /** header创建按钮 */
    @SearchWith(pageName = "doc", elementName = "b_headerCreate")
    public WebElement b_headerCreate;
	/** header创建文档按钮 */
	@SearchWith(pageName = "doc", elementName = "b_headerCreateDoc")
	public WebElement b_headerCreateDoc;
	/** header上用户头像icon */
	@SearchWith(pageName = "doc", elementName = "b_user_icon")
	public WebElement b_user_icon;
	/** header上讨论按钮 */
	@SearchWith(pageName = "doc", elementName = "b_discord")
	public WebElement b_discord;
	/** header上演示按钮 */
	@SearchWith(pageName = "doc", elementName = "b_screenShow")
	public WebElement b_screenShow;
	/** 演示页面，退出演示按钮 */
	@SearchWith(pageName = "doc", elementName = "b_demoScreenBack")
	public WebElement b_demoScreenBack;
	/** header上协作者按钮 */
	@SearchWith(pageName = "doc", elementName = "b_collaborator")
	public WebElement b_collaborator;
	/** header上分享按钮 */
	@SearchWith(pageName = "doc", elementName = "b_share")
	public WebElement b_share;
	/** header分享面板，更换密码 */
	@SearchWith(pageName = "doc", elementName = "share_changePWD")
	public WebElement share_changePWD;
	/** header分享面板，密码 */
	@SearchWith(pageName = "doc", elementName = "share_PWD")
	public WebElement share_PWD;
	/**
	 * dashboard
	 * 工作台
	 */
	@SearchWith(pageName = "dashboard", elementName = "used_share_file_time", noteName = "最近使用和共享给我-文件1-状态")
	public WebElement used_share_file_time;
	@SearchWith(pageName = "dashboard", elementName = "used_share_file_1", noteName = "最近使用和共享给我-文件1")
	public WebElement used_share_file_1;
	@SearchWith(pageName = "dashboard", elementName = "used_share_file_name", noteName = "最近使用和共享给我-文件1-文件名")
	public WebElement used_share_file_name;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_share_file_favorites", noteName = "工作台第一行第一个文件收藏按钮")
	public WebElement dashboard_share_file_favorites;
	@SearchWith(pageName = "dashboard", elementName = "used_share_file_2", noteName = "最近使用和共享给我-文件-2")
	public WebElement used_share_file_2;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_2", noteName = "工作台-最近使用")
	public WebElement dashboard_2;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_4", noteName = "工作台-共享给我的")
	public WebElement dashboard_4;

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
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_1_button", noteName = "桌面通知铃铛-通知列表中第一个-加入企业按钮")
	public WebElement dashboard_notice_list_1_button;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_1_time", noteName = "桌面通知铃铛-通知列表中第一个时间")
	public WebElement dashboard_notice_list_1_time;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_unread", noteName = "桌面通知铃铛-未读")
	public WebElement dashboard_notice_list_unread;
	@SearchWith(pageName = "dashboard", elementName = "dashboard_notice_list_allRead", noteName = "桌面通知铃铛-标记全部已读")
	public WebElement dashboard_notice_list_allRead;

	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon", noteName = "桌面-左上角头像")
	public WebElement desktop_user_icon;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_companyManagement", noteName = "桌面-左上角头像-我的企业")
	public WebElement desktop_user_icon_companyManagement;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_personSetting", noteName = "桌面-左上角头像-账号设置")
	public WebElement desktop_user_icon_personSetting;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_status_L", noteName = "桌面-左上角头像-当前账号状态-左边，如高级版，购买企业版")
	public WebElement desktop_user_icon_status_L;
	@SearchWith(pageName = "dashboard", elementName = "desktop_user_icon_status_R", noteName = "桌面-左上角头像-当前账号状态-右边，如企业版过期，企业试用中，企业名称等")
	public WebElement desktop_user_icon_status_R;

	/**
	 * Collaborative_space
	 * 协作空间
	 */
	/** 协作空间 */
	@SearchWith(pageName = "Collaborative_space", elementName = "Space")
	public WebElement Space;
	/** 新建协作空间按钮 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_newSpace")
	public WebElement b_newSpace;
	/** 收起协作空间文件列表 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_closeSpace")
	public WebElement b_closeSpace;
	/** 新建协作空间，空间明输入框 */
	@SearchWith(pageName = "Collaborative_space", elementName = "i_newSpace_inputPaceName")
	public WebElement i_newSpace_inputPaceName;
	/** 新建协作空间，下一步按钮 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_newSpace_next")
	public WebElement b_newSpace_next;
	/** 新建协作空间，取消按钮 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_newSpace_cancel")
	public WebElement b_newSpace_cancel;
	/** 新建协作空间，下一步按钮 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_collaborativeSpaceList")
	public WebElement b_collaborativeSpaceList;
	/** 协作空间列表1hover设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting1")
	public WebElement b_SpaceSetting1;
	/** 协作空间列表2hover设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting2")
	public WebElement b_SpaceSetting2;
	/** 协作空间列表3hover设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting3")
	public WebElement b_SpaceSetting3;
	/** 协作空间列表4hover设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting4")
	public WebElement b_SpaceSetting4;
	/** 协作空间列表5hover设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting5")
	public WebElement b_SpaceSetting5;
	/** 协作空间设置 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting")
	public WebElement b_SpaceSetting;
	/** 协作空间hover设置--「协作者」 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting_collaboration")
	public WebElement b_SpaceSetting_collaboration;
	/** 协作空间hover设置--「设置」 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting_setting")
	public WebElement b_SpaceSetting_setting;
    /** 协作空间设置--删除 */
    @SearchWith(pageName = "Collaborative_space", elementName = "b_SpaceSetting_delete")
    public WebElement b_SpaceSetting_delete;
	/** 协作空间列表1 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_1")
	public WebElement space_listing_1;
	/** 协作空间列表2 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_2")
	public WebElement space_listing_2;
	/** 协作空间列表3 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_3")
	public WebElement space_listing_3;
	/** 协作空间列表4 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_4")
	public WebElement space_listing_4;
	/** 协作空间列表5 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_5")
	public WebElement space_listing_5;
	/** 协作空间列表6 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_6")
	public WebElement space_listing_6;
	/** 协作空间列表7 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_7")
	public WebElement space_listing_7;
	/** 协作空间列表8 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_8")
	public WebElement space_listing_8;
	/** 协作空间列表9 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listing_9")
	public WebElement space_listing_9;
	/** 协作空间列表1名称 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_listName_1")
	public WebElement space_listName_1;
	/** 协作空间引导，【知道了】按钮 */
	@SearchWith(pageName = "Collaborative_space", elementName = "b_space_tooltipConfirm")
	public WebElement b_space_tooltipConfirm;
	/** 协作空间第一行第一个文件 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_document_1_1")
	public WebElement space_document_1_1;
	/** 协作空间第一行第二个文件 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_document_1_2")
	public WebElement space_document_1_2;
	/** 协作空间第一行第三个文件 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_document_1_3")
	public WebElement space_document_1_3;

	/** 音视频预览 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_Preview_video_music")
	public WebElement space_Preview_video_music;
	/** 图片预览 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_Preview_image")
	public WebElement space_Preview_image;
	/** 文档表格幻灯片预览 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_Preview_office")
	public WebElement space_Preview_office;
	/** 文档表格幻灯片预览 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_Preview_txt")
	public WebElement space_Preview_txt;
	/** 移动文件列表1 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing1")
	public WebElement space_move_listing1;
	/** 移动文件列表2 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing2")
	public WebElement space_move_listing2;
	/** 移动文件列表3 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing3")
	public WebElement space_move_listing3;
	/** 移动文件列表4 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing4")
	public WebElement space_move_listing4;
	/** 移动文件列表5 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing5")
	public WebElement space_move_listing5;
	/** 移动文件列表8 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_move_listing8")
	public WebElement space_move_listing8;
	/** 分享设置弹窗 分享开关 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_cooperation_Popup")
	public WebElement space_cooperation_Popup;
	/** 协作空间上方名 */
	@SearchWith(pageName = "Collaborative_space", elementName = "space_title")
	public WebElement space_title;




	/**
	 * spaceRightClickMenu
	 * 协作空间右键菜单
	 */
	/** 预览(云文件)&上传文件(桌面)&在新标签页打开(文件)&移动||创建副本(多选) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_1")
	public WebElement space_RightMenu_1;
	/** 预览(云文件)&上传文件(桌面)&在新标签页打开(文件)&移动||创建副本(多选) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_Preview")
	public WebElement space_RightMenu_Preview;
	/** 复制链接(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_copyLink")
	public WebElement space_RightMenu_copyLink;
	/** 移动(文件夹)&分享(文件) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_4")
	public WebElement space_RightMenu_4;
	/** 分享开关 */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_4_1")
	public WebElement space_RightMenu_4_1;
	/** 复制链接 */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_4_2")
	public WebElement space_RightMenu_4_2;
	/** 分享设置 */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_4_3")
	public WebElement space_RightMenu_4_3;
	/** 创建副本(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_createCopy")
	public WebElement space_RightMenu_createCopy;
	/** 新建文档(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_newDoc")
	public WebElement space_RightMenu_newDoc;
	/** 重命名(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_rename")
	public WebElement space_RightMenu_rename;
	/** 移动(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_move")
	public WebElement space_RightMenu_move;
	/** 删除(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_delete")
	public WebElement space_RightMenu_delete;
	/** 收藏(协作空间右键菜单) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_collection")
	public WebElement space_RightMenu_collection;
	/** 从模板新建(协作空间) */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_newTemplate")
	public WebElement space_RightMenu_newTemplate;
	/** 协作空间右键一级菜单，新建 */
	@SearchWith(pageName = "spaceRightClickMenu", elementName = "space_RightMenu_new")
	public WebElement space_RightMenu_new;



//	/**
//	 * addCollaborator
//	 * 协作者相关
//	 */
//	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_1_list", noteName = "协作者列表第一个协作者权限下拉框")
//	public WebElement b_addCollaborator_1_list;
//	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_2_list", noteName = "协作者列表第二个协作者权限下拉框")
//	public WebElement b_addCollaborator_2_list;
//	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_3_list", noteName = "协作者列表第三个协作者权限下拉框")
//	public WebElement b_addCollaborator_3_list;
//	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_4", noteName = "协作者权限列表--移除")
//	public WebElement list_addCollaborator_4;
//	@SearchWith(pageName = "addCollaborator", elementName = "list_addCollaborator_4_ok", noteName = "协作者权限列表--移除--确认移除")
//	public WebElement list_addCollaborator_4_ok;
//	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_1_list_emailOrMobile", noteName = "协作者列表第一个协作者邮箱")
//	public WebElement collaborator_1_list_emailOrMobile;
//	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_2_list_emailOrMobile", noteName = "协作者列表第二个协作者邮箱")
//	public WebElement collaborator_2_list_emailOrMobile;
//	@SearchWith(pageName = "addCollaborator", elementName = "collaborator_3_list_emailOrMobile", noteName = "协作者列表第三个协作者邮箱")
//	public WebElement collaborator_3_list_emailOrMobile;
//	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator", noteName = "添加协作者按钮")
//	public WebElement b_addCollaborator;
//	@SearchWith(pageName = "addCollaborator", elementName = "input_addCollaborator", noteName = "添加协作者邮箱输入框")
//	public WebElement input_addCollaborator;
//	@SearchWith(pageName = "addCollaborator", elementName = "b_addCollaborator_1_add", noteName = "搜索显示被添加协作者列表第一个添加按钮")
//	public WebElement b_addCollaborator_1_add;
//	@SearchWith(pageName = "addCollaborator", elementName = "Can_edit_1", noteName = "可以编辑")
//	public WebElement Can_edit_1;
//	@SearchWith(pageName = "addCollaborator", elementName = "can_only_comment_2", noteName = "只能评论")
//	public WebElement can_only_comment_2;
//	@SearchWith(pageName = "addCollaborator", elementName = "can_only_read_3", noteName = "只能阅读")
//	public WebElement can_only_read_3;
//	@SearchWith(pageName = "addCollaborator", elementName = "Shut_down_sm_modal_close_x", noteName = "关闭添加协作窗口")
//	public WebElement Shut_down_sm_modal_close_x;

	/**
	 * companyManagement
	 * 企业管理相关
	 */
	@SearchWith(pageName = "companyManagement", elementName = "company_Management", noteName = "桌面-企业管理入口")
	public WebElement company_Management;

	/** 企业管理-企业设置 */
	@SearchWith(pageName = "companyManagement", elementName = "company_setting")
	public WebElement company_setting;
	@SearchWith(pageName = "companyManagement", elementName = "invite_member", noteName = "企业设置-谁能邀请新成员进企业")
	public WebElement invite_member;
	@SearchWith(pageName = "companyManagement", elementName = "addMember", noteName = "成员管理-添加成员按钮")
	public WebElement addMember;
	@SearchWith(pageName = "companyManagement", elementName = "address_copy", noteName = "企业设置-添加成员-复制链接按钮")
	public WebElement address_copy;
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


	/** 企业设置-移除成员 */
	@SearchWith(pageName = "companyManagement", elementName = "b_delMember")
	public WebElement b_delMember;
	@SearchWith(pageName = "companyManagement", elementName = "setAdmin_ManagerAndCreator", noteName = "企业设置-设置管理员-管理员和创建者")
	public WebElement setAdmin_ManagerAndCreator;
	@SearchWith(pageName = "companyManagement", elementName = "setAdmin_Creator", noteName = "企业设置-设置管理员-仅创建者")
	public WebElement setAdmin_Creator;
	/** 企业设置-谁能添加外部协作者（设置按钮） */
	@SearchWith(pageName = "companyManagement", elementName = "button_addCollaborators")
	public WebElement button_addCollaborators;
	@SearchWith(pageName = "companyManagement", elementName = "transferCompany", noteName = "企业设置-移交企业")
	public WebElement transferCompany;
	@SearchWith(pageName = "companyManagement", elementName = "transferCompany_button", noteName = "企业设置-移交企业-移交企业确认按钮")
	public WebElement transferCompany_button;
	@SearchWith(pageName = "companyManagement", elementName = "memberSearch", noteName = "企业设置-成员列表-搜索")
	public WebElement memberSearch;
	@SearchWith(pageName = "companyManagement", elementName = "b_disableMember", noteName = "企业设置-成员列表-移除成员-禁用")
	public WebElement b_disableMember;
	/** 企业设置-成员列表-设置管理员为成员按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setMember")
	public WebElement b_setMember;
	/** 企业设置-成员列表-设置管理员为成员按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setAdmin")
	public WebElement b_setAdmin;
	/** 企业设置-成员列表-禁用成员的发起交接按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_handover")
	public WebElement b_handover;
	/** 通讯录-成员列表-移除成员-确认按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_delMember_confirm")
	public WebElement b_delMember_confirm;
	/** 通讯录-组织架构根部门 */
	@SearchWith(pageName = "companyManagement", elementName = "list_department_1")
	public WebElement list_department_1;


	/** 通讯录-组织架构第二行部门 */
	@SearchWith(pageName = "companyManagement", elementName = "list_department_2")
	public WebElement list_department_2;
	/** 通讯录-组织架构第三行部门 */
	@SearchWith(pageName = "companyManagement", elementName = "list_department_3")
	public WebElement list_department_3;
	/** 通讯录-组织架构第三行部门设置菜单按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setDepartment_3")
	public WebElement b_setDepartment_3;
	/** 通讯录-组织架构部门设置菜单，删除部门按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setting_delDepartment")
	public WebElement b_setting_delDepartment;
	/** 通讯录-组织架构部门设置菜单，修改部门名称按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setting_renameDepartment")
	public WebElement b_setting_renameDepartment;
	/** 通讯录-组织架构部门设置菜单，修改部门名称按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "input_setting_renameDepartment")
	public WebElement input_setting_renameDepartment;
	@SearchWith(pageName = "companyManagement", elementName = "list_disableMember", noteName = "通讯录-禁用成员列表")
	public WebElement list_disableMember;
	@SearchWith(pageName = "companyManagement", elementName = "button_exitCompany", noteName = "企业设置-成员退出企业")
	public WebElement button_exitCompany;


	/** 通讯录页面，添加新成员按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_addMember")
	public WebElement b_addMember;
	/** 通讯录-禁用成员列表-重新激活成员 */
	@SearchWith(pageName = "companyManagement", elementName = "b_resetMember")
	public WebElement b_resetMember;
	/** 通讯录页面，添加子部门按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_addDepartment")
	public WebElement b_addDepartment;
	/** 通讯录页面，添加新成员弹框，账号输入框 */
	@SearchWith(pageName = "companyManagement", elementName = "input_addMember")
	public WebElement input_addMember;
	/** 通讯录页面，添加新成员弹框，确认邀请成员按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_confirm_addMember")
	public WebElement b_confirm_addMember;
	/** 通讯录页面，添加新成员弹框，关闭弹框按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_close_addMember")
	public WebElement b_close_addMember;
	/** 通讯录页面，成员列表，取消邀请 */
	@SearchWith(pageName = "companyManagement", elementName = "b_cancel_invite")
	public WebElement b_cancel_invite;
	/** 通讯录页面，成员列表，第一个成员邮箱地址 */
	@SearchWith(pageName = "companyManagement", elementName = "memberList_email_1")
	public WebElement memberList_email_1;
	/** 通讯录页面，设置所在部门按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_setDepartment")
	public WebElement b_setDepartment;
	/** 通讯录页面，部门成员，从部门移除按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_removeFromDepartment")
	public WebElement b_removeFromDepartment;
	/** 通讯录页面，设置所在部门，部门选择页面，第二行的部门 */
	@SearchWith(pageName = "companyManagement", elementName = "list_setDepartment_2")
	public WebElement list_setDepartment_2;
	/** 通讯录页面，成员列表中的第一个部门 */
	@SearchWith(pageName = "companyManagement", elementName = "list_memberListDepartment_1")
	public WebElement list_memberListDepartment_1;
	/** 通讯录页面，添加子部门按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_addSubDepartment")
	public WebElement b_addSubDepartment;
	/** 通讯录页面，添加子部门，子部门名称输入框 */
	@SearchWith(pageName = "companyManagement", elementName = "input_subDepartmentName")
	public WebElement input_subDepartmentName;
	/** 企业设置，移交企业，确认按钮 */
	@SearchWith(pageName = "companyManagement", elementName = "b_transferCompany_confirm")
	public WebElement b_transferCompany_confirm;


	/**  ----------------------------------------------------------------------------------------------------------------------  */
	/** 企业设置 - 更改选项（任一）- 第一个选项 */
	@SearchWith(pageName = "companyManagement", elementName = "menu_1", noteName = "企业设置 - 更改选项（任一）- 第一个选项")
	public WebElement menu_1;
	/** 企业设置 - 更改选项（任一）- 第二个选项 */
	@SearchWith(pageName = "companyManagement", elementName = "menu_2", noteName = "企业设置 - 更改选项（任一）- 第二个选项")
	public WebElement menu_2;
	/** 企业设置 - 更改选项（任一）- 第二个选项 */
	@SearchWith(pageName = "companyManagement", elementName = "menu_3", noteName = "企业设置 - 更改选项（任一）- 第三个选项")
	public WebElement menu_3;
	/** 企业设置 - 更改选项（任一）- 第二个选项 */
	@SearchWith(pageName = "companyManagement", elementName = "menu_4", noteName = "企业设置 - 更改选项（任一）- 第四个选项")
	public WebElement menu_4;


	/**  ----------------------------------------------------------------------------------------------------------------------  */


	/**
	 * Registered
	 * 注册页面相关
	 */
	/** 注册页面-验证码输入框 */
	@SearchWith(pageName = "Registered", elementName = "verifyCode")
	public WebElement verifyCode;
	/** 注册页面-获取验证码按钮 */
	@SearchWith(pageName = "Registered", elementName = "b_verifyCode")
	public WebElement b_verifyCode;
	/** 注册页面-手机号输入框 */
	@SearchWith(pageName = "Registered", elementName = "input_registered_mobile")
	public WebElement input_registered_mobile;
	/** 注册页面-邮箱输入框 */
	@SearchWith(pageName = "Registered", elementName = "input_registered_email")
	public WebElement input_registered_email;
	/** 注册页面-密码输入框 */
	@SearchWith(pageName = "Registered", elementName = "input_registered_password")
	public WebElement input_registered_password;
	/** 注册页面-注册按钮 */
	@SearchWith(pageName = "Registered", elementName = "button_registered")
	public WebElement button_registered;
	/** 注册页面-密码提示信息 */
	@SearchWith(pageName = "Registered", elementName = "tips_registered_password")
	public WebElement tips_registered_password;
	/** 注册页面-手机号提示信息 */
	@SearchWith(pageName = "Registered", elementName = "tips_registered_mobile")
	public WebElement tips_registered_mobile;
	/** 注册页面-验证码提示信息 */
	@SearchWith(pageName = "Registered", elementName = "tips_registered_verifyCode")
	public WebElement tips_registered_verifyCode;
	/** 注册页面-邮箱提示信息 */
	@SearchWith(pageName = "Registered", elementName = "tips_registered_email")
	public WebElement tips_registered_email;
	/** 注册页面-使用邮箱注册 */
	@SearchWith(pageName = "Registered", elementName = "link_registered_useEmail")
	public WebElement link_registered_useEmail;
	/** 注册页面-同意相关服务条款CheckBox */
	@SearchWith(pageName = "Registered", elementName = "checkbox_agreement")
	public WebElement checkbox_agreement;
	/** 注册页面-相关服务条款提示信息 */
	@SearchWith(pageName = "Registered", elementName = "tips_checkbox_agreement")
	public WebElement tips_checkbox_agreement;




	/**
	 * profile
	 * 个人账号设置页面
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
	 */
	@SearchWith(pageName = "menu", elementName = "menu_newPage", noteName = "新标签页中打开")
	public WebElement menu_newPage;
	@SearchWith(pageName = "menu", elementName = "menu_shortcut", noteName = "添加到快速访问")
	public WebElement menu_shortcut;
	@SearchWith(pageName = "menu", elementName = "menu_shortcut_cancel", noteName = "从快速访问移除")
	public WebElement menu_shortcut_cancel;
	@SearchWith(pageName = "menu", elementName = "menu_collection", noteName = "收藏")
	public WebElement menu_collection;
	@SearchWith(pageName = "menu", elementName = "menu_collection_cancel", noteName = "取消收藏")
	public WebElement menu_collection_cancel;
	@SearchWith(pageName = "menu", elementName = "menu_cooperation", noteName = "添加协作者")
	public WebElement menu_cooperation;
	@SearchWith(pageName = "menu", elementName = "menu_move", noteName = "移动")
	public WebElement menu_move;
	@SearchWith(pageName = "menu", elementName = "menu_share", noteName = "分享")
	public WebElement menu_share;
	@SearchWith(pageName = "menu", elementName = "menu_share_1", noteName = "分享-公开分享")
	public WebElement menu_share_1;
	@SearchWith(pageName = "menu", elementName = "menu_share_2", noteName = "分享-复制分享链接")
	public WebElement menu_share_2;
	@SearchWith(pageName = "menu", elementName = "menu_share_3", noteName = "分享-分享设置")
	public WebElement menu_share_3;
	@SearchWith(pageName = "menu", elementName = "menu_rename", noteName = "重命名")
	public WebElement menu_rename;
	@SearchWith(pageName = "menu", elementName = "menu_createCopy", noteName = "创建副本")
	public WebElement menu_createCopy;
	@SearchWith(pageName = "menu", elementName = "menu_delete", noteName = "删除")
	public WebElement menu_delete;
	@SearchWith(pageName = "menu", elementName = "menu_mute", noteName = "消息免打扰")
	public WebElement menu_mute;
	@SearchWith(pageName = "menu", elementName = "menu_mute_cancel", noteName = "取消消息免打扰")
	public WebElement menu_mute_cancel;
	@SearchWith(pageName = "menu", elementName = "menu_moveToFolder", noteName = "定位到所在文件夹")
	public WebElement menu_moveToFolder;
	@SearchWith(pageName = "menu", elementName = "menu_Recovery", noteName = "恢复文件")
	public WebElement menu_Recovery;
	@SearchWith(pageName = "menu", elementName = "menu_Completely_removed", noteName = "彻底删除")
	public WebElement menu_Completely_removed;
	@SearchWith(pageName = "menu", elementName = "menu_Point_Menu", noteName = "工作台-最近使用-第一个文件点点(仅有一个文件时使用)")
	public WebElement menu_Point_Menu;

	/**
	 * file_menu
	 * 文档表格编辑页点点等-菜单
	 */
	@SearchWith(pageName = "file_menu", elementName = "file_menu_version", noteName = "保存版本")
	public WebElement file_menu_version;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_shortcut", noteName = "添加快捷方式")
	public WebElement file_menu_shortcut;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_collection", noteName = "添加收藏")
	public WebElement file_menu_collection;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_move", noteName = "移动")
	public WebElement file_menu_move;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_createCopy", noteName = "创建副本")
	public WebElement file_menu_createCopy;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_delete", noteName = "删除")
	public WebElement file_menu_delete;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_mute", noteName = "消息免打扰")
	public WebElement file_menu_mute;
	@SearchWith(pageName = "file_menu", elementName = "file_menu_msg", noteName = "文档信息")
	public WebElement file_menu_msg;
	/** 分享链接打开页面，输入密码框 */
	@SearchWith(pageName = "file_menu", elementName = "sharePage_inputPwd")
	public WebElement sharePage_inputPwd;
	/** 分享链接打开页面，输入密码,确定按钮 */
	@SearchWith(pageName = "file_menu", elementName = "sharePage_buttonConfirm")
	public WebElement sharePage_buttonConfirm;
	/** header上保存模板 */
	@SearchWith(pageName = "file_menu", elementName = "file_menu_template")
	public WebElement file_menu_template;


	/**
	 * Template
	 * 模板
	 */

	@SearchWith(pageName = "Template", elementName = "my_template", noteName = "我的模板")
	public WebElement my_template;
	@SearchWith(pageName = "Template", elementName = "my_template02", noteName = "我的模板第二个")
	public WebElement my_template02;
	@SearchWith(pageName = "Template", elementName = "doc_template", noteName = "文档模板")
	public WebElement doc_template;
	@SearchWith(pageName = "Template", elementName = "template_1_1", noteName = "模板库第一个种类第一个模板")
	public WebElement template_1_1;
	@SearchWith(pageName = "Template", elementName = "template_2_1", noteName = "模板库第二个种类第一个模板")
	public WebElement template_2_1;
	@SearchWith(pageName = "Template", elementName = "button_template_confirm", noteName = "【模板库】使用此模板按钮")
	public WebElement button_template_confirm;
	@SearchWith(pageName = "Template", elementName = "template_type_2", noteName = "【模板库】模板库模板类型2")
	public WebElement template_type_2;

	/**
	 * spaceRightButton
	 * 协作空间右侧按钮
	 */

	@SearchWith(pageName = "spaceRightButton", elementName = "space_button_new", noteName = "空间右侧新建")
	public WebElement space_button_new;
	@SearchWith(pageName = "spaceRightButton", elementName = "space_button_import", noteName = "空间右侧上传/导入")
	public WebElement space_button_import;
	@SearchWith(pageName = "spaceRightButton", elementName = "space_uploadFile", noteName = "上传文件")
	public WebElement space_uploadFile;
	@SearchWith(pageName = "spaceRightButton", elementName = "space_uploadFolder", noteName = "上传文件夹")
	public WebElement space_uploadFolder;


	/**
	 * spaceCollaboratorUI
	 * 【新协作面板】
	 */

	/** 【新协作面板】添加协作权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_add_Collaborator")
	public WebElement b_add_Collaborator;
	/** 【新协作面板】添加协作者邮箱/手机号-输入框 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "input_add_Collaborator")
	public WebElement input_add_Collaborator;
    /** 【新协作面板】添加协作者邮箱/手机号-输入框 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "input_add_Collaborator_1")
    public WebElement input_add_Collaborator_1;
    /** 【新协作面板】协作者列表，第一个协作者添加权限按钮 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_add_CollaboratorList_1")
    public WebElement b_add_CollaboratorList_1;
	/** 【新协作面板】协作者列表，第二个协作者添加权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_add_CollaboratorList_2")
	public WebElement b_add_CollaboratorList_2;
	/** 【新协作面板】协作者列表，【企业全员tab】第一个人员添加权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_add_companyCollaboratorList_1")
	public WebElement b_add_companyCollaboratorList_1;
    /** 【新协作面板】协作者权限，只能阅读 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "cpList_onlyRead")
    public WebElement cpList_onlyRead;
    /** 【新协作面板】协作者权限，只能评论 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "cpList_onlyDiscuss")
    public WebElement cpList_onlyDiscuss;
    /** 【新协作面板】协作者权限，可以编辑 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "cpList_edit")
    public WebElement cpList_edit;
    /** 【新协作面板】协作者权限，移除已选权限 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "cpList_remove")
    public WebElement cpList_remove;
    /** 【新协作面板】返回按钮 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_collaborator_Back")
    public WebElement b_collaborator_Back;
    /** 【新协作面板】协作者列表第一个协作者变更权限按钮 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_collaboratorsList_1")
    public WebElement b_collaboratorsList_1;
	/** 【新协作面板】协作者列表第二个协作者变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_collaboratorsList_2")
	public WebElement b_collaboratorsList_2;
	/** 【新协作面板】协作者列表第三个协作者变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_collaboratorsList_3")
	public WebElement b_collaboratorsList_3;
	/** 【新协作面板】管理者列表第一个管理者变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_adminList_1")
	public WebElement b_adminList_1;
	/** 【新协作面板】管理者列表第二个管理者变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_adminList_2")
	public WebElement b_adminList_2;
	/** 【新协作面板】管理者列表第三个管理者变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_adminList_3")
	public WebElement b_adminList_3;
	/** 【新协作面板】管理者列表第一个管理者名字 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "name_adminList_1")
	public WebElement name_adminList_1;
	/** 【新协作面板】管理者列表第二个管理者名字 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "name_adminList_2")
	public WebElement name_adminList_2;
	/** 【新协作面板】协作者列表【组织】企业全员变更权限按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_department_1")
	public WebElement b_department_1;
    /** 【新协作面板】协作者列表【组织】第二个变更权限按钮 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_department_2")
    public WebElement b_department_2;
    /** 【新协作面板】协作者变更toast */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "toast_addCollaborator")
    public WebElement toast_addCollaborator;
    /** 【新协作面板】协作者列表标签切换-企业全员 */
    @SearchWith(pageName = "spaceCollaboratorUI", elementName = "tabs_companyMember")
    public WebElement tabs_companyMember;
    /** 【新协作面板】协作者列表标签切换-组织 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "tabs_organization")
	public WebElement tabs_organization;
	/** 【新协作面板】协作空间设置页面-空间名输入框 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "spacingSetting_spaceName")
	public WebElement spacingSetting_spaceName;
	/** 【新协作面板】协作空间设置页面-确定按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingSetting_confirm")
	public WebElement b_spacingSetting_confirm;
	/** 【新协作面板】协作者列表页面-关闭按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_close")
	public WebElement b_spacingCollaborator_close;
	/** 【新协作面板】管理员列表页面-【添加协作者】按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_addCollaborator")
	public WebElement b_spacingCollaborator_addCollaborator;
	/** 【新协作面板】管理员列表页面-【添加管理员】按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_addAdmin")
	public WebElement b_spacingCollaborator_addAdmin;
	/** 【新协作面板】管理员列表第一个【设为管理员】按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_addAdmin_1")
	public WebElement b_spacingCollaborator_addAdmin_1;
	/** 【新协作面板】管理员列表，【移除管理员】按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_removeAdmin")
	public WebElement b_spacingCollaborator_removeAdmin;
	/** 【新协作面板】管理员列表，移除管理员，【确认】按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_spacingCollaborator_removeAdmin_confirm")
	public WebElement b_spacingCollaborator_removeAdmin_confirm;
	/** 【新协作面板】协作者列表，第一行用户的用户名 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "list_collaboratorName_1")
	public WebElement list_collaboratorName_1;
	/** 【新协作面板】协作者企业全员，第一行企业成员的用户名 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "list_companyCollaboratorName_1")
	public WebElement list_companyCollaboratorName_1;
	/** 【新协作面板】协作者企业全员，第一行企业成员的邮箱地址 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "list_collaboratorEmail_1")
	public WebElement list_collaboratorEmail_1;
	/** 【新协作面板】查看上级目录协作者按钮 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "b_checkParent")
	public WebElement b_checkParent;
	/** 【新协作面板】上级继承权限列表协作者权限 */
	@SearchWith(pageName = "spaceCollaboratorUI", elementName = "list_parentPermissions_1")
	public WebElement list_parentPermissions_1;


	/** 移动端_桌面文件_第一个 */
	@SearchWith(pageName = "mobile", elementName = "mobile_file_1")
	public WebElement mobile_file_1;
	/** 移动端_桌面文件_第二个 */
	@SearchWith(pageName = "mobile", elementName = "mobile_file_2")
	public WebElement mobile_file_2;
	/** 移动端_新建按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_create")
	public WebElement mobile_B_create;
	/** 移动端_新建新文档 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_createDoc")
	public WebElement mobile_B_createDoc;
	/** 移动端_新建表格 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_createSheet")
	public WebElement mobile_B_createSheet;
	/** 移动端_新建表单 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_createForm")
	public WebElement mobile_B_createForm;
	/** 移动端_文件重命名输入框 */
	@SearchWith(pageName = "mobile", elementName = "mobile_I_fileReName")
	public WebElement mobile_I_fileReName;
	/** 移动端_二次确认窗口_确定按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_confirm")
	public WebElement mobile_B_confirm;
	/** 移动端_文件菜单(...) */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting")
	public WebElement mobile_B_setting;
	/** 移动端_文件菜单_删除按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_del")
	public WebElement mobile_B_setting_del;
	/** 移动端_文件菜单_添加协作者按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_addCollaborator")
	public WebElement mobile_B_setting_addCollaborator;
	/** 移动端_文件菜单_重命名按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_rename")
	public WebElement mobile_B_setting_rename;
	/** 移动端_文件菜单_收藏按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_collection")
	public WebElement mobile_B_setting_collection;
	/** 移动端_文件菜单_分享_私有 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_share_1")
	public WebElement mobile_B_setting_share_1;
	/** 移动端_文件菜单_分享_公开只读 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_share_2")
	public WebElement mobile_B_setting_share_2;
	/** 移动端_文件菜单_分享_公开可写 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_share_3")
	public WebElement mobile_B_setting_share_3;
	/** 移动端_header_分享_私有 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_share_1")
	public WebElement mobile_header_share_1;
	/** 移动端_header_分享_公开只读 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_share_2")
	public WebElement mobile_header_share_2;
	/** 移动端_header_分享_公开可写 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_share_3")
	public WebElement mobile_header_share_3;
	/** 移动端_文件菜单_删除_确认删除按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_B_setting_del_confirm")
	public WebElement mobile_B_setting_del_confirm;
	/** 移动端_文件header_返回按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_back")
	public WebElement mobile_header_back;
	/** 移动端_文件header_分享按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_share")
	public WebElement mobile_header_share;
	/** 移动端_文件header_菜单(....) */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting")
	public WebElement mobile_header_setting;
	/** 移动端_文件header_菜单_协作按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting_collaborator")
	public WebElement mobile_header_setting_collaborator;
	/** 移动端_文件header_菜单_收藏按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting_collection")
	public WebElement mobile_header_setting_collection;
	/** 移动端_文件header_菜单_创建副本按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting_createCopy")
	public WebElement mobile_header_setting_createCopy;
	/** 移动端_文件header_菜单_用app编辑按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting_toApp")
	public WebElement mobile_header_setting_toApp;
	/** 移动端_文件header_菜单_重命名 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_setting_rename")
	public WebElement mobile_header_setting_rename;
	/** 移动端_文件header_协作_添加协作者按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_collaborator_addCollaborator")
	public WebElement mobile_header_collaborator_addCollaborator;
	/** 移动端_文件header_协作_添加管理者按钮 */
	@SearchWith(pageName = "mobile", elementName = "mobile_header_collaborator_addAdmin")
	public WebElement mobile_header_collaborator_addAdmin;
	/** 移动端_toast */
	@SearchWith(pageName = "mobile", elementName = "mobile_toast")
	public WebElement mobile_toast;

	/** 模板库_全部模板tab */
	@SearchWith(pageName = "templates", elementName = "templates_tab_all")
	public WebElement templates_tab_all;
	/** 模板库_文档模板tab */
	@SearchWith(pageName = "templates", elementName = "templates_tab_doc")
	public WebElement templates_tab_doc;
	/** 模板库_表格模板tab */
	@SearchWith(pageName = "templates", elementName = "templates_tab_sheet")
	public WebElement templates_tab_sheet;
	/** 模板库_个人模板tab */
	@SearchWith(pageName = "templates", elementName = "templates_tab_mine")
	public WebElement templates_tab_mine;
	/** 模板库_模板_1 */
	@SearchWith(pageName = "templates", elementName = "templates_template_1")
	public WebElement templates_template_1;
	/** 模板库_我的模板_1 */
	@SearchWith(pageName = "templates", elementName = "templates_mineTemplate_1")
	public WebElement templates_mineTemplate_1;
	/** 模板库_使用此模板按钮 */
	@SearchWith(pageName = "templates", elementName = "templates_create_button")
	public WebElement templates_create_button;
	/** 模板库_模板重命名 */
	@SearchWith(pageName = "templates", elementName = "templates_rename_button")
	public WebElement templates_rename_button;
	/** 模板库_模板删除 */
	@SearchWith(pageName = "templates", elementName = "templates_delete_button")
	public WebElement templates_delete_button;
}