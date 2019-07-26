package agenttb.code.message.common;

public enum MessageState {
    INITIALIZATION(0, "Initalization"),
    SENDING(1, "Sending"),
    DEPLAY(2, "Deplay"),
    SENDED(3, "Sended"),
    SUCCESS(4, "Success");
    private int code;
    private String desc;

    private MessageState(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
    public int getCode() {
        return code;
    }
}
