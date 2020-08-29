package agenttb.code.message.common;

public enum MsgType {
    SMS(1, "SMS"),
    EMAIL(2, "EMAIL");
    private int code;
    private String desc;

    private MsgType(int code, String desc) {
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
