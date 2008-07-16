package org.eclipse.mwe.runtime.status;

public class Status {
	private final StatusType type;
	private final String message;
	private Object ctx;
	
	private Status(String message, StatusType type, Object ctx) {
		super();
		this.message = message;
		this.type = type;
		this.ctx = ctx;
	}
	
	public StatusType getType() {
		return type;
	}
	public String getMessage() {
		return message;
	}
	
	public Object getContext() {
		return ctx;
	}
	
	public static Status failure() {
		return new Status("Unkown problem",StatusType.FAILURE,null);
	}
	public static Status failure(String msg) {
		return new Status(msg,StatusType.FAILURE,null);
	}
	public static Status failure(String msg,Object ctx) {
		return new Status(msg,StatusType.FAILURE,ctx);
	}
	
	public static Status success() {
		return new Status("Success",StatusType.SUCCESS,null);
	}
	public static Status success(String msg) {
		return new Status(msg,StatusType.SUCCESS,null);
	}
	public static Status success(String msg, Object ctx) {
		return new Status(msg,StatusType.SUCCESS,ctx);
	}
}
