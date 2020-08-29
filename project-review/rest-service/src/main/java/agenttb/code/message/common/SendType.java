package agenttb.code.message.common;

public enum SendType {
    SINGLE_SEND(0, "single-send"),
    BTACH_SEND(1, "batch-send");
    private int code;
    private String desc;

    private SendType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
