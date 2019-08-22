package com.llj.easypermission;

public enum GrantResult {

    /**
     * 授予权限
     */
    GRANT(0),

    /**
     * 拒接权限
     */
    DENIED(-1),

    /**
     * 之前在requestPremissionRational里面的next接口返回了IGNORE
     */
    IGNORE(-2);

    private int type;

    GrantResult(int type) {
        this.type = type;
    }

    public int getValue(){
        return type;
    }
}
