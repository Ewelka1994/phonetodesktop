package net.xisberto.phonetodesktop;

import java.util.Arrays;
import java.util.Collection;

import com.google.api.services.tasks.TasksScopes;

public class Utils {
	public static Collection<String> scopes = Arrays.asList(TasksScopes.TASKS);
	public static final String ACTION_LOAD_LISTS = "net.xisberto.phonetodesktop.action.LOAD_LISTS",
			ACTION_SAVE_LIST = "net.xisberto.phonetodesktop.action.SAVE_LISTS",
			ACTION_SHOW_AVAILABILITY_ERROR = "net.xisberto.phonetodesktop.action.SHOW_AVAILABILITY_ERROR",
			ACTION_SHOW_USER_RECOVERABLE = "net.xisberto.phonetodesktop.action.SHOW_USER_RECOVERABLE",
			EXTRA_LISTS = "net.xisberto.phonetodesktop.extra.LISTS",
			EXTRA_LISTNAME = "net.xisberto.phonetodesktop.extra.LISTNAME",
			EXTRA_LISTID = "net.xisberto.phonetodesktop.extra.LISTID",
			EXTRA_CONNECTION_STATUS_CODE = "net.xisberto.phonetodesktop.extra.CONNECTION_SATUS_CODE",
			LIST_TITLE = "PhoneToDesktop";
}