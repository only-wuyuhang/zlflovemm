package com.quellan.zlflovemm.entry;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName UserEntry
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/18 15:05
 * @Version 1.0
 */

@Getter
@Setter
public class UserEntry {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String roleCode;
    private String roleName;
    private String gmtCreate;
    private String gmtUpdate;
    private String nickname;
    private String userCreate;
}
