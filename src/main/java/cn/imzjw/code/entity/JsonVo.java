package cn.imzjw.code.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author https://blog.imzjw.cn
 * @date 2021/6/24 10:36
 */
@Data
public class JsonVo implements Serializable {

    private static final long serialVersionUID = -432908543160176349L;

    private int code;
    private List<String> data;
}
