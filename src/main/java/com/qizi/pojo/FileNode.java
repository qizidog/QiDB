package com.qizi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author : qizidog
 * @date : 2021-10-17 23:33
 * @description :
 **/

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class FileNode {
    private String fileId;
    private String fileName;
    private String fileSize;
    private Date createTime;
    private String fileParentFolder;
    private String fileCreator;
}